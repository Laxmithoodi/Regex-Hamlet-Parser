import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by thook on 10/7/15.
 */
public class HamletParser {

    private String oldString;
    private String newString;
    private String textFile;

    private String hamletData;


    public HamletParser(String textFile, String oldString, String newString) {
        this.oldString = oldString;
        this.newString = newString;
        this.textFile = textFile;

        this.hamletData = loadFile();
    }

    private String loadFile() {
        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("hamlet.txt").getFile());
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public String getHamletData() {
        String result = this.hamletData;
        for (int i = 0; i < oldString.length(); i++) {
            Pattern ptn = Pattern.compile(oldString, Pattern.CASE_INSENSITIVE);
            Matcher match = ptn.matcher(result);
            result = match.replaceAll(newString);
        }
        return result;
    }


}
