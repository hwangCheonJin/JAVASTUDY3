public class LedExam {
    public static void main(String[] args){
        TV tv = new LedTv();
        tv.turnOn();
        tv.changeChannel(10);
        tv.changeVolume(10);
        tv.turnOff();
    }
}
