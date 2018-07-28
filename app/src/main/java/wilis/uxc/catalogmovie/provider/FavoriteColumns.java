package com.omrobbie.cataloguemovieuiux.provider;

import android.provider.BaseColumns;

public class FavoriteColumns implements BaseColumns {
    public static String TABLE_NAME = "favorite_movie";

    public static String COLUMN_ID = "_id";
    public static String COLUMN_TITLE = "title";
    public static String COLUMN_BACKDROP = "backdrop";
    public static String COLUMN_POSTER = "poster";
    public static String COLUMN_RELEASE_DATE = "release_date";
    public static String COLUMN_VOTE = "vote";
    public static String COLUMN_OVERVIEW = "overview";
}
