public class LiveScore extends Source {
    private String result;

    public void setResult(String result) {
        this.result = result;
        notifyObserver();
    }

    public String getResult() {
        return result;
    }
}
