package myapp.co.mvple.home;

import java.util.List;

import myapp.co.mvple.base.BasePresenter;
import myapp.co.mvple.base.BaseView;
import myapp.co.mvple.data.News;

public interface homeContract {

    interface view extends BaseView{
        void showNewsList(List<News>newsList);
    }

    interface presenter extends BasePresenter<view>{
        void getNewsList();
    }


}
