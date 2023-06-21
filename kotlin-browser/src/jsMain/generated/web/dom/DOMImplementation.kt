// Automatically generated - do not modify!

package web.dom

import web.xml.XMLDocument

sealed external class DOMImplementation {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createDocument) */
    fun createDocument(
        namespace: String?,
        qualifiedName: String?,
        doctype: DocumentType? = definedExternally,
    ): XMLDocument

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createDocumentType) */
    fun createDocumentType(
        qualifiedName: String,
        publicId: String,
        systemId: String,
    ): DocumentType

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createHTMLDocument) */
    fun createHTMLDocument(title: String = definedExternally): Document
}
