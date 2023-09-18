// Automatically generated - do not modify!

@file:JsModule("@mui/material/PaginationItem")

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface PaginationItemProps :
    PaginationItemOwnProps,
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.types.PropsWithComponent

external interface PaginationItemOwnProps : mui.system.PropsWithSx {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PaginationItemClasses?

    /**
     * The active color.
     * It supports both default and custom theme colors, which can be added as shown in the
     * [palette customization guide](https://mui.com/material-ui/customization/palette/#adding-new-colors).
     * @default 'standard'
     */
    var color: PaginationItemColor?

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
        var first: react.ElementType<*>?
        var last: react.ElementType<*>?
        var next: react.ElementType<*>?
        var previous: react.ElementType<*>?
    }

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * The current page number.
     */
    var page: react.ReactNode?

    /**
     * If `true` the pagination item is selected.
     * @default false
     */
    var selected: Boolean?

    /**
     * The shape of the pagination item.
     * @default 'circular'
     */
    var shape: PaginationItemShape?

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: Size?

    /**
     * The components used for each slot inside.
     *
     * This prop is an alias for the `components` prop, which will be deprecated in the future.
     *
     * @default {}
     */
    var slots: Slots?

    interface Slots {
        var first: react.ElementType<*>?
        var last: react.ElementType<*>?
        var next: react.ElementType<*>?
        var previous: react.ElementType<*>?
    }

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    override var sx: SxProps<Theme>?

    /**
     * The type of pagination item.
     * @default 'page'
     */
    var type: UsePaginationItemType?

    /**
     * The variant to use.
     * @default 'text'
     */
    var variant: PaginationItemVariant?
}

/**
 *
 * Demos:
 *
 * - [Pagination](https://mui.com/material-ui/react-pagination/)
 *
 * API:
 *
 * - [PaginationItem API](https://mui.com/material-ui/api/pagination-item/)
 */
@JsName("default")
external val PaginationItem: react.FC<PaginationItemProps>
