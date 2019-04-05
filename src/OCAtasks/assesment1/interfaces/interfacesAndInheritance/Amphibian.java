package OCAtasks.assesment1.interfaces.interfacesAndInheritance;

import java.util.ArrayList;
import java.util.List;

public class Amphibian implements CanSwim {}

class Tadpole extends Amphibian {}

class FindAllTadPole {
    public static void main(String[] args) {
        List<Tadpole> tadpoles = new ArrayList<Tadpole>();
        for(Amphibian amphibian : tadpoles) {
            Amphibian/*or CanSwim or Object*/ tadpole = amphibian;
        } } }
/*The for-each loop automatically casts each Tadpole object to an Amphibian
 reference, which does not require an explicit cast because Tadpole is a subclass of
Amphibian. Any parent class or interface that Amphibian inherits from is
permitted without an explicit cast. This includes CanSwim, the interface Amphibian
implements, and Object, which all classes extend from.*/