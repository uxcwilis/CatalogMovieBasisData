package com.omrobbie.favoritemovies.activity;

import android.database.Cursor;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.omrobbie.favoritemovies.R;
import com.omrobbie.favoritemovies.adapter.FavoriteAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import static com.omrobbie.favoritemovies.provider.DatabaseContract.CONTENT_URI;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_favorite) RecyclerView rv_favorite;

    private Cursor list;
    private FavoriteAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        setupList();
        new loadDataAsync().execute();
    }

    @Override
    protected void onResume() {
        super.onResume();
        new loadDataAsync().execute();
    }

    private void setupList() {
        adapter = new FavoriteAdapter(list);
        rv_favorite.setLayoutManager(new LinearLayoutManager(this));
        rv_favorite.addItemDecoration(new DividerItemDecoration(rv_favorite.getContext(), DividerItemDecoration.VERTICAL));
        rv_favorite.setAdapter(adapter);
    }

    private class loadDataAsync extends AsyncTask<Void, Void, Cursor> {

        @Override
        protected Cursor doInBackground(Void... voids) {
            return getContentResolver().query(
                    CONTENT_URI,
                    null,
                    null,
                    null,
                    null
            );
        }

        @Override
        protected void onPostExecute(Cursor cursor) {
            super.onPostExecute(cursor);

            list = cursor;
            adapter.replaceAll(list);
        }
    }
}
