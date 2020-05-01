/**
 * Copyright (c) 2016-present, lovebing.org.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package org.lovebing.reactnative.baidumap.module;

import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;

import com.baidu.mapapi.map.MapView;
import com.facebook.react.bridge.ReadableMap;
import org.lovebing.reactnative.baidumap.uimanager.MapViewManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;

import org.lovebing.reactnative.baidumap.uimanager.MapViewManager;

/**
 * @author lovebing
 * @date 2019/10/30
 */
public class BaiduMapManager extends BaseModule {

    public BaiduMapManager(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @NonNull
    @Override
    public String getName() {
        return getClass().getSimpleName();
    }

    @ReactMethod
    public void initSDK(String key) {
        Log.i("initSDK", key);
    }

    @ReactMethod
    public void refresh() {
        MapViewManager.refreshView();
    }
}
