package gestion_etudiant;

public class Etudiant implements Comparable <Etudiant>
{
	private int id;
	private String nom ;
	private double note;
	public Etudiant() {
		this.id= id;
		this.nom=nom;
		this.note= 10 ;
		public String toString()
		{
			return "("+this.nom +":"+this.note+")";
		}
		public boolean equals(Object obj) 
		{
			if(obj instanceof Etudiant ) 
			{
				return false ;
				//Deux Etudiants sans égaux si et seulement s’ils ont la même valeur de id
				return ((Etudiant)obj).id== this.id ;		
			}
		}	
}
	@Override
	public int compareTo(Etudiant e)
	{
		if(e.note < this.note)
			return 1 ;
		if(e.note > this.note)
		  return 0 ;
		
		return -1;
	}



 