package com.example.cognacdon.news.adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.cognacdon.news.R;
import com.example.cognacdon.news.model.NewsFeed;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Cognac Don on 2/8/2017.
 */

public class NewsAdapter extends ArrayAdapter<NewsFeed> {
    private int viewId;
    public NewsAdapter(Context context, int resource, List<NewsFeed> news) {
        super(context, resource, news);
        viewId = resource;
    }
    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        NewsFeed news = getItem(position);
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(viewId, null);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }
        viewHolder.tv_title.setText(news.getTitle());
        viewHolder.tv_section.setText(news.getSection());
        return view;
    }

    class ViewHolder {
        @BindView(R.id.news_tv_title)
        public TextView tv_title;
        @BindView(R.id.news_tv_section)
        public TextView tv_section;
        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
