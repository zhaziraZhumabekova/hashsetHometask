import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(0);
        set2.add(1);
        set2.add(2);
        symSetDiff(set1, set2);
    }
    public static void symSetDiff(Set<Integer>set1, Set<Integer>set2){
        Set<Integer> newSet = new HashSet<Integer>(set1);
        newSet.removeAll(set2);
        set2.removeAll((set1));
        newSet.addAll(set2);
        System.out.println(newSet);
    }
}