
public class Aufgabe1_Gr��ter_gemeinsamer_Teiler {
	
	public static void main(String[] args) {
		
		
		System.out.println("Schreibe eine statische Funktion ggt(), die den gr��ten gemeinsamen Teiler zweier"
				+ " \nihr �ber-gebener Zahlen ermittelt und zur�ckgibt. Teste die Funktion.");
		System.out.print("\nZahl 1: ");
		int A = mainApp.scan.nextInt();
		System.out.print("Zahl 2: ");
		int B = mainApp.scan.nextInt();
		
		System.out.println("Die gr��ten gemeinsamen Teiler ist: " + rechner(A ,B));
	}
	
	public static int rechner(int zahl1, int zahl2) {
		int rest;
		int big;
		while(true) {
			rest = zahl1 % zahl2;
			if(rest != 0) {
				zahl1 = zahl2;
				zahl2 = rest;
				big = rest;
			}else {
				big = zahl2;
				break;
			}
		}
		return big;
	}

}
