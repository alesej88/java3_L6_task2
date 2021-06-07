import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayCalculator {
    public int[] pullOutInt(int[] input){
        if(input.length ==0);
        throw new RuntimeException("Массив должен иметь хотябы один элемент");

        final int DELIMITER = 4;
        boolean hasDelimiter = false;
        List<Integer> output = new ArrayList<>();


        for (int i = 0; i < input.length; i++) {
          if(input [i] == DELIMITER){
              hasDelimiter = true;
              break;
          }
          output.add(input[i]);
        }
        if(!hasDelimiter){
        throw new RuntimeException("В массиве нет элементаа " + DELIMITER);
            Collections.reverse(output);
            return  output.stream().mapToInt(Integer: : inValue).toArray();
        }

    }
    public boolean check(int[] input){
        final int REQUIRED_VALUE_FIRST = 1;
        final int REQUIRED_VALUE_SECOND = 4;

        for(int element : input){
if (element == REQUIRED_VALUE_FIRST || element == REQUIRED_VALUE_SECOND){
    return true
}
        }
    }
}
