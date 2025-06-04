// Automatically generated - do not modify!

package web.dom

import web.events.EventTarget
import web.html.HTMLElement
import kotlin.js.definedExternally

/**
 * The DOM **`Node`** interface is an abstract base class upon which many other DOM API objects are based, thus letting those object types to be used similarly and often interchangeably.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node)
 */
open external class Node
private constructor() :
    EventTarget {
    /**
     * The read-only **`baseURI`** property of the Node interface returns the absolute base URL of the document containing the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/baseURI)
     */
    val baseURI: String

    /**
     * The read-only **`childNodes`** property of the Node interface returns a live the first child node is assigned index `0`.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/childNodes)
     */
    val childNodes: NodeList<ChildNode>

    /**
     * The read-only **`firstChild`** property of the Node interface returns the node's first child in the tree, or `null` if the node has no children.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/firstChild)
     */
    val firstChild: ChildNode?

    /**
     * The read-only **`isConnected`** property of the Node interface returns a boolean indicating whether the node is connected (directly or indirectly) to a Document object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isConnected)
     */
    val isConnected: Boolean

    /**
     * The read-only **`lastChild`** property of the Node interface returns the last child of the node, or `null` if there are no child nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lastChild)
     */
    val lastChild: ChildNode?

    /**
     * The read-only **`nextSibling`** property of the Node interface returns the node immediately following the specified one in their parent's Node.childNodes, or returns `null` if the specified node is the last child in the parent element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nextSibling)
     */
    val nextSibling: ChildNode?

    /**
     * The read-only **`nodeName`** property of Node returns the name of the current node as a string.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeName)
     */
    val nodeName: String

    /**
     * The read-only **`nodeType`** property of a Node interface is an integer that identifies what the node is.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeType)
     */
    val nodeType: NodeType

    /**
     * The **`nodeValue`** property of the Node interface returns or sets the value of the current node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/nodeValue)
     */
    var nodeValue: String?

    /**
     * The read-only **`ownerDocument`** property of the Node interface returns the top-level document object of the node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/ownerDocument)
     */
    open val ownerDocument: Document?

    /**
     * The read-only **`parentElement`** property of Node interface returns the DOM node's parent Element, or `null` if the node either has no parent, or its parent isn't a DOM Element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentElement)
     */
    val parentElement: HTMLElement?

    /**
     * The read-only **`parentNode`** property of the Node interface returns the parent of the specified node in the DOM tree.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/parentNode)
     */
    val parentNode: ParentNode?

    /**
     * The read-only **`previousSibling`** property of the Node interface returns the node immediately preceding the specified one in its parent's or `null` if the specified node is the first in that list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/previousSibling)
     */
    val previousSibling: ChildNode?

    /**
     * The **`textContent`** property of the Node interface represents the text content of the node and its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     */
    var textContent: String?

    /**
     * The **`appendChild()`** method of the Node interface adds a node to the end of the list of children of a specified parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/appendChild)
     */
    fun <T : Node> appendChild(node: T): T

    /**
     * The **`cloneNode()`** method of the Node interface returns a duplicate of the node on which this method was called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/cloneNode)
     */
    fun cloneNode(subtree: Boolean = definedExternally): Node

    /**
     * The **`compareDocumentPosition()`** method of the Node interface reports the position of its argument node relative to the node on which it is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/compareDocumentPosition)
     */
    fun compareDocumentPosition(other: Node): Short

    /**
     * The **`contains()`** method of the Node interface returns a boolean value indicating whether a node is a descendant of a given node, that is the node itself, one of its direct children (Node.childNodes), one of the children's direct children, and so on.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/contains)
     */
    fun contains(other: Node?): Boolean

    /**
     * The **`getRootNode()`** method of the Node interface returns the context object's root, which optionally includes the shadow root if it is available.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/getRootNode)
     */
    fun getRootNode(options: GetRootNodeOptions = definedExternally): Node

    /**
     * The **`hasChildNodes()`** method of the Node interface returns a boolean value indicating whether the given Node has child nodes or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/hasChildNodes)
     */
    fun hasChildNodes(): Boolean

    /**
     * The **`insertBefore()`** method of the Node interface inserts a node before a _reference node_ as a child of a specified _parent node_.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/insertBefore)
     */
    fun <T : Node> insertBefore(
        node: T,
        child: Node?,
    ): T

    /**
     * The **`isDefaultNamespace()`** method of the Node interface accepts a namespace URI as an argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isDefaultNamespace)
     */
    fun isDefaultNamespace(namespace: String?): Boolean

    /**
     * The **`isEqualNode()`** method of the Node interface tests whether two nodes are equal.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isEqualNode)
     */
    fun isEqualNode(otherNode: Node?): Boolean

    /**
     * The **`isSameNode()`** method of the Node interface is a legacy alias the for the `===` strict equality operator.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isSameNode)
     */
    fun isSameNode(otherNode: Node?): Boolean

    /**
     * The **`lookupNamespaceURI()`** method of the Node interface takes a prefix as parameter and returns the namespace URI associated with it on the given node if found (and `null` if not).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupNamespaceURI)
     */
    fun lookupNamespaceURI(prefix: String?): String?

    /**
     * The **`lookupPrefix()`** method of the Node interface returns a string containing the prefix for a given namespace URI, if present, and `null` if not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupPrefix)
     */
    fun lookupPrefix(namespace: String?): String?

    /**
     * The **`normalize()`** method of the Node interface puts the specified node and all of its sub-tree into a _normalized_ form.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/normalize)
     */
    fun normalize()

    /**
     * The **`removeChild()`** method of the Node interface removes a child node from the DOM and returns the removed node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/removeChild)
     */
    fun <T : Node> removeChild(child: T): T

    /**
     * The **`replaceChild()`** method of the Node interface replaces a child node within the given (parent) node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/replaceChild)
     */
    fun <T : Node> replaceChild(
        node: Node,
        child: T,
    ): T

    /**
     * node is an element.
     */
    val ELEMENT_NODE: NodeType
    val ATTRIBUTE_NODE: NodeType

    /**
     * node is a Text node.
     */
    val TEXT_NODE: NodeType

    /**
     * node is a CDATASection node.
     */
    val CDATA_SECTION_NODE: NodeType
    val ENTITY_REFERENCE_NODE: NodeType
    val ENTITY_NODE: NodeType

    /**
     * node is a ProcessingInstruction node.
     */
    val PROCESSING_INSTRUCTION_NODE: NodeType

    /**
     * node is a Comment node.
     */
    val COMMENT_NODE: NodeType

    /**
     * node is a document.
     */
    val DOCUMENT_NODE: NodeType

    /**
     * node is a doctype.
     */
    val DOCUMENT_TYPE_NODE: NodeType

    /**
     * node is a DocumentFragment node.
     */
    val DOCUMENT_FRAGMENT_NODE: NodeType
    val NOTATION_NODE: NodeType

    /**
     * Set when node and other are not in the same tree.
     */
    val DOCUMENT_POSITION_DISCONNECTED: NodeType

    /**
     * Set when other is preceding node.
     */
    val DOCUMENT_POSITION_PRECEDING: NodeType

    /**
     * Set when other is following node.
     */
    val DOCUMENT_POSITION_FOLLOWING: NodeType

    /**
     * Set when other is an ancestor of node.
     */
    val DOCUMENT_POSITION_CONTAINS: NodeType

    /**
     * Set when other is a descendant of node.
     */
    val DOCUMENT_POSITION_CONTAINED_BY: NodeType
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: NodeType

    companion object {
        /**
         * node is an element.
         */
        val ELEMENT_NODE: NodeType
        val ATTRIBUTE_NODE: NodeType

        /**
         * node is a Text node.
         */
        val TEXT_NODE: NodeType

        /**
         * node is a CDATASection node.
         */
        val CDATA_SECTION_NODE: NodeType
        val ENTITY_REFERENCE_NODE: NodeType
        val ENTITY_NODE: NodeType

        /**
         * node is a ProcessingInstruction node.
         */
        val PROCESSING_INSTRUCTION_NODE: NodeType

        /**
         * node is a Comment node.
         */
        val COMMENT_NODE: NodeType

        /**
         * node is a document.
         */
        val DOCUMENT_NODE: NodeType

        /**
         * node is a doctype.
         */
        val DOCUMENT_TYPE_NODE: NodeType

        /**
         * node is a DocumentFragment node.
         */
        val DOCUMENT_FRAGMENT_NODE: NodeType
        val NOTATION_NODE: NodeType

        /**
         * Set when node and other are not in the same tree.
         */
        val DOCUMENT_POSITION_DISCONNECTED: NodeType

        /**
         * Set when other is preceding node.
         */
        val DOCUMENT_POSITION_PRECEDING: NodeType

        /**
         * Set when other is following node.
         */
        val DOCUMENT_POSITION_FOLLOWING: NodeType

        /**
         * Set when other is an ancestor of node.
         */
        val DOCUMENT_POSITION_CONTAINS: NodeType

        /**
         * Set when other is a descendant of node.
         */
        val DOCUMENT_POSITION_CONTAINED_BY: NodeType
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: NodeType
    }
}
