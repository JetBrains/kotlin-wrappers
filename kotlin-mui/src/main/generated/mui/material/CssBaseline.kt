// Automatically generated - do not modify!

@file:JsModule("@mui/material/CssBaseline")
@file:JsNonModule

package mui.material

external interface CssBaselineProps : react.PropsWithChildren {
    /**
     * You can wrap a node.
     */
    override var children: react.ReactNode?

    /**
     * Enable `color-scheme` CSS property to use `theme.palette.mode`.
     * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
     * For browser support, check out https://caniuse.com/?search=color-scheme
     * @default false
     */
    var enableColorScheme: Boolean?
}

/**
 * Kickstart an elegant, consistent, and simple baseline to build upon.
 *
 * Demos:
 *
 * - [Css baseline](https://mui.com/material-ui/react-css-baseline/)
 *
 * API:
 *
 * - [CssBaseline API](https://mui.com/material-ui/api/css-baseline/)
 */
@JsName("default")
external val CssBaseline: react.FC<CssBaselineProps>
