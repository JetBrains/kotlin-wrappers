// Automatically generated - do not modify!

package web.dom

/**
 * The **`DocumentType`** interface represents a Node containing a doctype.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType)
 */
open external class DocumentType
private constructor() :
    Node,
    ChildNode {
    /**
     * The read-only **`name`** property of the DocumentType returns the type of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/name)
     */
    open val name: String
    override val ownerDocument: Document

    /**
     * The read-only **`publicId`** property of the DocumentType returns a formal identifier of the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/publicId)
     */
    open val publicId: String

    /**
     * The read-only **`systemId`** property of the DocumentType returns the URL of the associated DTD.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentType/systemId)
     */
    open val systemId: String

    /* `ChildNode` overrides */

    override fun after(vararg nodes: Node)
    override fun after(vararg nodes: String)
    override fun before(vararg nodes: Node)
    override fun before(vararg nodes: String)
    override fun remove()
    override fun replaceWith(vararg nodes: Node)
    override fun replaceWith(vararg nodes: String)
}
