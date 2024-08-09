package sliding_apprach;
import java.rmi.server.RemoteStub;
import java.util.ArrayList;

public class moveNot_end {
    public static void main(String[] args) {
        ArrayList<Integer> li = new ArrayList<>();
        li.add(1);
        li.add(0);
        li.add(5);
        li.add(9);
        li.add(0);
        li.add(3);
        li.add(0);
        li.add(1);
        System.out.println(move0_to_end(li));
    }
    public static ArrayList<Integer> move0_to_end(ArrayList<Integer> li){
        if(li.size()<1){
            return li;
        }
        int f=0,e=li.size()-1;
        while(f<e){
            System.out.println(li);
            if(li.get(e)==0){
                e--;
            }
            if(li.get(f)!=0){
                f++;
            }
            if(li.get(f)==0 && li.get(e)!=0){
                li.remove(f);
                li.add(0);
                e--;
            }
        }
        return li;
    }
}
