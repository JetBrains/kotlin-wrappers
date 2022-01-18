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
    var components: dynamic
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: dynamic,
): Theme
