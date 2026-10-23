// Automatically generated - do not modify!

package tanstack.virtual.core

@kotlinx.js.JsPlainObject
external interface VirtualizerOptions<TScrollElement : web.events.EventTarget /* Element | Window */, TItemElement : web.dom.Element> {
    val count: Int
    val getScrollElement: () -> TScrollElement?
    val estimateSize: (index: Int) -> Int
    val scrollToFn: (offset: Int, options: ScrollOptions, instance: Virtualizer<TScrollElement, TItemElement>) -> Unit
    val observeElementRect: (
        instance: Virtualizer<TScrollElement, TItemElement>,
        cb: (rect: Rect) -> Unit,
    ) -> (() -> Unit)?
    val observeElementOffset: (
        instance: Virtualizer<TScrollElement, TItemElement>,
        cb: ObserveOffsetCallBack,
    ) -> (() -> Unit)?
    val debug: Boolean?
    val initialRect: Rect?
    val onChange: ((instance: Virtualizer<TScrollElement, TItemElement>, sync: Boolean) -> Unit)?
    val measureElement: (
        (
        element: TItemElement,
        entry: web.resize.ResizeObserverEntry?,
        instance: Virtualizer<TScrollElement, TItemElement>,
    ) -> Int
    )?
    val overscan: Int?
    val horizontal: Boolean?
    val paddingStart: Int?
    val paddingEnd: Int?
    val scrollPaddingStart: Int?
    val scrollPaddingEnd: Int?
    val initialOffset: (() -> Int)?
    val getItemKey: ((index: Int) -> Key)?
    val rangeExtractor: ((range: Range) -> js.array.ReadonlyArray<Int>)?
    val scrollMargin: Int?
    val gap: Int?
    val indexAttribute: String?
    val initialMeasurementsCache: js.array.ReadonlyArray<VirtualItem>?
    val lanes: Int?
    val anchorTo: ScrollAnchor?
    val followOnAppend: FollowOnAppend?
    val scrollEndThreshold: Int?
    val isScrollingResetDelay: Int?
    val useScrollendEvent: Boolean?
    val enabled: Boolean?
    val isRtl: Boolean?
    val useAnimationFrameWithResizeObserver: Boolean?
    val laneAssignmentMode: LaneAssignmentMode?
    val useCachedMeasurements: Boolean?
}
