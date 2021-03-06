package io.bakan.Vplayer.injector.module;

import android.app.Application;

import dagger.Module;
import dagger.Provides;
import io.bakan.Vplayer.ListenerApp;
import io.bakan.Vplayer.injector.scope.PerApplication;

/**
 * Created by hefuyi on 2016/11/1.
 */
@Module
public class ApplicationModule {
    private final ListenerApp mListenerApp;

    public ApplicationModule(ListenerApp listenerApp) {
        this.mListenerApp = listenerApp;
    }

    @Provides
    @PerApplication
    public ListenerApp provideListenerApp() {
        return mListenerApp;
    }

    @Provides
    @PerApplication
    public Application provideApplication() {
        return mListenerApp;
    }
}
