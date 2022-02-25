public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2){
        System.out.println(globalScope);
//      System.out.println(localScope);
//      System.out.println(value);
        System.out.println(value2);
        System.out.println(staticVal);
    }

    public static void main(String[] args){
//      System.out.println(globalScope);
//      System.out.println(localScope);
//      System.out.println(value);
        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v1.staticVal = 50;
        v2.staticVal = 100;
//      Static 한 변수는 값을 저장할 수 있는 공간이 하나뿐이라 값을 공유한다.
        System.out.println(v1.staticVal);
        System.out.println(v2.staticVal);
        System.out.println(VariableScopeExam.staticVal);
//      클래스 자체에 접근하여 사용하는것이 바람직하다.
    }
}
