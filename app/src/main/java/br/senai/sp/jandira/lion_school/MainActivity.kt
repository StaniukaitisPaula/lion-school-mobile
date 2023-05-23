package br.senai.sp.jandira.lion_school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.ui.theme.Lion_SchoolTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lion_SchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LionHome("Android")
                }
            }
        }
    }
}

@Composable
fun LionHome(name: String) {
    Column(
        Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween) {
        Icon(
            modifier = Modifier.padding(8.dp, 8.dp),
            painter = painterResource(id = R.drawable.support),
            contentDescription = stringResource(id = R.string.support)
        )
        Column(
            modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center) {
            Image(
                modifier = Modifier.size(400.dp),
                painter = painterResource(id = R.drawable.background),
                contentDescription = stringResource(id = R.string.app_name))
        }
        Column(modifier = Modifier.padding(8.dp, 50.dp)) {
            Text(
                text = stringResource(id = R.string.app_name),
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp
            )
            Spacer(modifier = Modifier.height(20.dp))
            Column(modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.CenterHorizontally) {
                Button(onClick = { /*TODO*/ },
                    modifier= Modifier
                        .width(187.dp)
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(Color(223, 251, 213)),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "DS",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                            contentDescription = ""
                        )
                    }
                }
                Spacer(modifier = Modifier.height(20.dp))
                Button(onClick = { /*TODO*/ },
                    modifier= Modifier
                        .width(187.dp)
                        .height(48.dp),
                    colors = ButtonDefaults.buttonColors(Color(223, 251, 213)),
                    shape = RoundedCornerShape(15.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(text = "RDS",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_arrow_forward_24),
                            contentDescription = ""
                        )
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Lion_SchoolTheme {
        LionHome("Lion School")
    }
}