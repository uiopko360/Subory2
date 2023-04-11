import java.awt.LinearGradientPaint;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Subory2uloha4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\nums.txt"));
		String line;
		int p = 0;
		while((line = br.readLine()) != null) {
			for(int i = 0; i < line.length(); i++) {
				if(line.charAt(i) >= '2' && line.charAt(i) <= '9') p++;
			}
			if(p > 0) System.out.println(line + " NIE");
			else System.out.println(line + " ANO");
			p = 0;
		}
	}

}
