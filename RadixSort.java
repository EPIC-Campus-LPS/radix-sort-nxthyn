import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileWriter;

public class RadixSort {

    private static String fileName;

    public static void main(String[] args) {

        File file = new File("text.txt");
        System.out.println(file.getName());

    }
    private static String getMax(String[] list) {

        String max = list[0];

        for (int i = 0; i < list.length; i++) {

            if (list[i].length() > max.length()) {

                max = list[i];

            }

        }

        return max;

    }
    private static String readFile(File file) {

        try {

            String word = "";
            Scanner input = new Scanner(file);

            fileName = file.getName();

            while (input.hasNextLine()) {

                String line = input.nextLine();
                word += line.toLowerCase() + " ";

            }

            return word;

        } catch (FileNotFoundException e) {

            e.printStackTrace();
            return null;

        }

    }

    private static void printFile(String[] words) {

        try {

            int ind = fileName.indexOf(".");
            FileWriter file = new FileWriter(fileName.substring(0, ind) + "_key.txt");

            for (int i = 0; i < words.length; i++) {

                file.write(words[i]);

            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }



    public String radixSort(String str) {

        String[] words = str.split(" ");
        String max = getMax(words);
        int maxLength = max.length();

        HashMap<Character, LinkedList<String>> map = new HashMap<Character, LinkedList<String>>(27);



        return "";

    }


}

/**
 * pad all words with spaces before
 * create 27th box (at first key) for space
 * .hasKey(key) to check whether key exists; if so, get, otherwise, put
 * loop from 'a' to 'z'
 * print out to words array every time
 *
 */