package com.example.gemchat;

public interface ResponseCallback {
    void onResponse(String Response);
    void onError(Throwable throwable);
}
