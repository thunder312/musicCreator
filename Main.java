public class Main {
    public static void main(String[] args) throws Exception{
        MusicalNote fundamentalTone = new MusicalNote("X");
        Scale cMajor = new Scale(fundamentalTone, "Major");
        cMajor.print();
    }
}
