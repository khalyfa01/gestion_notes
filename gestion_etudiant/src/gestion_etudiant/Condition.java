package gestion_etudiant;

import java.util.List;

public interface Condition {
	public boolean estVrai (Etudiant e) ;
	public List<Etudiant> filtrer(Condition c);

}
