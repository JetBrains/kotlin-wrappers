// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItem")
@file:JsNonModule

package mui.material

external interface ListItemProps : react.Props {
    /**
     * The components used for each slot inside the InputBase.
     * Either a string to use a HTML element or a component.
     * @default {}
     */
    var components: dynamic

    /**
     * The props used for each slot inside the Input.
     * @default {}
     */
    var componentsProps: dynamic
}

external interface ListItemBaseProps : react.PropsWithChildren {
    /**
     * Defines the `align-items` style property.
     * @default 'center'
     */
    var alignItems: mui.system.Union? /* 'flex-start' | 'center' */

    /**
     * If `true`, the list item is focused during the first mount.
     * Focus will also be triggered if the value changes from false to true.
     * @default false
     * @deprecated checkout [ListItemButton](/api/list-item-button/) instead
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
    var classes: ListItemClasses?

    /**
     * The container component used when a `ListItemSecondaryAction` is the last child.
     * @default 'li'
     * @deprecated
     */
    var ContainerComponent: react.ElementType<react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>>?

    /**
     * Props applied to the container component if used.
     * @default {}
     * @deprecated
     */
    var ContainerProps: react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>?

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used.
     * The prop defaults to the value inherited from the parent List component.
     * @default false
     */
    var dense: Boolean?

    /**
     * If `true`, the component is disabled.
     * @default false
     * @deprecated checkout [ListItemButton](/api/list-item-button/) instead
     */
    var disabled: Boolean?

    /**
     * If `true`, the left and right padding is removed.
     * @default false
     */
    var disableGutters: Boolean?

    /**
     * If `true`, all padding is removed.
     * @default false
     */
    var disablePadding: Boolean?

    /**
     * If `true`, a 1px light border is added to the bottom of the list item.
     * @default false
     */
    var divider: Boolean?

    /**
     * The element to display at the end of ListItem.
     */
    var secondaryAction: react.ReactNode?

    /**
     * Use to apply selected styling.
     * @default false
     * @deprecated checkout [ListItemButton](/api/list-item-button/) instead
     */
    var selected: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: mui.system.SxProps<mui.system.Theme>?
}

/**
 * Uses an additional container component if `ListItemSecondaryAction` is the last child.
 *
 * Demos:
 *
 * - [Lists](https://mui.com/components/lists/)
 * - [Transfer List](https://mui.com/components/transfer-list/)
 *
 * API:
 *
 * - [ListItem API](https://mui.com/api/list-item/)
 */
@JsName("default")
external val ListItem: react.FC<ListItemProps>
