// Automatically generated - do not modify!

@file:JsModule("@mui/material/MenuItem")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.FC
import react.dom.html.LiHTMLAttributes
import web.html.HTMLLIElement

external interface MenuItemProps :
    MenuItemOwnProps,
    LiHTMLAttributes<HTMLLIElement>,
    PropsWithComponent

external interface MenuItemOwnProps :
    PropsWithSx,
    LiHTMLAttributes<HTMLLIElement> {
    /**
     * If `true`, the list item is focused during the first mount.
     * Focus will also be triggered if the value changes from false to true.
     * @default false
     */
    override var autoFocus: Boolean?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MenuItemClasses?

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used.
     * The prop defaults to the value inherited from the parent Menu component.
     * @default false
     */
    var dense: Boolean?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, the left and right padding is removed.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * If `true`, a 1px light border is added to the bottom of the menu item.
     * @default false
     */
    var divider: Boolean?

    /**
     * If `true`, the component is selected.
     * @default false
     */
    var selected: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 *
 * Demos:
 *
 * - [Menu](https://v6.mui.com/material-ui/react-menu/)
 *
 * API:
 *
 * - [MenuItem API](https://v6.mui.com/material-ui/api/menu-item/)
 * - inherits [ButtonBase API](https://v6.mui.com/material-ui/api/button-base/)
 */
@JsName("default")
external val MenuItem: FC<MenuItemProps>
