package com.example.cognacdon.news;
import android.content.AsyncTaskLoader;
import android.content.Context;
import com.example.cognacdon.news.datautil.QueryUtils;
import com.example.cognacdon.news.model.NewsFeed;
import java.util.List;
/**
 * Created by Cognac Don on 2/8/2017.
 */

public class NewsLoader extends AsyncTaskLoader<List<NewsFeed>> {
    private String url;
    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }
    @Override
    public List<NewsFeed> loadInBackground() {
        String JSONResult = QueryUtils.makeHTTPConnection(url);
        return QueryUtils.parseJSONToNews(JSONResult);
    }
}

