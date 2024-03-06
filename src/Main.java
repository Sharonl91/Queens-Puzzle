import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a  number for your chessboard dimensions:");
        int n = s.nextInt();
        Queens board = new Queens(n);
        board.play();
    }
}