package gfg.potd;

public class remove_duplicate {
    public static void main(String[] args) {
        String s="Jaswant";
        String temp="";
        for(char i:s.toCharArray()){
            if(!(temp.contains(i+""))){
                temp+=i;
            }
        }
        System.out.println(temp);
    }
}
