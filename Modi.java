import java.util.Map;
import static java.util.Map.entry;

public class Modi {
    static final Map<Integer, Intervall> reineIntervalle = Map.ofEntries(
        entry(0, new Intervall("Prim", 1d)),
        entry(1, new Intervall("kl. Sekund", 16d/15)),
        entry(2, new Intervall("gr. Sekund", 9d/8)),
        entry(3, new Intervall("kl. Terz", 6d/5)),
        entry(4, new Intervall("gr. Terz", 5d/4)),
        entry(5, new Intervall("Quarte", 4d/3)),
        entry(6, new Intervall("Tritonus", 45d/32)),
        entry(7, new Intervall("Quinte", 3d/2)),
        entry(8, new Intervall("kl. Sexte", 8d/5)),
        entry(9, new Intervall("gr. Sexte", 5d/3)),
        entry(10, new Intervall("kl. Septime", 16d/9)),
        entry(11, new Intervall("gr. Septime", 15d/8)),
        entry(12, new Intervall("Octave", 2d/1))
   );

    static final Intervall[] durIntervalle = {
        reineIntervalle.get(0),
        reineIntervalle.get(2),
        reineIntervalle.get(4),
        reineIntervalle.get(5),
        reineIntervalle.get(7),
        reineIntervalle.get(9),
        reineIntervalle.get(11),
        reineIntervalle.get(12)
    };

    static final Intervall[] mollIntervalle = {
        reineIntervalle.get(0),
        reineIntervalle.get(2), // Halbton
        reineIntervalle.get(3),
        reineIntervalle.get(5), // Halbton
        reineIntervalle.get(6),
        reineIntervalle.get(9),
        reineIntervalle.get(11),
        reineIntervalle.get(12)
    };

    static final Map<String, Intervall[]> modus = Map.ofEntries(
        entry("dur", durIntervalle),
        entry("moll", mollIntervalle)
   );
}
