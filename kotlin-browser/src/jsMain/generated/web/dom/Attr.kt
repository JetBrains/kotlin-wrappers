// Automatically generated - do not modify!

package web.dom

/**
 * A DOM element's attribute as an object. In most DOM methods, you will probably directly retrieve the attribute as a string (e.g., Element.getAttribute(), but certain functions (e.g., Element.getAttributeNode()) or means of iterating give Attr types.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Attr)
 */
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
