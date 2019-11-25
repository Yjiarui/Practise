import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StreamTokenizer;
 
public class SameScore{
	public static void main(String[] args) throws IOException {
		StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		while (in.nextToken() != StreamTokenizer.TT_EOF) {
			int n = (int) in.nval;
			if(n == 0){
				break;
			}
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				in.nextToken();
				arr[i] = (int) in.nval;
			}
			in.nextToken();
			int score = (int) in.nval;
			int count = 0;
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] == score){
					count++;
				}
			}
			out.println(count);
			out.flush();
		}
	}
}
