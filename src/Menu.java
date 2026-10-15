import java.util.Scanner;

public class Menu {
    private int team;

    Scanner scanner = new Scanner(System.in);

public void teams() {
    System.out.println("Что вы хотите сделать?");
    System.out.println("1 - Прочитать текст либретто.");
    System.out.println("2 - Узнать кто режиссёр спектакля.");
    System.out.println("3 - Ознакомится со списком актёров.");
    System.out.println("4 - Добавить актёра в спектакль.");
    System.out.println("5 - Заменить актёра на другого.");
    System.out.println("6 - Выход.");

    team = scanner.nextInt();
}

public void teamwork() {
        switch(team) {
            case 1: printLibrettoText();
                break;
            case 2
                break;
            case 3
                break;
            case 4
                break;
            case 5
                break;
            case 6
                break;
            default : System.out.println("Такой команды нет.");
        }
}
}
