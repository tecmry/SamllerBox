package fight.tecmry.com.battlegroud.Activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import fight.tecmry.com.battlegroud.Activity.Interface.IScoreMainView;
import fight.tecmry.com.battlegroud.Bean.ScoreData;
import fight.tecmry.com.battlegroud.R;
import fight.tecmry.com.battlegroud.View.SearchView;

/**
 * Created by Tecmry on 2017/9/27.
 */

public class StartActivity extends BaseActivity implements IScoreMainView,SearchView.SearchViewListner {
    private SearchView searchView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startactivity);
        if (Build.VERSION.SDK_INT >= 21) {
            View decorView = getWindow().getDecorView();
            int option = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
            decorView.setSystemUiVisibility(option);
            getWindow().setNavigationBarColor(Color.TRANSPARENT);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }else {
            View decorView = getWindow().getDecorView();
            int option =  View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(option);
        }
        init();
    }

    private void init()
    {
        searchView = $(R.id.begin_sv);
        searchView.setSearchViewListner(this);

    }
    @Override
    public void onShowString(ScoreData scoreData) {

    }

    @Override
    public void setUser() {

    }

    @Override
    public void setError(String error) {

    }
    /**
     * 回调获取Edittext里的文字信息
     * */
    @Override
    public void onSearch(String searchText)
    {
        Intent intent = new Intent(StartActivity.this,MainActivity.class);
        intent.putExtra("UserName",searchText);
        startActivity(intent);
    }
}
