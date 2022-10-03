package fi.lasicaine.switchnightmode.ui.home

import android.app.UiModeManager
import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import fi.lasicaine.switchnightmode.R

@Composable
fun HomeScreen() {
    val context = LocalContext.current

    Surface(color = MaterialTheme.colors.background) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                fontSize = 20.sp,
                modifier = Modifier
                    .padding(
                        start = 16.dp,
                        end = 16.dp,
                        top = 8.dp,
                        bottom = 30.dp
                    )
                    .fillMaxWidth(),
                text = (stringResource(id = R.string.info))
            )
            Button(
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 8.dp,
                    bottom = 8.dp
                ),
                onClick = {
                    (context.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager).nightMode = UiModeManager.MODE_NIGHT_YES
                }
            ) {
                Text("Night Mode ON")
            }
            Button(
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,
                    top = 8.dp,
                    bottom = 8.dp
                ),
                onClick = {
                    (context.getSystemService(Context.UI_MODE_SERVICE) as UiModeManager).nightMode = UiModeManager.MODE_NIGHT_NO
                }
            ) {
                Text("Night Mode OFF")
            }
        }
    }
}
