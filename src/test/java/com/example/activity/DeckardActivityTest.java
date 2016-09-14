package com.example.activity;

import android.annotation.TargetApi;

import com.example.BuildConfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = 21)
public class DeckardActivityTest {

    @Test
    public void testSomething() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class) != null);
    }

    @Test
    @Config(sdk = 19)
    @TargetApi(19)
    public void testGetExternalCacheDirs19() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class).getExternalCacheDirs().length > 0);
    }

    @Test
    @Config(sdk = 20)
    @TargetApi(20)
    public void testGetExternalCacheDirs20() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class).getExternalCacheDirs().length > 0);
    }

    @Test
    @Config(sdk = 21)
    @TargetApi(21)
    public void testGetExternalCacheDirs21() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class).getExternalCacheDirs().length > 0);
    }

    @Test
    @Config(sdk = 22)
    @TargetApi(22)
    public void testGetExternalCacheDirs22() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class).getExternalCacheDirs().length > 0);
    }

    @Test
    @Config(sdk = 23)
    @TargetApi(23)
    public void testGetExternalCacheDirs23() throws Exception {
        assertTrue(Robolectric.setupActivity(DeckardActivity.class).getExternalCacheDirs().length > 0);
    }
}
