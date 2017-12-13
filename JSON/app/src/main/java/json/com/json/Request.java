package json.com.json;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Request {
    @GET("user/eng/%2B37477934440/_find")
    Call<ModelGson> getJSON();
}
