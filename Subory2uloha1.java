import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Subory2uloha1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("D:\\Ulohy\\Orechovský\\Workspace\\Subor2\\src\\znamky.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Ulohy\\Orechovský\\Workspace\\Subor2\\src\\znamkycopy.txt"));
		String line;
		
		int pocetziakov = 0;
		int sucetziakov = 0;
		double najlepsipriemer = 5;
		double najhorsipriemer = 0;
		String najlepsiemeno = "";
		String najhorsiemeno = "";
		double priemertriedy = 0;
		while((line = br.readLine()) != null) {
			String meno = line;
			line = br.readLine();
			String [] znamky = line.split(" ");
			int sucet = 0;	
			for(int i = 0; i < znamky.length; i++) {
				sucet += Integer.parseInt(znamky[i]);
				sucetziakov += Integer.parseInt(znamky[i]);
				pocetziakov++;
			}	
			double priemer = (double) sucet / znamky.length;
			bw.write(meno);
			bw.newLine();
			bw.write(Double.toString(priemer));
			bw.newLine();
			

            if (priemer > najhorsipriemer) {
                najhorsipriemer = priemer;
                najhorsiemeno = meno;
            }

            if (priemer < najlepsipriemer) {
                najlepsipriemer = priemer;
                najlepsiemeno = meno;
            }
		}
		 priemertriedy = (double) sucetziakov / pocetziakov;
         System.out.println("Meno žiaka s najlepším priemerom: " + najlepsiemeno);
         System.out.println("Meno žiaka s najhorším priemerom: " + najhorsiemeno);
         System.out.println("Celkový priemer triedy: " + priemertriedy);

         br.close();
         bw.close();
	}

}
