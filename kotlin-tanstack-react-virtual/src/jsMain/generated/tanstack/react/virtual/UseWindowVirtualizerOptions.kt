// Automatically generated - do not modify!

package tanstack.react.virtual

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import tanstack.virtual.core.*
import web.dom.Element
import web.resize.ResizeObserverEntry
import web.window.Window

@JsPlainObject
external interface UseWindowVirtualizerOptions<TItemElement : Element> {
    val count: Int
    val estimateSize: (index: Int) -> Int
    val debug: Boolean?
    val initialRect: Rect?
    val onChange: ((instance: Virtualizer<Window, TItemElement>, sync: Boolean) -> Unit)?
    val measureElement: ((element: TItemElement, entry: ResizeObserverEntry?, instance: Virtualizer<Window, TItemElement>) -> Int)?
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
