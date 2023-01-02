package exercice;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Exercice {
	
	private Random r = new Random ();
	private String nom;
	private String groupe;
	private int base ; //Exercice de base ou pas pour 1 ou 0 
	private Exercice [] listExericice = new Exercice [30]; // liste des exerices disponibles
	private int nombExercice ;

	public Exercice (String nom , String groupe , int base)
	{
		this.nom=nom;
		this.groupe=groupe;
		this.base=base;
		this.nombExercice=0;
	}
	public Exercice donnerExerice (Exercice[] listExercice ,int nombExerice ) {
		int rand = r.nextInt(nombExerice);
		Exercice aleatoire = listExercice[rand];
		
		System.out.println("Voici un exercice \n ");
		return aleatoire;
	}
							

	public void rajouterExercice (Exercice exercice , int nombExercice ,Exercice[] listExercice  )
	{
		if (nombExercice<30)
		{
			listExercice[nombExercice]= exercice ;
			nombExercice += 1 ;
		}
		else 
		{
			System.out.println("Liste exerice pleine \n ");
		}
	}
	
	
}
