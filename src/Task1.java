import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Task1 {

    public static void main(String[] args) throws IOException {

       try {
           Integer number;

           BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
           number = Integer.valueOf(buf.readLine());

//    Бинарный формат
           String convert = Integer.toBinaryString(number);
           System.out.println(convert);
//   Восьмиричный формат
           convert = Integer.toOctalString(number);
           System.out.println(convert);
//   Шеснадцатиричный формат
           convert = Integer.toHexString(number);
           System.out.println(convert);
       } catch (NumberFormatException exception){
        System.out.println("Вводить только цифры!");
    }
}}