// Automatically generated - do not modify!

package web.dom

/**
 * The **`Attr`** interface represents one of an element's attributes as an object. In most situations, you will directly retrieve the attribute value as a string (e.g., Element.getAttribute()), but some cases may require interacting with Attr instances (e.g., Element.getAttributeNode()).
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr)
 */
open external class Attr
private constructor() :
    Node {
    /**
     * The read-only **`localName`** property of the Attr interface returns the local part of the qualified name of an attribute, that is the name of the attribute, stripped from any namespace in front of it. For example, if the qualified name is xml:lang, the returned local name is lang, if the element supports that namespace.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/localName)
     */
    val localName: String

    /**
     * The read-only **`name`** property of the Attr interface returns the qualified name of an attribute, that is the name of the attribute, with the namespace prefix, if any, in front of it. For example, if the local name is lang and the namespace prefix is xml, the returned qualified name is xml:lang.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/name)
     */
    val name: String

    /**
     * The read-only **`namespaceURI`** property of the Attr interface returns the namespace URI of the attribute, or null if the element is not in a namespace.
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
     * The read-only **`prefix`** property of the Attr returns the namespace prefix of the attribute, or null if no prefix is specified.
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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Node/textContent)
     */
    override var textContent: String? // String
}
