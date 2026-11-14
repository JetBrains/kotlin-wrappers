// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import js.internal.InternalApi
import web.errors.DOMExceptionType.*
import web.errors.JsThrows
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

    /**
     * The read-only **`children`** property returns a live HTMLCollection which contains all of the child elements of the document upon which it was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/children)
     */
    val children: HTMLCollection<*>

    /**
     * The **`Document.firstElementChild`** read-only property returns the document's first child Element, or null if there are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/firstElementChild)
     */
    val firstElementChild: Element?

    /**
     * The **`Document.lastElementChild`** read-only property returns the document's last child Element, or null if there are no child elements.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/lastElementChild)
     */
    val lastElementChild: Element?

    /**
     * The **`Document.append()`** method inserts a set of Node objects or strings after the last child of the document. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    @JsThrows(HierarchyRequestError::class)
    fun append(vararg nodes: Node)

    /**
     * The **`Document.append()`** method inserts a set of Node objects or strings after the last child of the document. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/append)
     */
    @JsThrows(HierarchyRequestError::class)
    fun append(vararg nodes: String)

    /**
     * The **`moveBefore()`** method of the Document interface moves a given Node inside the Document DOM node as a direct child, before a given reference node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/moveBefore)
     */
    @JsThrows(HierarchyRequestError::class)
    @JsThrows(NotFoundError::class)
    fun moveBefore(
        node: Node,
        child: Node?,
    )

    /**
     * The **`Document.prepend()`** method inserts a set of Node objects or strings before the first child of the document. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    @JsThrows(HierarchyRequestError::class)
    fun prepend(vararg nodes: Node)

    /**
     * The **`Document.prepend()`** method inserts a set of Node objects or strings before the first child of the document. Strings are inserted as equivalent Text nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/prepend)
     */
    @JsThrows(HierarchyRequestError::class)
    fun prepend(vararg nodes: String)

    /**
     * The Document method **`querySelector()`** returns the first Element within the document that matches the specified CSS selector, or group of CSS selectors. If no matches are found, null is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelector)
     */
    @JsThrows(SyntaxError::class)
    fun <T : Element> querySelector(selectors: TagName<T>): T?

    @JsThrows(SyntaxError::class)
    fun querySelector(selectors: String): Element?

    /**
     * The Document method **`querySelectorAll()`** returns a static (not live) NodeList representing a list of the document's elements that match the specified group of selectors.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/querySelectorAll)
     */
    @JsThrows(SyntaxError::class)
    fun <T : Element> querySelectorAll(selectors: TagName<T>): NodeList<T>

    @JsThrows(SyntaxError::class)
    fun querySelectorAll(selectors: String): NodeList<Element>

    /**
     * The **`Document.replaceChildren()`** method replaces the existing children of a Document with a specified new set of children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    @JsThrows(HierarchyRequestError::class)
    fun replaceChildren(vararg nodes: Node)

    /**
     * The **`Document.replaceChildren()`** method replaces the existing children of a Document with a specified new set of children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/replaceChildren)
     */
    @JsThrows(HierarchyRequestError::class)
    fun replaceChildren(vararg nodes: String)

    @JsThrows(HierarchyRequestError::class)
    fun replaceChildren()
}
