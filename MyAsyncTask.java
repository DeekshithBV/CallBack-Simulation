package com.example.callback;

public class MyAsyncTask {
    public void doAsyncTask(final MyCallback callback){
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    String res = "data fetched successfully";
                    callback.onSuccess(res);
                } catch (Exception e){
                    String err = "err fetching data";
                    callback.onFailure(err);
                }
            }
        }).start();
    }
}
