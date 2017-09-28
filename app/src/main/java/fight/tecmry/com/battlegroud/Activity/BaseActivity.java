package fight.tecmry.com.battlegroud.Activity;

import android.app.Activity;
import android.view.View;

/**
 * Created by Tecmry on 2017/9/24.
 */

public class BaseActivity extends Activity {
    public  <T extends View> T $(int resId) {
        return (T) super.findViewById(resId);
    }
}
