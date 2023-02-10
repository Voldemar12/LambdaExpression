package DZ;

public class Character implements Movable{
    public void stepAhead(String[][] myArray, String input) {
        String[][] newArray = new String[myArray.length][];
        if (input.equals("w")) {
            for (int i = 0; i < myArray.length; i++) {
                newArray[i] = myArray[i].clone();
            }
        }
    }
}
