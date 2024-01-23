import java.util.Map;
import static java.util.Map.entry;

import java.io.StringWriter;

public class Interval{
    String shortName;
    String interval;
    String details = "";
    double propCounter;
    double propDenom;
    double proportion;

    Interval(String interval, String details, String shortName, double propCounter, double propDenom) {
        
        this.shortName = shortName;
        this.interval = interval;
        this.details = details;
        this.propCounter = propCounter;
        this.propDenom = propDenom;
        this.proportion = propCounter / propDenom;
    }
    // Based on:  https://anthrowiki.at/Intervall_(Musik)
    static final Map<Integer, Interval> INTERVALS = Map.ofEntries(
        entry(1, new Interval("Prim", "", "P", 1d, 1d)),
        entry(2, new Interval("überm. Prim", "kleiner chromatischer Halbton", "P1", 24d, 25d)),
        entry(3, new Interval("überm. Prim", "großer chromatischer Halbton", "P2", 135d, 128d)),
        entry(4, new Interval("kl. Sekund", "Leimma (pythagoreische Stimmung)", "Sk1", 256d, 243d)),
        entry(5, new Interval("kl. Sekund", "diatonischer Halbton (reine Stimmung)","Sk2", 16d, 15d)),
        entry(6, new Interval("gr. Sekund", "kleiner Ganzton (reine Stimmung)","Sg1", 10d, 9d)),
        entry(7, new Interval("gr. Sekund", "großer Ganzton (pyth. und reine Stimmung)","Sg2", 9d, 8d)),
        entry(8, new Interval("kl. Terz", "kleine Terz (pythagoreische Stimmung)","Tk1", 32d, 27d)),
        entry(9, new Interval("kl. Terz", "kleine Terz (reine Stimmung)","Tk2", 6d, 5d)),
        entry(10, new Interval("gr. Terz","reine große Terz","Tg1", 5d, 4d)),
        entry(11, new Interval("gr. Terz","Ditonus (pythagoreische Stimmung)","Tg2", 81d, 64d)),
        entry(12, new Interval("Quarte", "reine Quarte","Qua", 4d, 3d)),
        entry(13, new Interval("überm. Quarte", "Huygens' Tritonus","Qua2", 7d, 5d)),
        entry(14, new Interval("überm. Quarte", "diatonischer Tritonus","Qua1", 45d, 32d)),
        entry(15, new Interval("überm. Quarte", "pythagoreische Stimmung","Qua3", 729d, 512d)),
        entry(16, new Interval("verm. Quinte", "pythagoreische Stimmung","Qui1", 1024d, 729d)),
        entry(17, new Interval("verm. Quinte", "reine Stimmung","Qui2", 64d, 45d)),
        entry(18, new Interval("verm. Quinte", "Eulers Tritonus","Qui3", 10d, 7d)),
        entry(19, new Interval("Quinte", "reine Quinte","Qui", 3d,2d)),
        entry(20, new Interval("kl. Sexte", "reine kleine Sexte","Sxk", 8d, 5d)),
        entry(21, new Interval("gr. Sexte", "reine große Sexte","Sxg", 5d,3d)),
        entry(22, new Interval("kl. Septime","pyth. und kleinere reine (Oktave - großer Ganzton)","Sepk1", 16d, 9d)),
        entry(23, new Interval("kl. Septime","größere reine (Oktave - kleiner Ganzton)","Sepk2", 9d, 5d)),
        entry(24, new Interval("kl. Septime","Naturseptime","Sepk3", 7d, 4d)),
        entry(25, new Interval("gr. Septime", "diatonisch rein","Sepg", 15d,8d)),
        entry(26, new Interval("Oktave", "reine Oktave","Ok", 2d, 1d))
   );

    static final Interval[] majorIntervalsClean = {
        INTERVALS.get(1),
        INTERVALS.get(6),
        INTERVALS.get(10),
        INTERVALS.get(12),
        INTERVALS.get(19),
        INTERVALS.get(21),
        INTERVALS.get(25),
        INTERVALS.get(26)
    };

    static final Interval[] minorIntervalsClean = {
        INTERVALS.get(1),
        INTERVALS.get(6),
        INTERVALS.get(9),
        INTERVALS.get(12),
        INTERVALS.get(19), 
        INTERVALS.get(20),
        INTERVALS.get(25),
        INTERVALS.get(26)
    };

    public static void printIntervals() {
        StringWriter returnString = new StringWriter();
        for(Map.Entry<Integer, Interval> entry : INTERVALS.entrySet()) {
            returnString.append(String.format("%-5s", entry.getKey()) + "|" + String.format("%-5s", entry.getValue().shortName) + "|" + String.format("%-15s",entry.getValue().interval) + "|" + String.format("%-55s",entry.getValue().details) + "| " + String.format("%-15s",entry.getValue().propCounter + "/" +  entry.getValue().propDenom) + "| " + String.format("%-10s",entry.getValue().propCounter / entry.getValue().propDenom) );
            returnString.append("\n");
        }
        returnString.append("\r\n");
        System.out.println(returnString.toString());
    }

     // dorian
        // phrygian
        // lydian
        // mixolydian
        // locrian
}