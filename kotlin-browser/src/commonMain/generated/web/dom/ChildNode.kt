// Automatically generated - do not modify!

@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
    "INTERFACE_WITH_SUPERCLASS",
)

package web.dom

import js.core.JsAny

sealed external interface ChildNode :
    Node {
    /**
     * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/after)
     */
    fun after(vararg nodes: JsAny /* Node | string */): Unit = definedExternally

    /**
     * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/before)
     */
    fun before(vararg nodes: JsAny /* Node | string */): Unit = definedExternally

    /**
     * Removes node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/remove)
     */
    fun remove(): Unit = definedExternally

    /**
     * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterData/replaceWith)
     */
    fun replaceWith(vararg nodes: JsAny /* Node | string */): Unit = definedExternally
}
