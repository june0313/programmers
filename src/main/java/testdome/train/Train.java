package testdome.train;

import java.util.function.Function;

public class Train {
    private int wagonCount;
    private Function<Integer, Integer> wagonCargoFunction;

    public Train(int wagonCount, Function<Integer, Integer> fillWagon) {
        this.wagonCount = wagonCount;
        this.wagonCargoFunction = fillWagon;
    }

    public int peekWagon(int wagonIndex) {
        return wagonCargoFunction.apply(wagonIndex);
    }

    public static void main(String[] args) {
        Train train = new Train(10, wagonIndex -> wagonIndex);

        for (int i = 0; i < 10; i++) {
            System.out.println("Wagon: " + i + ", cargo: " + train.peekWagon(i));
        }
    }
}