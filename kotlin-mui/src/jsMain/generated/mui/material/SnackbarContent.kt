// Automatically generated - do not modify!

@file:JsModule("@mui/material/SnackbarContent")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface SnackbarContentProps :
    mui.system.StandardProps,
    PaperProps,
    mui.system.PropsWithSx {
    /**
     * The action to display. It renders after the message, at the end of the snackbar.
     */
    var action: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: SnackbarContentClasses?

    /**
     * The message to display.
     */
    var message: react.ReactNode?

    /**
     * The ARIA role attribute of the element.
     * @default 'alert'
     */
    var role: react.dom.aria.AriaRole?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Snackbars](https://mui.com/material-ui/react-snackbar/)
 *
 * API:
 *
 * - [SnackbarContent API](https://mui.com/material-ui/api/snackbar-content/)
 * - inherits [Paper API](https://mui.com/material-ui/api/paper/)
 */
@JsName("default")
external val SnackbarContent: react.FC<SnackbarContentProps>
