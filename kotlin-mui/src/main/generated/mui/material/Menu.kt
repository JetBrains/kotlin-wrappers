// Automatically generated - do not modify!

@file:JsModule("@mui/material/Menu")
@file:JsNonModule

@file:Suppress(
    "VIRTUAL_MEMBER_HIDDEN",
)

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps
import web.dom.Element

external interface MenuProps :
    mui.system.StandardProps,
    PopoverProps,
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * An HTML element, or a function that returns one.
     * It's used to set the position of the menu.
     */
    var anchorEl: ((element: Element) -> Element)?

    /**
     * If `true` (Default) will focus the `[role="menu"]` if no focusable child is found. Disabled
     * children are not focusable. If you set this prop to `false` focus will be placed
     * on the parent modal container. This has severe accessibility implications
     * and should only be considered if you manage focus otherwise.
     * @default true
     */
    var autoFocus: Boolean?

    /**
     * Menu contents, normally `MenuItem`s.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MenuClasses?

    /**
     * When opening the menu will not focus the active item but the `[role="menu"]`
     * unless `autoFocus` is also set to `false`. Not using the default means not
     * following WAI-ARIA authoring practices. Please be considerate about possible
     * accessibility implications.
     * @default false
     */
    var disableAutoFocusItem: Boolean?

    /**
     * Props applied to the [`MenuList`](/material-ui/api/menu-list/) element.
     * @default {}
     */
    var MenuListProps: MenuListProps?

    /**
     * Callback fired when the component requests to be closed.
     *
     * @param {object} event The event source of the callback.
     * @param {string} reason Can be: `"escapeKeyDown"`, `"backdropClick"`, `"tabKeyDown"`.
     */
    var onClose: dynamic /* PopoverProps['onClose'] */

    /**
     * If `true`, the component is shown.
     */
    var open: Boolean

    /**
     * `classes` prop applied to the [`Popover`](/material-ui/api/popover/) element.
     */
    var PopoverClasses: PopoverClasses?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The length of the transition in `ms`, or 'auto'
     * @default 'auto'
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](http://reactcommunity.org/react-transition-group/transition/) component.
     * @default {}
     */
    var TransitionProps: mui.material.transitions.TransitionProps?

    /**
     * The variant to use. Use `menu` to prevent selected items from impacting the initial focus.
     * @default 'selectedMenu'
     */
    var variant: MenuVariant?
}

/**
 *
 * Demos:
 *
 * - [App bar](https://mui.com/material-ui/react-app-bar/)
 * - [Menus](https://mui.com/material-ui/react-menu/)
 *
 * API:
 *
 * - [Menu API](https://mui.com/material-ui/api/menu/)
 * - inherits [Popover API](https://mui.com/material-ui/api/popover/)
 */
@JsName("default")
external val Menu: react.FC<MenuProps>
