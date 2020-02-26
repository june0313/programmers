package testdome.train_composition;

import java.util.*;

public class TrainComposition {
    private Deque<Integer> linkedList = new LinkedList<>();

    public void attachWagonFromLeft(int wagonId) {
        linkedList.addFirst(wagonId);
    }

    public void attachWagonFromRight(int wagonId) {
        linkedList.addLast(wagonId);
    }

    public int detachWagonFromLeft() {
        return linkedList.pollFirst();
    }

    public int detachWagonFromRight() {
        return linkedList.pollLast();
    }

    public static void main(String[] args) {
        TrainComposition tree = new TrainComposition();
        tree.attachWagonFromLeft(7);
        tree.attachWagonFromLeft(13);
        System.out.println(tree.detachWagonFromRight()); // 7
        System.out.println(tree.detachWagonFromLeft()); // 13
    }
}
