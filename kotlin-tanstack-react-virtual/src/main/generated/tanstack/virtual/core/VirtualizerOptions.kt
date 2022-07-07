// Automatically generated - do not modify!

package tanstack.virtual.core

import kotlinx.js.ReadonlyArray

external interface VirtualizerOptions<TScrollElement, TItemElement> {
    var count: Int
    var getScrollElement: () -> TScrollElement
    var estimateSize: (index: Int) -> Int
    var scrollToFn: (offset: Int, canSmooth: Boolean, instance: Virtualizer<TScrollElement, TItemElement>) -> Unit
    var observeElementRect: (instance: Virtualizer<TScrollElement, TItemElement>, cb: (rect: Rect) -> Unit) -> (() -> Unit)?
    var observeElementOffset: (instance: Virtualizer<TScrollElement, TItemElement>, cb: (offset: Int) -> Unit) -> (() -> Unit)?
    var debug: Any?
    var initialRect: Rect?
    var onChange: ((instance: Virtualizer<TScrollElement, TItemElement>) -> Unit)?
    var measureElement: ((el: TItemElement, instance: Virtualizer<TScrollElement, TItemElement>) -> Int)?
    var overscan: Int?
    var horizontal: Boolean?
    var paddingStart: Int?
    var paddingEnd: Int?
    var scrollPaddingStart: Int?
    var scrollPaddingEnd: Int?
    var initialOffset: Int?
    var getItemKey: ((index: Int) -> Key)?
    var rangeExtractor: ((range: Range) -> ReadonlyArray<Int>)?
    var enableSmoothScroll: Boolean?
}
