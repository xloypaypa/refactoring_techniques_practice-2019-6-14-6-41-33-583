package com.tws.refactoring.extract_variable;

public class BannerRender {
    String renderBanner(String platform, String browser) {
        boolean isMac = platform.toUpperCase().contains("MAC");
        boolean isIE = browser.toUpperCase().contains("IE");
        if (isMac && isIE) {
            return "IE on Mac?";
        }
        return "banner";
    }
}
