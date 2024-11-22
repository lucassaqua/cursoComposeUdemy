package components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InitialScreen(){

}

@Preview
@Composable
fun SimpleButtom(){
    Button(
        onClick = {/*todo*/}, modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
    ){
        Text(text = "Confirmar", modifier = Modifier.padding(4.dp))

    }

}