import java.util.Scanner;
import java.util.StringTokenizer;

class WordCounter {
    String sentence;

    WordCounter(String sentence) {
        this.sentence = sentence;
    }

    void countWords() {
        StringTokenizer st    = new StringTokenizer(sentence);
        int             count = st.countTokens();
        System.out.println("Sentence    : " + sentence);
        System.out.println("Word Count  : " + count);
    }
}

public class WordCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("     Question 6 - Word Counter          ");
        System.out.println("========================================");
        System.out.print("Enter a Sentence : ");
        String sentence = sc.nextLine();
        WordCounter wc = new WordCounter(sentence);
        wc.countWords();

        sc.close();
    }
}
