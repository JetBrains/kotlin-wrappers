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
    var classes: ScopedCssBaselineClasses
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
