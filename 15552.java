import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.*;
public class Main {
    public static void main(String args[]) throws IOException {
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
      StringTokenizer st;
      int n = Integer.parseInt(bf.readLine());
      
      for(int i = 0;i<n;i++){
          st = new StringTokenizer(bf.readLine());
          bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) + "\n");
      }
      bf.close();
      bw.flush();
      bw.close();
     

      
    }
}
