package DclassesUtilitarias.bStringTest;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Willian"; // String constant pool
        String nome2 = "Willian";
        nome = nome.concat(" Suane"); // nome += " Suane"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Willian"); // 1 variável de referência, 2 objeto do tipo String, 3 uma String no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
