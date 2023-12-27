import java.util.Map;
import static java.util.Map.entry;

public class Note {
    // member
        String letter;
        int octave = 0;
        String name = "";
        double frequenz; // Hz
        final String siUnit = "Hz";

   Map<String, Double> kammertonFreq = Map.ofEntries(
    entry("standard", 440.0),
    entry("de", 443.0),
    entry("at", 443.0),
    entry("ch", 442.0)
   );

    Map<String, Double> normalCdur = Map.ofEntries(
    entry("C", 264.0),
    entry("D", 297.0),
    entry("E", 330.0),
    entry("F", 352.0),
    entry("G", 396.0),
    entry("A", 440.0),
    entry("B", 466.0),
    entry("H", 495.0)
   );

    // default c-tor
    Note() {
        this.letter = "A";
        this.frequenz = kammertonFreq.get("de");
        this.name = "Kammerton A";
        this.octave = 1;
        System.out.println("Created musical note " + this.name + " ( " + this.frequenz + " " + siUnit + " ) as default.");
    }

    // full c-tor
    Note(String letter, double frequenz, String name, int octave) {
        this.letter = letter;
        // no frequency given; try to find it via letter
        if(frequenz == -1) {
            this.frequenz = normalCdur.get(letter);
        } else {
            this.frequenz = frequenz;
        }
        this.name = name;
        this.octave = octave;
    }

     Note(String letter, double frequenz, String name) {
         this(letter, frequenz, name, 1);
    }

    
    Note(String letter, double frequenz, int octave) {
         this(letter, frequenz, "", octave);
    }

    Note(String letter, double frequenz) {
       this(letter, frequenz, "", 1);
    }

    Note(String letter) {
      this(letter, -1, "", 1);
    }

    protected void print() {
        System.out.println(letter + octaveToSymbols(octave) + "\t( " + frequenz + siUnit +  " )");
    }

    protected static String octaveToSymbols(int octave) {
        String symbols = "";
        for(int i = 0; i < octave; i++) {
            symbols+="'";
        }
        return symbols;
    }
}
