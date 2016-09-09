package com.example.activity;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.BuildConfig;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class MediaSessionTest {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Test
    @Config(constants = BuildConfig.class, sdk = 21)
    public void testMediaSessionExists() throws Exception {
        final Object systemService = RuntimeEnvironment.application.getSystemService(Context.MEDIA_SESSION_SERVICE);
        Assert.assertNotNull(systemService);
    }
}
