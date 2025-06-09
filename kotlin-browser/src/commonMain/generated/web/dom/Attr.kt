// Automatically generated - do not modify!

package web.dom

/**
 * The **`Attr`** interface represents one of an element's attributes as an object.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr)
 */
external class Attr
private constructor() :
    Node {
    /**
     * The read-only **`localName`** property of the Attr interface returns the _local part_ of the _qualified name_ of an attribute, that is the name of the attribute, stripped from any namespace in front of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/localName)
     */
    val localName: String

    /**
     * The read-only **`name`** property of the Attr interface returns the _qualified name_ of an attribute, that is the name of the attribute, with the namespace prefix, if any, in front of it.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/name)
     */
    val name: String

    /**
     * The read-only **`namespaceURI`** property of the Attr interface returns the namespace URI of the attribute, or `null` if the element is not in a namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/namespaceURI)
     */
    val namespaceURI: String?
    override val ownerDocument: Document

    /**
     * The read-only **`ownerElement`** property of the Attr interface returns the Element the attribute belongs to.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/ownerElement)
     */
    val ownerElement: Element?

    /**
     * The read-only **`prefix`** property of the Attr returns the namespace prefix of the attribute, or `null` if no prefix is specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/prefix)
     */
    val prefix: String?

    /**
     * The **`value`** property of the Attr interface contains the value of the attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/value)
     */
    var value: String

    /**
     * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
     */
    override var textContent: String? // String
}
