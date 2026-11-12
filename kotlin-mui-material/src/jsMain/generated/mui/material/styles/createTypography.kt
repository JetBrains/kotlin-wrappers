// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles")

package mui.material.styles

import kotlinx.js.JsPlainObject
import react.CSSProperties
import web.cssom.FontFamily
import web.cssom.FontWeight

@JsPlainObject
external interface FontStyle {
    val fontFamily: FontFamily

    val fontSize: Double

    val fontWeightLight: FontWeight

    val fontWeightRegular: FontWeight

    val fontWeightMedium: FontWeight

    val fontWeightBold: FontWeight

    val htmlFontSize: Double
}

@JsPlainObject
external interface FontStyleOptions {
    val fontFamily: FontFamily?

    val fontSize: Double?

    val fontWeightLight: FontWeight?

    val fontWeightRegular: FontWeight?

    val fontWeightMedium: FontWeight?

    val fontWeightBold: FontWeight?

    val htmlFontSize: Double?

    val allVariants: CSSProperties?
}

@JsPlainObject
external interface TypographyUtils {
    val pxToRem: (px: Double) -> String
}

@JsPlainObject
external interface TypographyVariants :
    FontStyle,
    TypographyUtils {
    val h1: CSSProperties

    val h2: CSSProperties

    val h3: CSSProperties

    val h4: CSSProperties

    val h5: CSSProperties

    val h6: CSSProperties

    val subtitle1: CSSProperties

    val subtitle2: CSSProperties

    val body1: CSSProperties

    val body2: CSSProperties

    val caption: CSSProperties

    val button: CSSProperties

    val overline: CSSProperties
}

@JsPlainObject
external interface TypographyVariantsOptions : FontStyleOptions {
    val h1: CSSProperties?

    val h2: CSSProperties?

    val h3: CSSProperties?

    val h4: CSSProperties?

    val h5: CSSProperties?

    val h6: CSSProperties?

    val subtitle1: CSSProperties?

    val subtitle2: CSSProperties?

    val body1: CSSProperties?

    val body2: CSSProperties?

    val caption: CSSProperties?

    val button: CSSProperties?

    val overline: CSSProperties?
}

@JsName("private_createTypography")
external fun createTypography(
    palette: Palette,
    typography: TypographyVariantsOptions,
): TypographyVariants

@JsName("private_createTypography")
external fun createTypography(
    palette: Palette,
    typography: (palette: Palette) -> TypographyVariantsOptions,
): TypographyVariants
