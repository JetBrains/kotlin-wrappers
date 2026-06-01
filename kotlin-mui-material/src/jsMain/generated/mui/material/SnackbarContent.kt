// Automatically generated - do not modify!

@file:JsModule("@mui/material/SnackbarContent")

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.ReactNode
import react.dom.aria.AriaRole

external interface SnackbarContentProps :
    StandardProps,
    PaperProps,
    PropsWithSx {
    /**
     * The action to display. It renders after the message, at the end of the snackbar.
     */
    var action: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SnackbarContentClasses?

    /**
     * The message to display.
     */
    var message: ReactNode?

    /**
     * The ARIA role attribute of the element.
     * @default 'alert'
     */
    var role: AriaRole?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Snackbar](https://v6.mui.com/material-ui/react-snackbar/)
 *
 * API:
 *
 * - [SnackbarContent API](https://v6.mui.com/material-ui/api/snackbar-content/)
 * - inherits [Paper API](https://v6.mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val SnackbarContent: FC<SnackbarContentProps>
