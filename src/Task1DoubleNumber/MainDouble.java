package Task1DoubleNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MainDouble {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Ernter some words: ");
            String word = reader.readLine();
            list.add(word);

        }


        List<String> doubleValue = doubleWords(list);
        for (String value : doubleValue) {
            System.out.println(value);
        }


    }

    private static List<String> doubleWords(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String word :
                list) {
            result.add(word);
            result.add(word);


        }
        return result;


    }
}
