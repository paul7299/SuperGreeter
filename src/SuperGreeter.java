import java.util.Scanner;

public class SuperGreeter {
    public static void main(String[] args) {
        SuperGreeter sg = new SuperGreeter();
        sg.start();
        sg.greet();
        System.out.println(sg.askAboutAge());

    }

    public void start() {
        System.out.println("Det virker!");
    }

    public void greet() {
        System.out.println("- Indtast dit navn:");
        Scanner sc = new Scanner(System.in);
        String navn = sc.nextLine();
        System.out.println("Hej " + navn);
    }

    public int askAboutAge() {
        System.out.println("- Hvor gammel er du?");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        return age;
    }

}
