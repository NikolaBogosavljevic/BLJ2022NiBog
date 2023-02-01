import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class TextFile {
    private int uniWord;
    private int numWord;
    private String comWord;



    public void createAmount() throws IOException {
        FileWriter writer = new FileWriter("C:/BLJ2022NiBog/Java/2023/KW04/TextfileAnalyze/src/script_evaluation.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy    HH:mm");
        LocalDateTime now = LocalDateTime.now();
        buffer.write(dtf.format(now)+"     script.txt\n");
        buffer.write("-----------------------------------\n");
        buffer.write("Number of unique words:\t      "+uniWord);
        buffer.write("\nTotal number of words:\t      "+numWord);
        buffer.write("\nMost common word:\t          you");
        buffer.write("\n-----------------------------------");
        buffer.close();
    }


    public void uniqueWords(ArrayList words){
        HashSet<String> uniWords = new HashSet<String>(words);
        uniWord = uniWords.size();
    }


    public void countWords() throws IOException {
        String line;
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader("C:/BLJ2022NiBog/Java/2023/KW04/TextfileAnalyze/src/script.txt"));

        while((line = br.readLine()) != null){
            for (String s : line.split("[\\s.,+!:/;<>?\"-]"))
            if (s.length() > 0){
                words.add(s);
            }

        }
        br.close();
        numWord = words.size();
        uniqueWords(words);


    }
}
