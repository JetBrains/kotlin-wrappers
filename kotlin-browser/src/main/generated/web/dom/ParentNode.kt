// Automatically generated - do not modify!

package web.dom

import web.html.HTMLCollection
import web.html.HTMLElement
import web.html.HtmlTagName
import web.svg.SVGElement
import web.svg.SvgTagName

sealed external interface ParentNode /* : Node */ {
    val childElementCount: Int

    /** Returns the child elements. */
    val children: HTMLCollection<*>

    /** Returns the first child that is an element, and null otherwise. */
    val firstElementChild: Element?

    /** Returns the last child that is an element, and null otherwise. */
    val lastElementChild: Element?

    /**
     * Inserts nodes after the last child of node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    fun append(vararg nodes: Any /* Node | string */)

    /**
     * Inserts nodes before the first child of node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    fun prepend(vararg nodes: Any /* Node | string */)

    /** Returns the first element that is a descendant of node that matches selectors. */
    fun <T : HTMLElement> querySelector(selectors: HtmlTagName<T>): T?
    fun <T : SVGElement> querySelector(selectors: SvgTagName<T>): T?
    fun querySelector(selectors: String): Element?

    /** Returns all element descendants of node that match selectors. */
    fun <T : HTMLElement> querySelectorAll(selectors: HtmlTagName<T>): NodeListOf<T>
    fun <T : SVGElement> querySelectorAll(selectors: SvgTagName<T>): NodeListOf<T>
    fun querySelectorAll(selectors: String): NodeListOf<Element>

    /**
     * Replace all children of node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    fun replaceChildren(vararg nodes: Any /* Node | string */)
}
