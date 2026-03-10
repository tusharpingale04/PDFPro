package com.tushar.pdf.pro.designsystem

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// ---------------------------------------------------------------------------
// Raw palette tokens
// Named by visual identity, not by role. Internal — consumers should always
// access colors through MaterialTheme.colorScheme.* rather than these.
// ---------------------------------------------------------------------------

// Navy Blue family — Primary brand color (trust, authority, document-centric)
internal val Navy10 = Color(0xFF001B3D)
internal val Navy20 = Color(0xFF002F6C)
internal val Navy30 = Color(0xFF00429A)
internal val Navy40 = Color(0xFF1565C0)   // Primary light
internal val Navy80 = Color(0xFF90CAF9)   // Primary dark
internal val Navy90 = Color(0xFFBBDEFB)
internal val Navy95 = Color(0xFFE3F2FD)

// Navy container tones
internal val NavyContainer30 = Color(0xFF1E3A5F)
internal val NavyContainer90 = Color(0xFFD6E4FF)

// Teal family — Secondary (constructive actions: merge, annotate, export)
internal val Teal10 = Color(0xFF002019)
internal val Teal20 = Color(0xFF00382C)
internal val Teal40 = Color(0xFF00695C)   // Secondary light
internal val Teal80 = Color(0xFF80CBC4)   // Secondary dark
internal val Teal90 = Color(0xFFB2DFDB)

// Teal container tones
internal val TealContainer30 = Color(0xFF1C4A44)
internal val TealContainer90 = Color(0xFFCCEDE9)

// Amber family — Tertiary (warnings: unsaved changes, large file, overwrite)
internal val Amber10 = Color(0xFF2D1600)
internal val Amber30 = Color(0xFF7A3D00)
internal val Amber40 = Color(0xFFE65100)   // Tertiary light
internal val Amber80 = Color(0xFFFFCC80)   // Tertiary dark
internal val Amber90 = Color(0xFFFFE0B2)

// Amber container tones
internal val AmberContainer30 = Color(0xFF5C3000)
internal val AmberContainer90 = Color(0xFFFFE8C8)

// Red family — Error / Danger (delete, destructive operations)
internal val Red10 = Color(0xFF410002)
internal val Red20 = Color(0xFF690005)
internal val Red40 = Color(0xFFBA1A1A)   // Error light
internal val Red80 = Color(0xFFFFB4AB)   // Error dark
internal val Red90 = Color(0xFFFFDAD6)

// Red container tones
internal val RedContainer10 = Color(0xFF410002)
internal val RedContainer90 = Color(0xFFFFDAD6)

// Neutrals — Background, Surface, Outline
internal val Neutral10 = Color(0xFF1A1C1E)
internal val Neutral20 = Color(0xFF2F3033)
internal val Neutral90 = Color(0xFFE2E2E6)
internal val Neutral95 = Color(0xFFF0F0F4)
internal val Neutral99 = Color(0xFFFCFCFF)

// Neutral Variant — Surface variant, Outline
internal val NeutralVariant30 = Color(0xFF44474F)
internal val NeutralVariant50 = Color(0xFF74777F)
internal val NeutralVariant60 = Color(0xFF8E9099)
internal val NeutralVariant80 = Color(0xFFC4C6D0)
internal val NeutralVariant90 = Color(0xFFE2E2EC)

// ---------------------------------------------------------------------------
// Assembled Material 3 color schemes — consumed by Theme.kt
// ---------------------------------------------------------------------------

internal val PdfProLightColorScheme = lightColorScheme(
    primary = Navy40,
    onPrimary = Color.White,
    primaryContainer = NavyContainer90,
    onPrimaryContainer = Navy10,

    secondary = Teal40,
    onSecondary = Color.White,
    secondaryContainer = TealContainer90,
    onSecondaryContainer = Teal10,

    tertiary = Amber40,
    onTertiary = Color.White,
    tertiaryContainer = AmberContainer90,
    onTertiaryContainer = Amber10,

    error = Red40,
    onError = Color.White,
    errorContainer = RedContainer90,
    onErrorContainer = Red10,

    background = Neutral99,
    onBackground = Neutral10,

    surface = Neutral99,
    onSurface = Neutral10,
    surfaceVariant = NeutralVariant90,
    onSurfaceVariant = NeutralVariant30,

    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,

    inverseSurface = Neutral20,
    inverseOnSurface = Neutral95,
    inversePrimary = Navy80,

    scrim = Color.Black,
    surfaceTint = Navy40,
)

internal val PdfProDarkColorScheme = darkColorScheme(
    primary = Navy80,
    onPrimary = Navy20,
    primaryContainer = NavyContainer30,
    onPrimaryContainer = Navy90,

    secondary = Teal80,
    onSecondary = Teal20,
    secondaryContainer = TealContainer30,
    onSecondaryContainer = Teal90,

    tertiary = Amber80,
    onTertiary = Amber30,
    tertiaryContainer = AmberContainer30,
    onTertiaryContainer = Amber90,

    error = Red80,
    onError = Red20,
    errorContainer = RedContainer10,
    onErrorContainer = Red90,

    background = Neutral10,
    onBackground = Neutral90,

    surface = Neutral10,
    onSurface = Neutral90,
    surfaceVariant = NeutralVariant30,
    onSurfaceVariant = NeutralVariant80,

    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,

    inverseSurface = Neutral90,
    inverseOnSurface = Neutral20,
    inversePrimary = Navy40,

    scrim = Color.Black,
    surfaceTint = Navy80,
)
