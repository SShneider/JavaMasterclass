import java.util.ArrayList;

public class Monsters implements ISaveable{
    ArrayList<String> MonsterNames;

    public Monsters() {
        MonsterNames = new ArrayList<String>();
    }
    @Override
    public ArrayList fetchList() {
        return this.MonsterNames;
    }
    @Override
    public void addToList(String name) {
        MonsterNames.add(name);
    }
}
