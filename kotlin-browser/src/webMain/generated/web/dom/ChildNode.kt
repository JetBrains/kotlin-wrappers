// Automatically generated - do not modify!

@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import js.internal.InternalApi
import web.errors.DOMExceptionType.HierarchyRequestError
import web.errors.JsThrows

/* mixin */
@SubclassOptInRequired(InternalApi::class)
external interface ChildNode :
    Node {
    /**
     * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/after)
     */
    @JsThrows(HierarchyRequestError::class)
    fun after(vararg nodes: Node)

    /**
     * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/after)
     */
    @JsThrows(HierarchyRequestError::class)
    fun after(vararg nodes: String)

    /**
     * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/before)
     */
    @JsThrows(HierarchyRequestError::class)
    fun before(vararg nodes: Node)

    /**
     * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/before)
     */
    @JsThrows(HierarchyRequestError::class)
    fun before(vararg nodes: String)

    /**
     * Removes node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/remove)
     */
    fun remove()

    /**
     * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceWith)
     */
    @JsThrows(HierarchyRequestError::class)
    fun replaceWith(vararg nodes: Node)

    /**
     * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceWith)
     */
    @JsThrows(HierarchyRequestError::class)
    fun replaceWith(vararg nodes: String)
}
