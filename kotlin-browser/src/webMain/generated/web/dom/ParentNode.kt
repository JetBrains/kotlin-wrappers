// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import js.internal.InternalApi
import web.html.HTMLCollection

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface ParentNode :
    Node {
    /**
     * The **`Document.childElementCount`** read-only property returns the number of child elements of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/childElementCount)
     */
    val childElementCount: Int
        get() = definedExternally

    /**
     * The read-only **`children`** property returns a live HTMLCollection which contains all of the child elements of the document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     */
    val children: HTMLCollection<*>
        get() = definedExternally

    /**
     * The **`Document.firstElementChild`** read-only property returns the document's first child Element, or null if there are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     */
    val firstElementChild: Element?
        get() = definedExternally

    /**
     * The **`Document.lastElementChild`** read-only property returns the document's last child Element, or null if there are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     */
    val lastElementChild: Element?
        get() = definedExternally

    /**
     * The **`Document.append()`** method inserts a set of Node objects or strings after the last child of the document. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    fun append(vararg nodes: Node): Unit = definedExternally
    fun append(vararg nodes: String): Unit = definedExternally

    /**
     * The **`moveBefore()`** method of the Document interface moves a given Node inside the Document DOM node as a direct child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     */
    fun moveBefore(
        node: Node,
        child: Node?,
    ): Unit = definedExternally

    /**
     * The **`Document.prepend()`** method inserts a set of Node objects or strings before the first child of the document. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    fun prepend(vararg nodes: Node): Unit = definedExternally
    fun prepend(vararg nodes: String): Unit = definedExternally

    /**
     * The Document method **`querySelector()`** returns the first Element within the document that matches the specified CSS selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     */
    fun <T : Element> querySelector(selectors: TagName<T>): T? = definedExternally
    fun querySelector(selectors: String): Element? = definedExternally

    /**
     * The Document method **`querySelectorAll()`** returns a static (not live) NodeList representing a list of the document's elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     */
    fun <T : Element> querySelectorAll(selectors: TagName<T>): NodeList<T> = definedExternally
    fun querySelectorAll(selectors: String): NodeList<Element> = definedExternally

    /**
     * The **`Document.replaceChildren()`** method replaces the existing children of a Document with a specified new set of children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    fun replaceChildren(vararg nodes: Node): Unit = definedExternally
    fun replaceChildren(vararg nodes: String): Unit = definedExternally
    fun replaceChildren(): Unit = definedExternally
}
