package com.vstb7module;

import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;




public class VSTB7module extends ReactContextBaseJavaModule {

    private static final String TAG="VSTB7Module";
    private static ReactApplicationContext reactApplicationContext;
    VSTB7module(ReactApplicationContext reactContext){
        super(reactContext);
        reactApplicationContext=reactContext;

    }

    @ReactMethod
    public void initializeVSTB()
    {
        VSTBConfiguration configuration=new VSTBConfiguration.Builder()
                .setAccountId("")
                .setApplicationNAme("")
                .build();

        VSTB.getInstance().initialize(getReactApplicationContext(),configuration,new VSTB.IIintializationListener(){

            @Override
            public void oninitializeVSTBCompleted()
            {
                Log.d(TAG, "VSTB initialized Successfully ");
            }
            @Override
            public void onInitializationFailed(Exception e)
            {
                Log.e(TAG, "Failed to initialize VSTB7",e );
            }
        });
    }



    @NonNull
    @Override
    public String getName() {
        return "VSTBManager";
    }
}
