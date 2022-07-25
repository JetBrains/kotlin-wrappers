// Automatically generated - do not modify!

@file:JsModule("@tanstack/virtual-core")
@file:JsNonModule

package tanstack.virtual.core

import kotlinx.js.ReadonlyArray

external class Virtualizer<TScrollElement, TItemElement> {
    var options: VirtualizerOptions<TScrollElement, TItemElement>
    var scrollElement: TScrollElement?

    constructor(opts: VirtualizerOptions<TScrollElement, TItemElement>)

    var setOptions: (opts: VirtualizerOptions<TScrollElement, TItemElement>) -> Unit
    var getVirtualItems: () -> ReadonlyArray<VirtualItem<TItemElement>>
    var scrollToOffset: (toOffset: Int, options: ScrollToOffsetOptions?) -> Unit
    var scrollToIndex: (index: Int, options: ScrollToIndexOptions?) -> Unit
    var getTotalSize: () -> Int
    var measure: () -> Unit
}
