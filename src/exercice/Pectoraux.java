package exercice;

import java.util.Random;

public class Pectoraux extends Exercice {
	
	private int nombExercice ;
	private Pectoraux [] listPec = new Pectoraux [30];
	private Random r = new Random ();
	
	public Pectoraux(String nom, String groupe, int base) {
		super(nom, "Pectoraux", base);
		this.nombExercice=0;
	}
	
	public void rajouterExercice (Pectoraux exercice , int nombExercice ,Pectoraux[] listPec  )
	{
		if (nombExercice<30)
		{
			listPec[nombExercice]= exercice ;
			nombExercice += 1 ;
		}
		else 
		{
			System.out.println("Liste exerice pleine \n ");
		}

	}
	public Exercice donnerExerice (Pectoraux[] listPec ,int nombExercice ) {
		int rand = r.nextInt(nombExercice);
		Exercice aleatoire = listPec[rand];
		
		System.out.println("Voici un exercice \n ");
		return aleatoire;
	}
	}
