public class Subscriber implements Observer {
    @Override
    public void update(Source s) {
        System.out.println("live result: " + ((LiveScore) s).getResult());
    }
}
