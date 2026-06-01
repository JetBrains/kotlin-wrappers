// Automatically generated - do not modify!

@file:JsModule("@mui/material/ScopedCssBaseline")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ScopedCssBaselineProps :
    ScopedCssBaselineOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface ScopedCssBaselineOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

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

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [CSS Baseline](https://v6.mui.com/material-ui/react-css-baseline/)
 *
 * API:
 *
 * - [ScopedCssBaseline API](https://v6.mui.com/material-ui/api/scoped-css-baseline/)
 */
@JsName("default")
external val ScopedCssBaseline: FC<ScopedCssBaselineProps>
