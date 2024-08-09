import java.util.ArrayList;
import java.util.List;

public class reverse_arr {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(1); 
        li.add(2); 
        li.add(3); 
        li.add(5); 
        li.add(6); 
        li.add(18);
        System.out.println(reverseList(li)); 
    }
    public static List<Integer> reverseList(List<Integer> li){
        List<Integer> l1 = new ArrayList<>();
        l1= li.reversed();
        return l1;
    }
}
