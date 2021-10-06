// Automatically generated - do not modify!

@file:JsModule("@mui/material/DialogActions")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface DialogActionsProps : react.PropsWithChildren {
    /**
     * The content of the component.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: DialogActionsClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * If `true`, the actions do not have additional margin.
     * @default false
     */
    var disableSpacing: Boolean
}

/**
 *
 * Demos:
 *
 * - [Dialogs](https://mui.com/components/dialogs/)
 *
 * API:
 *
 * - [DialogActions API](https://mui.com/api/dialog-actions/)
 */
@JsName("default")
external val DialogActions: react.FC<DialogActionsProps>
