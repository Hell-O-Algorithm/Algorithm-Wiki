package method;

import java.util.ArrayList;
import java.util.List;

public class SelfNumber {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        List<String> copyNumbers = new ArrayList<>();

        for (int i = 1; i < 10001; i++) {
            numbers.add(Integer.toString(i));
            copyNumbers.add(Integer.toString(i));
        }

        for (String num : numbers) {
            int checkNumber = 0;
            for (Character character : num.toCharArray()) {
                checkNumber += Integer.parseInt(character.toString(character));
            }
            num = String.valueOf(Integer.parseInt(num) +  checkNumber);

            if (num.length()!=1) {
                copyNumbers.remove(num);
            }
            if (num.length()==1) {
                if(Integer.parseInt(num) % 2 == 0){
                    copyNumbers.remove(num);
                }
            }
        }

        for(String num: copyNumbers){
            System.out.println(num);
        }
    }
}
