import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class kelipatan {
    public static void main(String[] args) throws IOException{
         int batas, kelipatan;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        System.out.print("Batas = ");
        batas = Integer.parseInt(br.readLine());

        System.out.print("Kelipatan = ");
        kelipatan = Integer.parseInt(br.readLine());
        
          for (int a = 1; a < batas; a = a + kelipatan) {
            System.out.print(a + " ");
        }

        System.out.println("");

    }

}
