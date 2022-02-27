public class InnerExam3 {
    public void exec() {
        class Cal {
            int value = 0;

            public void plus() {
                value++;
            }
        }
        Cal ca1 = new Cal();
        ca1.plus();
        System.out.println(ca1.value);
    }
    public static void main(String[] args){
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
