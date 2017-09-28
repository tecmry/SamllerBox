package fight.tecmry.com.battlegroud.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

import fight.tecmry.com.battlegroud.Activity.Interface.IScoreMainView;
import fight.tecmry.com.battlegroud.Bean.ScoreData;
import fight.tecmry.com.battlegroud.Fragmrnt.ScoreMainFragment;
import fight.tecmry.com.battlegroud.Prenster.ScoreMainPrenster;
import fight.tecmry.com.battlegroud.R;

public class MainActivity extends BaseActivity implements IScoreMainView {

    private ArrayList<String> TabTitleList = new ArrayList<String>(){{
        add("One");
        add("Two");
    }};
    private ArrayList<Fragment> FragmentLidt = new ArrayList<Fragment>(){{
            add(new ScoreMainFragment());

        }};


    private TabLayout main_TabLayout;
    private ViewPager main_ViewPager;
    private ScoreMainPrenster mainPrenster = new ScoreMainPrenster(this);
    private Intent intent;


    private TextView solo_solotimes;
    private TextView solo_eatchickentimes;
    private TextView solo_killpeopletimes;
    private TextView solo_playtimes;
    private TextView solo_top10percent;
    private TextView solo_averagekilltimes;

    private TextView duo_duosource;
    private TextView duo_eatchickentimes;
    private TextView duo_killpeopletimes;
    private TextView duo_playtimes;
    private TextView duo_top10percent;
    private TextView duo_averagekilltimes;

    private TextView squad_squadtimes;
    private TextView squad_eatchchickentimes;
    private TextView squad_killpeopletimes;
    private TextView squad_playtimes;
    private TextView squad_top10percent;
    private TextView squad_averagekilltimes;

    private TextView main_eatchicken;
    private TextView main_playtimes;
    private TextView main_playtime;
    private TextView main_username;

    private List<ScoreData.SoloBean> sololist = new ArrayList<ScoreData.SoloBean>();
    private List<ScoreData.DuoBean>  duolist = new ArrayList<ScoreData.DuoBean>();
    private List<ScoreData.SquadBean> squadlist = new ArrayList<ScoreData.SquadBean>();
    private List<ScoreData.UnionBean> unionlist = new ArrayList<ScoreData.UnionBean>();
    private List<ScoreData.UsernameBean> usernamelist = new ArrayList<ScoreData.UsernameBean>();

    private ScoreData.SoloBean soloBean;
    private ScoreData.DuoBean duoBean;
    private ScoreData.SquadBean squadBean;
    private ScoreData.UnionBean unionBean;
    private ScoreData.UsernameBean usernameBean;
    /**
     * 用来存放用户头像
     * */
    private String img_url;
    private String username;
    private ImageView user_imageview;
    private ImageView user_backgroud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scoremainfr);

        main_TabLayout = $(R.id.tablayout);
        main_ViewPager = $(R.id.viewpager);
        intent = getIntent();
        /**
         * TabLayout还未设置Adapter
         * */
        setUser();
        init();
    }
    private void init()
    {
        solo_solotimes = $(R.id.solo_solotimes);
        solo_eatchickentimes = $(R.id.solo_eatchickentimes);
        solo_killpeopletimes = $(R.id.solo_killpeopletimes);
        solo_playtimes = $(R.id.solo_playtimes);
        solo_top10percent = $(R.id.solo_top10precent);
        solo_averagekilltimes = $(R.id.solo_averagekilltimes);

        duo_duosource = $(R.id.duo_duotimes);
        duo_eatchickentimes = $(R.id.duo_eatchickentimes);
        duo_killpeopletimes = $(R.id.duo_killpeopletimes);
        duo_playtimes = $(R.id.duo_playtimes);
        duo_top10percent = $(R.id.duo_top10precent);
        duo_averagekilltimes = $(R.id.duo_averagekilltimes);

        squad_squadtimes = $(R.id.squad_squad);
        squad_eatchchickentimes = $(R.id.squad_eatchickentimes);
        squad_killpeopletimes = $(R.id.squad_killpeopletimes);
        squad_playtimes = $(R.id.squad_playtimes);
        squad_top10percent = $(R.id.squad_top10precent);
        squad_averagekilltimes = $(R.id.squad_averagekilltimes);

        main_eatchicken = $(R.id.textView5);
        main_playtime = $(R.id.textView13);
        main_playtimes = $(R.id.textView10);
        main_username = $(R.id.main_username);
        user_backgroud = $(R.id.Iv_backgroud);
        user_imageview = $(R.id.Iv_userimage);


    }
    @Override
    public void onShowString(ScoreData scoreData) {
        try {
            setText(scoreData);
        }catch (NullPointerException e)
        {
            /**
             * 该服务区尚未查明该人
             * 进行异常处理  （弹Toasts并返回上一个Activity）
             * */

            System.out.println("emmm......");
        }
    }

    @Override
    public void setUser() {
        try {
            mainPrenster.getUserName(intent.getStringExtra("UserName"));
        }catch (NullPointerException e)
        {
            System.out.println("emmm......");
        }
    }

    @Override
    public void setError(String error) {
        System.out.println(error);
    }

    private void setText(ScoreData scoreData)
    {
        /**
         * solo_solotimes = $(R.id.solo_solotimes);
         solo_eatchickentimes = $(R.id.solo_eatchickentimes);
         solo_killpeopletimes = $(R.id.duo_killpeopletimes);
         solo_playtimes = $(R.id.solo_playtimes);
         solo_top10percent = $(R.id.solo_top10precent);
         solo_averagekilltimes = $(R.id.solo_averagekilltimes);
         * */
       try{
           sololist = scoreData.getSolo();
           soloBean =sololist.get(0);
           solo_top10percent.setText(soloBean.getTop10rate());
           solo_solotimes.setText(soloBean.getRating());
           solo_eatchickentimes.setText(soloBean.getWins());
           solo_averagekilltimes.setText(soloBean.getAvgdamagepermatch());
           solo_playtimes.setText(soloBean.getMatchesplayed());
           solo_killpeopletimes.setText(soloBean.getKills());

           duolist = scoreData.getDuo();
           duoBean = duolist.get(0);
           duo_duosource.setText(duoBean.getRating());
           duo_top10percent.setText(duoBean.getTop10rate());
           duo_eatchickentimes.setText(duoBean.getWins());
           duo_averagekilltimes.setText(duoBean.getAvgdamagepermatch());
           duo_playtimes.setText(duoBean.getMatchesplayed());
           duo_killpeopletimes.setText(duoBean.getKills());


           squadlist =scoreData.getSquad();
           squadBean = squadlist.get(0);
           squad_squadtimes.setText(squadBean.getRating());
           squad_top10percent.setText(squadBean.getTop10rate());
           squad_eatchchickentimes.setText(squadBean.getWins());
           squad_averagekilltimes.setText(squadBean.getAvgdamagepermatch());
           squad_playtimes.setText(squadBean.getMatchesplayed());
           squad_killpeopletimes.setText(squadBean.getKills());

           unionlist = scoreData.getUnion();
           unionBean = unionlist.get(0);
           main_eatchicken.setText(unionBean.getWins());
           main_playtimes.setText(unionBean.getPlayed());
           main_playtime.setText(unionBean.getPlaytime());

           usernamelist = scoreData.getUsername();
           usernameBean = usernamelist.get(0);
           img_url = usernameBean.getUsername_avatar();
           username = usernameBean.getUsername();
           main_username.setText(username);
           Glide.with(this).load(img_url).into(user_imageview);


       }catch (NullPointerException e){
           System.out.println("emmm... 空指针了");
       }
    }
}

