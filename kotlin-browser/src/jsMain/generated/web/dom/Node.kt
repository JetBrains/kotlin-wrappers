// Automatically generated - do not modify!

package web.dom

import web.events.EventTarget
import web.html.HTMLElement

sealed external class Node :
    EventTarget {
    /**
     * Returns node's node document's document base URL.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/baseURI)
     */
    val baseURI: String

    /**
     * Returns the children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/childNodes)
     */
    val childNodes: NodeListOf<ChildNode>

    /**
     * Returns the first child.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/firstChild)
     */
    val firstChild: ChildNode?

    /**
     * Returns true if node is connected and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isConnected)
     */
    val isConnected: Boolean

    /**
     * Returns the last child.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lastChild)
     */
    val lastChild: ChildNode?

    /**
     * Returns the next sibling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nextSibling)
     */
    val nextSibling: ChildNode?

    /**
     * Returns a string appropriate for the type of node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeName)
     */
    val nodeName: String

    /**
     * Returns the type of node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeType)
     */
    val nodeType: Short
    var nodeValue: String?

    /**
     * Returns the node document. Returns null for documents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/ownerDocument)
     */
    open val ownerDocument: Document?

    /**
     * Returns the parent element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentElement)
     */
    val parentElement: HTMLElement?

    /**
     * Returns the parent.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentNode)
     */
    val parentNode: ParentNode?

    /**
     * Returns the previous sibling.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/previousSibling)
     */
    val previousSibling: ChildNode?
    var textContent: String?
    fun <T : Node> appendChild(node: T): T

    /**
     * Returns a copy of node. If deep is true, the copy also includes the node's descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/cloneNode)
     */
    fun cloneNode(deep: Boolean = definedExternally): Node

    /**
     * Returns a bitmask indicating the position of other relative to node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/compareDocumentPosition)
     */
    fun compareDocumentPosition(other: Node): Number

    /**
     * Returns true if other is an inclusive descendant of node, and false otherwise.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/contains)
     */
    fun contains(other: Node?): Boolean

    /**
     * Returns node's root.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/getRootNode)
     */
    fun getRootNode(options: GetRootNodeOptions = definedExternally): Node

    /**
     * Returns whether node has children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/hasChildNodes)
     */
    fun hasChildNodes(): Boolean
    fun <T : Node> insertBefore(
        node: T,
        child: Node?,
    ): T

    fun isDefaultNamespace(namespace: String?): Boolean

    /**
     * Returns whether node and otherNode have the same properties.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isEqualNode)
     */
    fun isEqualNode(otherNode: Node?): Boolean
    fun isSameNode(otherNode: Node?): Boolean
    fun lookupNamespaceURI(prefix: String?): String?
    fun lookupPrefix(namespace: String?): String?

    /**
     * Removes empty exclusive Text nodes and concatenates the data of remaining contiguous exclusive Text nodes into the first of their nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/normalize)
     */
    fun normalize()
    fun <T : Node> removeChild(child: T): T
    fun <T : Node> replaceChild(
        node: Node,
        child: T,
    ): T

    /** node is an element. */
    val ELEMENT_NODE: Short
    val ATTRIBUTE_NODE: Short

    /** node is a Text node. */
    val TEXT_NODE: Short

    /** node is a CDATASection node. */
    val CDATA_SECTION_NODE: Short
    val ENTITY_REFERENCE_NODE: Short
    val ENTITY_NODE: Short

    /** node is a ProcessingInstruction node. */
    val PROCESSING_INSTRUCTION_NODE: Short

    /** node is a Comment node. */
    val COMMENT_NODE: Short

    /** node is a document. */
    val DOCUMENT_NODE: Short

    /** node is a doctype. */
    val DOCUMENT_TYPE_NODE: Short

    /** node is a DocumentFragment node. */
    val DOCUMENT_FRAGMENT_NODE: Short
    val NOTATION_NODE: Short

    /** Set when node and other are not in the same tree. */
    val DOCUMENT_POSITION_DISCONNECTED: Short

    /** Set when other is preceding node. */
    val DOCUMENT_POSITION_PRECEDING: Short

    /** Set when other is following node. */
    val DOCUMENT_POSITION_FOLLOWING: Short

    /** Set when other is an ancestor of node. */
    val DOCUMENT_POSITION_CONTAINS: Short

    /** Set when other is a descendant of node. */
    val DOCUMENT_POSITION_CONTAINED_BY: Short
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short

    companion object {
        /** node is an element. */
        val ELEMENT_NODE: Short
        val ATTRIBUTE_NODE: Short

        /** node is a Text node. */
        val TEXT_NODE: Short

        /** node is a CDATASection node. */
        val CDATA_SECTION_NODE: Short
        val ENTITY_REFERENCE_NODE: Short
        val ENTITY_NODE: Short

        /** node is a ProcessingInstruction node. */
        val PROCESSING_INSTRUCTION_NODE: Short

        /** node is a Comment node. */
        val COMMENT_NODE: Short

        /** node is a document. */
        val DOCUMENT_NODE: Short

        /** node is a doctype. */
        val DOCUMENT_TYPE_NODE: Short

        /** node is a DocumentFragment node. */
        val DOCUMENT_FRAGMENT_NODE: Short
        val NOTATION_NODE: Short

        /** Set when node and other are not in the same tree. */
        val DOCUMENT_POSITION_DISCONNECTED: Short

        /** Set when other is preceding node. */
        val DOCUMENT_POSITION_PRECEDING: Short

        /** Set when other is following node. */
        val DOCUMENT_POSITION_FOLLOWING: Short

        /** Set when other is an ancestor of node. */
        val DOCUMENT_POSITION_CONTAINS: Short

        /** Set when other is a descendant of node. */
        val DOCUMENT_POSITION_CONTAINED_BY: Short
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: Short
    }
}
