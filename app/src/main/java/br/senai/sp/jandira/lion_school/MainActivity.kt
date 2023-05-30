package br.senai.sp.jandira.lion_school

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lion_school.model.CourseList
import br.senai.sp.jandira.lion_school.service.RetrofitFactory
import br.senai.sp.jandira.lion_school.ui.theme.Lion_SchoolTheme
import retrofit2.Callback
import retrofit2.Call
import retrofit2.Response

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
     val contex = LocalContext.current

    //var alunos by remember {
   //     mutableStateOf(listOf<br.senai.sp.jandira.lion_school.model.Course>())
   // }


    Column(
        Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.SpaceBetween) {
        Button(
            onClick = {
            val  openSupport = Intent(contex, Support::class.java)
                contex.startActivity(openSupport)
                      },

            modifier = Modifier
                .size(height = 50.dp, width = 100.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(colorResource(id = R.color.green))

        ) {
            Icon(
                modifier = Modifier.padding(8.dp, 8.dp),
                painter = painterResource(id = R.drawable.support),
                contentDescription = stringResource(id = R.string.support)
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth(),horizontalAlignment = Alignment.End, verticalArrangement = Arrangement.Center) {
            Image(
               // modifier = Modifier.size(200.dp),
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
                Button(onClick = {
                    val  openCourse = Intent(contex, Courses::class.java)
                    contex.startActivity(openCourse)
                },
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
                Button(onClick = {
                    val  openCourse = Intent(contex, Courses::class.java)
                    contex.startActivity(openCourse),

                   // val call = RetrofitFactory().getCourseService()

                //    call.enqueue(object : Callback<CourseList> {


                  //      override fun onResponse(
                       //     call: Call<CourseList>,
                      //      response: Response<CourseList>,
                     //   ) {
                      //      alunos = response.body()!!.alunos

                     //   }

                       // override fun onFailure(call: Call<CourseList>, t: Throwable) {
                      //      Log.i("ds2m", "onFailure: ${t.message} ")
                       // }

                    //})
                },
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