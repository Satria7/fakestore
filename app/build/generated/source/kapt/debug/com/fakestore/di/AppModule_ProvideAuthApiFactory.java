// Generated by Dagger (https://dagger.dev).
package com.fakestore.di;

import android.content.Context;
import com.fakestore.Network.api.RemoteDataSource;
import com.fakestore.Network.api.data.AuthApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideAuthApiFactory implements Factory<AuthApi> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<Context> contextProvider;

  public AppModule_ProvideAuthApiFactory(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<Context> contextProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.contextProvider = contextProvider;
  }

  @Override
  public AuthApi get() {
    return provideAuthApi(remoteDataSourceProvider.get(), contextProvider.get());
  }

  public static AppModule_ProvideAuthApiFactory create(
      Provider<RemoteDataSource> remoteDataSourceProvider, Provider<Context> contextProvider) {
    return new AppModule_ProvideAuthApiFactory(remoteDataSourceProvider, contextProvider);
  }

  public static AuthApi provideAuthApi(RemoteDataSource remoteDataSource, Context context) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideAuthApi(remoteDataSource, context));
  }
}
