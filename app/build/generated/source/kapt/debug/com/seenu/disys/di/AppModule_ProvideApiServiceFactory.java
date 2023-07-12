// Generated by Dagger (https://dagger.dev).
package com.seenu.disys.di;

import com.seenu.disys.data.remote.ApiService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideApiServiceFactory implements Factory<ApiService> {
  private final Provider<Retrofit> retrofitProvider;

  public AppModule_ProvideApiServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public ApiService get() {
    return provideApiService(retrofitProvider.get());
  }

  public static AppModule_ProvideApiServiceFactory create(Provider<Retrofit> retrofitProvider) {
    return new AppModule_ProvideApiServiceFactory(retrofitProvider);
  }

  public static ApiService provideApiService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideApiService(retrofit));
  }
}
