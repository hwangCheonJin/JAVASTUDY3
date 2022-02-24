public class StringExam {
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        String str4 = new String("hello");
        if(str1 == str2)
            System.out.println("str1과 str2는 같은 레퍼런스");
        if(str1 == str3)
            System.out.println("str1과 str3은 같은 레퍼런스");
        if(str3 == str4) {
            System.out.println("str3과 str4는 같은 레퍼런스");
        }else{
            System.out.println("str3과 str4는 다른 레퍼런스");
        }
        System.out.println(str1.substring(3));
        System.out.println(str1.length());
//      String이 가지고있는 메소드들은 수행 후 새로운 String을 반환한다.
    }
}
