// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createPalette")
@file:JsNonModule

package mui.material.styles

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

    var hoverOpacity: Number

    var selected: String

    var selectedOpacity: Number

    var disabled: String

    var disabledOpacity: Number

    var disabledBackground: String

    var focus: String

    var focusOpacity: Number

    var activatedOpacity: Number
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
    var text: dynamic

    var action: dynamic

    var divider: dynamic

    var background: dynamic
}

external interface PaletteAugmentColorOptions {
    var color: dynamic

    var mainShade: dynamic

    var lightShade: dynamic

    var darkShade: dynamic

    var name: dynamic
}

external interface Palette {
    var common: dynamic

    var mode: dynamic

    var contrastThreshold: Number

    var tonalOffset: dynamic

    var primary: PaletteColor

    var secondary: PaletteColor

    var error: PaletteColor

    var warning: PaletteColor

    var info: PaletteColor

    var success: PaletteColor

    var grey: dynamic

    var text: dynamic

    var divider: dynamic

    var action: dynamic

    var background: dynamic

    var getContrastText: (background: String) -> String

    var augmentColor: (options: PaletteAugmentColorOptions) -> PaletteColor
}

external interface PaletteOptions {
    var primary: dynamic

    var secondary: dynamic

    var error: dynamic

    var warning: dynamic

    var info: dynamic

    var success: dynamic

    var mode: dynamic

    var tonalOffset: dynamic

    var contrastThreshold: Number?

    var common: dynamic

    var grey: dynamic

    var text: dynamic

    var divider: String?

    var action: dynamic

    var background: dynamic

    var getContrastText: ((background: String) -> String)?
}

@JsName("default")
external fun createPalette(palette: PaletteOptions): Palette
