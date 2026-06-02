// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItem")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*
import react.dom.html.HTMLAttributes
import web.html.HTMLDivElement

external interface ListItemProps :
    ListItemOwnProps,
    PropsWithComponent

external interface ListItemBaseProps :
    PropsWithChildren,
    PropsWithSx {
    /**
     * Defines the `align-items` style property.
     * @default 'center'
     */
    var alignItems: ListItemAlignItems?

    /**
     * The content of the component if a `ListItemSecondaryAction` is used it must
     * be the last child.
     */
    override var children: ReactNode?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemClasses?

    /**
     * The container component used when a `ListItemSecondaryAction` is the last child.
     * @default 'li'
     * @deprecated Use the `component` or `slots.root` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ContainerComponent: ElementType<HTMLAttributes<HTMLDivElement>>?

    /**
     * Props applied to the container component if used.
     * @default {}
     * @deprecated Use the `slotProps.root` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     */
    var ContainerProps: HTMLAttributes<HTMLDivElement>?

    /**
     * If `true`, compact vertical padding designed for keyboard and mouse input is used.
     * The prop defaults to the value inherited from the parent List component.
     * @default false
     */
    var dense: Boolean?

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
    var secondaryAction: ReactNode?

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?
}

external interface ListItemOwnProps :
    ListItemBaseProps {
    /**
     * The components used for each slot inside.
     *
     * @deprecated Use the `slots` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default {}
     */
    var components: Components?

    interface Components {
        var Root: ElementType<*>?
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @deprecated Use the `slotProps` prop instead. This prop will be removed in v7. See [Migrating from deprecated APIs](https://mui.com/material-ui/migration/migrating-from-deprecated-apis/) for more details.
     * @default {}
     */
    var componentsProps: ComponentsProps?

    interface ComponentsProps {
        var root: Props? /* React.HTMLAttributes<HTMLDivElement> & ListItemComponentsPropsOverrides */
    }

    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* React.HTMLAttributes<HTMLDivElement> & ListItemComponentsPropsOverrides */
    }

    /**
     * The components used for each slot inside.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: ElementType<*>?
    }
}

/**
 * Uses an additional container component if `ListItemSecondaryAction` is the last child.
 *
 * Demos:
 *
 * - [Lists](https://v6.mui.com/material-ui/react-list/)
 * - [Transfer List](https://v6.mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [ListItem API](https://v6.mui.com/material-ui/api/list-item/)
 */
@JsName("default")
external val ListItem: FC<ListItemProps>
