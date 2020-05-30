package org.lovebing.reactnative.baidumap.util;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReadableMap;

import org.lovebing.reactnative.baidumap.model.IconData;

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