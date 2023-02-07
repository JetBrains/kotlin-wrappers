// Automatically generated - do not modify!

@file:JsModule("@mui/material/MenuList")
@file:JsNonModule

package mui.material

external interface MenuListProps :
    react.dom.html.HTMLAttributes<web.html.HTMLUListElement>,
    react.PropsWithChildren {
    /**
     * If `true`, will focus the `[role="menu"]` container and move into tab order.
     * @default false
     */
    var autoFocus: Boolean?

    /**
     * If `true`, will focus the first menuitem if `variant="menu"` or selected item
     * if `variant="selectedMenu"`.
     * @default false
     */
    var autoFocusItem: Boolean?

    /**
     * MenuList contents, normally `MenuItem`s.
     */
    override var children: react.ReactNode?

    /**
     * If `true`, will allow focus on disabled items.
     * @default false
     */
    var disabledItemsFocusable: Boolean?

    /**
     * If `true`, the menu items will not wrap focus.
     * @default false
     */
    var disableListWrap: Boolean?

    /**
     * The variant to use. Use `menu` to prevent selected items from impacting the initial focus
     * and the vertical alignment relative to the anchor element.
     * @default 'selectedMenu'
     */
    var variant: MenuListVariant?
}

/**
 * A permanently displayed menu following https://www.w3.org/WAI/ARIA/apg/patterns/menubutton/.
 * It's exposed to help customization of the [`Menu`](https://mui.com/material-ui/api/menu/) component if you
 * use it separately you need to move focus into the component manually. Once
 * the focus is placed inside the component it is fully keyboard accessible.
 *
 * Demos:
 *
 * - [Menus](https://mui.com/material-ui/react-menu/)
 *
 * API:
 *
 * - [MenuList API](https://mui.com/material-ui/api/menu-list/)
 * - inherits [List API](https://mui.com/material-ui/api/list/)
 */
@JsName("default")
external val MenuList: react.FC<MenuListProps>
