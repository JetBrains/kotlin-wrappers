// Automatically generated - do not modify!

@file:JsModule("@mui/system/createTheme/createBreakpoints")
@file:JsNonModule

package mui.system

import kotlinext.js.ReadonlyArray

external interface Breakpoints {
    var keys: ReadonlyArray<Breakpoint>

    /**
     * Each breakpoint (a key) matches with a fixed screen width (a value).
     * @default {
     *    // extra-small
     *    xs: 0,
     *    // small
     *    sm: 600,
     *    // medium
     *    md: 900,
     *    // large
     *    lg: 1200,
     *    // extra-large
     *    xl: 1536,
     * }
     */
    var values: kotlinext.js.Record<Breakpoint, Number>

    /**
     * @param key - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
     * @returns A media query string ready to be used with most styling solutions, which matches screen widths greater than the screen size given by the breakpoint key (inclusive).
     * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-up-key-media-query)
     */
    var up: (key: Breakpoint) -> String

    /**
     * @param key - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
     * @returns A media query string ready to be used with most styling solutions, which matches screen widths less than the screen size given by the breakpoint key (exclusive).
     * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-down-key-media-query)
     */
    var down: (key: Breakpoint) -> String

    /**
     * @param start - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
     * @param end - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
     * @returns A media query string ready to be used with most styling solutions, which matches screen widths greater than
     *          the screen size given by the breakpoint key in the first argument (inclusive) and less than the screen size given by the breakpoint key in the second argument (exclusive).
     * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-between-start-end-media-query)
     */
    var between: (start: Breakpoint, end: Breakpoint) -> String

    /**
     * @param key - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
     * @returns A media query string ready to be used with most styling solutions, which matches screen widths starting from
     *          the screen size given by the breakpoint key (inclusive) and stopping at the screen size given by the next breakpoint key (exclusive).
     * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-only-key-media-query)
     */
    var only: (key: Breakpoint) -> String

    /**
     * @param key - A breakpoint key (`xs`, `sm`, etc.).
     * @returns A media query string ready to be used with most styling solutions, which matches screen widths stopping at
     *          the screen size given by the breakpoint key (exclusive) and starting at the screen size given by the next breakpoint key (inclusive).
     */
    var not: (key: Breakpoint) -> String
}

external interface BreakpointsOptions {
    /**
     * The increment divided by 100 used to implement exclusive breakpoints.
     * For example, `step: 5` means that `down(500)` will result in `'(max-width: 499.95px)'`.
     * @default 5
     */
    var step: dynamic

    /**
     * The unit used for the breakpoint's values.
     * @default 'px'
     */
    var unit: dynamic
}
