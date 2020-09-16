import java.util.ArrayList;

public class Players implements ISaveable{
    ArrayList<String> PlayerNames;

    public Players() {
        PlayerNames = new ArrayList<String>();
    }
    @Override
    public ArrayList fetchList() {
        return this.PlayerNames;
    }

    @Override
    public void addToList(String name) {
        PlayerNames.add(name);
    }
}
