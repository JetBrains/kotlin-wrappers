// Automatically generated - do not modify!

package dom.html

import dom.Element
import dom.Node
import js.core.ReadonlyArray

abstract external class HTMLSlotElement :
    HTMLElement {
    var name: String
    fun assign(vararg nodes: Element /* | Text */)
    fun assignedElements(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Element>
    fun assignedNodes(options: AssignedNodesOptions = definedExternally): ReadonlyArray<Node>
}
