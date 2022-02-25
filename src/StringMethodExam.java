public class StringMethodExam {
    public static void main(String[] args){
//        String str = new String("hello");
        String str = "hello";
        System.out.println(str.length());
        System.out.println(str.concat(" world"));
        System.out.println(str);
        str = str.concat(" world");
//      Str에서는 참조 형식을 사용하기때문에 위 형식을 사용해야 값이 변한다.
        System.out.println(str);

        System.out.println(str.substring(3));
        System.out.println(str.substring(3,7));
    }
}
