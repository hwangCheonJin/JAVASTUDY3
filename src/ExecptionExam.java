public class ExecptionExam {
    public static void main(String[] args){
        int i = 10;
        int j = 5;
        try {
            int k = i / j;
            System.out.println(k);
        }catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다."+ e.toString());
        }finally {
            System.out.println("무조건 실행");
        }
        System.out.println("main end");
    }
}
