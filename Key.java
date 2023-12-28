public class Key {
    
    // members
    MusicalNote fundamentalTone;
    Scale scale;
    
    //default c-tor: C-Dur
    Key() throws Exception {
        this.fundamentalTone = new MusicalNote("C", 264, 1);
    }

    // custom
    Key(MusicalNote fundamentalTone, Scale scale) {

    }
}
