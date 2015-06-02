package model;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.wizardsgroup.christianmoscosa.c2sapp.R;

/**
 * Created by shuri_000 on 5/19/2015.
 */
public class SearchAssetItem extends Fragment{
    public SearchAssetItem() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View mainView = inflater.inflate(R.layout.fragment_web, container, false);
        WebView webView = (WebView) mainView.findViewById(R.id.webview);
        webView.loadUrl("file:///android_asset/www/c2ssample.html");
        return mainView;

    }

    public void AssetManager(){

    }
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}

