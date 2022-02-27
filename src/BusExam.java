public class BusExam {
    public static void main(String[] args){
        Bus bus = new Bus();
        bus.run();
        bus.ppangppang();

        Car car = new Car();
        car.run();

        Car c = new Bus();

        Bus bue = (Bus)c;
//        car.ppangppang();
//        부모 클래스는 자식이 가지고 있는것을 사용할 수 없다.
    }
}
