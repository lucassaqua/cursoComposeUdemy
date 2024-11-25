package components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview
@Composable
fun Preview(){
    SimpleText()

}

@Composable
fun SimpleText(){
    val offset = Offset(x = 5f, y = 10f)
    Column(modifier = Modifier.background(color = Color.White)){ //.fillMaxSize()
        Text(text = "Texto de outro component",
            color = Color.Blue,
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            modifier = Modifier.fillMaxWidth(),
            style = TextStyle( shadow = Shadow(color = Color.Red, blurRadius = 5.0f,
                offset = offset)) //posicao da sombra
        )

    }

}

//teste
