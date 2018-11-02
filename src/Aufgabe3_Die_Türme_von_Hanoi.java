
public class Aufgabe3_Die_Türme_von_Hanoi {

	public static void main(String[] args) {
		
		Aufgabe3_Die_Türme_von_Hanoi object = new Aufgabe3_Die_Türme_von_Hanoi();
		System.out.print("Zahl für Scheiben: ");
		int scheiben = mainApp.scan.nextInt();
		object.lösung(scheiben, "A", "B", "C");
		
	}
	
	public void lösung(int scheiben, String anfang, String hilfsturm, String ende) {
		
		if(scheiben == 1) {
			System.out.println(anfang + " -> " + ende);
		}else {
			lösung(scheiben - 1, anfang, ende, hilfsturm);
			System.out.println(anfang + " -> " + ende);
			lösung(scheiben - 1, hilfsturm, anfang, ende);
		}
	}
	
	// hilfe von http://www.javawithus.com/programs/towers-of-hanoi

}
