package com.tws.refactoring.extract_variable;

import org.junit.Test;

import static org.junit.Assert.*;

public class BannerRenderTest {

    @Test
    public void should_return_ie_on_mac_when_browser_is_ie_and_platform_is_mac() {
        BannerRender bannerRender = new BannerRender();

        assertEquals("IE on Mac?", bannerRender.renderBanner("not MAC :P", "not IE :p"));
    }

    @Test
    public void should_return_banner_if_platform_not_mac_and_browser_is_ie() {
        BannerRender bannerRender = new BannerRender();

        assertEquals("banner", bannerRender.renderBanner("windows", "ie11"));
    }

    @Test
    public void should_return_banner_if_platform_is_mac_and_browser_not_ie() {
        BannerRender bannerRender = new BannerRender();

        assertEquals("banner", bannerRender.renderBanner("mac", "chrome"));
    }

    @Test
    public void should_return_banner_if_platform_not_mac_and_browser_not_ie() {
        BannerRender bannerRender = new BannerRender();

        assertEquals("banner", bannerRender.renderBanner("windows", "chrome"));
    }
}