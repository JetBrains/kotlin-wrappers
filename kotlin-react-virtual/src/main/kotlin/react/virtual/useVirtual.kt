@file:JsModule("react-virtual")
@file:JsNonModule

package react.virtual

import kotlinext.js.ReadonlyArray
import org.w3c.dom.HTMLElement
import org.w3c.dom.events.Event
import react.Key
import react.Ref

external interface VirtualOptions<T : Any> {
    var size: Int
    var parentRef: Ref<T>
    var estimateSize: (index: Index) -> Int
    var overscan: Int
    var horizontal: Boolean
    var scrollToFn: (offset: Int, defaultScrollToFn: (offset: Int) -> Unit) -> Unit
    var useObserver: (parentRef: Ref<T>, initialRect: Size?) -> Size
    var initialRect: Size
    var paddingStart: Int
    var paddingEnd: Int
    var onScrollElement: Ref<HTMLElement>
    var scrollOffsetFn: (event: Event?) -> Int
    var keyExtractor: (index: Index) -> Key
    var measureSize: (el: HTMLElement, horizontal: Boolean) -> Int
    var rangeExtractor: RangeExtractor
}

external interface VirtualInstance {
    val virtualItems: ReadonlyArray<VirtualItem>
    val totalSize: Int
    val scrollToIndex: (index: Index, options: ScrollToIndexOptions) -> Unit
    val scrollToOffset: (offset: Int, options: ScrollToOffsetOptions) -> Unit
}

external fun <T : Any> useVirtual(
    options: VirtualOptions<T>,
): VirtualInstance
