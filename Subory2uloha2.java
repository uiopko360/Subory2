import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Subory2uloha2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("D:\\Ulohy\\Orechovský\\Workspace\\Subor2\\src\\vysvedcenie.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ulohy\\Orechovský\\Workspace\\Subor2\\src\\vysvedceniecopy.txt"));
		
		String line;
		int p = 0;
		int sucet = 0;
		String prospech = "";
		while((line = br.readLine()) != null) {
			String [] znamky = line.split(" ");
			for(int i = 0; i < znamky.length; i++) {
				sucet += Integer.parseInt(znamky[i]);
				//System.out.println(znamky[i]);
				p++;
				if(Integer.parseInt(znamky[i]) == 3) prospech = "Prospel velmi dobre";
				else if(Integer.parseInt(znamky[i]) == 4) prospech = "Prospel";
				else if(Integer.parseInt(znamky[i]) == 5) prospech = "Neprospel";
			}
			double priemer = (double) sucet / p;
			if(priemer < 1.5) prospech = "Prospel s vyznamenanim";
			else if(priemer >= 1.5 && priemer < 2.0) prospech = "Prospel velmi dobre";
			System.out.println(priemer);
			System.out.println(prospech);
			bw.write(Double.toString(priemer) + " ");
			bw.write(prospech);
			sucet = 0;
			p = 0;
			bw.newLine();
		}
		br.close();
		bw.close();
	}

}
