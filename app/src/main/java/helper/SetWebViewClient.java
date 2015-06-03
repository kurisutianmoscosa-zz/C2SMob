package helper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.cogdasma.c2smob.R;

/**
 * Created by shuri_000 on 5/19/2015.
 */

public class SetWebViewClient {
    private LayoutInflater inflater;
    private ViewGroup container;
    private View mainView;
    private WebView webView;

    public SetWebViewClient(LayoutInflater inflater, ViewGroup container) {
        this.inflater = inflater;
        this.container = container;
    }

    public View getMainView() {
        return mainView;
    }

    public WebView getWebView() {
        return webView;
    }

    public SetWebViewClient invoke() {
        mainView = inflater.inflate(R.layout.fragment_web, container, false);
        webView = (WebView) mainView.findViewById(R.id.webview);
        return this;
    }
}