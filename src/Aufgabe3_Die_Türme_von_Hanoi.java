
public class Aufgabe3_Die_T�rme_von_Hanoi {

	public static void main(String[] args) {
		
		Aufgabe3_Die_T�rme_von_Hanoi object = new Aufgabe3_Die_T�rme_von_Hanoi();
		System.out.print("Zahl f�r Scheiben: ");
		int scheiben = mainApp.scan.nextInt();
		object.l�sung(scheiben, "A", "B", "C");
		
	}
	
	public void l�sung(int scheiben, String anfang, String hilfsturm, String ende) {
		
		if(scheiben == 1) {
			System.out.println(anfang + " -> " + ende);
		}else {
			l�sung(scheiben - 1, anfang, ende, hilfsturm);
			System.out.println(anfang + " -> " + ende);
			l�sung(scheiben - 1, hilfsturm, anfang, ende);
		}
	}
	
	// hilfe von http://www.javawithus.com/programs/towers-of-hanoi

}
