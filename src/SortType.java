public enum SortType {
    IMIEMALEJACO ("Imie malejąco"),
    IMIEROSNACO ("Imię rosnąco"),
    NAZWISKOMALEJACO ("Nazwisko malejąco"),
    NAZWISKOROSNACO ("Nazwisko rosnąco"),
    END("Koniec");
    public final String name;

    SortType(String name){
        this.name = name;
    }

}
