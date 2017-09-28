package fight.tecmry.com.battlegroud.Interface;

import fight.tecmry.com.battlegroud.Bean.ScoreData;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import rx.Observable;

/**
 * Created by Tecmry on 2017/9/23.
 */

public interface ScoreInterface {
    @Headers({
            "Content-Type: application/x-www-form-urlencoded",
            "Postman-Token: 76ad7d23-d81a-b870-b546-07892304a60d,",
            "Cache-Control: no-cache",
    })
    @FormUrlEncoded
    @POST("indexdata/")
    Observable<ScoreData> getScore(@Field("getdata")String getdata, @Field("server")String local
            , @Field("username")String username, @Field("versiondata") String versiondata);
}
