package Cexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args)  {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException| ArithmeticException  e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IndexOutOfBoundsException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do RuntimeException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        try {
            talvezLanceException();
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, IOException {

    }
}
