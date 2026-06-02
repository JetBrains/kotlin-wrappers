// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemAvatar")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.StandardProps
import mui.system.SxProps
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ListItemAvatarProps :
    StandardProps,
    HTMLAttributes<HTMLDivElement>,
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component, normally an `Avatar`.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemAvatarClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * A simple wrapper to apply `List` styles to an `Avatar`.
 *
 * Demos:
 *
 * - [Lists](https://v6.mui.com/material-ui/react-list/)
 *
 * API:
 *
 * - [ListItemAvatar API](https://v6.mui.com/material-ui/api/list-item-avatar/)
 */
@JsName("default")
external val ListItemAvatar: FC<ListItemAvatarProps>
