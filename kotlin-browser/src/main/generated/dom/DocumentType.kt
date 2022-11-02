// Automatically generated - do not modify!

package dom

sealed external class DocumentType :
    Node,
    ChildNode {
    val name: String

    // TEMP: WA for old `Node`
    // override val ownerDocument: Document
    val publicId: String
    val systemId: String
}
