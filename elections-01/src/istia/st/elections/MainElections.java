package istia.st.elections;

import java.util.Scanner; 

public class MainElections {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		boolean saisieOk = false;
		int nbSiegesAPourvoir;
		int nbListes;
		String[] nomListe[];
		int[] voixListe[];
		boolean[] elimineListe[];
		int[] siegesListe[];
		double[] moyenneListe[];
		int i;
		int nbVoixUtiles;
		double quotientElectoral;
		int nbSiegesPourvus;
		double moyenneMax;
		int Max;
		int Siege;
		do {
			System.out.println("Nombre de sièges à pourvoir : ");
			nbSiegesAPourvoir = sc.nextInt();
		}while(saisieOk != true );
	}
}
