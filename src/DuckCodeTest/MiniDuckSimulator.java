package DuckCodeTest;

import DuckCode.Duck;
import DuckCode.MallardDuck;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }
}
