package exercice;

import java.util.Random;

public class Bras extends Exercice {
	
	private int nombExercice ;
	private Bras [] listBras = new Bras [30];
	private Random r = new Random ();
	
	public Bras(String nom, String groupe, int base) {
		super(nom, "Bras", base);
		this.nombExercice=0;
	}
	
	public void rajouterExercice (Bras exercice , int nombExercice ,Bras[] listBras  )
	{
		if (nombExercice<30)
		{
			listBras[nombExercice]= exercice ;
			nombExercice += 1 ;
		}
		else 
		{
			System.out.println("Liste exerice pleine \n ");
		}

	}
	public Exercice donnerExerice (Bras[] listBras ,int nombExercice ) {
		int rand = r.nextInt(nombExercice);
		Exercice aleatoire = listBras[rand];
		
		System.out.println("Voici un exercice \n ");
		return aleatoire;
	}
	}
