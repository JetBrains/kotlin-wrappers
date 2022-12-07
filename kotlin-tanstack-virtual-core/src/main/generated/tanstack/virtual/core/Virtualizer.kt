// Automatically generated - do not modify!

@file:JsModule("@tanstack/virtual-core")
@file:JsNonModule

package tanstack.virtual.core

import dom.Element
import js.core.ReadonlyArray

external class Virtualizer<TScrollElement : Any /* Element | Window */, TItemElement : Element> {
    var options: VirtualizerOptions<TScrollElement, TItemElement>
    var scrollElement: TScrollElement?
    var isScrolling: Boolean
    var measurementsCache: ReadonlyArray<VirtualItem>
    var range: ItemRange

    constructor(opts: VirtualizerOptions<TScrollElement, TItemElement>)

    var setOptions: (opts: VirtualizerOptions<TScrollElement, TItemElement>) -> Unit
    var calculateRange: () -> ItemRange
    var indexFromElement: (node: TItemElement) -> Int
    var measureElement: (node: TItemElement?) -> Unit
    var getVirtualItems: () -> ReadonlyArray<VirtualItem>
    var scrollToOffset: (toOffset: Int, options: ScrollToOffsetOptions?) -> Unit
    var scrollToIndex: (index: Int, options: ScrollToIndexOptions?) -> Unit
    var getTotalSize: () -> Int
    var measure: () -> Unit
}
