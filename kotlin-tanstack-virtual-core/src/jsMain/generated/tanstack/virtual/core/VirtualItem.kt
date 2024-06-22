// Automatically generated - do not modify!

package tanstack.virtual.core

import web.dom.Element

external interface VirtualItem<TItemElement : Element> {
    var key: Key
    var index: Int
    var start: Int
    var end: Int
    var size: Int
    var lane: Int
    var measureElement: (node: TItemElement?) -> Unit
}
