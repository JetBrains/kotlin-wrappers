// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createTheme")
@file:JsNonModule

package mui.material.styles

external interface ThemeOptions : mui.system.ThemeOptions {
    override var mixins: MixinsOptions?

    override var components: dynamic

    override var palette: PaletteOptions?

    override var shadows: dynamic

    override var transitions: TransitionsOptions?

    override var typography: dynamic

    override var zIndex: dynamic

    var unstable_strictMode: Boolean?
}

external interface BaseTheme : mui.system.Theme {
    override var mixins: Mixins

    override var palette: Palette

    override var shadows: dynamic

    override var transitions: Transitions

    override var typography: dynamic

    override var zIndex: ZIndex

    var unstable_strictMode: Boolean?
}

external interface Theme : BaseTheme {
    override var components: dynamic
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: dynamic,
): Theme
