package composite;

import basecomponent.FileComponent;

import java.util.ArrayList;
import java.util.List;


public class FolderComposite implements FileComponent {
    private List<FileComponent> files = new ArrayList<>();

    public FolderComposite(List<FileComponent> files) {
        this.files = files;
    }

    @Override
    public void showProperty() {
        for (FileComponent fileComponent : files) {
            fileComponent.showProperty();
        }

    }

    @Override
    public long totalSize() {
        long total = 0;
        for (FileComponent fileComponent : files) {
            total += fileComponent.totalSize();
        }
        return total;
    }
}
