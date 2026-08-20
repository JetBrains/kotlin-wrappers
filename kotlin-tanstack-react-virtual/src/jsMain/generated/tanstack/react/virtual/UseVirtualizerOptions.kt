// Automatically generated - do not modify!

package tanstack.react.virtual

import tanstack.virtual.core.*

@kotlinx.js.JsPlainObject
external interface UseVirtualizerOptions<TScrollElement : web.events.EventTarget, TItemElement : web.dom.Element> {
    var count: Double
    var getScrollElement: () -> TScrollElement?
    var estimateSize: (index: Double) -> Double
    var debug: Boolean?
    var initialRect: Rect?
    var onChange: ((instance: Virtualizer<TScrollElement, TItemElement>, sync: Boolean) -> Unit)?
    var measureElement: (
        (
        element: TItemElement,
        entry: web.resize.ResizeObserverEntry?,
        instance: Virtualizer<TScrollElement, TItemElement>,
    ) -> Double
    )?
    var overscan: Double?
    var horizontal: Boolean?
    var paddingStart: Double?
    var paddingEnd: Double?
    var scrollPaddingStart: Double?
    var scrollPaddingEnd: Double?
    var initialOffset: (Double)?
    var getItemKey: ((index: Double) -> Key)?
    var rangeExtractor: ((range: Range) -> js.array.ReadonlyArray<Double>)?
    var scrollMargin: Double?
    var gap: Double?
    var indexAttribute: String?
    var initialMeasurementsCache: js.array.ReadonlyArray<VirtualItem>?
    var lanes: Double?
    var anchorTo: ScrollAnchor?
    var followOnAppend: FollowOnAppend?
    var scrollEndThreshold: Double?
    var isScrollingResetDelay: Double?
    var useScrollendEvent: Boolean?
    var enabled: Boolean?
    var isRtl: Boolean?
    var useAnimationFrameWithResizeObserver: Boolean?
    var laneAssignmentMode: LaneAssignmentMode?
    var useCachedMeasurements: Boolean?
    var useFlushSync: Boolean?
    var directDomUpdates: Boolean?
    var directDomUpdatesMode: (DirectDomUpdatesMode)?
}
