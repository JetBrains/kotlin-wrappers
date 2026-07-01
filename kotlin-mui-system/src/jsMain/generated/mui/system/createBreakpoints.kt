// Automatically generated - do not modify!

@file:JsModule("@mui/system/createBreakpoints/createBreakpoints")

package mui.system

import js.array.ReadonlyArray
import js.objects.Record

external interface Breakpoints {
    var keys: ReadonlyArray<Breakpoint>

    var values: Record<Breakpoint, Number>

    var up: (key: Breakpoint) -> String

    var down: (key: Breakpoint) -> String

    var between: (start: Breakpoint, end: Breakpoint) -> String

    var only: (key: Breakpoint) -> String

    var not: (key: Breakpoint) -> String

    var unit: String?

    /**
     * @ignore - Do not document.
     */
    var internal_mediaKeys: ReadonlyArray<String>
}

external interface BreakpointsOptions : Breakpoints {
    /**
     * The increment divided by 100 used to implement exclusive breakpoints.
     * For example, `step: 5` means that `down(500)` will result in `'(max-width: 499.95px)'`.
     * @default 5
     */
    var step: Number?

    /**
     * The unit used for the breakpoint's values.
     * @default 'px'
     */
    override var unit: String?
}

@JsName("default")
external fun createBreakpoints(
    breakpoints: BreakpointsOptions,
): Breakpoints
