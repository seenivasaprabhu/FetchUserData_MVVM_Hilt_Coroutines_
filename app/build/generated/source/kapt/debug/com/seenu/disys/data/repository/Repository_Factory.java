// Generated by Dagger (https://dagger.dev).
package com.seenu.disys.data.repository;

import com.seenu.disys.data.local.DatabaseDao;
import com.seenu.disys.data.remote.RemoteDataSource;
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
public final class Repository_Factory implements Factory<Repository> {
  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  private final Provider<DatabaseDao> localDataSourceProvider;

  public Repository_Factory(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<DatabaseDao> localDataSourceProvider) {
    this.remoteDataSourceProvider = remoteDataSourceProvider;
    this.localDataSourceProvider = localDataSourceProvider;
  }

  @Override
  public Repository get() {
    return newInstance(remoteDataSourceProvider.get(), localDataSourceProvider.get());
  }

  public static Repository_Factory create(Provider<RemoteDataSource> remoteDataSourceProvider,
      Provider<DatabaseDao> localDataSourceProvider) {
    return new Repository_Factory(remoteDataSourceProvider, localDataSourceProvider);
  }

  public static Repository newInstance(RemoteDataSource remoteDataSource,
      DatabaseDao localDataSource) {
    return new Repository(remoteDataSource, localDataSource);
  }
}
