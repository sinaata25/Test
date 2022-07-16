package myapp.co.mvple.home;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

import myapp.co.mvple.data.News;

public class HomeFragmnet extends Fragment implements homeContract.view {

    homeContract.presenter presenter;

    @Override
    public void showNewsList(List<News> newsList) {

    }


    @Override
    public Context getViewContext() {
        return null;
    }


    @Override
    public void onCreate(@Nullable  Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        presenter=new HomePresenter();
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }


}
