// Automatically generated - do not modify!

@file:JsModule("@mui/system/createTheme")

package mui.system

import js.objects.Record
import kotlinx.js.JsPlainObject

external interface Typography

external interface Mixins

external interface Shadows

external interface Transitions

external interface ZIndex

@JsPlainObject
external interface ThemeOptions {
    val shape: ShapeOptions?

    val breakpoints: BreakpointsOptions?

    val direction: Direction?

    val mixins: Mixins?

    val palette: Any? /* Record<String, *> */

    val shadows: Any? /* Shadows */

    val spacing: Any? /* SpacingOptions */

    val transitions: Transitions?

    val components: Record<String, *>?

    val typography: Any? /* Typography */

    val zIndex: ZIndex?

    val unstable_sxConfig: Any? /* SxConfig */
}

@JsPlainObject
external interface Theme {
    val shape: Shape

    val breakpoints: Breakpoints

    val direction: Direction

    val palette: Any? /* Record<String, *> */

    val shadows: Any? /* Shadows */

    val spacing: Spacing

    val transitions: Transitions?

    val components: Record<String, *>?

    val mixins: Mixins?

    val typography: Any? /* Typography */

    val zIndex: ZIndex?

    val applyStyles: Any? /* ApplyStyles<'light' | 'dark'> */

    val unstable_sxConfig: Any? /* SxConfig */

    val unstable_sx: (props: SxProps<Theme>) -> Any /* CSSObject from `@mui/styled-engine` */
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: Any,
): Theme
