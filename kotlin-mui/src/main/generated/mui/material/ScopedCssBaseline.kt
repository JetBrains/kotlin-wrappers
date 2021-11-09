// Automatically generated - do not modify!

@file:JsModule("@mui/material/ScopedCssBaseline")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface ScopedCssBaselineProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ScopedCssBaselineClasses?

    /**
     * Enable `color-scheme` css property to use `theme.palette.mode`.
     * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
     * For browser support, check out https://caniuse.com/?search=color-scheme
     */
    var enableColorScheme: Boolean?
}

/**
 *
 * Demos:
 *
 * - [Css Baseline](https://mui.com/components/css-baseline/)
 *
 * API:
 *
 * - [ScopedCssBaseline API](https://mui.com/api/scoped-css-baseline/)
 */
@JsName("default")
external val ScopedCssBaseline: react.FC<ScopedCssBaselineProps>
