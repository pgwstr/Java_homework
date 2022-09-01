/**
 * @author pgwstr
 * @date 2022/8/14 10:14 PM
 */

public class test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setI(1);
        System.out.println("hello github");
        System.out.println("8月16日");
        System.out.println("test");
        System.out.println("123");
    }

    /**
     * @author pgwstr
     * @date 2022/8/18 11:21 PM
     */

    static class Person {
        private int i;
        private int age;
        private static int height;
        private final static double o = 2;
        int st;

        public int getI() {
            return i;
        }

        public int getSt() {
            return st;
        }

        public static double getO() {
            return o;
        }

        public int getAge() {
            return age;
        }

        public void setI(int i) {
            this.i = i;
        }

        public static int getHeight() {
            return height;
        }


    }
}
