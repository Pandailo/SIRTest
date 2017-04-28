/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serveurs;

import java.util.ArrayList;

/**
 *
 * @author Annabelle
 */
public class Schema_local {
    private Gestion_json g_json;
    private String chemin_schema_local;
    
    public Schema_local(boolean actuel)
    {
        Parametres p = new Parametres();
        if(actuel)
            this.chemin_schema_local = p.getChemin_schemas()+"/BD_actuelle.json";
        else
            this.chemin_schema_local = p.getChemin_schemas()+"/local.json";
        this.g_json = new Gestion_json(this.chemin_schema_local, true);
    }
    
    //**********Lecture du fichier**********// 
    public int get_nb_tables()
    {
        return this.g_json.get_taille_tableau("tables");
    }
    
    public String[] get_liste_nom_tables()
    {
        String[] tables = new String[0];
        if(this.get_nb_tables()>0)
        {
            tables = new String[this.get_nb_tables()];
            for(int i=0; i<this.get_nb_tables(); i++)
                tables[i] = (String)this.g_json.get_attribut_tableau("tables", i, "nom");
        }
        return tables;
    }
    
    private int get_indice_table(String nom_table)
    {
        for(int i=0; i<this.get_nb_tables(); i++)
            if(((String)this.g_json.get_attribut_tableau("tables", i, "nom")).equals(nom_table))
                return i;
        return -1;
    }
    
    public String get_table_fragmentation(String nom_table)
    {
        String fragmentation = null;
        int i = this.get_indice_table(nom_table);
        if(i!=-1)
            fragmentation = (String)this.g_json.get_attribut_tableau("tables", i, "fragmentation");
        else
            System.out.println("La table "+nom_table+" n'a pas été trouvée.");
        return fragmentation;
    }
    
    public int get_nb_attributs(String nom_table)
    {
        return this.g_json.get_taille_tableau_imbrique_niveau_1("tables", this.get_indice_table(nom_table), "attributs");
    }
    
    public String[] get_liste_attributs_table(String nom_table)
    {
        String[] attributs = null;
        int i = this.get_indice_table(nom_table);
        if(i!=-1)
        {
            int nb_attributs = this.get_nb_attributs(nom_table);
            attributs = new String[nb_attributs];
            for(int j=0; j<nb_attributs; j++)
                attributs[j] = (String)this.g_json.get_attribut_tableau_imbrique_niveau_1("tables", i, "attributs", j, "nom_attribut");
        }
        else
            System.out.println("La table "+nom_table+" n'a pas été trouvée.");
        return attributs;
    }
    
    public String[] get_cles_primaires(String nom_table)
    {
        ArrayList<String> cles_primaires = new ArrayList<String>();
        String[] attributs = this.get_liste_attributs_table(nom_table);
        for(int i=0; i<attributs.length; i++)
            if(this.is_primary_key(nom_table, attributs[i]))
                cles_primaires.add(attributs[i]);
        return (String[])cles_primaires.toArray();
    }
    
    private int get_indice_attribut(String nom_table, String nom_attribut)
    {
        int i = this.get_indice_table(nom_table);
        for(int j=0; j<this.get_nb_attributs(nom_table); j++)
            if(((String)this.g_json.get_attribut_tableau_imbrique_niveau_1("tables", i, "attributs", j, "nom_attribut")).equals(nom_attribut))
                return j;
        return -1;
    }
    
    public boolean is_primary_key(String nom_table, String nom_attribut)
    {
        int i = this.get_indice_table(nom_table);
        int j = this.get_indice_attribut(nom_table, nom_attribut);
        String pk = null;
        if(i!=-1 && j!=-1)
            pk = (String)this.g_json.get_attribut_tableau_imbrique_niveau_1("tables", i, "attributs", j, "cle_primaire");
        return pk.equals("oui");
    }
    
    public String get_type_attribut(String nom_table, String nom_attribut)
    {
        int i = this.get_indice_table(nom_table);
        int j = this.get_indice_attribut(nom_table, nom_attribut);
        if(i!=-1 && j!=-1)
            return (String)this.g_json.get_attribut_tableau_imbrique_niveau_1("tables", i, "attributs", j, "type");
        else
            return null;
    }
    
    public int get_nb_fragments(String nom_table)
    {
        int i = this.get_indice_table(nom_table);
        if(i!=-1)
            return this.g_json.get_taille_tableau_imbrique_niveau_1("tables", i, "fragments");
        else
            return -1;
    }
    
    //Dimension 0 : nom de l'attribut
    //Dimension 1 : signe de comparaison
    //Dimension 2 : valeur de comparaison
    public String[][] get_attributs_fragment(String nom_table)
    {
        String[][] attributs = null;
        int table = this.get_indice_table(nom_table);
        int nb_attributs = this.g_json.get_taille_tableau_imbrique_niveau_2("tables", table, "fragments", 0, "attributs");
        if(nb_attributs!=-1)
        {
            attributs = new String[nb_attributs][3];
            for(int i=0; i<nb_attributs; i++)
            {
                attributs[i][0] = (String)this.g_json.get_attribut_tableau_imbrique_niveau_2("tables", table, "fragments", 0, "attributs", i, "attribut");
                attributs[i][1] = (String)this.g_json.get_attribut_tableau_imbrique_niveau_2("tables", table, "fragments", 0, "attributs", i, "signe");
                attributs[i][2] = (String)this.g_json.get_attribut_tableau_imbrique_niveau_2("tables", table, "fragments", 0, "attributs", i, "valeur");
            }
        }
        return attributs;
    }
}
