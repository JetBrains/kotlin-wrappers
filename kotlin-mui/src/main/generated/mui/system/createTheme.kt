// Automatically generated - do not modify!

@file:JsModule("@mui/system/createTheme/createTheme")
@file:JsNonModule

package mui.system

external interface ThemeOptions {
    var shape: ShapeOptions?

    var breakpoints: BreakpointsOptions?

    var direction: Direction?

    var mixins: dynamic

    var palette: kotlinext.js.Record<String, *>?

    var shadows: dynamic

    var spacing: dynamic

    var transitions: dynamic

    var components: kotlinext.js.Record<String, *>?

    var typography: dynamic

    var zIndex: dynamic
}

external interface Theme {
    var shape: Shape

    var breakpoints: Breakpoints

    var direction: Direction

    var palette: kotlinext.js.Record<String, *>

    var shadows: dynamic

    var spacing: Spacing

    var transitions: dynamic

    var components: kotlinext.js.Record<String, *>?

    var mixins: dynamic

    var typography: dynamic

    var zIndex: dynamic
}

@JsName("default")
external fun createTheme(
    options: ThemeOptions? = definedExternally,
    vararg args: dynamic,
): Theme
