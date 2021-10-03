package com.codepath.alvaroots97.instagramclone;

import android.app.Application;
import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // register your parse models
        ParseObject.registerSubclass(Post.class);
        // set applicationId, and server server based on the values in the Heroku settings

        // clientKey is not needed unless explicitly configured

        //any netowork interceptors must be added with the Configuration Builder given this sync
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build());
    }
}
