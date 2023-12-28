public class Main {
    public static void main(String[] args) throws Exception{
        MusicalNote fundamentalTone = new MusicalNote("C");
        Scale cMajor = new Scale(fundamentalTone, "Major");
        cMajor.print();
    }
}
