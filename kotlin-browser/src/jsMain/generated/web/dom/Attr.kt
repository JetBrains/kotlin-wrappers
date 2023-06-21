// Automatically generated - do not modify!

package web.dom

sealed external class Attr :
    Node {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/localName) */
    val localName: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/name) */
    val name: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/namespaceURI) */
    val namespaceURI: String?
    override val ownerDocument: Document

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/ownerElement) */
    val ownerElement: Element?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/prefix) */
    val prefix: String?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr/value) */
    var value: String
}
