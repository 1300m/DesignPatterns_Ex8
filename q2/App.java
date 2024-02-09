import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Subscriber s1 = new Subscriber();
        Subscriber s2 = new Subscriber();

        LiveScore live = new LiveScore();
        live.add(s1);
        live.add(s2);

        Scanner inp = new Scanner(System.in);
        String result = "";
        while(true) {
            System.out.print("Enter score: ");
            result = inp.nextLine();

            if(result.equals("")) break;

            live.setResult(result);
        }
        inp.close();
    }
}
