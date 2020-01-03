import adaptee.JPAdaptee;
import adapter.Translate;
import target.Vietnamese;

public class AdapterMain  {
    public static void main(String[] args) {
        Vietnamese client = new Translate(new JPAdaptee());
        client.send("xin chao!");
    }
}
