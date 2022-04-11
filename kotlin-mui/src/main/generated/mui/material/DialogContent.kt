// Automatically generated - do not modify!

@file:JsModule("@mui/material/DialogContent")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface DialogContentProps :
    mui.system.StandardProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DialogContentClasses?

    /**
     * Display the top and bottom dividers.
     * @default false
     */
    var dividers: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Dialogs](https://mui.com/material-ui/react-dialog/)
 *
 * API:
 *
 * - [DialogContent API](https://mui.com/material-ui/api/dialog-content/)
 */
@JsName("default")
external val DialogContent: react.FC<DialogContentProps>
