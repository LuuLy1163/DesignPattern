package AdapterPatter;

public class Main {
    public static void main(String[] args) {
        String json = "{\"name\":\"John\", \"age\":30, \"city\":\"New York\"}";
        String xml = "<Object><name>John</name><age>30</age><city>New York</city></Object>";

        // Tạo adapter
        DataFormatAdapter adapter = new JsonToXMLAdapter();

        // Chuyển từ JSON sang XML
        String convertedXml = adapter.toXml(json);
        System.out.println("Converted XML: " + convertedXml);

        // Chuyển từ XML sang JSON
        String convertedJson = adapter.toJson(xml);
        System.out.println("Converted JSON: " + convertedJson);
    }
}
