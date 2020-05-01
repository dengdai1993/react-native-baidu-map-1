package org.lovebing.reactnative.baidumap.util;

import android.content.Context;
import android.support.annotation.NonNull;

public class DensityUtils {

    /**
     * dp 转成为 px
     *
     * @param context the context
     * @param dpValue 要转换的 dp 值
     * @return 转换好的 px 像素值
     */
    public static int dip2px(@NonNull final Context context, final float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }

}
