import java.util.Comparator;

public class Users implements  Comparable<Users>{
    private String name;
    private String lastName;

    public Users(String name, String lastName) {
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
    public int compareTo(Users o) {
        return 0;
    }

    public static Comparator<Users>IMIEROSNACO = new Comparator<Users>() {
        @Override
        public int compare(Users o1, Users o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Users>IMIEMALEJACO = new Comparator<Users>() {
        @Override
        public int compare(Users o1, Users o2) {
            return -o1.getName().compareTo(o2.getName());
        }
    };
    public static Comparator<Users>NAZWISKOMALEJACO = new Comparator<Users>() {
        @Override
        public int compare(Users o1, Users o2) {
            return -o1.getLastName().compareTo(o2.getLastName());
        }
    };

    public static Comparator<Users>NAZWISKOROSNACO = new Comparator<Users>() {
        @Override
        public int compare(Users o1, Users o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    };
}
