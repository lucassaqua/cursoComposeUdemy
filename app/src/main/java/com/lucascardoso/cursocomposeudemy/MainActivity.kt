package com.lucascardoso.cursocomposeudemy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.lucascardoso.cursocomposeudemy.ui.theme.CursoComposeUdemyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Principal()



            //Text(text = "Olá mundo!")
            //Textcustomizado("Ola mundo")
        }
    }


}


@Composable
fun Principal(){
    CursoComposeUdemyTheme {
        Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
            /*Greeting(
                name = "Android",
                modifier = Modifier.padding(innerPadding)
            )*/
            Log.i("innerPadding - ", "innerPadding - $innerPadding")
            Textcustomizado("Ola mundo teste",
                modifier =  Modifier.padding(innerPadding))
        }
    }
}

@Composable
fun Textcustomizado(texto: String, modifier: Modifier = Modifier){
    Text(text = texto,
        modifier = modifier)
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Olá $name!",

        modifier = modifier
    )
}

/*
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CursoComposeUdemyTheme {
        Greeting("Android")
    }
}

@Preview(showBackground = true)
@Composable
fun TextCustomizadoPreview() {
    CursoComposeUdemyTheme {
        Textcustomizado("Android")
    }
}
*/

@Preview(showBackground = true)
@Composable
fun PricipalPreview() {
    Principal()

}

