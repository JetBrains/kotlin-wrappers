@file:JsModule("react-virtual")
@file:JsNonModule

package react.virtual

import kotlinext.js.ReadonlyArray
import org.w3c.dom.Element
import org.w3c.dom.events.Event
import react.Key
import react.Ref

external interface VirtualOptions {
    var size: Int
    var parentRef: Ref<Element>
    var estimateSize: (index: Index) -> Int
    var overscan: Int
    var horizontal: Boolean
    var scrollToFn: (offset: Int, defaultScrollToFn: (offset: Int) -> Unit) -> Unit
    var useObserver: (parentRef: Ref<Element>) -> Size
    var paddingStart: Int
    var paddingEnd: Int
    var onScrollElement: Ref<Element>
    var scrollOffsetFn: (event: Event?) -> Int
    var keyExtractor: (index: Index) -> Key

    // nondocumented
    // var measureSize: ?
    var rangeExtractor: (range: Range) -> ReadonlyArray<Index>
}

external interface VirtualInstance {
    val virtualItems: ReadonlyArray<VirtualItem>
    val totalSize: Int
    val scrollToIndex: (index: Index, options: ScrollOptions) -> Unit
    val scrollToOffset: (offset: Int, options: ScrollOptions) -> Unit
}

external fun useVirtual(
    options: VirtualOptions,
): VirtualInstance
