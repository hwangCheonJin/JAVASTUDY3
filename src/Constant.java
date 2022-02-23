public class Constant {
    public static void main(String[] args) {
        int i;
        i = 5;

//		����� �׻� �빮�ڷ� ����Ѵ�.
//		��ġ�ʴ� ���� ����Ҷ� ����� ����Ѵ�
        final int J;
        J = 10;

//		J = 5;

        double circleArea;
        final double PI = 3.14159;
        circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1450;
//		����� �δܾ� �̻��� ���ɶ� ����ٸ� ����Ѵ�.

        int totalPrice = 50 * OIL_PRICE;
        System.out.println(J);
        System.out.println(circleArea);
        System.out.println(totalPrice);
    }
}
