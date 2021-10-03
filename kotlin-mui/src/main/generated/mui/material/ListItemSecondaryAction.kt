// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemSecondaryAction")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface ListItemSecondaryActionProps : react.PropsWithChildren {
    /**
     * The content of the component, normally an `IconButton` or selection control.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemSecondaryActionClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 * Must be used as the last child of ListItem to function properly.
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemSecondaryAction API](https://mui.com/api/list-item-secondary-action/)
 */
@JsName("default")
external val ListItemSecondaryAction: react.FC<ListItemSecondaryActionProps>
