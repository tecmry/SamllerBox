package fight.tecmry.com.battlegroud.Model.Interface;

import fight.tecmry.com.battlegroud.Model.GetSxoreData;

/**
 * Created by Tecmry on 2017/9/24.
 */

public interface ScoreDataSource
{
    void getStudents(final String UserName,GetSxoreData.CallBack callback);
}
