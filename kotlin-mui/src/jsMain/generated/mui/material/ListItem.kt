// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItem")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface ListItemProps :
    ListItemBaseProps,
    react.dom.html.HTMLAttributes<web.html.HTMLElement> {
    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `slots` prop.
     * It's recommended to use the `slots` prop instead.
     *
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: react.ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `slotProps` prop.
     * It's recommended to use the `slotProps` prop instead, as `componentsProps` will be deprecated in the future.
     *
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> & ListItemComponentsPropsOverrides */
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * This prop is an alias for the `componentsProps` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: react.Props? /* React.HTMLAttributes<HTMLDivElement> & ListItemComponentsPropsOverrides */
    }

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `components` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: react.ElementType<*>?
    }
}

external interface ListItemBaseProps :
    react.PropsWithChildren,
    mui.system.PropsWithSx {
    /**
     * Defines the `align-items` style property.
     * @default 'center'
     */
    var alignItems: ListItemAlignItems?

    /**
     * If `true`, the list item is focused during the first mount.
     * Focus will also be triggered if the value changes from false to true.
     * @default false
     * @deprecated checkout [ListItemButton](/material-ui/api/list-item-button/) instead
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
    var ContainerComponent: react.ElementType<react.dom.html.HTMLAttributes<web.html.HTMLDivElement>>?

    /**
     * Props applied to the container component if used.
     * @default {}
     * @deprecated
     */
    var ContainerProps: react.dom.html.HTMLAttributes<web.html.HTMLDivElement>?

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used.
     * The prop defaults to the value inherited from the parent List component.
     * @default false
     */
    var dense: Boolean?

    /**
     * If `true`, the component is disabled.
     * @default false
     * @deprecated checkout [ListItemButton](/material-ui/api/list-item-button/) instead
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
     * @deprecated checkout [ListItemButton](/material-ui/api/list-item-button/) instead
     */
    var selected: Boolean?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

/**
 * Uses an additional container component if `ListItemSecondaryAction` is the last child.
 *
 * Demos:
 *
 * - [Lists](https://mui.com/material-ui/react-list/)
 * - [Transfer List](https://mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [ListItem API](https://mui.com/material-ui/api/list-item/)
 */
@JsName("default")
external val ListItem: react.FC<ListItemProps>
