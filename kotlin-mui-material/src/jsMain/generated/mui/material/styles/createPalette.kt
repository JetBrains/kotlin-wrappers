// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createPalette")

package mui.material.styles

import web.cssom.Color

external interface Color {
    var `50`: String

    var `100`: String

    var `200`: String

    var `300`: String

    var `400`: String

    var `500`: String

    var `600`: String

    var `700`: String

    var `800`: String

    var `900`: String

    var A100: String

    var A200: String

    var A400: String

    var A700: String
}

external interface CommonColors {
    var black: Color

    var white: Color
}

external interface TypeText {
    var primary: Color

    var secondary: Color

    var disabled: Color
}

external interface TypeAction {
    var active: Color

    var hover: Color

    var hoverOpacity: Number

    var selected: Color

    var selectedOpacity: Number

    var disabled: Color

    var disabledOpacity: Number

    var disabledBackground: Color

    var focus: Color

    var focusOpacity: Number

    var activatedOpacity: Number
}

external interface TypeBackground {
    var default: String

    var paper: String
}

external interface SimplePaletteColorOptions {
    var light: Color?

    var main: Color

    var dark: Color?

    var contrastText: Color?
}

external interface PaletteColor {
    var light: Color

    var main: Color

    var dark: Color

    var contrastText: Color
}

external interface TypeObject {
    var text: TypeText

    var action: TypeAction

    var divider: Any? /* TypeDivider */

    var background: TypeBackground
}

external interface PaletteAugmentColorOptions {
    var color: Any? /* PaletteColorOptions */

    var mainShade: Any? /* number | string */

    var lightShade: Any? /* number | string */

    var darkShade: Any? /* number | string */

    var name: Any? /* number | string */
}

external interface Palette {
    var common: CommonColors

    var mode: mui.material.PaletteMode

    var contrastThreshold: Number

    var tonalOffset: Any? /* PaletteTonalOffset */

    var primary: PaletteColor

    var secondary: PaletteColor

    var error: PaletteColor

    var warning: PaletteColor

    var info: PaletteColor

    var success: PaletteColor

    var grey: Any? /* Color */

    var text: TypeText

    var divider: Any? /* TypeDivider */

    var action: TypeAction

    var background: TypeBackground

    var getContrastText: (background: String) -> String

    var augmentColor: (options: PaletteAugmentColorOptions) -> PaletteColor
}

external interface Channels {
    var mainChannel: String

    var lightChannel: String

    var darkChannel: String

    var contrastTextChannel: String
}

external interface PaletteOptions {
    var primary: Any? /* PaletteColorOptions */

    var secondary: Any? /* PaletteColorOptions */

    var error: Any? /* PaletteColorOptions */

    var warning: Any? /* PaletteColorOptions */

    var info: Any? /* PaletteColorOptions */

    var success: Any? /* PaletteColorOptions */

    var mode: mui.material.PaletteMode?

    var tonalOffset: Any? /* PaletteTonalOffset */

    var contrastThreshold: Number?

    var common: CommonColors?

    var grey: Any? /* ColorPartial */

    var text: TypeText?

    var divider: String?

    var action: TypeAction?

    var background: TypeBackground?

    var getContrastText: ((background: String) -> String)?
}

@JsName("default")
external fun createPalette(
    palette: PaletteOptions,
): Palette
