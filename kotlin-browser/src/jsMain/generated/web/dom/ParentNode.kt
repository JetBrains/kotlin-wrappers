// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import web.html.HTMLCollection
import web.html.HTMLElement
import web.html.HtmlTagName
import web.mathml.MathMLElement
import web.mathml.MathMLTagName
import web.svg.SVGElement
import web.svg.SvgTagName

sealed external interface ParentNode :
    Node {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount) */
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
    fun append(vararg nodes: Any /* Node | string */): Unit = definedExternally

    /**
     * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    fun prepend(vararg nodes: Any /* Node | string */): Unit = definedExternally

    /**
     * Returns the first element that is a descendant of node that matches selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     */
    fun <T : HTMLElement> querySelector(selectors: HtmlTagName<T>): T? = definedExternally
    fun <T : SVGElement> querySelector(selectors: SvgTagName<T>): T? = definedExternally
    fun <T : MathMLElement> querySelector(selectors: MathMLTagName<T>): T? = definedExternally
    fun querySelector(selectors: String): Element? = definedExternally

    /**
     * Returns all element descendants of node that match selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     */
    fun <T : HTMLElement> querySelectorAll(selectors: HtmlTagName<T>): NodeListOf<T> = definedExternally
    fun <T : SVGElement> querySelectorAll(selectors: SvgTagName<T>): NodeListOf<T> = definedExternally
    fun <T : MathMLElement> querySelectorAll(selectors: MathMLTagName<T>): NodeListOf<T> = definedExternally
    fun querySelectorAll(selectors: String): NodeListOf<Element> = definedExternally

    /**
     * Replace all children of node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    fun replaceChildren(vararg nodes: Any /* Node | string */): Unit = definedExternally
}
