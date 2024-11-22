package components
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun TextFieldTeste(){
    var text by remember { mutableStateOf("") }
    //var text = "" Se eu fizer isso, o valor do text não é atualizado

    var isError by remember { mutableStateOf(false)}

    if(text.contains("0")){ // o OutlinedTextField apresenta o erro, se o texto contiver um 0
        isError = true
    }
    else{
        isError = false
    }

    Column(modifier = Modifier.background(color = Color.White)){
        Spacer(modifier = Modifier.padding(30.dp))
        Text(text= "texto do input: " + text)
        Spacer(modifier = Modifier.padding(30.dp))
        TextField(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = {novoValorDigitado -> text = novoValorDigitado}, //esta atualizando o valor do text
            label = { Text(text= "Nome")}
        )
        Spacer(modifier = Modifier.padding(30.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = {novoValorDigitado -> text = novoValorDigitado}, //esta atualizando o valor do text
            label = { Text(text= "Nome")},
            isError = isError,
            textStyle = TextStyle(
                color = Color.Blue,
                fontFamily =  FontFamily.Cursive,
                fontSize = 20.sp
            ),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                cursorColor = Color.Green,
                errorBorderColor = Color.Red,
                errorCursorColor = Color.Magenta,
                focusedBorderColor = Color.Cyan
            ),
            maxLines = 2
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = {novoValorDigitado -> text = novoValorDigitado}, //esta atualizando o valor do text
            label = { Text(text= "Nome")},
            isError = isError,
            singleLine = true,
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters, //faz com que as letras do teclado fiquem maiusculas por padrão
                autoCorrect = true, // KeyboardCapitalization.Words // Sentence
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next),// eh o botao que aparece no enter
                                                           
        )
        OutlinedTextField( // Senha
            modifier = Modifier.fillMaxWidth(),
            value = text,
            onValueChange = {novoValorDigitado -> text = novoValorDigitado.trim()}, //esta atualizando o valor do text
            label = { Text(text= "Senha")},
            isError = isError,
            singleLine = true,
            keyboardOptions = KeyboardOptions(capitalization = KeyboardCapitalization.Characters, //faz com que as letras do teclado fiquem maiusculas por padrão
                autoCorrect = true, // KeyboardCapitalization.Words // Sentence
                keyboardType = KeyboardType.Number,
                imeAction = ImeAction.Next),// eh o botao que aparece no enter
            visualTransformation = PasswordVisualTransformation()

        )




    }



}