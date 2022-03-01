// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItemButton")
@file:JsNonModule

package mui.material

external interface ListItemButtonProps :
    ListItemButtonBaseProps,
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLElement>

external interface ListItemButtonBaseProps : react.PropsWithChildren {
    /**
     * Defines the `align-items` style property.
     * @default 'center'
     */
    var alignItems: ListItemButtonAlignItems?

    /**
     * If `true`, the list item is focused during the first mount.
     * Focus will also be triggered if the value changes from false to true.
     * @default false
     */
    var autoFocus: Boolean?

    /**
     * The content of the component if a `ListItemSecondaryAction` is used it must
     * be the last child.
     */
    override var children: react.ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemButtonClasses?

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used.
     * The prop defaults to the value inherited from the parent List component.
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
     * If `true`, a 1px light border is added to the bottom of the list item.
     * @default false
     */
    var divider: Boolean?

    /**
     * Use to apply selected styling.
     * @default false
     */
    var selected: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemButton API](https://mui.com/api/list-item-button/)
 * - inherits [ButtonBase API](https://mui.com/api/button-base/)
 */
@JsName("default")
external val ListItemButton: react.FC<ListItemButtonProps>
