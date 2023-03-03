package com.uistack.jetpackcompose4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.uistack.jetpackcompose4.ui.screens.ForgotPasswordScreen
import com.uistack.jetpackcompose4.ui.screens.LoginScreen
import com.uistack.jetpackcompose4.ui.screens.RegisterScreen
import com.uistack.jetpackcompose4.ui.screens.SettingsScreen
import com.uistack.jetpackcompose4.ui.theme.BackgroundColor
import com.uistack.jetpackcompose4.ui.theme.PrimaryColor
import com.uistack.jetpackcompose4.ui.theme.JetpackCompose4Theme

class MainActivity : ComponentActivity() {
    @ExperimentalMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackCompose4Theme {
                Surface(color = BackgroundColor, modifier = Modifier.fillMaxSize()) {
                      // LoginScreen()
                    //   RegisterScreen()
                      // ForgotPasswordScreen()
                    SettingsScreen()
                }
            }
        }
    }
}

