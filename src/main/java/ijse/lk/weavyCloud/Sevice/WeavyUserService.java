package ijse.lk.weavyCloud.Sevice;

import okhttp3.*;
import org.springframework.stereotype.Service;

@Service
public class WeavyUserService {
    private static final String BASE_URL = "https://api.weavy.io";
    private static final String BEARER_TOKEN = "wys_hMWpXdekxcn9Gc8Ioah3azOllzUZ7l3HN9yB";
    private final OkHttpClient client = new OkHttpClient();

    public String createUser(String userJson) throws Exception {
        RequestBody body = RequestBody.create(userJson, MediaType.get("application/json"));
        Request request = new Request.Builder()
                .url(BASE_URL)
                .header("Authorization", "Bearer " + BEARER_TOKEN)
                .post(body)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

}