import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        ArrayList<Users> listUsers = new ArrayList<>();
        listUsers.add(new Users("Jan", "Kowalski"));
        listUsers.add(new Users("Ramona", "Shelbourne"));
        listUsers.add(new Users("Adrian", "Wojnarowski"));
        listUsers.add(new Users("Chams", "Charania"));
        listUsers.add(new Users("Fareed", "Zakaria"));
        listUsers.add(new Users("Zygmunt", "Bee"));

        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            try {
                System.out.println("Typu komparatorów");
                SortType[] sortTypes = SortType.values();
                for (SortType sortType : sortTypes) {
                    System.out.println(sortType);
                }
                String sortTypeString = scanner.nextLine();
                SortType sortType = SortType.valueOf(sortTypeString);
                if (sortType == SortType.IMIEMALEJACO) {
                    listUsers.sort(Users.IMIEMALEJACO);
                    System.out.println(listUsers);
                }
                if (sortType == SortType.IMIEROSNACO) {
                    listUsers.sort((Users.IMIEROSNACO));
                    System.out.println(listUsers);
                }
                if (sortType == SortType.NAZWISKOMALEJACO) {
                    listUsers.sort(Users.NAZWISKOMALEJACO);
                    System.out.println(listUsers);
                }
                if (sortType == SortType.NAZWISKOROSNACO) {
                    listUsers.sort(Users.NAZWISKOROSNACO);
                    System.out.println(listUsers);
                }
                if(sortType == SortType.END){
                    System.out.println("Koniec programu");
                    flag = false;
                }
            }
            catch (IllegalArgumentException ex){
                System.out.println("Niepoprawna wartość. Spróbuj jeszcze raz");
            }

        }
        /*listUsers.sort(Users.IMIEMALEJACO);
        System.out.println(listUsers);
        System.out.println();
        listUsers.sort(Users.IMIEROSNACO);
        System.out.println(listUsers);
        System.out.println();
        listUsers.sort(Users.NAZWISKOMALEJACO);
        System.out.println(listUsers);
        System.out.println();
        listUsers.sort(Users.NAZWISKOROSNACO);
        System.out.println(listUsers);
        */
    }
}
