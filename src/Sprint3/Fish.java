package Sprint3;

import java.io.Serializable;

public class Fish implements Serializable {
    int fNumber;
    String fName;
    int fPrice;

    public Fish(int fNumber, String fName, int fPrice) {
        this.fNumber = fNumber;
        this.fName = fName;
        this.fPrice = fPrice;
    }

    @Override
    public String toString() {
        return "Number of fish: " + fNumber + ", Name of fish: " + fName + ", Price of fish (eur): " + fPrice;
    }
}
