package com.example.android_studio_scaffold.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_studio_scaffold.nav.BottomNavigationScreens

class ScaffoldViewModel : ViewModel {
    private val _bottomNavigationItems = MutableLiveData<List<BottomNavigationScreens>>(emptyList())
    public val bottomNavigationItems: LiveData<List<BottomNavigationScreens>> = _bottomNavigationItems

    /**
     * Constructor de la classe ScaffoldViewModel
     * que inicialitza l'atribut els valors de la llista
     * de l'atribut privat _bottomNavigationItems
     */
    constructor(){
        this._bottomNavigationItems.value = listOf(
            BottomNavigationScreens.Home,
            BottomNavigationScreens.Favorite,
            BottomNavigationScreens.Settings
        )
    }
}
