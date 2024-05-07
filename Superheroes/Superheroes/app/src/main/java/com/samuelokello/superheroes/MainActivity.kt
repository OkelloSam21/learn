package com.samuelokello.superheroes

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.samuelokello.superheroes.model.HeroesRepository
import com.samuelokello.superheroes.presentation.theme.SuperheroesTheme
import com.samuelokello.superheroes.presentation.ui.HeroesList
import com.samuelokello.superheroes.presentation.ui.HeroesTopAppBar

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SuperheroesTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SuperHeroesApp()
                }
            }
        }
    }
}

@Composable
fun SuperHeroesApp(modifier: Modifier = Modifier) {
    Scaffold (
        modifier = modifier.fillMaxSize(),
        topBar = { HeroesTopAppBar()}
    ){
        val heroes = HeroesRepository.heroes
        HeroesList(heroes = heroes, contentPadding = it)
    }
}
