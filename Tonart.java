public class Tonart {
    
    // members
    Note grundton;
    Tonleiter tonleiter;
    
    //default c-tor: C-Dur
    Tonart() {
        this.grundton = new Note("C", 264, 1);
    }

    // custom
    Tonart(Note grundton, Tonleiter tonleiter) {

    }
}
