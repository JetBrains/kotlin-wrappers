// Automatically generated - do not modify!

@file:JsModule("@mui/material/CssBaseline")

package mui.material

import react.FC
import react.PropsWithChildren
import react.ReactNode

external interface CssBaselineProps : PropsWithChildren {
    /**
     * You can wrap a node.
     */
    override var children: ReactNode?

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
 * - [CSS Baseline](https://v6.mui.com/material-ui/react-css-baseline/)
 *
 * API:
 *
 * - [CssBaseline API](https://v6.mui.com/material-ui/api/css-baseline/)
 */
@JsName("default")
external val CssBaseline: FC<CssBaselineProps>
