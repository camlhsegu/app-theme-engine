package com.afollestad.appthemeengine.processors;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.NestedScrollView;

import com.afollestad.appthemeengine.Config;
import com.afollestad.appthemeengine.util.EdgeGlowUtil;

/**
 * @author Aidan Follestad (afollestad)
 */
public class NestedScrollViewProcessor implements Processor<NestedScrollView, Void> {

    public static final String MAIN_CLASS = "android.support.v4.widget.NestedScrollView";

    @Override
    public void process(@NonNull Context context, @Nullable String key, @Nullable NestedScrollView target, @Nullable Void extra) {
        if (target == null) return;
        EdgeGlowUtil.setEdgeGlowColor(target, ScrollViewProcessor.processTag(context, key, target));
    }
}
