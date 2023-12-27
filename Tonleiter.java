import java.util.ArrayList;
import java.util.List;

public class Tonleiter {

    public static final String DUR = "Dur"; 
    public static final String MOLL = "Moll"; 

    String symbol;

    Note grundton;
    Intervall[] intervals;
    String modus;
    List<Note> tonleiter = new ArrayList<Note>();

    Tonleiter(Note grundton, String modus) {
        this.grundton = grundton;
        if(Modi.modus.containsKey(modus.toLowerCase())) {
            this.modus = modus;
        } else {
            System.err.println("Unknown modus: " + modus);
        };
        this.intervals = Modi.modus.get(modus.toLowerCase());
        this.symbol = Note.octaveToSymbols(grundton.octave);
        //System.out.println("Grundton: " + grundton.letter + "\nModus: " + modus + "\nIntervals: " + intervals.length);
        createTonleiter();
    }

    private void createTonleiter() {
        String[] tonnamen = getTonnamen(this.grundton.letter, this.modus, this.grundton.octave);
        tonleiter.add(this.grundton);
         for(int i = 1; i < this.intervals.length; i++) {
            tonleiter.add(new Note(tonnamen[i], this.grundton.frequenz * this.intervals[i].interval, this.grundton.octave));
            //System.out.println(i + " Tonname:" + tonnamen[i] + "\nFrequenz: " + this.grundton.frequenz + " * " + this.intervals[i].interval + " = " + this.grundton.frequenz * this.intervals[i].interval);
        }
    }

    private String[] getTonnamen(String letter, String modus, int octave) {
        String[] result = {};
        switch(modus) {
            case "Dur":
                switch(letter) {
                    case "C":
                        result = addSymbols(new String[]{"C", "D", "E", "F", "G", "A", "H", "C"});
                        break;
                }

            case "Moll":
                switch(letter) {}
        }
        return result;
    }

    private String[] addSymbols(String[] data) {
        for(int i = 0; i < data.length; i++) {
            if(i == data.length-1){
                data[i]+=this.symbol;
            }
        }
        return data;
    }

    protected void print() {
        System.out.println(grundton.letter + "-" + modus);
        for(int i = 0; i< tonleiter.size(); i++) {
            tonleiter.get(i).print();
        }
        System.out.println("");
    }
}

    /* weitere Modi
        // Ionisch (Dur)
        // Dorisch
        // Phrygisch
        // Lydisch
        // Mixolydisch
        // Äolisch (Moll)
        // Lokrisch
    */
