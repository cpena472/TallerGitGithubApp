package me.cristianpena.tallergitgithubapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.cristianpena.tallergitgithubapp.ui.theme.TallerGitGithubAppTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            TallerGitGithubAppTheme {

                TarjetaPresentacion()

            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun TarjetaPresentacion() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),

        horizontalAlignment = Alignment.CenterHorizontally,

        verticalArrangement = Arrangement.Center
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth(),

            shape = RoundedCornerShape(30.dp),

            elevation = CardDefaults.cardElevation(
                defaultElevation = 0.dp
            )
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(24.dp),

                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(
                        id = R.drawable.imagen
                    ),

                    contentDescription = "Foto de perfil",

                    modifier = Modifier
                        .size(120.dp)
                        .clip(CircleShape),

                    contentScale = ContentScale.Crop
                )

                Spacer(
                    modifier = Modifier.height(16.dp)
                )

                Text(
                    text = "Cristian Peña",

                    fontSize = 24.sp,

                    fontWeight = FontWeight.Bold
                )

                Spacer(
                    modifier = Modifier.height(5.dp)
                )

                Text(
                    text = "Desarrollador Móvil Jr.",

                    fontSize = 16.sp
                )

                Spacer(
                    modifier = Modifier.height(20.dp)
                )

                Text(
                    text = "EDAD",

                    fontSize = 12.sp,

                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "21 años",

                    fontSize = 16.sp
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Text(
                    text = "CORREO",

                    fontSize = 12.sp,

                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "[cpena472@unab.edu.co]",

                    fontSize = 16.sp
                )

                Spacer(
                    modifier = Modifier.height(12.dp)
                )

                Text(
                    text = "CIUDAD",

                    fontSize = 12.sp,

                    fontWeight = FontWeight.Bold
                )

                Text(
                    text = "Bucaramanga, Colombia",

                    fontSize = 16.sp
                )

                Spacer(
                    modifier = Modifier.height(20.dp)
                )

                Text(
                    text = "Me apasiona el Desarrollo de Aplicaciones Móviles porque permite transformar ideas en herrramientas tangibles que las personas usan a diario. Me encanta el reto de diseñar interfaces intuitivas.",

                    fontSize = 14.sp
                )

                Spacer(
                    modifier = Modifier.height(30.dp)
                )

                Button(
                    onClick = {
                    },

                    modifier = Modifier
                        .fillMaxWidth()
                        .height(55.dp),

                    shape = RoundedCornerShape(18.dp)
                ) {

                    Text(
                        text = "Contactar conmigo",

                        fontSize = 16.sp
                    )
                }
            }
        }
    }
}