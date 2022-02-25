public class MyClass2 {
//  메소드 오버로딩
//  매개변수의 타입과 매개변수의 수가 중요하다.
    public int plus (int x, int y)
    {
        return x + y;
    }
    public int plus(int x, int y, int z){
        return x + y + z;
    }
    public String plus(String x, String y){
        return x + y;
    }
}
