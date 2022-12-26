import java.util.Map;

public interface DataElement {
    void accept(DataElementVisitor visitor, Map<String, Object> map);
}
