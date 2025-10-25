package thread.excutor;

public class InstanceofMainV0 {

    public static void main(String[] args) {
        Object obj = "Hello Java";

        if (obj instanceof String) {
            String str = (String) obj; // 명시적 캐스팅 필요
            System.out.println(str.toUpperCase());
        }
    }
}
