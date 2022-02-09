@file:JsModule("react-virtual")
@file:JsNonModule

package react.virtual

import kotlinx.js.ReadonlyArray
import react.Key

external interface VirtualOptions<T : Any> : ScrollOptions<T> {
    var size: Int
    var estimateSize: ((index: Index) -> Int)?
    var overscan: Int?
    var scrollToFn: ((offset: Int, defaultScrollToFn: (offset: Int) -> Unit) -> Unit)?
    var paddingStart: Int?
    var paddingEnd: Int?
    var keyExtractor: ((index: Index) -> Key)?
    var rangeExtractor: RangeExtractor?
    var useScroll: ((options: ScrollOptions<T>) -> ScrollInstance)?
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
