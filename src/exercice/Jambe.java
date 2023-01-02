package exercice;

import java.util.Random;

public class Jambe extends Exercice {
	
	private  int nombExercice ;
	private  Jambe [] listJambe = new Jambe [30];
	private Random r = new Random ();
	
	public Jambe(String nom, String groupe, int base) {
		super(nom, "Jambe", base);
		this.nombExercice=0;
	}
	
	public void rajouterExercice (Jambe exercice , int nombExercice ,Jambe[] listJambe  )
	{
		if (nombExercice<30)
		{
			listJambe[nombExercice]= exercice ;
			nombExercice += 1 ;
		}
		else 
		{
			System.out.println("Liste exerice pleine \n ");
		}
	
	}
	public Jambe[] getlist ()
	{
		return listJambe;
	}
	public Exercice donnerExerice (Jambe[] listJambe ,int nombExercice ) {
		int rand = r.nextInt(nombExercice);
		Exercice aleatoire = listJambe[rand];
		
		System.out.println("Voici un exercice \n ");
		return aleatoire;
	}
}
