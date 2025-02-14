package exceptions.ThrowVsThrows;

import java.io.IOException;

// từ khóa throws dùng để khai báo ngoại lệ, duy trì luồng bình thường của chương trình
// dùng try-catch để bắt hoặc throws cho thằng khác xử lý
public class TestExceptionPropagation2 {
    void m() throws IOException {
        //từ khóa throw dùng để ném ra 1 ngoại lệ
        throw new java.io.IOException("device error"); // checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {

        try {
            n();
        } catch (Exception e) { // exception từ hàm m() được ném vào hàm p() để xử lý
            System.out.println("exception handeled");
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        TestExceptionPropagation2 obj = new TestExceptionPropagation2();
        obj.p();
        System.out.println("normal flow");
    }
}
