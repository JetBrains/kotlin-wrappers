// Automatically generated - do not modify!

@file:JsModule("@mui/material/DialogContentText")

@file:Suppress(
    "VAR_TYPE_MISMATCH_ON_OVERRIDE",
)

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC

external interface DialogContentTextProps :
    DialogContentTextOwnProps,
    PropsWithComponent

external interface DialogContentTextOwnProps :
    TypographyProps,
    PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    override var classes: DialogContentTextClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Dialog](https://v6.mui.com/material-ui/react-dialog/)
 *
 * API:
 *
 * - [DialogContentText API](https://v6.mui.com/material-ui/api/dialog-content-text/)
 * - inherits [Typography API](https://v6.mui.com/material-ui/api/typography/)
 */
@JsName("default")
external val DialogContentText: FC<DialogContentTextProps>
