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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/localName)
     */
    val localName: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/name)
     */
    val name: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/namespaceURI)
     */
    val namespaceURI: String?
    override val ownerDocument: Document

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/ownerElement)
     */
    val ownerElement: Element?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/prefix)
     */
    val prefix: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/value)
     */
    var value: String
}
