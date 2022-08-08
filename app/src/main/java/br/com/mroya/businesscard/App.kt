package br.com.mroya.businesscard

import android.app.Application
import br.com.mroya.businesscard.data.AppDatabase
import br.com.mroya.businesscard.data.BusinessCardRepository

class App: Application() {
    val database by lazy { AppDatabase.getDatabase(this)}
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}