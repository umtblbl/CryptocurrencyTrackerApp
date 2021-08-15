package com.umit.cryptocurrencytrackerapp.di.module

import com.umit.cryptocurrencytrackerapp.scenes.coinDetail.CoinDetailFragment
import com.umit.cryptocurrencytrackerapp.scenes.coinList.CoinListFragment
import com.umit.cryptocurrencytrackerapp.scenes.favoriteCoinList.FavoriteCoinListFragment
import com.umit.cryptocurrencytrackerapp.scenes.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FragmentBuildersModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeCoinListFragment(): CoinListFragment

    @ContributesAndroidInjector
    abstract fun contributeFavoriteCoinListFragment(): FavoriteCoinListFragment

    @ContributesAndroidInjector
    abstract fun contributeCoinDetailFragment(): CoinDetailFragment
}
