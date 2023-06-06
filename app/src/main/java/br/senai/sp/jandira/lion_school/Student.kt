package br.senai.sp.jandira.lion_school

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.ui.theme.Lion_SchoolTheme

class Student : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lion_SchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    val contex = LocalContext.current

    Column(modifier = Modifier.fillMaxWidth()) {
        Card(
            backgroundColor = Color(213, 243, 251),
            shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {

//           Spacer(modifier = Modifier.height(300.dp))
                Row(modifier = Modifier.fillMaxWidth()) {

                    Icon(
                        modifier = Modifier
                            .padding(8.dp, 8.dp)
                            .clickable {
                                val openSupport = Intent(contex, MainActivity::class.java)
                                contex.startActivity(openSupport)
                            }, painter = painterResource(id = R.drawable.baseline_arrow),
                        contentDescription = "",
                    )
                    Spacer(modifier = Modifier.width(110.dp))

                }
                Spacer(modifier = Modifier.height(200.dp))
                Column() {
                }
            }
        }
        Column() {

        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview4() {
    Lion_SchoolTheme {
        Greeting("Android")
    }
}