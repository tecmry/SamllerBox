package fight.tecmry.com.battlegroud.View;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import fight.tecmry.com.battlegroud.R;

/**
 * Created by Tecmry on 2017/9/27.
 */

public class SearchView extends LinearLayout implements TextWatcher,View.OnClickListener {

    private EditText editText;

    private Button search;

    private Button delete;

    private SearchViewListner listner;
    private Context context;

    public void setSearchViewListner(SearchViewListner listner)
    {
        this.listner = listner;
    }
    public SearchView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.searchview,this,true);

        editText = (EditText)findViewById(R.id.et_search);
        search = (Button)findViewById(R.id.btn_clear_search);
        delete = (Button)findViewById(R.id.btn_clear_search_delete);
        this.context = context;
        search.setVisibility(VISIBLE);
        delete.setVisibility(GONE);

        editText.addTextChangedListener(this);

        search.setOnClickListener(this);
        delete.setOnClickListener(this);
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after)
    {

    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }
    /**
     * 对用户输入文字进行监听
     * */
    @Override
    public void afterTextChanged(Editable s) {
    String str = editText.getText().toString().trim();
        if (str.isEmpty())
        {
            delete.setVisibility(GONE);
        }else {
            delete.setVisibility(VISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_clear_search:
                String str = editText.getText().toString();
                if (listner!=null&&!str.isEmpty()){
                    editText.setText("");
                    listner.onSearch(str);
                }
                InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(0, InputMethodManager.HIDE_NOT_ALWAYS);
                break;
            case R.id.btn_clear_search_delete:
                editText.setText("");
                break;
        }
    }
    public interface SearchViewListner{
    /**
     * @Param 传入输入框的文字
     * */
    void onSearch(String searchText);
    }
}
