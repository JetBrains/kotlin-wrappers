// Automatically generated - do not modify!

@file:JsModule("@mui/material/MenuList")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface MenuListProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLUListElement>,
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
    override var children: ReadonlyArray<react.ReactNode>?

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
    var variant: mui.system.Union? /* 'menu' | 'selectedMenu' */
}

/**
 * A permanently displayed menu following https://www.w3.org/TR/wai-aria-practices/#menubutton.
 * It's exposed to help customization of the [`Menu`](https://mui.com/api/menu/) component if you
 * use it separately you need to move focus into the component manually. Once
 * the focus is placed inside the component it is fully keyboard accessible.
 *
 * Demos:
 *
 * - [Menus](https://mui.com/components/menus/)
 *
 * API:
 *
 * - [MenuList API](https://mui.com/api/menu-list/)
 * - inherits [List API](https://mui.com/api/list/)
 */
@JsName("default")
external val MenuList: react.FC<MenuListProps>
