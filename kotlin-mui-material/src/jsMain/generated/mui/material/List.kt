// Automatically generated - do not modify!

@file:JsModule("@mui/material/List")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.PropsWithChildren
import react.ReactNode
import react.dom.html.HTMLAttributes
import web.html.HTMLUListElement

external interface ListProps :
    ListOwnProps,
    HTMLAttributes<HTMLUListElement>,
    PropsWithComponent

external interface ListOwnProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListClasses?

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used for
     * the list and list items.
     * The prop is available to descendant components as the `dense` context.
     * @default false
     */
    var dense: Boolean?

    /**
     * If `true`, vertical padding is removed from the list.
     * @default false
     */
    var disablePadding: Boolean?

    /**
     * The content of the subheader, normally `ListSubheader`.
     */
    var subheader: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Lists](https://v6.mui.com/material-ui/react-list/)
 * - [Transfer List](https://v6.mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [List API](https://v6.mui.com/material-ui/api/list/)
 */
@JsName("default")
external val List: FC<ListProps>
