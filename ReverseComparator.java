package ComparableAndComparatorInterface;
import java.util.*;

public class ReverseComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1);
    }
    
}