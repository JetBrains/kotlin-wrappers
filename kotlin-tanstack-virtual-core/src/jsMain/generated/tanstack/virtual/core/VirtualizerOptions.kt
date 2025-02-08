// Automatically generated - do not modify!

package tanstack.virtual.core

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.dom.Element
import web.events.EventTarget
import web.resize.ResizeObserverEntry

@JsPlainObject
external interface VirtualizerOptions<TScrollElement : EventTarget /* Element | Window */, TItemElement : Element> {
    val count: Int
    val getScrollElement: () -> TScrollElement?
    val estimateSize: (index: Int) -> Int
    val scrollToFn: (offset: Int, options: ScrollOptions, instance: Virtualizer<TScrollElement, TItemElement>) -> Unit
    val observeElementRect: (instance: Virtualizer<TScrollElement, TItemElement>, cb: (rect: Rect) -> Unit) -> (() -> Unit)?
    val observeElementOffset: (instance: Virtualizer<TScrollElement, TItemElement>, cb: ObserveOffsetCallBack) -> (() -> Unit)?
    val debug: Boolean?
    val initialRect: Rect?
    val onChange: ((instance: Virtualizer<TScrollElement, TItemElement>, sync: Boolean) -> Unit)?
    val measureElement: ((element: TItemElement, entry: ResizeObserverEntry?, instance: Virtualizer<TScrollElement, TItemElement>) -> Int)?
    val overscan: Int?
    val horizontal: Boolean?
    val paddingStart: Int?
    val paddingEnd: Int?
    val scrollPaddingStart: Int?
    val scrollPaddingEnd: Int?
    val initialOffset: Int /* | (() -> Int) */?
    val getItemKey: ((index: Int) -> Key)?
    val rangeExtractor: ((range: Range) -> ReadonlyArray<Int>)?
    val scrollMargin: Int?
    val gap: Int?
    val indexAttribute: String?
    val initialMeasurementsCache: ReadonlyArray<VirtualItem>?
    val lanes: Int?
    val isScrollingResetDelay: Int?
    val useScrollendEvent: Boolean?
    val enabled: Boolean?
    val isRtl: Boolean?
    val useAnimationFrameWithResizeObserver: Boolean?
}
