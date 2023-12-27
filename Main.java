public class Main {
    public static void main(String[] args) {
        Note grundton = new Note("C");
        Tonleiter cDur = new Tonleiter(grundton, "Dur");
        cDur.print();
        cDur.tonleiter.get(3).print();
    }
}
