class jas{
    private int length, height, breath;

    public void getVal(int height, int length, int breath) {
        System.out.println(height);
        System.out.println(breath);
        System.out.println(length);
    }

    public int getArea(int length, int breath) {
        return length * breath;
    }
}
public class cons {
    public static void main(String[] args) {
        jas obj = new jas();
        obj.getVal(2, 4, 5);
    }
}
