import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yearOfBirth;
        String zodyakBurcu;
        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen doğum yılınızı giriniz: ");
        yearOfBirth = sc.nextInt();
        int i = yearOfBirth%12;
        switch (i){
            case 0:{
                zodyakBurcu = "Maymun";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 1:{
                zodyakBurcu = "Horoz";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 2:{
                zodyakBurcu = "Köpek";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 3:{
                zodyakBurcu = "Domuz";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 4:{
                zodyakBurcu = "Fare";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 5:{
                zodyakBurcu = "Öküz";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 6:{
                zodyakBurcu = "Kaplan";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 7:{
                zodyakBurcu = "Tavşan";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 8:{
                zodyakBurcu = "Ejderha";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 9:{
                zodyakBurcu = "Yılan";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 10:{
                zodyakBurcu = "At";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
            case 11:{
                zodyakBurcu = "Koyun";
                System.out.println("Çin zodyağı burcunuz: " + zodyakBurcu);
                break;
            }
        }
    }
}