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

    Map<String, Double> defaultScale = Map.ofEntries(
    entry("C", 264.0),
    entry("Cis", 280.5),
    entry("D", 297.0),
    entry("Dis", 313.5),
    entry("E", 330.0),
    entry("Eis", 341.0),
    entry("F", 352.0),
    entry("Fis", 374.0),
    entry("G", 396.0),
    entry("Gis", 418.0),
    entry("A", 440.0),
    entry("B", 466.0),
    entry("H", 495.0)
   );

    // default c-tor
    MusicalNote() {
        this.letter = "A";
        this.frequency = concertPitchFreq.get("default");
        this.name = "concert pitch 'A'";
        this.octave = 1;
        System.out.println("Created musical note " + this.name + " ( " + this.frequency + " " + siUnit + " ) as default.");
    }

    // full c-tor
    MusicalNote(String letter, double frequency, String name, int octave) throws Exception {
        this.letter = letter;
        // no frequency given; try to find it via letter in a c-major scale
        if(frequency == -1) {
            if(defaultScale.containsKey(letter)) {
                this.frequency = defaultScale.get(letter);
            } else {
                throw new Exception("No musical note found named '"+ letter + "' in default scale (based on concert pitch A, starting with C).");
            }
        } else {
            this.frequency = frequency;
        }
        this.name = name;
        this.octave = octave;
    }

    MusicalNote(String letter, double frequency, String name) throws Exception {
         this(letter, frequency, name, 1);
    }

    
    MusicalNote(String letter, double frequency, int octave) throws Exception{
         this(letter, frequency, "", octave);
    }

    MusicalNote(String letter, double frequency) throws Exception {
       this(letter, frequency, "", 1);
    }

    MusicalNote(String letter) throws Exception {
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
