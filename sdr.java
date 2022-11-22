import java.io.BufferedReader;
import java.io.FileReader;

public class sdr2 {


	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/sdr.dat"));
			String input,splitA,splitB;
			
						while (true) {
				input = br.readLine();

				if (input == null)
					break;
				String split[] = input.split(" ");
				splitA = split[0].substring(0,Integer.parseInt(split[1]));
				splitB = split[0].substring(Integer.parseInt(split[1]),split[0].length());
				System.out.print(splitA+"-");
				for (int i=split[0].length()-1;i>=0;i--) {
					if(i==Integer.parseInt(split[1])-1)
						System.out.print("-");
					
					System.out.print(split[0].charAt(i));
					}
				
				System.out.println("-"+splitB);

			}
						br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
