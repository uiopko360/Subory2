import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Subory2uloha3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\pali.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\palicopy.txt"));
		String line;
		int p = 0;
		while((line = br.readLine()) != null) {
			String veta1 = line;
			String veta = veta1.replace(" ", "");
			StringBuilder sb = new StringBuilder();
			sb.append(veta);
			String novy = sb.reverse().toString();
			if(novy.equalsIgnoreCase(veta)) {
				p++;
				bw.write(veta1);
			}
			bw.newLine();
		}
		bw.write("pocet palindromov: " + Integer.toString(p));
		bw.close();
		br.close();
	}

}
