package work;

import java.util.Objects;

public class FileData implements Comparable<FileData> {

    private String fileName;

    private int size;

    public String getFileName() {
        return fileName;
    }

    public int getSize() {
        return size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FileData fileData = (FileData) o;
        return size == fileData.size && Objects.equals(fileName, fileData.fileName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, size);
    }


    @Override
    public int compareTo(FileData o) {

        return 0;
    }
}
