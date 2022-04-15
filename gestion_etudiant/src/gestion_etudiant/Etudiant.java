package gestion_etudiant;

import aiac.gi18.java.complexe.Complexe;

public class Etudiant implements comparable<Etudiant> {
	private int id;
	private String nom ;
	private double note;
	public Etudiant() {
		this.id= id;
		this.nom=nom;
		this.note= 10.0;
		public String toString()
		{
			return "("+this.nom+":"+this.note+")" ;
		}
		public boolean equals(Object obj) {
			if(obj instanceof Etudiant ) {
				return false ;
				//Deux Etudiants sans égaux si et seulement s’ils ont la même valeur de id
				return ((Etudiant)obj).id== this.id ;		
			}
			public boolean compareTo (Etudiant e)
			{
				if(e.note > this.note)
					return true;
				  return false;	
			}
			
			
			
				
			}
		
		
		
		
	}

}
