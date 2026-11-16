// Automatically generated - do not modify!

package web.dom

import web.html.HTMLCollection
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

    /**
     * The **`getElementById()`** method of the DocumentFragment returns an Element object representing the element whose id property matches the specified string. Since element IDs are required to be unique if specified, they're a useful way to get access to a specific element quickly.
     */
    override fun getElementById(elementId: ElementId): HTMLElement?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     */
    override var textContent: String

    /* `ParentNode` overrides */

    override val childElementCount: Int
    override val children: HTMLCollection<*>
    override val firstElementChild: Element?
    override val lastElementChild: Element?
    override fun append(vararg nodes: Node)
    override fun append(vararg nodes: String)
    override fun moveBefore(
        node: Node,
        child: Node?,
    )

    override fun prepend(vararg nodes: Node)
    override fun prepend(vararg nodes: String)
    override fun <T : Element> querySelector(selectors: TagName<T>): T?
    override fun querySelector(selectors: String): Element?
    override fun <T : Element> querySelectorAll(selectors: TagName<T>): NodeList<T>
    override fun querySelectorAll(selectors: String): NodeList<Element>
    override fun replaceChildren(vararg nodes: Node)
    override fun replaceChildren(vararg nodes: String)
    override fun replaceChildren()
}
