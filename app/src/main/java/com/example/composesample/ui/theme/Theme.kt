package com.example.composesample.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = com.example.composesample.ui1.theme.Purple200,
    primaryVariant = com.example.composesample.ui1.theme.Purple700,
    secondary = com.example.composesample.ui1.theme.Teal200
)

private val LightColorPalette = lightColors(
    primary = com.example.composesample.ui1.theme.Purple500,
    primaryVariant = com.example.composesample.ui1.theme.Purple700,
    secondary = com.example.composesample.ui1.theme.Teal200
    
    /* Other default colors to override
    background = Color.White,
    surface = Color.White,
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black,
    */
)

@Composable
fun LearnComposeTheHardWayTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }
    
    MaterialTheme(
        colors = colors,
        typography = com.example.composesample.ui1.theme.Typography,
        shapes = com.example.composesample.ui1.theme.Shapes,
        content = content
    )
}