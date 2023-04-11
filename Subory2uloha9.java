import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Subory2uloha9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\meteo.txt\\"));
		Scanner sc = new Scanner(System.in);
		System.out.println("Typ oblacnosti (PO/PJ/OO/JJ)");
		String obl = sc.nextLine();
		
		int PO = 0;
		int PJ = 0;
		int OO = 0;
		int JJ = 0;
		
		double max = -273.15;
		String maxS = "";
		double min = 80;
		String minN = "";
		
		String line;
		while ((line=br.readLine()) != null) {
			String [] stanica = line.split(" ");
			if(stanica[4].equals("PO")) PO++;
			else if(stanica[4].equals("PJ")) PJ++;
			else if(stanica[4].equals("OO")) OO++;
			else if(stanica[4].equals("JJ")) JJ++;
			if(Double.parseDouble(stanica[3]) > max) {
				max = Double.parseDouble(stanica[3]);
				maxS = stanica[0];
			}
			else if(Double.parseDouble(stanica[3]) < min) {
				min = Double.parseDouble(stanica[3]);
				minN = stanica[0];
			}
		}
		br.close();
		
		System.out.println("Najvyssia teplota bola namerana v stanici " + maxS +" "+max);
		System.out.println("Najnizsia teplota bola namerana v stanici " + minN +" "+min);
		if(obl.equals("PO")) System.out.println("Oblacnost: " + obl +" "+ PO );
		else if(obl.equals("PJ")) System.out.println("Oblacnost: " + obl +" "+ PJ );
		else if(obl.equals("OO")) System.out.println("Oblacnost: " + obl +" "+ OO );
		else if(obl.equals("JJ")) System.out.println("Oblacnost: " + obl +" "+ JJ );
	}

}
