// Automatically generated - do not modify!

package web.dom

/**
 * The **`DocumentType`** interface represents a Node containing a doctype.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType)
 */
external class DocumentType
private constructor() :
    Node,
    ChildNode {
    /**
     * The read-only **`name`** property of the DocumentType returns the type of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/name)
     */
    val name: String
    override val ownerDocument: Document

    /**
     * The read-only **`publicId`** property of the DocumentType returns a formal identifier of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/publicId)
     */
    val publicId: String

    /**
     * The read-only **`systemId`** property of the DocumentType returns the URL of the associated DTD.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/systemId)
     */
    val systemId: String
}
