//
//  OverlayMarker.m
//  react-native-baidu-map
//
//  Created by lovebing on 2019/10/7.
//  Copyright © 2019年 lovebing.org. All rights reserved.
//

#import "OverlayMarker.h"
#import "BMKPointAnnotationPro.h"
#import <BaiduMapAPI_Map/BMKAnnotationView.h>
#import "RCBMImageAnnotView.h"

//在OverlayMarkerManager.m中有如下内容：
//RCT_EXPORT_VIEW_PROPERTY(location, NSDictionary*)
//RCT_EXPORT_VIEW_PROPERTY(title, NSString*)
//RCT_EXPORT_VIEW_PROPERTY(icon, RCTImageSource*);

@implementation OverlayMarker

- (NSString *)getType {
    return @"marker";
}

//Override
- (void)addToMap:(BMKMapView *)mapView {
    [mapView addAnnotation:[self getAnnotation]];
}

//Override
- (void)update {
    [self updateAnnotation:[self getAnnotation]];
}

//Override
- (void)removeFromMap:(BMKMapView *)mapView {
    [mapView removeAnnotation:[self getAnnotation]];
}

- (BMKPointAnnotationPro *)getAnnotation {
    if (_annotation == nil) {
        _annotation = [[BMKPointAnnotationPro alloc] init];
        [self updateAnnotation:_annotation];
    }
    return _annotation;
}

//传入annotation对象，
- (void)updateAnnotation:(BMKPointAnnotationPro *)annotation {
    CLLocationCoordinate2D coor = [OverlayUtils getCoorFromOption:_location];
    if(_title.length == 0) {
        annotation.title = nil;
    } else {
        annotation.title = _title;
    }

    annotation.coordinate = coor;

    annotation.getAnnotationView = ^BMKAnnotationView * _Nonnull(BMKPointAnnotation * _Nonnull annotation) {
        RCBMImageAnnotView *annotV = [[RCBMImageAnnotView alloc] initWithAnnotation:annotation reuseIdentifier:@"dontCare"];
        annotV.canShowCallout = NO;
        annotV.bridge = self.bridge;
        NSLog(@"self.icon:%@",self.icon);
        annotV.source = self.icon;
        return annotV;
    };
}

@end

