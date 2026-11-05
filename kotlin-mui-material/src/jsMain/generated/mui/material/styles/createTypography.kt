// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles")

package mui.material.styles

import kotlinx.js.JsPlainObject
import react.CSSProperties

@JsPlainObject
external interface FontStyle {
    var fontFamily: web.cssom.FontFamily

    var fontSize: Double

    var fontWeightLight: web.cssom.FontWeight

    var fontWeightRegular: web.cssom.FontWeight

    var fontWeightMedium: web.cssom.FontWeight

    var fontWeightBold: web.cssom.FontWeight

    var htmlFontSize: Double
}

@JsPlainObject
external interface FontStyleOptions {
    var fontFamily: web.cssom.FontFamily?

    var fontSize: Double?

    var fontWeightLight: web.cssom.FontWeight?

    var fontWeightRegular: web.cssom.FontWeight?

    var fontWeightMedium: web.cssom.FontWeight?

    var fontWeightBold: web.cssom.FontWeight?

    var htmlFontSize: Double?

    var allVariants: CSSProperties?
}

@JsPlainObject
external interface TypographyUtils {
    var pxToRem: (px: Number) -> String
}

@JsPlainObject
external interface TypographyVariants :
    FontStyle,
    TypographyUtils {
    var h1: CSSProperties

    var h2: CSSProperties

    var h3: CSSProperties

    var h4: CSSProperties

    var h5: CSSProperties

    var h6: CSSProperties

    var subtitle1: CSSProperties

    var subtitle2: CSSProperties

    var body1: CSSProperties

    var body2: CSSProperties

    var caption: CSSProperties

    var button: CSSProperties

    var overline: CSSProperties
}

@JsPlainObject
external interface TypographyVariantsOptions : FontStyleOptions {
    var h1: CSSProperties?

    var h2: CSSProperties?

    var h3: CSSProperties?

    var h4: CSSProperties?

    var h5: CSSProperties?

    var h6: CSSProperties?

    var subtitle1: CSSProperties?

    var subtitle2: CSSProperties?

    var body1: CSSProperties?

    var body2: CSSProperties?

    var caption: CSSProperties?

    var button: CSSProperties?

    var overline: CSSProperties?
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
