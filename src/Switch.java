public class Switch {
    public static void main(String[] args) {
//		switch, case, default, break
        int value = 2;
//		break���� ������ ���������� ����ȴ�.
        switch(value) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case 3:
                System.out.println("3");
                break;
            default :
                System.out.println("�� �� �ٸ� ����");
        }
        java.lang.String str = "A";
        switch(str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
        }
    }
}
