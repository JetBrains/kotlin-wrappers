// Automatically generated - do not modify!

package mui.material.styles

import react.CSSProperties

/**
 * CSS of the keyboard focus ring, spread onto the `Mui-focusVisible` state.
 */
typealias FocusVisible = CSSProperties

external interface Theme : mui.system.Theme {
    /**
     * The resolved focus ring, present only when the theme opted in.
     * `createTheme` turns the [ThemeOptions.focusVisible] opt-in into this.
     */
    var focusVisible: FocusVisible?
}

external interface ThemeOptions : mui.system.ThemeOptions {
    /**
     * `true` for the curated default ring (solid, `palette.primary.main`,
     * `2px` wide, `2px` offset), or a [FocusVisible] merged over that default.
     * Set `outlineColor: 'transparent'` for a box-shadow-only ring.
     */
    var focusVisible: Any? /* Boolean | FocusVisible */
}
