package DclassesUtilitarias.eUregexTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        // []
        //String regex = "[a-zA-C]"
        String regex = "0[xX][0-9a-fA-F]";
        // String texto = "abaaba";
        String texto2 = "12 0x 0x 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("Texto:  "+texto2);
        System.out.println("Indice: 0123456789");
        System.out.println("Regex: "+regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }
    }
}
