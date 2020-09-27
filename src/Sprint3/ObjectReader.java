package Sprint3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectReader {

    public static void main(String[] args) {

        String fileName = "fish.bin";
        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(fileName));
            os.writeObject(Fish);
            os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Object written");
    }
}
