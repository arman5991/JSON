package json.com.json;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Request {
    @GET("android/jsonandroid/")
    Call<JSONResponse> getJSON();
}
