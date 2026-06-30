// Automatically generated - do not modify!

@file:JsModule("@mui/material/ListItem")

package mui.material

import mui.material.styles.Theme
import mui.system.PropsWithSx
import mui.system.SxProps
import mui.types.PropsWithComponent
import react.*

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

external interface ListItemOwnerState

external interface ListItemOwnProps :
    ListItemBaseProps {
    /**
     * The extra props for the slot components.
     * You can override the existing props or add new ones.
     *
     * @default {}
     */
    var slotProps: SlotProps?

    interface SlotProps {
        var root: Props? /* React.HTMLAttributes<HTMLDivElement> & ListItemComponentsPropsOverrides */
        var secondaryAction: Props? /* SlotProps<React.ElementType<React.HTMLAttributes<HTMLDivElement>>, ListItemSecondaryActionSlotPropsOverrides, ListItemOwnerState> */
    }

    /**
     * The components used for each slot inside.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var root: ElementType<*>?
        var secondaryAction: ElementType<*>?
    }
}

/**
 * Uses an additional container component if `ListItemSecondaryAction` is the last child.
 *
 * Demos:
 *
 * - [Lists](https://v7.mui.com/material-ui/react-list/)
 * - [Transfer List](https://v7.mui.com/material-ui/react-transfer-list/)
 *
 * API:
 *
 * - [ListItem API](https://v7.mui.com/material-ui/api/list-item/)
 */
@JsName("default")
external val ListItem: FC<ListItemProps>
