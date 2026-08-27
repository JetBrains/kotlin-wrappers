// Automatically generated - do not modify!

@file:JsModule("@tanstack/virtual-core")

package tanstack.virtual.core

open external class Virtualizer<TScrollElement : web.events.EventTarget /* Element | Window */, TItemElement : web.dom.Element> {
    constructor (opts: VirtualizerOptions<TScrollElement, TItemElement>)

    var options: VirtualizerOptions<TScrollElement, TItemElement>
    var scrollElement: TScrollElement?
    var targetWindow: (web.window.Window)?
    var isScrolling: Boolean
    var measurementsCache: js.array.ReadonlyArray<VirtualItem>
    var itemSizeCache: js.collections.ReadonlyMap<Key, Int>
    var scrollRect: Rect?
    var scrollOffset: Int?
    var scrollDirection: ScrollDirection?
    var scrollAdjustments: Int
    var shouldAdjustScrollPositionOnItemSizeChange: (
        (item: VirtualItem, delta: Int, instance: Virtualizer<TScrollElement, TItemElement>) -> Boolean
    )?
    var elementsCache: js.collections.ReadonlyMap<Key, TItemElement>
    var range: (ItemRange)?
    var setOptions: (opts: VirtualizerOptions<TScrollElement, TItemElement>) -> Unit

    var calculateRange: VirtualizerCalculateRange
    var getVirtualIndexes: VirtualizerGetVirtualIndexes
    var indexFromElement: (node: TItemElement) -> Int
    var measureElement: (node: TItemElement?) -> Unit
    var resizeItem: (index: Int, size: Int) -> Unit
    var getVirtualItems: VirtualizerGetVirtualItems
    var getVirtualItemForOffset: (offset: Int) -> VirtualItem?
    var getDistanceFromEnd: () -> Int
    var isAtEnd: (threshold: Int? /* use undefined for default */) -> Boolean
    var getOffsetForAlignment: (
        toOffset: Int,
        align: ScrollAlignment,
        itemSize: Int?, // use undefined for default
    ) -> Int
    var getOffsetForIndex: (
        index: Int,
        align: ScrollAlignment?, // use undefined for default
    ) -> js.array.Tuple2<Double, ScrollAlignment>?
    var scrollToOffset: (toOffset: Int, options: ScrollToOffsetOptions? /* use undefined for default */) -> Unit
    var scrollToIndex: (index: Int, options: ScrollToIndexOptions? /* use undefined for default */) -> Unit
    var scrollBy: (delta: Int, options: ScrollToOffsetOptions? /* use undefined for default */) -> Unit
    var scrollToEnd: (options: ScrollToEndOptions? /* use undefined for default */) -> Unit
    var getTotalSize: () -> Int

    /**
     * Returns a snapshot of currently-measured items suitable for round-
     * tripping through state storage (sessionStorage, history, etc.) and
     * passing back as `initialMeasurementsCache` on remount. Pair with the
     * current `scrollOffset` to restore exact scroll position after navigation.
     *
     * Only items the consumer has actually rendered (and thus measured) appear
     * in the snapshot; unmeasured items will fall back to `estimateSize` on
     * restore. Returns an empty array if no items have been measured.
     */
    var takeSnapshot: () -> js.array.ReadonlyArray<VirtualItem>
    var measure: () -> Unit
}
