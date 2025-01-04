import javax.swing.plaf.synth.SynthSliderUI;
import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);


        if(ch>='a' && ch<='z'){
            System.out.println("Char is Lowercase");

        }else {
            System.out.println("Char Uppercase");
        }

    }
}
