// Automatically generated - do not modify!

package dom.observers

import dom.Node
import dom.NodeList

sealed external class MutationRecord {
    /** Return the nodes added and removed respectively. */
    val addedNodes: NodeList<*>

    /** Returns the local name of the changed attribute, and null otherwise. */
    val attributeName: String?

    /** Returns the namespace of the changed attribute, and null otherwise. */
    val attributeNamespace: String?

    /** Return the previous and next sibling respectively of the added or removed nodes, and null otherwise. */
    val nextSibling: Node?

    /** The return value depends on type. For "attributes", it is the value of the changed attribute before the change. For "characterData", it is the data of the changed node before the change. For "childList", it is null. */
    val oldValue: String?

    /** Return the previous and next sibling respectively of the added or removed nodes, and null otherwise. */
    val previousSibling: Node?

    /** Return the nodes added and removed respectively. */
    val removedNodes: NodeList<*>

    /** Returns the node the mutation affected, depending on the type. For "attributes", it is the element whose attribute changed. For "characterData", it is the CharacterData node. For "childList", it is the node whose children changed. */
    val target: Node

    /** Returns "attributes" if it was an attribute mutation. "characterData" if it was a mutation to a CharacterData node. And "childList" if it was a mutation to the tree of nodes. */
    val type: MutationRecordType
}
