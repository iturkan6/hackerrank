import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class decryptPassword {
    public static String decryptPassword(String s) {
        // Write your code here
        ArrayList<Character> character = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            character.add(s.charAt(i));
        }
        System.out.println("hi");
        List<Character> characters = character.stream().filter(x -> x.equals('*')).collect(Collectors.toList());

        for (int i = characters.size(); i > 0; i--) {
            System.out.println("help");
            if(Character.isUpperCase(characters.get(i)) && Character.isLowerCase(characters.get(i-1)) ){
                System.out.println("priv");
                Collections.swap(characters, i, i-1);
                i--;
            }
            if(Character.isDigit(characters.get(i))){
                System.out.println("hola");

                characters.set(i, '0');
                characters.add(0, characters.get(i));
            }
        }
        StringBuilder buffer = new StringBuilder();
        for (int i = 0; i < characters.size(); i++) {
            buffer.append(characters.get(i));
        }
        return  buffer.toString();
    }

    public static void main(String[] args) {
        System.out.println(decryptPassword("51Pa*0Lp*0e"));
    }
}
