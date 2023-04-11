import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Subory2uloha10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\pomoc.txt\\"));
		String line;
		int v = 0; // pocet v. pismen
		int m = 0; // pocet m. pismen
		int c = 0; // pocet cislic
		int o = 0; // pocet ostatnych
		int r = 0; // pocet riadkov
		int s = 0; // pocet slov
		int vety = 0; // pocet viet
		while ((line=br.readLine()) != null) {
			r++;
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) >= 65 && line.charAt(i) <= 90) v++;
				else if(line.charAt(i) >= 97 && line.charAt(i) <= 122) m++;
				else if(line.charAt(i) >= 48 && line.charAt(i) <= 57) c++;
				else o++;
				if(line.charAt(i) == '.') vety++;
			}
			String [] slova = line.split(" ");
			s+= slova.length;
		}
		br.close();
		System.out.println("Velkych pismen je: " + v);
		System.out.println("Malych pismen je: " + m);
		System.out.println("Cislic je: " + c);
		System.out.println("Ostatnych je: " + o);
		System.out.println("Slov je: " + s);
		System.out.println("Viet je: " + vety);
		System.out.println("Riadkov je: " + r);
		
	}

}
