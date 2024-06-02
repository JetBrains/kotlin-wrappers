// Automatically generated - do not modify!

@file:JsModule("@mui/material/usePagination")

package mui.material

import js.array.ReadonlyArray

external interface UsePaginationProps : react.Props {
    /**
     * Number of always visible pages at the beginning and end.
     * @default 1
     */
    var boundaryCount: Number?

    /**
     * The name of the component where this hook is used.
     */
    var componentName: String?

    /**
     * The total number of pages.
     * @default 1
     */
    var count: Number?

    /**
     * The page selected by default when the component is uncontrolled.
     * @default 1
     */
    var defaultPage: Number?

    /**
     * If `true`, the component is disabled.
     * @default false
     */
    var disabled: Boolean?

    /**
     * If `true`, hide the next-page button.
     * @default false
     */
    var hideNextButton: Boolean?

    /**
     * If `true`, hide the previous-page button.
     * @default false
     */
    var hidePrevButton: Boolean?

    /**
     * Callback fired when the page is changed.
     *
     * @param {React.ChangeEvent<unknown>} event The event source of the callback.
     * @param {number} page The page selected.
     */
    var onChange: ((event: react.dom.events.ChangeEvent<*>, page: Number) -> Unit)?

    /**
     * The current page. Unlike `TablePagination`, which starts numbering from `0`, this pagination starts from `1`.
     */
    var page: Number?

    /**
     * If `true`, show the first-page button.
     * @default false
     */
    var showFirstButton: Boolean?

    /**
     * If `true`, show the last-page button.
     * @default false
     */
    var showLastButton: Boolean?

    /**
     * Number of always visible pages before and after the current page.
     * @default 1
     */
    var siblingCount: Number?
}

external interface UsePaginationItem : react.Props {
    var onClick: react.dom.events.ReactEventHandler<*>

    var type: UsePaginationItemType

    var page: Number?

    var selected: Boolean

    var disabled: Boolean
}

external interface UsePaginationResult {
    var items: ReadonlyArray<UsePaginationItem>
}

@JsName("default")
external fun usePagination(
    props: UsePaginationProps,
): UsePaginationResult
