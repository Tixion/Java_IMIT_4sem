import java.util.List;

public class CollectionsDemo {
    public static int FirstSymbolLineCount(List<String> spisok, char s){
        //if (spisok == null) {
        //    throw new IllegalArgumentException();
        //}

        int count = 0;
        for (String str : spisok){
            if (str.charAt(0) == s){
                count++;
            }
        }

        return count;
    }
}
