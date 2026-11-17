// Automatically generated - do not modify!

package mui.material.styles

import kotlinx.js.JsPlainObject

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
    var black: String

    var white: String
}

external interface TypeText {
    var primary: String

    var secondary: String

    var disabled: String
}

external interface TypeAction {
    var active: String

    var hover: String

    var hoverOpacity: Double

    var selected: String

    var selectedOpacity: Double

    var disabled: String

    var disabledOpacity: Double

    var disabledBackground: String

    var focus: String

    var focusOpacity: Double

    var activatedOpacity: Double
}

external interface TypeBackground {
    var default: String

    var paper: String
}

external interface SimplePaletteColorOptions {
    var light: String?

    var main: String

    var dark: String?

    var contrastText: String?
}

external interface PaletteColor {
    var light: String

    var main: String

    var dark: String

    var contrastText: String
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

@JsPlainObject
external interface Palette : mui.system.Palette {
    val common: CommonColors

    val mode: mui.material.PaletteMode

    val contrastThreshold: Double

    val tonalOffset: Any? /* PaletteTonalOffset */

    val primary: PaletteColor

    val secondary: PaletteColor

    val error: PaletteColor

    val warning: PaletteColor

    val info: PaletteColor

    val success: PaletteColor

    val grey: Any? /* Color */

    val text: TypeText

    val divider: Any? /* TypeDivider */

    val action: TypeAction

    val background: TypeBackground

    val getContrastText: (background: String) -> String

    val augmentColor: (options: PaletteAugmentColorOptions) -> PaletteColor
}

external interface Channels {
    var mainChannel: String

    var lightChannel: String

    var darkChannel: String

    var contrastTextChannel: String
}

@JsPlainObject
external interface PaletteOptions : mui.system.PaletteOptions {
    val primary: Any? /* PaletteColorOptions */

    val secondary: Any? /* PaletteColorOptions */

    val error: Any? /* PaletteColorOptions */

    val warning: Any? /* PaletteColorOptions */

    val info: Any? /* PaletteColorOptions */

    val success: Any? /* PaletteColorOptions */

    val mode: mui.material.PaletteMode?

    val tonalOffset: Any? /* PaletteTonalOffset */

    val contrastThreshold: Double?

    val common: CommonColors?

    val grey: Any? /* ColorPartial */

    val text: TypeText?

    val divider: String?

    val action: TypeAction?

    val background: TypeBackground?

    val getContrastText: ((background: String) -> String)?
}
