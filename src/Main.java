import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Users> listUsers = new ArrayList<>();
        listUsers.add(new Users("Jan", "Kowalski"));
        listUsers.add(new Users("Ramona", "Shelbourne"));
        listUsers.add(new Users("Adrian", "Wojnarowski"));
        listUsers.add(new Users("Chams", "Charania"));
        listUsers.add(new Users("Fareed", "Zakaria"));
        listUsers.add(new Users("Zygmunt", "Bee"));

        listUsers.sort(Users.IMIEMALEJACO);
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

    }
}
