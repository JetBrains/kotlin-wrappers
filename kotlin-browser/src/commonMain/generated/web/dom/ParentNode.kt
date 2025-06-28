// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import web.html.HTMLCollection
import kotlin.js.definedExternally

sealed external interface ParentNode :
    Node {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     */
    val childElementCount: Int
        get() = definedExternally

    /**
     * Returns the child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     */
    val children: HTMLCollection<*>
        get() = definedExternally

    /**
     * Returns the first child that is an element, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     */
    val firstElementChild: Element?
        get() = definedExternally

    /**
     * Returns the last child that is an element, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     */
    val lastElementChild: Element?
        get() = definedExternally

    /**
     * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    fun append(vararg nodes: Node): Unit = definedExternally
    fun append(vararg nodes: String): Unit = definedExternally

    /**
     * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    fun prepend(vararg nodes: Node): Unit = definedExternally
    fun prepend(vararg nodes: String): Unit = definedExternally

    /**
     * Returns the first element that is a descendant of node that matches selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     */
    fun <T : Element> querySelector(selectors: TagName<T>): T? = definedExternally
    fun querySelector(selectors: String): Element? = definedExternally

    /**
     * Returns all element descendants of node that match selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     */
    fun <T : Element> querySelectorAll(selectors: TagName<T>): NodeList<T> = definedExternally
    fun querySelectorAll(selectors: String): NodeList<Element> = definedExternally

    /**
     * Replace all children of node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    fun replaceChildren(vararg nodes: Node): Unit = definedExternally
    fun replaceChildren(vararg nodes: String): Unit = definedExternally
    fun replaceChildren(): Unit = definedExternally
}
