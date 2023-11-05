import java.util.Scanner;

public class OperacjeKonsoli {
    public void NacisnijEnter()
    {
        System.out.println("Naciśnij \"ENTER\" aby kontynuować...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
}
