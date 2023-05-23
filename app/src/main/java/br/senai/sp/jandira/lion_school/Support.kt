package br.senai.sp.jandira.lion_school

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.magnifier
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.ui.theme.Lion_SchoolTheme

class Support : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lion_SchoolTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Support("Android")
                }
            }
        }
    }
}

@Composable
fun Support(name: String) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.fillMaxWidth()
            ) {
            Card(
                backgroundColor = Color(223, 251, 213),
                shape = RoundedCornerShape(bottomStart = 20.dp, bottomEnd = 20.dp)
            ) {
                Icon(
                    modifier = Modifier.padding(8.dp, 8.dp), painter = painterResource(id = R.drawable.baseline_arrow),
                    contentDescription = "",
                )
                Spacer(modifier = Modifier.height(200.dp))

                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(
                        text = stringResource(id = R.string.support),
                        fontWeight = FontWeight.Bold,
                        fontSize = 44.sp,

                    )
                }
            }
            Spacer(modifier = Modifier.height(80.dp))
                Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally,)  {
                    Row() {
                Icon(
                    painter = painterResource(id = R.drawable.call),
                    contentDescription = ""
                )
                        Text(text = stringResource(id = R.string.tell))
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row() {
                Icon(
                    painter = painterResource(id = R.drawable.call),
                    contentDescription = ""
                )
                        Text(text = stringResource(id = R.string.email))
                    }
                    Spacer(modifier = Modifier.height(20.dp))
                    Row() {
                Icon(
                    painter = painterResource(id = R.drawable.baseline_location_on_24),
                    contentDescription = ""
                )
                        Text(text = stringResource(id = R.string.location))
                    }
                }


            }
        Spacer(modifier = Modifier.height(200.dp))
        Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = stringResource(id = R.string.socialMedia),
                fontWeight = FontWeight.Bold,
                fontSize = 34.sp,
            )
                Row(

                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.youtube),
                        contentDescription = ""
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.instagram),
                        contentDescription = ""
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.twitter),
                        contentDescription = ""
                    )
                    Icon(
                        painter = painterResource(id = R.drawable.facebook),
                        contentDescription = ""
                    )
            }
        }
    }
}

@Preview(showBackground = true,  showSystemUi = true)
@Composable
fun DefaultPreview3() {
    Lion_SchoolTheme {
        Support("Android")
    }
}