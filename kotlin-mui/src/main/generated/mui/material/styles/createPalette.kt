// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createPalette")
@file:JsNonModule

package mui.material.styles

external interface CommonColors {
    var black: csstype.Color

    var white: csstype.Color
}

external interface TypeText {
    var primary: csstype.Color

    var secondary: csstype.Color

    var disabled: csstype.Color
}

external interface TypeAction {
    var active: csstype.Color

    var hover: csstype.Color

    var hoverOpacity: Number

    var selected: csstype.Color

    var selectedOpacity: Number

    var disabled: csstype.Color

    var disabledOpacity: Number

    var disabledBackground: csstype.Color

    var focus: csstype.Color

    var focusOpacity: Number

    var activatedOpacity: Number
}

external interface TypeBackground {
    var default: String

    var paper: String
}

external interface SimplePaletteColorOptions {
    var light: csstype.Color?

    var main: csstype.Color

    var dark: csstype.Color?

    var contrastText: csstype.Color?
}

external interface PaletteColor {
    var light: csstype.Color

    var main: csstype.Color

    var dark: csstype.Color

    var contrastText: csstype.Color
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

external interface PaletteWithChannels {
    var common: dynamic

    var mode: mui.material.PaletteMode

    var contrastThreshold: Number

    var tonalOffset: dynamic

    var primary: dynamic

    var secondary: dynamic

    var error: dynamic

    var warning: dynamic

    var info: dynamic

    var success: dynamic

    var grey: dynamic

    var text: dynamic

    var divider: dynamic

    var dividerChannel: dynamic

    var action: dynamic

    var background: TypeBackground

    var getContrastText: (background: String) -> String

    var augmentColor: (options: PaletteAugmentColorOptions) -> PaletteColor

    var AppBar: dynamic

    var Avatar: dynamic

    var Chip: dynamic

    var FilledInput: dynamic

    var LinearProgress: dynamic

    var Slider: dynamic

    var SnackbarContent: dynamic

    var SpeedDialAction: dynamic

    var StepConnector: dynamic

    var StepContent: dynamic

    var Switch: dynamic

    var TableCell: dynamic

    var Tooltip: dynamic
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
