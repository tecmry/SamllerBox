package fight.tecmry.com.battlegroud.Prenster;

import android.os.Handler;

import fight.tecmry.com.battlegroud.Activity.Interface.IScoreMainView;
import fight.tecmry.com.battlegroud.Activity.MainActivity;
import fight.tecmry.com.battlegroud.Bean.ScoreData;
import fight.tecmry.com.battlegroud.Model.GetSxoreData;
import fight.tecmry.com.battlegroud.Model.Interface.ScoreDataSource;
import fight.tecmry.com.battlegroud.Prenster.Interface.IScoreMainPrenster;

/**
 * Created by Tecmry on 2017/9/24.
 */

public class ScoreMainPrenster implements IScoreMainPrenster
{
    private IScoreMainView mainView;
    private ScoreDataSource dataSource;
    private Handler handler = new Handler();
    public ScoreMainPrenster(MainActivity activity)
    {
        this.mainView = activity;
        this.dataSource = new GetSxoreData();
    }
    @Override
    public void getUserName(String UserName)
    {
        dataSource.getStudents(UserName, new GetSxoreData.CallBack() {
            @Override
            public void setScoreData(final ScoreData scoreData) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        /**
                         * 这里还需进行错误判断
                         * */
                        mainView.onShowString(scoreData);
                    }
                });
            }

            @Override
            public void returnError(String error) {
                mainView.setError(error);
            }
        });
    }
}
