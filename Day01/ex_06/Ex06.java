import java.util.ArrayList;
import java.util.List;

// objectif : do a conaway sequence
public class Ex06 {
    public static void sequence(int nbr) {
        if (nbr < 0) {
            System.out.print("");
        } else {
            List<String> conwaySequence = new ArrayList<>();

            String FIRST_TERM = "1";
            conwaySequence.add(FIRST_TERM);

            for (int rowIndex = 0; rowIndex <= nbr - 1; rowIndex++) {
                String previousRow = conwaySequence.get(rowIndex);
                int previousRowLength = previousRow.length();

                StringBuilder currentRow = new StringBuilder();

                int numberOfMatchingChars = 1;
                char[] arr = previousRow.toCharArray();

                
                for (int i = 0; i < previousRowLength - 1; i++) {
                    if (arr[i] == arr[i + 1]) { 
                        numberOfMatchingChars++; 
                    } else { 
                        currentRow.append(numberOfMatchingChars); 
                        currentRow.append(arr[i]); 

                        numberOfMatchingChars = 1; 
                    }
                }
                currentRow.append(numberOfMatchingChars); 
                currentRow.append(arr[previousRowLength - 1]); 

                conwaySequence.add(currentRow.toString());
            }

            for (int i = 0; i < conwaySequence.size(); i++) {
                System.out.println(conwaySequence.get(i));
            }
        }
    }
}
