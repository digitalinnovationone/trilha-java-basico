package org.app.implts;

import org.app.interfaces.IBrowser;

public final class Browser implements IBrowser {

    @Override
    public void openPage(String url) {
        System.out.println("loading website");
    }

    @Override
    public void newTab() {
        System.out.println("new tab opend");
    }

    @Override
    public void refreshPage() {
        System.out.println("refresh");
    }
}
