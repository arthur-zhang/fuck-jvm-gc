import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonFactoryBuilder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Map;

public class YGCDemo5 {
    public static void main(String[] args) throws IOException {

        JsonFactory factory = new JsonFactoryBuilder().configure(JsonFactory.Feature.INTERN_FIELD_NAMES, false).build();
        ObjectMapper mapper = new ObjectMapper(factory);

//        ObjectMapper om = new ObjectMapper();

        for (int i = 0; i < 10 * 10000; i++) {
            Map<Integer, Boolean> map =
                    mapper.readValue(String.format("{\"%s\":\"true\"}", i),
                            new TypeReference<Map<Integer, Boolean>>() {
                            });
        }
    }
}
