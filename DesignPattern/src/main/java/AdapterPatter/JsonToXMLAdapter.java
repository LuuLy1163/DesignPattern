package AdapterPatter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class JsonToXMLAdapter implements DataFormatAdapter {

    @Override
    public String toXml(String json) {
        try {
            ObjectMapper jsonMapper = new ObjectMapper();
            Object obj = jsonMapper.readValue(json, Object.class);  // Chuyển JSON thành Object

            XmlMapper xmlMapper = new XmlMapper();
            return xmlMapper.writeValueAsString(obj);  // Chuyển Object thành XML
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toJson(String xml) {
        try {
            XmlMapper xmlMapper = new XmlMapper();
            Object obj = xmlMapper.readValue(xml, Object.class);  // Chuyển XML thành Object

            ObjectMapper jsonMapper = new ObjectMapper();
            return jsonMapper.writeValueAsString(obj);  // Chuyển Object thành JSON
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}

