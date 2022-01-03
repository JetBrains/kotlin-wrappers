// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createTheme")
@file:JsNonModule

package mui.material.styles

external interface ThemeOptions {
    var mixins: MixinsOptions?

    var components: dynamic

    var palette: PaletteOptions?

    var shadows: dynamic

    var transitions: TransitionsOptions?

    var typography: dynamic

    var zIndex: dynamic

    var unstable_strictMode: Boolean?
}

external interface Theme {
    var mixins: Mixins

    var components: dynamic

    var palette: Palette

    var shadows: dynamic

    var transitions: Transitions

    var typography: dynamic

    var zIndex: ZIndex

    var unstable_strictMode: Boolean?
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: dynamic,
): Theme
