public abstract class Color implements Cloneable {
    String name;

    public Color(String name) {
        this.name = name;
    }

    protected Color() {
    }

    abstract void addColor();

    public Object clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }
}
