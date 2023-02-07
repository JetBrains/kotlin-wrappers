// Automatically generated - do not modify!

package web.html

import js.core.ReadonlyArray
import web.dom.Element
import web.dom.Node

abstract external class HTMLSlotElement :
    HTMLElement {
    var name: String
    fun assign(vararg nodes: Element /* | Text */)
    fun assignedElements(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Element>
    fun assignedNodes(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Node>
}
