package Sprint3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Fish fish1 = new Fish(1, "Hering", 20);
        Fish fish2 = new Fish (2, "Carp", 5);
        Fish fish3 = new Fish (3, "Gold fish", 17);

        Fish[] fishPlural = new Fish[3];
        fishPlural[0] = fish1;
        fishPlural[1] = fish2;
        fishPlural[2] = fish3;

        for(Fish f : fishPlural){
            System.out.println(f);
        }
    }
}

