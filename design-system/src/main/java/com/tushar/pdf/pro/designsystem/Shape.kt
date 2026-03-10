package com.tushar.pdf.pro.designsystem

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

internal val PdfProShapes = Shapes(
    // Used by: chips, small badges, filter chips
    extraSmall = RoundedCornerShape(4.dp),

    // Used by: cards, text fields, menus, snackbars
    small = RoundedCornerShape(8.dp),

    // Used by: dialogs, standard FABs
    medium = RoundedCornerShape(12.dp),

    // Used by: bottom sheets, navigation drawers, large cards
    large = RoundedCornerShape(16.dp),

    // Used by: extended FABs, large bottom sheets
    extraLarge = RoundedCornerShape(28.dp),
)
