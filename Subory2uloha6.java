import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Subory2uloha6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("D:\\Ulohy\\Orechovský\\Workspace\\Subor2\\src\\cisla6.txt"));
		String line;
		while ((line = br.readLine()) != null) {
			int p = 0;
			for(int i = 1; i <= Integer.parseInt(line); i++) {
				if(Integer.parseInt(line) % i == 0) p++;
			}
			if(p == 2) System.out.println(Integer.parseInt(line) + " je prvocislo");
			else System.out.println(Integer.parseInt(line) + " nie je prvocislo");
		}
	}

}
