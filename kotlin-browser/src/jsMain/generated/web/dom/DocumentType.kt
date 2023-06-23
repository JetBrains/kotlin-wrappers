// Automatically generated - do not modify!

package web.dom

/**
 * A Node containing a doctype.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType)
 */
sealed external class DocumentType :
    Node,
    ChildNode {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/name) */
    val name: String
    override val ownerDocument: Document

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/publicId) */
    val publicId: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/systemId) */
    val systemId: String
}
