package gestion_etudiant;
import java.util.ArrayList;
import java.util.List;


public class ListEtudiant extends ArrayList<Etudiant> {
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
	}
	public List<Etudiant> filtrer(Condition c){
		ListEtudiant l = new ListEtudiant;
		for (int i=0; i<this.size(); i++)
		{
			if(c.estVrai(e))
				return l.add(e);
		}
	}
	

}
