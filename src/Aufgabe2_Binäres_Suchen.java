import java.util.Arrays;

public class Aufgabe2_Binäres_Suchen {

	public static void main(String[] args) {
		
		System.out.println("Es ist eine statische, rekursive Funktion search() zu schreiben, der ein zu suchendes Element (elem), "
				+ "\ndas Array (a) sowie der kleinste (low) und höchste Index (high) des Arrays übergeben wird und "
				+ "\ndie den Index im Array, an der das zu suchende Element gespeichert ist, zurückgibt. "
				+ "\nBeim binären rekursiven Suchen wird in der Mitte des Arrays nach der zu suchenden Zahl gesucht. "
				+ "\nIst das dort gespeicherte Element kleiner als der gesuchte Wert, wird im rechten Teil des Arrays "
				+ "\nmit derselben Methode gesucht, sonst im linken Teil. Teste dein Programm mit dem dargestellten Array.");
		
		int array[] = {19,11,7,17,2,5,13,3};
		Arrays.sort(array);
		int legth = array.length;
		System.out.print("\nein Zahl zu suchen: ");
		int suchen = mainApp.scan.nextInt();
		int result = rekursionBinarySechen(array, 0, legth-1, suchen);
		
		if(result == 0) {
			System.out.println("Element nicht gefunden");
		}else {
			System.out.println("Element gefunden am index: " + result);
		}
		

	}
	
	static int rekursionBinarySechen(int arr[],int element,int length, int suche) {
		
		if(length >= element) {
			
			int mid = element + (length - element)/2;
			
			if(arr[mid] == suche) {
				return mid;
			}
			
			if(arr[mid] > suche) {
				return rekursionBinarySechen(arr, element, mid-1, suche);
				
			}else {
				
				return rekursionBinarySechen(arr, mid+1, length, suche);
			}
		}
		return 0;
	}
	
	

}
