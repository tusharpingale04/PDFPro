package com.tushar.pdf.pro.designsystem

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

/**
 * The single source-of-truth theme composable for PDFPro.
 *
 * Apply this at the root of every screen. All child composables access
 * design tokens via MaterialTheme.colorScheme, MaterialTheme.typography,
 * and MaterialTheme.shapes.
 *
 * @param darkTheme    Whether to use the dark color scheme. Defaults to the system setting.
 * @param dynamicColor Whether to use Material You wallpaper-driven dynamic colors (Android 12+).
 *                     Defaults to false to preserve PDFPro's navy/teal brand palette.
 * @param content      The composable content rendered inside the theme.
 */
@Composable
fun PDFProTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> PdfProDarkColorScheme
        else -> PdfProLightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as? Activity)?.window
            if (window != null) {
                window.statusBarColor = colorScheme.primary.toArgb()
                WindowCompat.getInsetsController(window, view)
                    .isAppearanceLightStatusBars = !darkTheme
            }
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = PdfProTypography,
        shapes = PdfProShapes,
        content = content,
    )
}
