import java.util.Map;
import static java.util.Map.entry;

public class Modi {
   
    static final Map<String, Interval[]> modiIntervals = Map.ofEntries(
        entry("major", Interval.majorIntervals),
        entry("minor", Interval.minorIntervals)
        // dorian
        // phrygian
        // lydian
        // mixolydian
        // locrian
   );

   public static Interval[] getIntervals(String name) {
    return modiIntervals.get(name);
   }

   public static Map<String, Interval[]> getModi() {
    return modiIntervals;
   }
}