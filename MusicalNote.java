import java.util.Map;
import static java.util.Map.entry;

public class MusicalNote {
    // member
        String letter;
        int octave = 0;
        String name = "";
        double frequency; // Hz
        final String siUnit = "Hz";

   Map<String, Double> concertPitchFreq = Map.ofEntries(
    entry("default", 440.0),
    entry("de", 443.0),
    entry("at", 443.0),
    entry("ch", 442.0)
   );

    Map<String, Double> cMajor = Map.ofEntries(
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
    MusicalNote() {
        this.letter = "A";
        this.frequency = concertPitchFreq.get("default");
        this.name = "Kammerton A";
        this.octave = 1;
        System.out.println("Created musical note " + this.name + " ( " + this.frequency + " " + siUnit + " ) as default.");
    }

    // full c-tor
    MusicalNote(String letter, double frequency, String name, int octave) {
        this.letter = letter;
        // no frequency given; try to find it via letter in a c-major scale
        if(frequency == -1) {
            this.frequency = cMajor.get(letter);
        } else {
            this.frequency = frequency;
        }
        this.name = name;
        this.octave = octave;
    }

    MusicalNote(String letter, double frequency, String name) {
         this(letter, frequency, name, 1);
    }

    
    MusicalNote(String letter, double frequency, int octave) {
         this(letter, frequency, "", octave);
    }

    MusicalNote(String letter, double frequency) {
       this(letter, frequency, "", 1);
    }

    MusicalNote(String letter) {
      this(letter, -1, "", 1);
    }

    protected void print() {
        System.out.println(letter + octaveToSymbols(octave) + "\t( " + frequency + siUnit +  " )");
    }

    protected static String octaveToSymbols(int octave) {
        String symbols = "";
        for(int i = 0; i < octave; i++) {
            symbols+="'";
        }
        return symbols;
    }
}
