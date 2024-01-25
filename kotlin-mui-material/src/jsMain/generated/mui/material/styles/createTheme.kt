// Automatically generated - do not modify!

@file:JsModule("@mui/material/styles/createTheme")

package mui.material.styles

import mui.system.SxProps

external interface ThemeOptions : mui.system.ThemeOptions {
    override var mixins: MixinsOptions?

    override var components: dynamic

    override var palette: PaletteOptions?

    override var shadows: dynamic

    override var transitions: TransitionsOptions?

    override var typography: dynamic

    override var zIndex: dynamic

    var unstable_strictMode: Boolean?

    override var unstable_sxConfig: dynamic
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

    override var unstable_sx: (props: SxProps<Theme>) -> dynamic /* CSSObject from `@mui/styled-engine` */

    override var unstable_sxConfig: dynamic

    var applyDarkStyles: (css: dynamic /* CSSObject from `@mui/styled-engine` */) -> dynamic /* CSSObject from `@mui/styled-engine` */
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: dynamic,
): Theme
