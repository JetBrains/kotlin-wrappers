// Automatically generated - do not modify!

@file:JsModule("@mui/material/Pagination")
@file:JsNonModule

package mui.material

external interface PaginationProps : react.Props {
    /**
     * Override or extend the styles applied to the component.
     */
    var classes: PaginationClasses?

    /**
     * The active color.
     * @default 'standard'
     */
    var color: PaginationColor?

    /**
     * Accepts a function which returns a string value that provides a user-friendly name for the current page.
     * This is important for screen reader users.
     *
     * For localization purposes, you can use the provided [translations](/guides/localization/).
     * @param {string} type The link or button type to format ('page' | 'first' | 'last' | 'next' | 'previous'). Defaults to 'page'.
     * @param {number} page The page number to format.
     * @param {bool} selected If true, the current page is selected.
     * @returns {string}
     */
    var getItemAriaLabel: ((
        type: mui.system.Union, /* 'page' | 'first' | 'last' | 'next' | 'previous' */
        page: Number,
        selected: Boolean,
    ) -> String)?

    /**
     * Render the item.
     * @param {PaginationRenderItemParams} params The props to spread on a PaginationItem.
     * @returns {ReactNode}
     * @default (item) => <PaginationItem {...item} />
     */
    var renderItem: ((params: PaginationRenderItemParams) -> react.ReactNode)?

    /**
     * The shape of the pagination items.
     * @default 'circular'
     */
    var shape: mui.system.Union? /* 'circular' | 'rounded' */

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
     * The variant to use.
     * @default 'text'
     */
    var variant: PaginationVariant?
}

external interface PaginationRenderItemParams : react.Props {
    var color: PaginationColor

    var shape: dynamic /* PaginationProps['shape'] */

    var size: Size

    var variant: PaginationVariant
}

/**
 *
 * Demos:
 *
 * - [Pagination](https://mui.com/components/pagination/)
 *
 * API:
 *
 * - [Pagination API](https://mui.com/api/pagination/)
 */
@JsName("default")
external val Pagination: react.FC<PaginationProps>
