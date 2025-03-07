package com.example.android_studio_scaffold.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.android_studio_scaffold.nav.BottomNavigationScreens

class ScaffoldViewModel : ViewModel {
    private val _bottomNavigationItems = MutableLiveData<List<BottomNavigationScreens>>(emptyList())
    public val bottomNavigationItems: LiveData<List<BottomNavigationScreens>> = _bottomNavigationItems

    private val _searchedText = MutableLiveData("")
    public val searchedText: LiveData<String> = _searchedText

    private val _searchHistory = MutableLiveData<List<String>>(emptyList())
    public val searchHistory: LiveData<List<String>> = _searchHistory


    /**
     * Constructor de la classe ScaffoldViewModel
     * que inicialitza l'atribut els valors de la llista
     * de l'atribut privat _bottomNavigationItems
     */
    constructor() : super() {
        this._bottomNavigationItems.value = listOf(
            BottomNavigationScreens.Home,
            BottomNavigationScreens.Favorite,
            BottomNavigationScreens.Settings
        )
    }

    fun onSearchTextChange(text: String) {
        this._searchedText.value = text
    }

    fun addToHistory(text: String) {
        if (text.isNotBlank()) {
            // Obté la llista actual o una llista buida
            val currentHistory = this._searchHistory.value.orEmpty()
            // Afegeix el nou text al principi
            this._searchHistory.value = listOf(text) + currentHistory
            // Neteja el text després de fer la cerca
            this._searchedText.value = ""
        }
    }

    fun clearHistory() {
        this._searchHistory.value = emptyList()
    }
}
