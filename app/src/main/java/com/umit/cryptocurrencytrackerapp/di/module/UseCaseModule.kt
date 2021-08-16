package com.umit.cryptocurrencytrackerapp.di.module

import com.umit.cryptocurrencytrackerapp.data.repository.AuthRepository
import com.umit.cryptocurrencytrackerapp.data.repository.CoinsRepository
import com.umit.cryptocurrencytrackerapp.domain.auth.LoginUseCase
import com.umit.cryptocurrencytrackerapp.domain.auth.RegisterUseCase
import com.umit.cryptocurrencytrackerapp.domain.coins.FetchCoinDetailUseCase
import com.umit.cryptocurrencytrackerapp.domain.coins.FetchCoinListUseCase
import com.umit.cryptocurrencytrackerapp.domain.coins.FetchSearchedCoinListUseCase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UseCaseModule {

    @Singleton
    @Provides
    fun provideFetchCoinListUseCase(coinsRepository: CoinsRepository): FetchCoinListUseCase {
        return FetchCoinListUseCase(coinsRepository)
    }

    @Singleton
    @Provides
    fun provideFetchSearchedCoinListUseCase(coinsRepository: CoinsRepository): FetchSearchedCoinListUseCase {
        return FetchSearchedCoinListUseCase(coinsRepository)
    }

    @Singleton
    @Provides
    fun provideFetchCoinDetailUseCase(coinsRepository: CoinsRepository): FetchCoinDetailUseCase {
        return FetchCoinDetailUseCase(coinsRepository)
    }

    @Singleton
    @Provides
    fun provideLoginUseCase(authRepository: AuthRepository): LoginUseCase {
        return LoginUseCase(authRepository)
    }

    @Singleton
    @Provides
    fun provideRegisterUseCase(authRepository: AuthRepository): RegisterUseCase {
        return RegisterUseCase(authRepository)
    }
}
