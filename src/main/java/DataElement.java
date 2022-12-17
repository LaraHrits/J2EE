public interface DataElement {
    void accept(DataElementVisitor visitor);
}