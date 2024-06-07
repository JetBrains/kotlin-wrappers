// Automatically generated - do not modify!

@file:JsModule("@tanstack/virtual-core")

package tanstack.virtual.core

import js.array.JsTuple2
import js.array.ReadonlyArray
import js.collections.ReadonlyMap
import web.dom.Element
import web.events.EventTarget
import web.window.Window

external class Virtualizer<TScrollElement : EventTarget /* Element | Window */, TItemElement : Element> {
    var options: VirtualizerOptions<TScrollElement, TItemElement>
    var scrollElement: TScrollElement?
    var targetWindow: Window?
    var isScrolling: Boolean
    var measurementsCache: ReadonlyArray<VirtualItem>
    var scrollRect: Rect
    var scrollOffset: Int
    var scrollDirection: ScrollDirection?
    var shouldAdjustScrollPositionOnItemSizeChange: ((item: VirtualItem, delta: Int, instance: Virtualizer<TScrollElement, TItemElement>) -> Boolean)?
    var measureElementCache: ReadonlyMap<Key, TItemElement>
    var range: ItemRange?

    constructor(opts: VirtualizerOptions<TScrollElement, TItemElement>)

    var setOptions: (opts: VirtualizerOptions<TScrollElement, TItemElement>) -> Unit
    var calculateRange: () -> ItemRange?
    var indexFromElement: (node: TItemElement) -> Int
    var resizeItem: (item: VirtualItem, size: Int) -> Unit
    var measureElement: (node: TItemElement?) -> Unit
    var getVirtualItems: () -> ReadonlyArray<VirtualItem>
    var getVirtualItemForOffset: (offset: Int) -> VirtualItem
    var getOffsetForAlignment: (toOffset: Int, align: ScrollAlignment) -> Int
    var getOffsetForIndex: (index: Int, align: ScrollAlignment?) -> JsTuple2<Double, ScrollAlignment>
    var scrollToOffset: (toOffset: Int, options: ScrollToOffsetOptions?) -> Unit
    var scrollToIndex: (index: Int, options: ScrollToIndexOptions?) -> Unit
    var scrollBy: (delta: Int, options: ScrollToOffsetOptions?) -> Unit
    var getTotalSize: () -> Int
    var measure: () -> Unit
}
