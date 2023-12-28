import java.util.Map;
import static java.util.Map.entry;

public class Interval{
    String name;
    double interval;
    Interval(String name, double interval) {
        this.name = name;
        this.interval = interval;
    }

    static final Map<Integer, Interval> pureIntervals = Map.ofEntries(
        entry(0, new Interval("Prim", 1d)),
        entry(1, new Interval("kl. Sekund", 16d/15)),
        entry(2, new Interval("gr. Sekund", 9d/8)),
        entry(3, new Interval("kl. Terz", 6d/5)),
        entry(4, new Interval("gr. Terz", 5d/4)),
        entry(5, new Interval("Quarte", 4d/3)),
        entry(6, new Interval("Tritonus", 45d/32)),
        entry(7, new Interval("Quinte", 3d/2)),
        entry(8, new Interval("kl. Sexte", 8d/5)),
        entry(9, new Interval("gr. Sexte", 5d/3)),
        entry(10, new Interval("kl. Septime", 16d/9)),
        entry(11, new Interval("gr. Septime", 15d/8)),
        entry(12, new Interval("Octave", 2d/1))
   );

    static final Interval[] majorIntervals = {
        pureIntervals.get(0),
        pureIntervals.get(2),
        pureIntervals.get(4),
        pureIntervals.get(5),
        pureIntervals.get(7),
        pureIntervals.get(9),
        pureIntervals.get(11),
        pureIntervals.get(12)
    };

    static final Interval[] minorIntervals = {
        pureIntervals.get(0),
        pureIntervals.get(2), // halftone
        pureIntervals.get(3),
        pureIntervals.get(5), // halftone
        pureIntervals.get(6),
        pureIntervals.get(9),
        pureIntervals.get(11),
        pureIntervals.get(12)
    };
}