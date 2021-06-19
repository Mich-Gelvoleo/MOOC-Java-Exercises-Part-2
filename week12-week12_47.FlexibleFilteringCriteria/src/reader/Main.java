package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.AllLines;
import reader.criteria.EndsWithQuestionOrExclamationMark;
import reader.criteria.LengthAtLeast;
import reader.criteria.Both;
import reader.criteria.Not;
import reader.criteria.AtLeastOne;

public class Main {

    public static void main(String[] args) {
        String address = "https://www.gutenberg.org/files/2701/2701-0.txt";
        GutenbergReader book = new GutenbergReader(address);
        Criterion criterion =new AtLeastOne(
                        new ContainsWord("beer"),
                        new ContainsWord("milk"),
                        new ContainsWord("oil")
                    );

        for (String line : book.linesWhichComplyWith(criterion)) {
            System.out.println(line);
        }
    }
}
