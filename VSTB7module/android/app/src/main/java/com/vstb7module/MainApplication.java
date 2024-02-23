/*
package com.vstb7module;

import android.app.Application;

import com.facebook.react.BuildConfig;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JSIModulePackage;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.ReactMarkerConstants;
import com.facebook.react.devsupport.HMRClient;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost reactNativeHost = new ReactNativeHost(this) {
        @Override
        public boolean getUseDeveloperSupport() {
            return BuildConfig.DEBUG;
        }

        @Override
        //protected List<ReactPackage> getPackages() {
        //    return new PackageList(this).getPackages();
        //}
        protected List<ReactPackage> getPackages() {
            @SuppressWarnings("UnnecessaryLocalVariable")
            List<ReactPackage> packages = new PackageList(this).getPackages();
            // below MyAppPackage is added to the list of packages returned
            packages.add(new VSTB7Package());
            return packages;
        }

        @Override
        protected String getJSMainModuleName() {
            return "index";
        }

        @Override
        protected JSIModulePackage getJSIModulePackage() {
            return new MainReactPackage();
        }

        @Override
        protected ReactMarker.MarkerListener getReactMarkerListener() {
            return (name, markerData) -> {
                if (name.equals(ReactMarkerConstants.CONTENT_APPEARED)) {
                    HMRClient.enable();
                }
            };
        }

        @Override
        protected DevBundleDownloadListener getDevBundleDownloadListener() {
            return null;
        }
    };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return reactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, */
/* native exopackage *//*
 false);
    }
}*/
package com.vstb7module;

import android.app.Application;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.vstb7module.BuildConfig;


import java.util.List;

public class MainApplication extends Application implements ReactApplication {
    private final ReactNativeHost mReactNativeHost =
            new ReactNativeHost(this) {
                @Override
                public boolean getUseDeveloperSupport() {
                    return BuildConfig.DEBUG;
                }

                @Override
                protected List<ReactPackage> getPackages() {
                    List<ReactPackage> packages = new PackageList(this).getPackages();
                    packages.add(new VSTB7Package()); // Add this line to register the VSTBModule
                    return packages;
                }

                @Override
                protected String getJSMainModuleName() {
                    return "index";
                }
            };

    @Override
    public ReactNativeHost getReactNativeHost() {
        return mReactNativeHost;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        SoLoader.init(this, /* native exopackage */ false);
    }
}