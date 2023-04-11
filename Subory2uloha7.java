import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Subory2uloha7 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stubS
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\tance.txt"));
		BufferedWriter standart = new BufferedWriter(new FileWriter("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\standart.txt"));
		BufferedWriter latino = new BufferedWriter(new FileWriter("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\latino.txt"));
		String line;
		int najuspesnejsi1 = 0;
		int sk = 0; // sucet bodov sk. tanecnikov
		int cz = 0; // sucet bodov cz. tanecnikov
		String najusp1 = "";
		int najuspesnejsi2 = 0;
		String najusp2 = "";
		while ((line = br.readLine()) != null) {
			String [] udaje = line.split(" ");
			if(udaje[1].equals("STA")) {
				if(Integer.parseInt(udaje[3]) > najuspesnejsi1) {
					najuspesnejsi1 = Integer.parseInt(udaje[3]);
					najusp1 = udaje[0];
				}
				if(udaje[2].equals("SK")) sk += Integer.parseInt(udaje[3]);
				else cz += Integer.parseInt(udaje[3]);
				standart.write(line);
				standart.newLine();
			}
			else if(udaje[1].equals("LAT")) {
				if(Integer.parseInt(udaje[3]) > najuspesnejsi2) {
					najuspesnejsi2 = Integer.parseInt(udaje[3]);
					najusp2 = udaje[0];
				}
				if(udaje[2].equals("SK")) sk += Integer.parseInt(udaje[3]);
				else cz += Integer.parseInt(udaje[3]);
				latino.write(line);
				latino.newLine();
			}
			
		}
		standart.close();
		latino.close();
		System.out.println("Najuspesnejsi standartny par " + najusp1 + " s " + najuspesnejsi1 + " bodmi.");
		System.out.println("Najuspesnejsi latinskoamericky par " + najusp2 + " s " + najuspesnejsi2 + " bodmi.");
		if(cz>sk) System.out.println("CZ bola uspesnejsia s " + cz + "b.");
		else if(sk>cz) System.out.println("SK bola uspesnejsia s " + sk + "b.");
		else System.out.println("Remiza");
		
	}
}
