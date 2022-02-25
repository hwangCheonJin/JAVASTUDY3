public class EnumExam {
    public static final String MALE="MALE";
    public static final String FEMAIL="FEMAIL";
    public static void main(String[] args){
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMAIL;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MAIL;
        gender2 = Gender.FEMAIL;
//      특정값만 사용해야 한다면 열거형을 사용한다
//      enum << 가장 아랫줄에 사용

    }
}
enum Gender{
    MAIL,FEMAIL
}