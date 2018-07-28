package io.bakan.Vplayer.mvp.contract;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import io.bakan.Vplayer.mvp.presenter.BasePresenter;
import io.bakan.Vplayer.mvp.view.BaseView;

/**
 * Created by hefuyi on 2016/11/24.
 */

public interface ArtistDetailContract {

    interface View extends BaseView {

        Context getContext();

        void showArtistArt(Bitmap bitmap);

        void showArtistArt(Drawable drawable);

        void setTitle(String artistName);

    }

    interface Presenter extends BasePresenter<View> {

        void subscribe(long artistID);

        void loadArtistArt(long artistID);
    }

}
