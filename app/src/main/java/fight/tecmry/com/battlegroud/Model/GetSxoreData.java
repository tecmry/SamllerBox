package fight.tecmry.com.battlegroud.Model;

import fight.tecmry.com.battlegroud.Bean.ScoreData;
import fight.tecmry.com.battlegroud.Interface.ScoreInterface;
import fight.tecmry.com.battlegroud.Model.Interface.ScoreDataSource;
import fight.tecmry.com.battlegroud.Util.ResponseConverterFactory;
import fight.tecmry.com.battlegroud.Util.ResultException;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/**
 * Created by Tecmry on 2017/9/24.
 */

public class GetSxoreData implements ScoreDataSource
{
    public interface CallBack
    {
        void setScoreData(ScoreData scoreData);
        void returnError(String error);
    }
    @Override
    public void getStudents(String UserName, final CallBack callback) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(ResponseConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

        
        ScoreInterface scoreInterface = retrofit.create(ScoreInterface.class);
        scoreInterface.getScore("overview", "sea",UserName, "2017-pre4")
                .subscribeOn(Schedulers.io())
                .doOnNext(new Action1<ScoreData>() {
                    @Override
                    public void call(ScoreData response) {
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .observeOn(Schedulers.io())
                .subscribe(new Subscriber<ScoreData>() {
                    @Override
                    public void onCompleted()
                    {

                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("Error:" + e.toString());
                        if (e instanceof ResultException)
                        {
                            String msg = "您的账户不存在";
                            callback.returnError(msg);
                        }
                    }

                    @Override
                    public void onNext(ScoreData response)
                    {
                        callback.setScoreData(response);
                    }
                });
    }
}

