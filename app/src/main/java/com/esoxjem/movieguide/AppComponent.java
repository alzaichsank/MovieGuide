package com.esoxjem.movieguide;

import com.esoxjem.movieguide.details.DetailsComponent;
import com.esoxjem.movieguide.details.DetailsModule;
import com.esoxjem.movieguide.favorites.FavoritesModule;
import com.esoxjem.movieguide.listing.ListingComponent;
import com.esoxjem.movieguide.listing.ListingModule;
import com.esoxjem.movieguide.network.NetworkModule;
import com.esoxjem.movieguide.rxbus.RxBusModule;
import com.esoxjem.movieguide.sorting.SortingComponent;
import com.esoxjem.movieguide.sorting.SortingModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author pulkitkumar
 */
@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class,
        RxBusModule.class})
public interface AppComponent
{
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);

    SortingComponent plus(SortingModule sortingModule);
}
