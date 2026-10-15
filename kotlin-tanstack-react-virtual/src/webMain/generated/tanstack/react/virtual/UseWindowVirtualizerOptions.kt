// Automatically generated - do not modify!

package tanstack.react.virtual

import tanstack.virtual.core.*

@kotlinx.js.JsPlainObject
external interface UseWindowVirtualizerOptions<TItemElement : web.dom.Element> {
    val count: Int
    val getScrollElement: (() -> web.window.Window?)?
    val estimateSize: (index: Int) -> Int
    val scrollToFn: (
        (offset: Int, options: ScrollOptions, instance: Virtualizer<web.window.Window, TItemElement>) -> Unit
    )?
    val observeElementRect: (
        (instance: Virtualizer<web.window.Window, TItemElement>, cb: (rect: Rect) -> Unit) -> (() -> Unit)?
    )?
    val observeElementOffset: (
        (instance: Virtualizer<web.window.Window, TItemElement>, cb: ObserveOffsetCallBack) -> (() -> Unit)?
    )?
    val debug: Boolean?
    val initialRect: Rect?
    val onChange: ((instance: Virtualizer<web.window.Window, TItemElement>, sync: Boolean) -> Unit)?
    val measureElement: (
        (
        element: TItemElement,
        entry: web.resize.ResizeObserverEntry?,
        instance: Virtualizer<web.window.Window, TItemElement>,
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
    val useFlushSync: Boolean?
    val directDomUpdates: Boolean?
    val directDomUpdatesMode: (DirectDomUpdatesMode)?
}
