import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;
import java.util.UUID;

public class YGCDemo5 {
    public static void main(String[] args) throws IOException {

        JsonFactory factory = new JsonFactoryBuilder().configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false).build();
//        ObjectMapper mapper = new ObjectMapper(factory);

        ObjectMapper mapper = new ObjectMapper();

        for (int i = 0; i < 500 * 10000; i++) {
            Map<String, Boolean> map = mapper.readValue(String.format("{\"%s\":\"true\"}", UUID.randomUUID()),
                            new TypeReference<Map<String, Boolean>>() { });
        }
        System.in.read();
    }
}
