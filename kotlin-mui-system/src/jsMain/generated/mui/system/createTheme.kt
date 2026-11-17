// Automatically generated - do not modify!

@file:JsModule("@mui/system/createTheme")

package mui.system

import js.array.ReadonlyArray
import js.objects.ReadonlyRecord
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface Typography

@JsPlainObject
external interface Mixins

typealias Shadows = ReadonlyArray<String>

@JsPlainObject
external interface Transitions

@JsPlainObject
external interface ZIndex

@JsPlainObject
external interface Palette

@JsPlainObject
external interface PaletteOptions

@JsPlainObject
external interface ThemeOptions {
    val shape: ShapeOptions?

    val breakpoints: BreakpointsOptions?

    val direction: Direction?

    val mixins: Mixins?

    val palette: PaletteOptions?

    val shadows: Shadows?

    val spacing: SpacingOptions?

    val transitions: Transitions?

    val components: ReadonlyRecord<String, *>?

    val typography: Typography?

    val zIndex: ZIndex?

    val unstable_sxConfig: Any? /* SxConfig */
}

@JsPlainObject
external interface Theme {
    val shape: Shape

    val breakpoints: Breakpoints

    val direction: Direction

    val palette: Palette

    val shadows: Shadows?

    val spacing: Spacing

    val transitions: Transitions?

    val components: ReadonlyRecord<String, *>?

    val mixins: Mixins?

    val typography: Typography?

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
