// Automatically generated - do not modify!

@file:JsModule("@mui/material/ScopedCssBaseline")
@file:JsNonModule

package mui.material

external interface ScopedCssBaselineProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.types.PropsWithComponent {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ScopedCssBaselineClasses?

    /**
     * Enable `color-scheme` CSS property to use `theme.palette.mode`.
     * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
     * For browser support, check out https://caniuse.com/?search=color-scheme
     */
    var enableColorScheme: Boolean?
}

/**
 *
 * Demos:
 *
 * - [Css Baseline](https://mui.com/material-ui/react-css-baseline/)
 *
 * API:
 *
 * - [ScopedCssBaseline API](https://mui.com/material-ui/api/scoped-css-baseline/)
 */
@JsName("default")
external val ScopedCssBaseline: react.FC<ScopedCssBaselineProps>
