package b.actionbarwithspinner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class IconCustomAdapter extends BaseAdapter {
    Context context;
    int icons[];
    String options[];
    LayoutInflater inflter;

    public IconCustomAdapter(Context applicationContext, int[] icons, String[] options) {
        this.context = applicationContext;
        this.icons = icons;
        this.options = options;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return icons.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.custom_spinner_items, viewGroup, false);
        TextView option = (TextView) view.findViewById(R.id.textView);
        ImageView icon = (ImageView) view.findViewById(R.id.imageView);
        option.setText(options[i]);
        icon.setImageResource(icons[i]);

        /** For Options Spinner **/
        if(i == 0)
            option.setVisibility(View.GONE);
        if(i > 0)
            icon.setVisibility(View.GONE);
        option.setTextSize(10f);

        return view;
    }
}