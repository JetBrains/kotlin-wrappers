// Automatically generated - do not modify!

@file:JsModule("@mui/system/createTheme/createTheme")

package mui.system

import js.objects.Record

external interface Typography

external interface Mixins

external interface Shadows

external interface Transitions

external interface ZIndex

external interface ThemeOptions {
    var shape: ShapeOptions?

    var breakpoints: BreakpointsOptions?

    var direction: Direction?

    var mixins: Mixins?

    var palette: Any? /* Record<String, *> */

    var shadows: Any? /* Shadows */

    var spacing: Any? /* SpacingOptions */

    var transitions: Transitions?

    var components: Record<String, *>?

    var typography: Any? /* Typography */

    var zIndex: ZIndex?

    var unstable_sxConfig: Any? /* SxConfig */
}

external interface Theme {
    var shape: Shape

    var breakpoints: Breakpoints

    var direction: Direction

    var palette: Any? /* Record<String, *> */

    var shadows: Any? /* Shadows */

    var spacing: Spacing

    var transitions: Transitions?

    var components: Record<String, *>?

    var mixins: Mixins?

    var typography: Any? /* Typography */

    var zIndex: ZIndex?

    var applyStyles: Any? /* ApplyStyles<'light' | 'dark'> */

    var unstable_sxConfig: Any? /* SxConfig */

    var unstable_sx: (props: SxProps<Theme>) -> Any /* CSSObject from `@mui/styled-engine` */
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: Any,
): Theme
