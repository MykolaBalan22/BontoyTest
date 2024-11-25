package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Directory<T> {

    private List<Note> phones;

    public boolean add(Note instance) {
        return phones.add(instance);
    }

    public Note find(Note instance) {
        return phones.indexOf(instance) == -1 ? null : phones.get(phones.indexOf(instance));
    }

    public List<Note> findAll(String name) {

        ArrayList<Note> result = new ArrayList<>();
        for (Note note : phones) {
            if (note.getName().equals(name)) {
                result.add(note);
            }
        }
        return result;
    }
}
