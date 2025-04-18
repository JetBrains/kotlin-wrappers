// Automatically generated - do not modify!

package web.dom

import web.html.HTMLElement

/**
 * The **`DocumentFragment`** interface represents a minimal document object that has no parent.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentFragment)
 */
open external class DocumentFragment :
    Node,
    NonElementParentNode,
    ParentNode {
    override val ownerDocument: Document
    override fun getElementById(elementId: String): HTMLElement?
}
