// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemSecondaryAction")

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

external interface ListItemSecondaryActionProps :
    ListItemSecondaryActionOwnProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithComponent

external interface ListItemSecondaryActionOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally an `IconButton` or selection control.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemSecondaryActionClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * Must be used as the last child of ListItem to function properly.
 *
 * Demos:
 *
 * - [Lists](https://mui.com/material-ui/react-list/)
 *
 * API:
 *
 * - [ListItemSecondaryAction API](https://mui.com/material-ui/api/list-item-secondary-action/)
 */
@JsName("default")
external val ListItemSecondaryAction: FC<ListItemSecondaryActionProps>
