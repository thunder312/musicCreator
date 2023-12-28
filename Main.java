public class Main {
    public static void main(String[] args) {
        MusicalNote fundamentalTone = new MusicalNote("C");
        Scale cMajor = new Scale(fundamentalTone, "Major");
        cMajor.print();
        cMajor.scale.get(3).print();
    }
}
