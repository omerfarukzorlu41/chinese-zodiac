import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int birthdate,zodiac;
        String horoscope ="";
        System.out.print("Please enter a birthdate: ");
        birthdate = scanner.nextInt();
        zodiac = birthdate % 12;
        switch (zodiac){
            case 0:
                horoscope ="monkey";
                break;
            case 1:
                horoscope ="cock";
                break;
            case 2:
                horoscope ="dog";
                break;
            case 3:
                horoscope ="pig";
                break;
            case 4:
                horoscope ="mouse";
                break;
            case 5:
                horoscope ="ox";
                break;
            case 6:
                horoscope ="tiger";
                break;
            case 7:
                horoscope ="rabbit";
                break;
            case 8:
                horoscope ="dragon";
                break;
            case 9:
                horoscope ="snake";
                break;
            case 10:
                horoscope ="horse";
                break;
            case 11:
                horoscope ="sheep";
                break;
        }
        System.out.println("Your zodiac: "+horoscope);
    }
}
