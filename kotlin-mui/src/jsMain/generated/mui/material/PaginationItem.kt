// Automatically generated - do not modify!

@file:JsModule("@mui/material/PaginationItem")
@file:JsNonModule

package mui.material

import mui.material.styles.Theme
import mui.system.SxProps

external interface PaginationItemProps :
    react.dom.html.HTMLAttributes<web.html.HTMLDivElement>,
    mui.system.PropsWithSx,
    mui.types.PropsWithComponent {
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
     * The components used for first, last, next & previous item type
     * @default {
     *   first: FirstPageIcon,
     *   last: LastPageIcon,
     *   next: NavigateNextIcon,
     *   previous: NavigateBeforeIcon,
     * }
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
