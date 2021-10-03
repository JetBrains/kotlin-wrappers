// Automatically generated - do not modify!

@file:JsModule("@mui/material/PaginationItem")
@file:JsNonModule

package mui.material

external interface PaginationItemProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PaginationItemClasses

    /**
     * The active color.
     * @default 'standard'
     */
    var color: Union /* 'standard' | 'primary' | 'secondary', PaginationItemPropsColorOverrides */

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean

    /**
     * The current page number.
     */
    var page: react.ReactNode

    /**
     * If `true` the pagination item is selected.
     * @default false
     */
    var selected: Boolean

    /**
     * The shape of the pagination item.
     * @default 'circular'
     */
    var shape: Union /* 'circular' | 'rounded' */

    /**
     * The size of the component.
     * @default 'medium'
     */
    var size: Union /* 'small' | 'medium' | 'large', PaginationItemPropsSizeOverrides */

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>

    /**
     * The type of pagination item.
     * @default 'page'
     */
    var type: dynamic /* UsePaginationItem['type'] */

    /**
     * The variant to use.
     * @default 'text'
     */
    var variant: Union /* 'text' | 'outlined', PaginationItemPropsVariantOverrides */
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
