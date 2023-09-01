import java.util.Comparator;

public class Comp implements Comparator<String> {

    @Override
    public int compare(String s, String t1) {
        if(s.compareTo(t1)>0){
            return 1;
        }
        return -1;
    }
}
