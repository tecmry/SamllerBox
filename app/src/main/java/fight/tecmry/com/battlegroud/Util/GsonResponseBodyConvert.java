package fight.tecmry.com.battlegroud.Util;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import retrofit2.Converter;



public class GsonResponseBodyConvert<T> implements Converter<ResponseBody,T> {
    private final Gson gson;
    private final Type type;

    public GsonResponseBodyConvert(Gson gson, Type type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T convert(ResponseBody value) throws IOException {
        String response = value.string().replace("\n","");
        String unusername = "  [\"\\u67e5\\u8be2\\u4e0d\\u5230\\u8be5\\u7528\\u6237\\u6240\\u73a9\\u7684\\u670d\\" +
                "u52a1\\u5668,\\u6216\\u8005\\u8be5\\u7528\\u6237\\u672a\\u73a9\\u8fc7\\u4e00\\u5c40\\u6e38\\u620f! " +
                "\\u4e5f\\u6709\\u53ef\\u80fd\\u5403\\u9e21\\u670d\\u52a1\\u5668\\u51fa" +
                "\\u95ee\\u9898.\\u8bf7\\u7a0d\\u540e\\u67e5\\u8be2\"]";
        if (response.equals(unusername)) {
            System.out.println("User is not exits");
//            try {
//                throw new ResultException(100);
//            } catch (ResultException e) {
//                e.printStackTrace();
//            }
        }else {
            return gson.fromJson(response, type);
        }
        return null;
    }
}
