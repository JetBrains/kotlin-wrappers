// Automatically generated - do not modify!

package web.dom

sealed external interface ChildNode /* : Node */ {
    /**
     * Inserts nodes just after node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    fun after(vararg nodes: Any /* Node | string */)

    /**
     * Inserts nodes just before node, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    fun before(vararg nodes: Any /* Node | string */)

    /** Removes node. */
    fun remove()

    /**
     * Replaces node with nodes, while replacing strings in nodes with equivalent Text nodes.
     *
     * Throws a "HierarchyRequestError" DOMException if the constraints of the node tree are violated.
     */
    fun replaceWith(vararg nodes: Any /* Node | string */)
}
