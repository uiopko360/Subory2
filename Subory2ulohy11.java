import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Subory2ulohy11 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Matej\\Desktop\\Workspace\\Subor\\src\\trasy.txt\\"));
		String line;
		double d = 0;
		double najkr = Integer.MAX_VALUE;
		int p = 0; // pocet ucastnikov / riadkov
		while ((line=br.readLine()) != null) {
			p++;
			String [] suradnice = line.split(" ");
			ArrayList<Integer> x = new ArrayList<Integer>();
			ArrayList<Integer> y = new ArrayList<Integer>();
			for(int i = 0; i < suradnice.length; i++) {
			if(i%2 == 0) x.add(Integer.parseInt(suradnice[i]));
			else y.add(Integer.parseInt(suradnice[i]));
			}
			//System.out.println(x.toString());
			//System.out.println(y.toString());
			for(int i = 1; i < x.size(); i++) {
				d += Math.sqrt(Math.pow((x.get(i) - x.get(i-1)), 2) + Math.pow((y.get(i) - y.get(i-1)), 2));
				//System.out.println(d);
			}
			if(d < najkr) najkr = d;
			System.out.println(d);
			d = 0;
		}
		System.out.println("Najkratsia vzdialenost je: "+najkr);
		br.close();
	}

}
