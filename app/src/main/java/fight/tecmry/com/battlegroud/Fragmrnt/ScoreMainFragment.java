package fight.tecmry.com.battlegroud.Fragmrnt;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import fight.tecmry.com.battlegroud.R;

/**
 * Created by Tecmry on 2017/9/24.
 */

public class ScoreMainFragment extends Fragment
{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.scoremainfr,container,false);
        return view;
    }
}
