import java.util.Comparator;

public class User implements  Comparable<User>{
    private String name;
    private String lastName;

    public User(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return name + " " + lastName + "\n";
    }

    @Override
    public int compareTo(User o) {
        return 0;
    }

    /*public static Comparator<User>IMIEROSNACO = new Comparator<User>() {
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
    */
}
