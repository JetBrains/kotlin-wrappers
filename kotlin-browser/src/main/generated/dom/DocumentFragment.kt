// Automatically generated - do not modify!

package dom

import dom.html.HTMLElement

abstract external class DocumentFragment :
    Node,
    NonElementParentNode,
    ParentNode {
    // TEMP: WA for old `Node`
    // override val ownerDocument: Document
    override fun getElementById(elementId: String): HTMLElement?
}
