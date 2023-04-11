import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Subory2uloha5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("D:\\Ulohy\\Orechovský\\Workspace\\Subor2\\src\\hobbit.txt"));
		String line;
		int pocet = 0; // pocet riadkov
		int vety = 0; // pocet viet
		int pslova = 0; // pocet slov
		int najdlh = 0;
		String najslovo = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("Daj dlzku slova: ");
		int dlzka = sc.nextInt();
		ArrayList<String> hladane = new ArrayList<String>();
		while ((line = br.readLine()) != null) {
			pocet++;
			String [] slova = line.split(" ");
			for(int i = 0; i < slova.length; i++) {
				if(slova[i].length() > najdlh) {
					najdlh = slova[i].length();
					najslovo = slova[i];
				}
				if(slova[i].contains(".") || slova[i].contains(",")) {
					String pomoc = slova[i].substring(0, (slova[i].length() - 1));
					if(pomoc.length() == dlzka) hladane.add(slova[i]);
				}
			}
			pslova += slova.length;
			if(line.contains(".") == true) vety++; 
		}
		if(najslovo.contains(".") || najslovo.contains(",")) {
			najdlh = najdlh - 1;
			najslovo = najslovo.substring(0, (najslovo.length() -1));
		}
		System.out.println("Pocet riadkov je: " + pocet);
		System.out.println("Pocet viet je: " + vety);
		System.out.println("Pocet slov je: " + pslova);
		System.out.println("Najdlhsie slovo je: " + najslovo + " a je dlhe " + najdlh);
		System.out.println("Slova s hladanou dlzkou: " + dlzka +" "+ hladane.toString());
		br.close();
	}

}
