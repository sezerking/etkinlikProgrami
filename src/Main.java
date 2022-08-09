import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int heat;

        Scanner scn = new Scanner(System.in);
        System.out.println("Sicaklik giriniz: ");
        heat=scn.nextInt();
        if (heat<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heat<=25) {
            if (heat<=15){
                System.out.println("Sinemaya gidebilirsin.");
            }
            if (heat>=10){
                System.out.println("Piknige gidebilirsinizç");
            }
        }
        else {
            System.out.println("yüzmeye gidebilirisniz");
        }
    }
}
