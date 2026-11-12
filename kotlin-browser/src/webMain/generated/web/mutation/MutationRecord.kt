// Automatically generated - do not modify!

package web.mutation

import web.dom.Node
import web.dom.NodeList

/**
 * The **`MutationRecord`** is a read-only interface that represents an individual DOM mutation observed by a MutationObserver. It is the object inside the array passed to the callback of a MutationObserver.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord)
 */
open external class MutationRecord
private constructor() {
    /**
     * The MutationRecord read-only property **`addedNodes`** is a NodeList of nodes added to a target node by a mutation observed with a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/addedNodes)
     */
    open val addedNodes: NodeList<*>

    /**
     * The MutationRecord read-only property **`attributeName`** contains the name of a changed attribute belonging to a node that is observed by a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeName)
     */
    open val attributeName: String?

    /**
     * The MutationRecord read-only property **`attributeNamespace`** is the namespace of the mutated attribute in the MutationRecord observed by a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/attributeNamespace)
     */
    open val attributeNamespace: String?

    /**
     * The MutationRecord read-only property **`nextSibling`** is the next sibling of an added or removed child node of the target of a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/nextSibling)
     */
    open val nextSibling: Node?

    /**
     * The MutationRecord read-only property **`oldValue`** contains the character data or attribute value of an observed node before it was changed.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/oldValue)
     */
    open val oldValue: String?

    /**
     * The MutationRecord read-only property **`previousSibling`** is the previous sibling of an added or removed child node of the target of a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/previousSibling)
     */
    open val previousSibling: Node?

    /**
     * The MutationRecord read-only property **`removedNodes`** is a NodeList of nodes removed from a target node by a mutation observed with a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/removedNodes)
     */
    open val removedNodes: NodeList<*>

    /**
     * The MutationRecord read-only property **`target`** is the target (i.e., the mutated/changed node) of a mutation observed with a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/target)
     */
    open val target: Node

    /**
     * The MutationRecord read-only property **`type`** is the type of the MutationRecord observed by a MutationObserver.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MutationRecord/type)
     */
    open val type: MutationRecordType
}
