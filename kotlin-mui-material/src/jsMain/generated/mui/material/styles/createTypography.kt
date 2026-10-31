// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles")

package mui.material.styles

import react.CSSProperties

external interface FontStyle {
    var fontFamily: web.cssom.FontFamily

    var fontSize: Number

    var fontWeightLight: web.cssom.FontWeight

    var fontWeightRegular: web.cssom.FontWeight

    var fontWeightMedium: web.cssom.FontWeight

    var fontWeightBold: web.cssom.FontWeight

    var htmlFontSize: Number
}

external interface FontStyleOptions : FontStyle {
    var allVariants: CSSProperties?
}

external interface TypographyUtils {
    var pxToRem: (px: Number) -> String
}

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
    typography: Any /* TypographyVariantsOptions | ((palette: Palette) => TypographyVariantsOptions) */,
): TypographyVariants
