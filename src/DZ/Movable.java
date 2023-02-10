package DZ;

interface Movable {
    default void stepAhead(String[][] x, String y) {

    }

    void turnLeft();
    void turnRight();
    default void TurnAround() {
        turnLeft();
        turnLeft();
    }
}
