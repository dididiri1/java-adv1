package thread.excutor;

public class InstanceofMainV1 {

    public static void main(String[] args) {
        Object obj = "Hello Pattern Matching";

        if (obj instanceof String str) {
            System.out.println(str.toUpperCase());
        }
    }
}
