// Automatically generated - do not modify!

package tanstack.virtual.core

import js.core.ReadonlyArray
import web.dom.Element
import web.dom.observers.ResizeObserverEntry
import web.events.EventTarget

external interface VirtualizerOptions<TScrollElement : EventTarget /* Element | Window */, TItemElement : Element> {
    var count: Int
    var getScrollElement: () -> TScrollElement?
    var estimateSize: (index: Int) -> Int
    var scrollToFn: (offset: Int, options: ScrollOptions, instance: Virtualizer<TScrollElement, TItemElement>) -> Unit
    var observeElementRect: (instance: Virtualizer<TScrollElement, TItemElement>, cb: (rect: Rect) -> Unit) -> (() -> Unit)?
    var observeElementOffset: (instance: Virtualizer<TScrollElement, TItemElement>, cb: (offset: Int) -> Unit) -> (() -> Unit)?
    var debug: Any?
    var initialRect: Rect?
    var onChange: ((instance: Virtualizer<TScrollElement, TItemElement>) -> Unit)?
    var measureElement: ((element: TItemElement, entry: ResizeObserverEntry?, instance: Virtualizer<TScrollElement, TItemElement>) -> Int)?
    var overscan: Int?
    var horizontal: Boolean?
    var paddingStart: Int?
    var paddingEnd: Int?
    var scrollPaddingStart: Int?
    var scrollPaddingEnd: Int?
    var initialOffset: Int?
    var getItemKey: ((index: Int) -> Key)?
    var rangeExtractor: ((range: Range) -> ReadonlyArray<Int>)?
    var scrollMargin: Int?
    var scrollingDelay: Int?
    var indexAttribute: String?
    var initialMeasurementsCache: ReadonlyArray<VirtualItem>?
    var lanes: Int?
}
