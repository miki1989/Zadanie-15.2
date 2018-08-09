import java.util.Comparator;

public class Comparatory {
    public static Comparator<User> IMIEROSNACO = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<User>IMIEMALEJACO = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return -o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<User>NAZWISKOMALEJACO = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return -o1.getLastName().compareTo(o2.getLastName());
        }
    };

    public static Comparator<User>NAZWISKOROSNACO = new Comparator<User>() {
        @Override
        public int compare(User o1, User o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    };
}
