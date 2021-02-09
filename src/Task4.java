import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {

            public static void main(String[] args) throws IOException {

                BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
                String str1;
                String str2;
                str1 = buf.readLine();
                str2 = buf.readLine();

                System.out.println("1) " + str1);
                System.out.printf("2) %s%n", str2.replaceAll("([a-zA-Z1-9])", "*"));

            if  (str1.equals(str2))
            {
//           Считывает * как букву
//           String str = str1.length() > str2.length() ? str1 : str2;
             System.out.println("OK");

            } else {
                System.out.println("КO");
            }

        }
    }



