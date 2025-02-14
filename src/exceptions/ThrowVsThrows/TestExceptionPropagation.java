package exceptions.ThrowVsThrows;

// exception được lan truyền trong Calling Chain và được catch tại hàm p()
public class TestExceptionPropagation {
    void m() {
        int data = 50 / 0;
    }

    void n() {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        TestExceptionPropagation obj = new TestExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
}
