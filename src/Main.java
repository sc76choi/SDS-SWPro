import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	static int T, ans;
	
	public static void main(String[] args) throws Exception {
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		T = Integer.parseInt(br.readLine());
		
		for(int i=0; i < T; i++){
			bw.write("#"+i+" " + ans + " ");
			bw.write("\n");
		} // end of tc
		
		bw.flush();
		bw.close();
	}
}