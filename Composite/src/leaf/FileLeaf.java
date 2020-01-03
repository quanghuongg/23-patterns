package leaf;

import basecomponent.FileComponent;

public class FileLeaf implements FileComponent {
    private String name;
    private long size;

    @Override
    public void showProperty() {
        System.out.println("Name: " + name + " Size: " + size);
    }

    public FileLeaf(String name, long size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public long totalSize() {
        return size;
    }
}
