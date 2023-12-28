import java.util.Map;
import static java.util.Map.entry;

public class Interval{
    String interval;
    String details = "";
    double propCounter;
    double propDenom;
    double proportion;

    Interval(String interval, String details, double propCounter, double propDenom) {
        this.interval = interval;
        this.details = details;
        this.propCounter = propCounter;
        this.propDenom = propDenom;
        this.proportion = propCounter / propDenom;
    }

    static final Map<String, Interval> INTERVALS = Map.ofEntries(
        entry("P", new Interval("Prim", "", 1d, 1d)),
        entry("P1", new Interval("überm. Prim", "kleiner chromatischer Halbton", 24d, 25d)),
        entry("P2", new Interval("überm. Prim", "großer chromatischer Halbton", 135d, 128d)),
        entry("Sk1", new Interval("kl. Sekund", "Leimma (pythagoreische Stimmung)", 256d, 43d)),
        entry("Sk2", new Interval("kl. Sekund", "diatonischer Halbton (reine Stimmung)", 16d, 15d)),
        entry("Sg1", new Interval("gr. Sekund", "kleiner Ganzton (reine Stimmung)", 10d, 9d)),
        entry("Sg2", new Interval("gr. Sekund", "großer Ganzton (pyth. und reine Stimmung)", 9d, 8d)),
        entry("Tk1", new Interval("kl. Terz", "kleine Terz (pythagoreische Stimmung)", 32d, 27d)),
        entry("Tk2", new Interval("kl. Terz", "kleine Terz (reine Stimmung)", 6d, 5d)),
        entry("Tg1", new Interval("gr. Terz","reine große Terz", 5d, 4d)),
        entry("Tg2", new Interval("gr. Terz","Ditonus (pythagoreische Stimmung)", 81d, 64d)),
        entry("Qua", new Interval("Quarte", "reine Quarte", 4d, 3d)),
        entry("Qua1", new Interval("überm. Quarte", "diatonischer Tritonus", 45d, 32d)),
        entry("Qua2", new Interval("überm. Quarte", "Huygens’ Tritonus", 7d, 5d)),
        entry("Qua3", new Interval("überm. Quarte", "pythagoreische Stimmung", 729d, 512d)),
        entry("Qui1", new Interval("verm. Quinte", "pythagoreische Stimmung", 1024d, 729d)),
        entry("Qui2", new Interval("verm. Quinte", "reine Stimmung", 64d, 45d)),
        entry("Qui3", new Interval("verm. Quinte", "Eulers Tritonus", 10d, 7d)),
        entry("Qui", new Interval("Quinte", "reine Quinte", 3d,2d)),
        entry("Sxk", new Interval("kl. Sexte", "reine kleine Sexte", 8d, 5d)),
        entry("Sxg", new Interval("gr. Sexte", "reine große Sexte", 5d,3d)),
        entry("Sepk1", new Interval("kl. Septime","pyth. und kleinere reine (Oktave – großer Ganzton)", 16d, 9d)),
        entry("Sepk2", new Interval("kl. Septime","größere reine (Oktave – kleiner Ganzton)", 9d, 5d)),
        entry("Sepk3", new Interval("kl. Septime","Naturseptime", 7d, 4d)),
        entry("Sepg", new Interval("gr. Septime", "diatonisch rein", 15d,8d)),
        entry("Ok", new Interval("Oktave", "reine Oktave", 2d, 1d))
   );

    static final Interval[] majorIntervalsClean = {
        INTERVALS.get("P"),
        INTERVALS.get("Sg1"),
        INTERVALS.get("Tg1"),
        INTERVALS.get("Qua"),
        INTERVALS.get("Qui"),
        INTERVALS.get("Sxg"),
        INTERVALS.get("Sepg"),
        INTERVALS.get("Ok")
    };

    static final Interval[] minorIntervalsClean = {
        INTERVALS.get("P"),
        INTERVALS.get("Sg1"),
        INTERVALS.get("Tk2"),
        INTERVALS.get("Qua"),
        INTERVALS.get("Qui"), 
        INTERVALS.get("Sxk"),
        INTERVALS.get("Sepk"),
        INTERVALS.get("Ok")
    };

     // dorian
        // phrygian
        // lydian
        // mixolydian
        // locrian
}