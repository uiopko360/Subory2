import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Subory2uloha8 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\PARK.TXT"));
		String line;
		int s = 0;
		int t = 0;
		int k = 0;
		int v = 0;
		while ((line=br.readLine()) != null) {
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) == 'S') s++;
				if(line.charAt(i) == 'T') t++;
				if(line.charAt(i) == 'K') k++;
				if(line.charAt(i) == 'V') v++;
			}
			
		}
		br.close();
		int sucet = s*500 + t*100 + k*20;
		System.out.println("Travnik zabera " + t + " m2.");
		System.out.println("Vchodov je: " + v);
		System.out.println("Pouzitych bolo " + sucet + "g hnojiva.");
	}

}
