package exercice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
	
	public static void main(String[] args) {
		    System.out.println("Bienvenue Sur FocusOn ! \n");
		    debut();
		}
	
    public static void debut() {
        System.out.println("1. Donne moi un exercice pour un muscle au choix ");
        System.out.println("2. Donne moi une séance pour un groupe musculaire au choix ");
        System.out.println("3. Donne moi un programme complet de musculation ");
        System.out.println("4. Donne moi un exemple de programme alimentaire en fonction de mon besoin calorique ");
        //System.out.println("5. ");
        //System.out.println("6. ");
        System.out.println("0. Sortie \n");
        
        
   
        int entrerutilisateur = Integer.parseInt(inputOutput("Donner un chiffre entre 0-4 en fonction de ton besoin "));
        	
        if (entrerutilisateur >= 0 && entrerutilisateur <=4) {
		       if (entrerutilisateur == 1) exercice();
		       if (entrerutilisateur == 2) seance();
		       if (entrerutilisateur == 3) programme();
		       if (entrerutilisateur == 4) nutrition();
		       //if (entrerutilisateur == 5) System.out.println("8");
		       //if (entrerutilisateur == 6) System.out.println("9");
		       if (entrerutilisateur == 0) System.exit(0);
        	} else {
        		System.out.println("Donner un nombre entre 0 et 4");
        		debut();
        	}
        }
    
    public static int muscle() {
        System.out.println("1. Jambe ");
        System.out.println("2. Pectoraux ");
        System.out.println("3. Bras ");
        //System.out.println("5. ");
        //System.out.println("6. ");
        System.out.println("0. Sortie \n");
        
        
   
        int entrerutilisateur = Integer.parseInt(inputOutput("Donner un chiffre entre 0-3 en fonction de ton besoin "));
        	
        if (entrerutilisateur >= 0 && entrerutilisateur <=3) {
        	  if (entrerutilisateur == 0) System.exit(0);
		      return entrerutilisateur;
        	} else {
        		System.out.println("Donner un nombre entre 0 et 3");
        		muscle();
        	}
        	return 0;
        }
    
    
    public static void exercice() {
    	System.out.println(" De quelle groupe musculaire veut tu un exercice ? \n ");
    	int groupe = muscle();
    	if (groupe==1)
    	{
    		
    	}
    	
    }
    public static void seance() {
    	
    	
    }
    public static void programme() {
    	
    	
    }
    public static void nutrition() {
    	
    	
    }



    private static String inputOutput(String message) {
        System.out.println(message);
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    String returnString = "";
	    try {
	        returnString = br.readLine();
	    }
	    catch (IOException e){
	        System.out.println("Error reading in value");
	        debut();
	    }
	    return returnString;
    }

}