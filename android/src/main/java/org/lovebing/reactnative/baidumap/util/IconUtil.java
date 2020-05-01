package org.lovebing.reactnative.baidumap.util;

import android.content.Context;
import android.graphics.drawable.Icon;
import android.support.annotation.NonNull;

import com.baidu.mapapi.model.LatLng;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

import org.lovebing.reactnative.baidumap.constant.LocationDataKey;
import org.lovebing.reactnative.baidumap.model.IconData;

import java.util.ArrayList;
import java.util.List;

public class IconUtil {

    public static IconData fromReadableMap(ReadableMap readableMap) {
        IconData iconData = new IconData();
        if (readableMap.hasKey(IconData.URI)) {
            iconData.uri = readableMap.getString(IconData.URI);
        }
        if (readableMap.hasKey(IconData.WIDTH)) {
            iconData.width = readableMap.getInt(IconData.WIDTH);
        }
        if (readableMap.hasKey(IconData.HEIGHT)) {
            iconData.height = readableMap.getInt(IconData.HEIGHT);
        }
        return iconData;
    }
}