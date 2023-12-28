import java.util.ArrayList;
import java.util.List;

public class Scale {

    String symbol;

    MusicalNote fundamentalTone;
    Interval[] intervals;
    String modus;
    List<MusicalNote> scale = new ArrayList<MusicalNote>();

    Scale(MusicalNote fundamentalTone, String modus) throws Exception{
        this.fundamentalTone = fundamentalTone;
        if(Modi.getModi().containsKey(modus.toLowerCase())) {
            this.modus = modus;
        } else {
            System.err.println("Unknown modus: " + modus);
        };
        this.intervals = Modi.modiIntervals.get(modus.toLowerCase());
        this.symbol = MusicalNote.octaveToSymbols(fundamentalTone.octave);
        createScale();
    }

    private void createScale() throws Exception {
        String[] toneNames = getNoteLetters(this.fundamentalTone.letter, this.modus, this.fundamentalTone.octave);
        this.scale.add(this.fundamentalTone);
         for(int i = 1; i < this.intervals.length; i++) {
            this.scale.add(new MusicalNote(toneNames[i], this.fundamentalTone.frequency * this.intervals[i].proportion, this.fundamentalTone.octave));
            //System.out.println(i + " Tonname:" + tonnamen[i] + "\nFrequency: " + this.fundamentalTone.frequency + " * " + this.intervals[i].proportion + " = " + this.fundamentalTone.frequency * this.intervals[i].interval);
        }
    }

    private String[] getNoteLetters(String letter, String modus, int octave) {
        String[] result = {};
        switch(modus) {
            case "Major":
                switch(letter) {
                    case "C":
                        result = addSymbols(new String[]{"C", "D", "E", "F", "G", "A", "Ces/H", "C"});
                        break;
                }
            break;

            case "Minor":
                switch(letter) {
                    case "C":
                        result = addSymbols(new String[]{"C", "D", "Dis", "F", "G", "Gis", "Ais/B", "C"});
                        break;
                }
            break;
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
        System.out.println("Fundamental tone: " + fundamentalTone.letter + "\nModus: " + modus + "\nIntervals: " + intervals.length + "  (incl. fundamental tone itself 'prime' )");
        System.out.println(fundamentalTone.letter + "-" + modus);
        for(int i = 0; i< scale.size(); i++) {
            scale.get(i).print();
        }
        System.out.println("");
    }
}
