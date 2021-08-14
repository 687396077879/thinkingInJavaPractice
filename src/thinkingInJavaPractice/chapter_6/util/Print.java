package thinkingInJavaPractice.chapter_6.util;

import java.util.Date;

/**
 * @author jeromecui
 * @description
 * @date 2021/8/11 22:47
 */
public class Print {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void print(Date date) {
        System.out.println(date.toString());
    }
}
