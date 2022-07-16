package myapp.co.mvple.base;

public interface BasePresenter<T extends BaseView> {

    void attachView(T view);
    void detachView();
}
