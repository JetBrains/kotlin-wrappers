// Automatically generated - do not modify!

@file:JsModule("@mui/material/PaginationItem")
@file:JsNonModule

package mui.material

external interface PaginationItemProps :
    react.dom.html.HTMLAttributes<org.w3c.dom.HTMLDivElement>,
    mui.types.PropsWithComponent {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PaginationItemClasses?

    /**
     * The active color.
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
    var components: dynamic

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
    var sx: mui.system.SxProps<mui.system.Theme>?

    /**
     * The type of pagination item.
     * @default 'page'
     */
    var type: dynamic /* UsePaginationItem['type'] */

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
 * - [Pagination](https://mui.com/components/pagination/)
 *
 * API:
 *
 * - [PaginationItem API](https://mui.com/api/pagination-item/)
 */
@JsName("default")
external val PaginationItem: react.FC<PaginationItemProps>
