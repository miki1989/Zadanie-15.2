import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        ArrayList<User> listUsers = new ArrayList<>();
        listUsers.add(new User("Jan", "Kowalski"));
        listUsers.add(new User("Ramona", "Shelbourne"));
        listUsers.add(new User("Adrian", "Wojnarowski"));
        listUsers.add(new User("Chams", "Charania"));
        listUsers.add(new User("Fareed", "Zakaria"));
        listUsers.add(new User("Zygmunt", "Bee"));

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Typy komparatorów");
                SortType[] sortTypes = SortType.values();
                for (SortType sortType : sortTypes) {
                    System.out.println(sortType);
                }
                String sortTypeString = scanner.nextLine();
                sortTypeString = sortTypeString.toUpperCase();
                SortType sortType = SortType.valueOf(sortTypeString);
                switch (sortType){
                    case IMIEMALEJACO:
                        listUsers.sort(Comparatory.IMIEMALEJACO);
                        System.out.println(listUsers);
                        break;
                    case IMIEROSNACO:
                        listUsers.sort((Comparatory.IMIEROSNACO));
                        System.out.println(listUsers);
                        break;
                    case NAZWISKOMALEJACO:
                        listUsers.sort(Comparatory.NAZWISKOMALEJACO);
                        System.out.println(listUsers);
                        break;
                    case NAZWISKOROSNACO:
                        listUsers.sort(Comparatory.NAZWISKOROSNACO);
                        System.out.println(listUsers);
                        break;
                    case END:
                        System.out.println("Koniec programu");
                        flag = false;
                        break;
                }
            }
            catch (IllegalArgumentException ex){
                System.out.println("Niepoprawna wartość. Spróbuj jeszcze raz");
            }

        }
        /*listUsers.sort(User.IMIEMALEJACO);
        System.out.println(listUsers);
        System.out.println();
        listUsers.sort(User.IMIEROSNACO);
        System.out.println(listUsers);
        System.out.println();
        listUsers.sort(User.NAZWISKOMALEJACO);
        System.out.println(listUsers);
        System.out.println();
        listUsers.sort(User.NAZWISKOROSNACO);
        System.out.println(listUsers);
        */
    }
}
