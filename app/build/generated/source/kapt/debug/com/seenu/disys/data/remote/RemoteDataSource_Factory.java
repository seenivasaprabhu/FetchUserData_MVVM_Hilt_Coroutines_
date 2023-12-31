// Generated by Dagger (https://dagger.dev).
package com.seenu.disys.data.remote;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<ApiService> apiServiceProvider;

  public RemoteDataSource_Factory(Provider<ApiService> apiServiceProvider) {
    this.apiServiceProvider = apiServiceProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(apiServiceProvider.get());
  }

  public static RemoteDataSource_Factory create(Provider<ApiService> apiServiceProvider) {
    return new RemoteDataSource_Factory(apiServiceProvider);
  }

  public static RemoteDataSource newInstance(ApiService apiService) {
    return new RemoteDataSource(apiService);
  }
}
