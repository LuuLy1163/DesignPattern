package AdapterPatter;

public interface DataFormatAdapter {
    String toXml(String json);
    String toJson(String xml);
}
