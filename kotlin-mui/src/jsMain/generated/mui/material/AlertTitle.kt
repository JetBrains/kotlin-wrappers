// Automatically generated - do not modify!

@file:JsModule("@mui/material/AlertTitle")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface AlertTitleProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: AlertTitleClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Alert](https://mui.com/material-ui/react-alert/)
 *
 * API:
 *
 * - [AlertTitle API](https://mui.com/material-ui/api/alert-title/)
 */
@JsName("default")
external val AlertTitle: react.FC<AlertTitleProps>
