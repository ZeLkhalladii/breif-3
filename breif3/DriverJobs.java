package breif3;

public class DriverJobs {
   
	
	public static void main(String[] argv) {
		
		Personne[] personnes = new Personne[2];
		personnes[0] = new Medecin("Maher",31);
		personnes[1] = new Opticienne("Iman",33);
		

		for (int i = 0; i < personnes.length; i++)
		personnes[i].afficher();
}
}
