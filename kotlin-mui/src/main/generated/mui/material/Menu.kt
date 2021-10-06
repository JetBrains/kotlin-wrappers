// Automatically generated - do not modify!

@file:JsModule("@mui/material/Menu")
@file:JsNonModule

package mui.material

import kotlinext.js.ReadonlyArray

external interface MenuProps : react.PropsWithChildren {
    /**
     * An HTML element, or a function that returns one.
     * It's used to set the position of the menu.
     */
    var anchorEl: dynamic /* PopoverProps['anchorEl'] */

    /**
     * If `true` (Default) will focus the `[role="menu"]` if no focusable child is found. Disabled
     * children are not focusable. If you set this prop to `false` focus will be placed
     * on the parent modal container. This has severe accessibility implications
     * and should only be considered if you manage focus otherwise.
     * @default true
     */
    var autoFocus: Boolean

    /**
     * Menu contents, normally `MenuItem`s.
     */
    override var children: ReadonlyArray<react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: MenuClasses

    /**
     * When opening the menu will not focus the active item but the `[role="menu"]`
     * unless `autoFocus` is also set to `false`. Not using the default means not
     * following WAI-ARIA authoring practices. Please be considerate about possible
     * accessibility implications.
     * @default false
     */
    var disableAutoFocusItem: Boolean

    /**
     * Props applied to the [`MenuList`](/api/menu-list/) element.
     * @default {}
     */
    var MenuListProps: MenuListProps

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
     * `classes` prop applied to the [`Popover`](/api/popover/) element.
     */
    var PopoverClasses: dynamic /* PopoverProps['classes'] */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>

    /**
     * The length of the transition in `ms`, or 'auto'
     * @default 'auto'
     */
    var transitionDuration: dynamic /* TransitionProps['timeout'] | 'auto' */

    /**
     * Props applied to the transition element.
     * By default, the element is based on this [`Transition`](https://reactcommunity.org/react-transition-group/transition) component.
     * @default {}
     */
    var TransitionProps: mui.material.transitions.TransitionProps

    /**
     * The variant to use. Use `menu` to prevent selected items from impacting the initial focus.
     * @default 'selectedMenu'
     */
    var variant: mui.system.Union /* 'menu' | 'selectedMenu' */
}

/**
 *
 * Demos:
 *
 * - [App Bar](https://mui.com/components/app-bar/)
 * - [Menus](https://mui.com/components/menus/)
 *
 * API:
 *
 * - [Menu API](https://mui.com/api/menu/)
 * - inherits [Popover API](https://mui.com/api/popover/)
 */
@JsName("default")
external val Menu: react.FC<MenuProps>
