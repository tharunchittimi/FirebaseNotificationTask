package com.example.firebasenotificationtask;

import com.google.firebase.messaging.FirebaseMessaging;

public class MyApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseMessaging.getInstance().subscribeToTopic("all");

    }
}
