package breif3;


public class Personne {

	String nom;
	int age;
	
	
	
	public Personne(String nom, int age) {
		super();
		this.nom = nom;
		this.age = age;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


public void afficher() {
		
		System.out.println(" Je suis "+ getNom() + " j’ai " + getAge() +" ans et je travaille en tant que opticienne !");
		
	}

}
