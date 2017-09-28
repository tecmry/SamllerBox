package fight.tecmry.com.battlegroud.Activity.Interface;

import fight.tecmry.com.battlegroud.Bean.ScoreData;

/**
 * Created by Tecmry on 2017/9/24.
 */

public interface IScoreMainView
{
    void onShowString(ScoreData scoreData);
    void setUser();
    void setError(String error);
}
