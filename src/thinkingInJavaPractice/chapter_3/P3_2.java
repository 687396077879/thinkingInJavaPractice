package thinkingInJavaPractice.chapter_3;

/**
 * @author jeromecui
 * @description
 * @date 2021/8/14 10:11
 */
public class P3_2 {

    public float a;

    P3_2(float a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        P3_2 p = new P3_2(1.1f);
        P3_2 p2 = p;
        p2.a = 1.5f;
        System.out.println("p: " + p);
        System.out.println("p2: " + p2);
    }
}
