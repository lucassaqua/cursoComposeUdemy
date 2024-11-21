package com.lucascardoso.cursocomposeudemy

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.lucascardoso.cursocomposeudemy.ui.theme.CursoComposeUdemyTheme
import androidx.compose.runtime.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Principal()
            //ChangeBoxColorExample()



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

            Column(
                modifier = Modifier
                    .fillMaxSize() // pega todoo espaço em tela
            ){
                Textcustomizado("Ola mundo teste",
                    modifier =  Modifier.padding(innerPadding))

                Row(
                    modifier = Modifier
                        .fillMaxWidth() // Pega todoo espaço horizontal
                        .background(Color.LightGray), // Apenas para visualização
                    horizontalArrangement = Arrangement.Center, // Centraliza no eixo horizontal
                    //verticalAlignment = Alignment.CenterVertically // Centraliza no eixo vertical
                ) {
                    Text(text = "testandoo ", modifier = Modifier.padding(
                        start = 20.dp,
                        top = 30.dp,
                        //end = 24.dp,
                        //bottom = 32.dp
                    ), color = Color.Blue,
                        fontSize = 30.sp,

                        )
                }


                Row{
                    Text(text = "AAAAA", modifier = Modifier.padding(16.dp))
                    Text(text = "BBBBB", modifier = Modifier.padding(16.dp))
                    Text(text = "CCCCC", modifier = Modifier.padding(16.dp))

                }

                NotificationBage()
                Text( text = "Olaa" )

                CardMesagem()
                TesteModifier()


            }


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

@Composable
fun NotificationBage(){
    var quadradoColor by remember { mutableStateOf(Color.Blue) }
    var circuloColor by remember { mutableStateOf(Color.Red) }

    Box(modifier = Modifier
        .padding(16.dp)
        .background(color = Color.LightGray)
        //.size(60.dp)
        .fillMaxWidth()
        .size(200.dp),
        contentAlignment = Alignment.Center,
        ){
        //Text(text = "Box Pai", color = Color.Green)


        Box(modifier = Modifier.background(color = quadradoColor,
            )
            .size(180.dp)){
            Text(text = "Box1")
        }
        // O elemento q ira sobrepor o outro precisa ser chamado depois
        Box(modifier = Modifier
            .size(100.dp)
            .clip(CircleShape) // faz o circulo
            .background(color = circuloColor)
            .align(Alignment.TopEnd)    ,
            contentAlignment = Alignment.Center
            ){
            Text(text = "Box2")
        }
    }
    Row(modifier = Modifier.fillMaxWidth() , //.align(Alignment.TopEnd,
        horizontalArrangement = Arrangement.Center ){
        Button(
            onClick = {
                circuloColor = if (circuloColor == Color.Blue) Color.Green else Color.Blue
            }, modifier = Modifier //.fillMaxWidth()
                .padding(16.dp)
        ){
            Text(text = "Cor Bola")
        }
        Button(
            onClick = {
                quadradoColor = if (quadradoColor == Color.Red) Color.Yellow else Color.Red
            }, modifier = Modifier //.fillMaxWidth()
                .padding(16.dp)
        ){
            Text(text = "Cor Quadrado")
        }

    }

}


@Composable
fun CardMesagem(){
    Row(modifier = Modifier.padding(16.dp)){
        Image(painter = painterResource(id = R.drawable.avatar_svgrepo_com),
            contentDescription = "AAAAA",
            modifier = Modifier.size(40.dp)
            )

        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = "Autor da Mensagem")
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "Conteudo da Mensagem")

        }
    }
}

@Composable
fun TesteModifier(){
    Row(modifier = Modifier.fillMaxWidth()){
        Column{
            Text(text = "Item 1",
                modifier = Modifier.padding(top = 3.dp, bottom = 8.dp, start = 5.dp, end = 9.dp))

            Text(text = "Item 2",
                modifier = Modifier.padding(top = 3.dp, bottom = 8.dp, start = 5.dp, end = 9.dp))

            Text(text = "Item 3",
                modifier = Modifier.padding(top = 3.dp, bottom = 8.dp, start = 5.dp, end = 9.dp))
        }

        Spacer(modifier = Modifier.width(40.dp))

        Button(
            onClick = {
                /*todo*/
            }, modifier = Modifier
                .padding(16.dp).align(Alignment.CenterVertically)
        ){
            Text(text = "Próxima Página")
        }


    }

}


@Preview(showBackground = true)
@Composable
fun PricipalPreview() {
    Principal()
}


