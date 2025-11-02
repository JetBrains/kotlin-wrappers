// Automatically generated - do not modify!

package web.dom

import web.events.EventTarget
import web.html.HTMLElement
import kotlin.js.definedExternally

/**
 * The DOM **`Node`** interface is an abstract base class upon which many other DOM API objects are based, thus letting those object types be used similarly and often interchangeably. As an abstract class, there is no such thing as a plain Node object. All objects that implement Node functionality are based on one of its subclasses. Most notable are Document, Element, and DocumentFragment.
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
     * The read-only **`childNodes`** property of the Node interface returns a live NodeList of child nodes of the given element where the first child node is assigned index 0. Child nodes include elements, text and comments.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/childNodes)
     */
    val childNodes: NodeList<ChildNode>

    /**
     * The read-only **`firstChild`** property of the Node interface returns the node's first child in the tree, or null if the node has no children.
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
     * The read-only **`lastChild`** property of the Node interface returns the last child of the node, or null if there are no child nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lastChild)
     */
    val lastChild: ChildNode?

    /**
     * The read-only **`nextSibling`** property of the Node interface returns the node immediately following the specified one in their parent's childNodes, or returns null if the specified node is the last child in the parent element.
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
     * The read-only **`nodeType`** property of a Node interface is an integer that identifies what the node is. It distinguishes different kinds of nodes from each other, such as elements, text, and comments.
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
     * The read-only **`parentElement`** property of Node interface returns the DOM node's parent Element, or null if the node either has no parent, or its parent isn't a DOM Element. Node.parentNode on the other hand returns any kind of parent, regardless of its type.
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
     * The read-only **`previousSibling`** property of the Node interface returns the node immediately preceding the specified one in its parent's childNodes list, or null if the specified node is the first in that list.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/previousSibling)
     */
    val previousSibling: ChildNode?

    /**
     * The **`textContent`** property of the Node interface represents the text content of the node and its descendants.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     */
    open var textContent: String?

    /**
     * The **`appendChild()`** method of the Node interface adds a node to the end of the list of children of a specified parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/appendChild)
     */
    fun <T : Node> appendChild(node: T): T

    /**
     * The **`cloneNode()`** method of the Node interface returns a duplicate of the node on which this method was called. Its parameter controls if the subtree contained in a node is also cloned or not.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/cloneNode)
     */
    fun cloneNode(subtree: Boolean = definedExternally): Node

    /**
     * The **`compareDocumentPosition()`** method of the Node interface reports the position of its argument node relative to the node on which it is called.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/compareDocumentPosition)
     */
    fun compareDocumentPosition(other: Node): NodePosition

    /**
     * The **`contains()`** method of the Node interface returns a boolean value indicating whether a node is a descendant of a given node, that is the node itself, one of its direct children (childNodes), one of the children's direct children, and so on.
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
     * The **`insertBefore()`** method of the Node interface inserts a node before a reference node as a child of a specified parent node.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/insertBefore)
     */
    fun <T : Node> insertBefore(
        node: T,
        child: Node?,
    ): T

    /**
     * The **`isDefaultNamespace()`** method of the Node interface accepts a namespace URI as an argument. It returns a boolean value that is true if the namespace is the default namespace on the given node and false if not. The default namespace can be retrieved with Node.lookupNamespaceURI() by passing null as the argument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isDefaultNamespace)
     */
    fun isDefaultNamespace(namespace: String?): Boolean

    /**
     * The **`isEqualNode()`** method of the Node interface tests whether two nodes are equal. Two nodes are equal when they have the same type, defining characteristics (for elements, this would be their ID, number of children, and so forth), its attributes match, and so on. The specific set of data points that must match varies depending on the types of the nodes.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isEqualNode)
     */
    fun isEqualNode(otherNode: Node?): Boolean

    /**
     * The **`isSameNode()`** method of the Node interface is a legacy alias the for the === strict equality operator. That is, it tests whether two nodes are the same (in other words, whether they reference the same object).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/isSameNode)
     */
    fun isSameNode(otherNode: Node?): Boolean

    /**
     * The **`lookupNamespaceURI()`** method of the Node interface takes a prefix as parameter and returns the namespace URI associated with it on the given node if found (and null if not). This method's existence allows Node objects to be passed as a namespace resolver to XPathEvaluator.createExpression() and XPathEvaluator.evaluate().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupNamespaceURI)
     */
    fun lookupNamespaceURI(prefix: String?): String?

    /**
     * The **`lookupPrefix()`** method of the Node interface returns a string containing the prefix for a given namespace URI, if present, and null if not. When multiple prefixes are possible, the first prefix is returned.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/lookupPrefix)
     */
    fun lookupPrefix(namespace: String?): String?

    /**
     * The **`normalize()`** method of the Node interface puts the specified node and all of its sub-tree into a normalized form. In a normalized sub-tree, no text nodes in the sub-tree are empty and there are no adjacent text nodes.
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
    val DOCUMENT_POSITION_DISCONNECTED: NodePosition

    /**
     * Set when other is preceding node.
     */
    val DOCUMENT_POSITION_PRECEDING: NodePosition

    /**
     * Set when other is following node.
     */
    val DOCUMENT_POSITION_FOLLOWING: NodePosition

    /**
     * Set when other is an ancestor of node.
     */
    val DOCUMENT_POSITION_CONTAINS: NodePosition

    /**
     * Set when other is a descendant of node.
     */
    val DOCUMENT_POSITION_CONTAINED_BY: NodePosition
    val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: NodePosition

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
        val DOCUMENT_POSITION_DISCONNECTED: NodePosition

        /**
         * Set when other is preceding node.
         */
        val DOCUMENT_POSITION_PRECEDING: NodePosition

        /**
         * Set when other is following node.
         */
        val DOCUMENT_POSITION_FOLLOWING: NodePosition

        /**
         * Set when other is an ancestor of node.
         */
        val DOCUMENT_POSITION_CONTAINS: NodePosition

        /**
         * Set when other is a descendant of node.
         */
        val DOCUMENT_POSITION_CONTAINED_BY: NodePosition
        val DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC: NodePosition
    }
}
