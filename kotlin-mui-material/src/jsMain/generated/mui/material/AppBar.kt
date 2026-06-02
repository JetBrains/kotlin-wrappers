// Automatically generated - do not modify!

@file:JsModule("@mui/material/AppBar")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface AppBarProps :
    AppBarOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent,
    PaperProps

external interface AppBarOwnProps :
    PropsWithSx,
    PaperProps {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AppBarClasses?

    /**
     * The color of the component.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#custom-colors).
     * @default 'primary'
     */
    var color: AppBarColor?

    /**
     * If true, the `color` prop is applied in dark mode.
     * @default false
     */
    var enableColorOnDark: Boolean?

    /**
     * The positioning type. The behavior of the different options is described
     * [in the MDN web docs](https://developer.mozilla.org/en-US/docs/Web/CSS/position).
     * Note: `sticky` is not universally supported and will fall back to `static` when unavailable.
     * @default 'fixed'
     */
    var position: AppBarPosition?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [App Bar](https://v6.mui.com/material-ui/react-app-bar/)
 *
 * API:
 *
 * - [AppBar API](https://v6.mui.com/material-ui/api/app-bar/)
 * - inherits [Paper API](https://v6.mui.com/material-ui/api/paper/)
 */

@JsName("default")
external val AppBar: FC<AppBarProps>
