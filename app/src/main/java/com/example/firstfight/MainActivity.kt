package com.example.firstfight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.firstfight.ui.theme.FirstFightTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FirstFightTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   FightWindow()
                }
            }
        }
    }
}

@Composable
fun FightWindow () {
    Column() {
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Magenta)
            .weight(2f))
        {
            RoundNumber()
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .weight(2f)) {
            EnemyLifeScreen()
            PlayerLifeScreen()
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Green)
            .weight(12f)) {
            EnemyPictureScreen()
            PlayerPictureScreen()
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .weight(3f)) {
            Column(modifier = Modifier
                .fillMaxHeight()
                .background(Color.Blue)
                .weight(1f)) {
                WeaponOne()
            }
            Column(modifier = Modifier
                .fillMaxHeight()
                .background(Color.White)
                .weight(1f)) {
                WeaponTwo()
            }
            Column(modifier = Modifier
                .fillMaxHeight()
                .background(Color.Gray)
                .weight(1f)) {
                WeaponThree()
            }
            Column(modifier = Modifier
                .fillMaxHeight()
                .background(Color.DarkGray)
                .weight(1f)) {
                UseWeapon()
            }
        }
    }
}

@Composable
fun RoundNumber() {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){
        Text(text = "Round 1", textAlign = TextAlign.Center)
    }
}

@Composable
fun EnemyLifeScreen() {
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(0.5f), contentAlignment = Alignment.Center){
        Text(text = "100", textAlign = TextAlign.Center)
    }
}

@Composable
fun PlayerLifeScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        , contentAlignment = Alignment.Center){
        Text(text = "100", textAlign = TextAlign.Center)
    }
}

@Composable
fun EnemyPictureScreen() {
    Box(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth(0.5f)
        .background(Color.DarkGray)
        , contentAlignment = Alignment.Center ){

    }
}

@Composable
fun PlayerPictureScreen() {
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.LightGray)
        , contentAlignment = Alignment.Center ){

    }
}

@Composable
fun WeaponOne(){
    Button(modifier = Modifier.fillMaxSize()
        , onClick = { /*TODO*/ }
        , shape = RectangleShape) {
        Image(painter = painterResource(id = R.drawable.hammer), contentDescription = "Hammer" )
    }
}

@Composable
fun WeaponTwo(){
    Button(modifier = Modifier.fillMaxSize()
        , onClick = { /*TODO*/ }
        , shape = RectangleShape) {
        Image(painter = painterResource(id = R.drawable.repire), contentDescription = "Hammer" )
    }
}

@Composable
fun WeaponThree(){
    Button(modifier = Modifier.fillMaxSize()
        , onClick = { /*TODO*/ }
        , shape = RectangleShape) {
        Image(painter = painterResource(id = R.drawable.axe), contentDescription = "Hammer" )
    }
}

@Composable
fun UseWeapon(){
    Button(modifier = Modifier.fillMaxSize()
        , onClick = { /*TODO*/ }
        , shape = RectangleShape) {
        Image(painter = painterResource(id = R.drawable.use), contentDescription = "Hammer" )
    }
}
