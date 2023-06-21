// Automatically generated - do not modify!

package web.dom.observers

import web.dom.Node
import web.dom.NodeList

sealed external class MutationRecord {
    /**
     * Return the nodes added and removed respectively.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/addedNodes)
     */
    val addedNodes: NodeList<*>

    /**
     * Returns the local name of the changed attribute, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeName)
     */
    val attributeName: String?

    /**
     * Returns the namespace of the changed attribute, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeNamespace)
     */
    val attributeNamespace: String?

    /**
     * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/nextSibling)
     */
    val nextSibling: Node?

    /**
     * The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/oldValue)
     */
    val oldValue: String?

    /**
     * Return the previous and next sibling respectively of the added or removed nodes, and null otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/previousSibling)
     */
    val previousSibling: Node?

    /**
     * Return the nodes added and removed respectively.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/removedNodes)
     */
    val removedNodes: NodeList<*>

    /**
     * Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/target)
     */
    val target: Node

    /**
     * Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type)
     */
    val type: MutationRecordType
}
