// Automatically generated - do not modify!

@file:JsModule("@mui/material/List")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ListProps :
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * The content of the component.
     */
    override var children: react.ReactNode?

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
    var subheader: react.ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Lists](https://mui.com/material-ui/react-list/)
 * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [List API](https://mui.com/material-ui/api/list/)
 */
@JsName("default")
external val List: react.FC<ListProps>
