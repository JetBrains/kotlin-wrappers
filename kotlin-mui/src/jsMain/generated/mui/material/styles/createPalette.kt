// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createPalette")

package mui.material.styles

external interface CommonColors {
    var black: web.cssom.Color

    var white: web.cssom.Color
}

external interface TypeText {
    var primary: web.cssom.Color

    var secondary: web.cssom.Color

    var disabled: web.cssom.Color
}

external interface TypeAction {
    var active: web.cssom.Color

    var hover: web.cssom.Color

    var hoverOpacity: Number

    var selected: web.cssom.Color

    var selectedOpacity: Number

    var disabled: web.cssom.Color

    var disabledOpacity: Number

    var disabledBackground: web.cssom.Color

    var focus: web.cssom.Color

    var focusOpacity: Number

    var activatedOpacity: Number
}

external interface TypeBackground {
    var default: String

    var paper: String
}

external interface SimplePaletteColorOptions {
    var light: web.cssom.Color?

    var main: web.cssom.Color

    var dark: web.cssom.Color?

    var contrastText: web.cssom.Color?
}

external interface PaletteColor {
    var light: web.cssom.Color

    var main: web.cssom.Color

    var dark: web.cssom.Color

    var contrastText: web.cssom.Color
}

external interface TypeObject {
    var text: TypeText

    var action: TypeAction

    var divider: dynamic

    var background: TypeBackground
}

external interface PaletteAugmentColorOptions {
    var color: dynamic

    var mainShade: dynamic

    var lightShade: dynamic

    var darkShade: dynamic

    var name: dynamic
}

external interface Palette {
    var common: CommonColors

    var mode: mui.material.PaletteMode

    var contrastThreshold: Number

    var tonalOffset: dynamic

    var primary: PaletteColor

    var secondary: PaletteColor

    var error: PaletteColor

    var warning: PaletteColor

    var info: PaletteColor

    var success: PaletteColor

    var grey: dynamic

    var text: TypeText

    var divider: dynamic

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
    var primary: dynamic

    var secondary: dynamic

    var error: dynamic

    var warning: dynamic

    var info: dynamic

    var success: dynamic

    var mode: mui.material.PaletteMode?

    var tonalOffset: dynamic

    var contrastThreshold: Number?

    var common: CommonColors?

    var grey: dynamic

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
