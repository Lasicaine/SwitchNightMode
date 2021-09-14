package fi.lasicaine.switchnightmode

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import fi.lasicaine.switchnightmode.ui.home.HomeScreen
import fi.lasicaine.switchnightmode.ui.theme.SwitchNightModeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwitchNightModeTheme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SwitchNightModeTheme {
        HomeScreen()
    }
}