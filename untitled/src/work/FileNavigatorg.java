package work;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FileNavigatorg {

    private final HashMap<String, HashSet<FileData>> files = new HashMap<>();

    public boolean add(String path, FileData file) {

        HashSet<FileData> pathFiles = files.get(path) == null ? new HashSet<>() : files.get(path);

        return pathFiles.add(file);
    }

    public Set<FileData> find(String path) {
        return files.get(path);
    }

    public Set<FileData> findBySize(int fileSize) {
        HashSet<FileData> result = new HashSet<>();

        for (HashSet<FileData> pathFiles : files.values()) {
            for (FileData file : pathFiles) {
                if (file.getSize() == fileSize) {
                    result.add(file);
                }
            }

        }
        return result;
    }

    public void remove (String path){
        files.remove(path);
    }

}
