# 二次修改说明
+ 基于lovebing的fc-npm分支2c2dcee修改
+ 修复RCTImageView.h引用路径的错误，ios增加zoom，双端引入latitudeDelta及longitudeDelta，统一marker的icon在各端的使用方式
+ 安卓需要刷新，否则，很多标志物都是黑色的，但是这段逻辑实现比较差，以后改

---------------------------------------以下是fc-npm版本的说明-----------------------------------------------
# 修改说明
+ 基于lovebing（原始开发者）的 6c31285
+ 修改目的：lovebing的代码要求react-native 0.61.2，修改为兼容mobilecrm的0.54

## android部分修改
+ lovebing 使用的是jetpack（androidx appcompat-v7:28.0.0）。改为23.0.1
+ lovebing 使用了java8 lambda，改为java1.7的语法
+ lovebing 用了一些无用的sdk，删掉。并使用最新的sdk

## ios部分修改
+ lovebing 用了一些无用的sdk，删掉。并使用最新的sdk
+ 修改podspec，因为之前的不能用
+ Marker支持icon

## js部分修改
+ js中有些没有propType，会报错"XXX has no propType for native prop XXX.propName of native type number"。需要在js中进行处理


# 用的百度地图sdk版本
# android版本
+ 安卓下载自 http://lbsyun.baidu.com/index.php?title=androidsdk/sdkandev-download
+ BaiduLBS_AndroidSDK_Docs.zip 点击页面的【类参考】按钮
+ 最新map sdk版本 v6.1
+ 最新定位sdk，v8.1.1
+ 安卓有个恶心的地方，每个zip包里都带有BaiduLBS_Android.jar，而且可能会出现冲突！必须从网站直接下载，不能独立下载、手动合并。

# ios版本
+ http://lbs.baidu.com/index.php?title=iossdk/sdkiosdev-download
+ 最新map sdk v5.1.0
+ 最新定位sdk v1.8
