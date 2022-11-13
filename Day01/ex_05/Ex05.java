import java.util.ArrayList;

public class Ex05 {
    public static ArrayList<String> myGetArgs(String... var) {
        ArrayList<String> myArray = new ArrayList<String>();
        for (int i = 0; i < var.length; i++) {
            myArray.add(var[i]);
        }
        return myArray;
    }
}
