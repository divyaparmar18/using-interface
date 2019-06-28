import java.util.ArrayList;
import java.util.List;

public class ListWriter implements Writer{
    List<String> Strings = new ArrayList<>();

    @Override
    public boolean write(String s) {
       return Strings.add(s);
    }
}
