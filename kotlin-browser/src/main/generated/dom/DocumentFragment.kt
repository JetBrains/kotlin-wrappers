// Automatically generated - do not modify!

package dom

import dom.html.HTMLElement

sealed external class DocumentFragment :
    Node,
    NonElementParentNode,
    ParentNode {
    // TEMP: WA for old `Node`
    // override val ownerDocument: Document
    override fun getElementById(elementId: String): HTMLElement?
}
