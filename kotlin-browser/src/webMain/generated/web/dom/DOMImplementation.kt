// Automatically generated - do not modify!

package web.dom

import web.xml.XMLDocument
import kotlin.js.definedExternally

/**
 * The **`DOMImplementation`** interface represents an object providing methods which are not dependent on any particular document. Such an object is returned by the Document.implementation property.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation)
 */
open external class DOMImplementation
private constructor() {
    /**
     * The **`DOMImplementation.createDocument()`** method creates and returns an XMLDocument.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createDocument)
     */
    fun createDocument(
        namespace: String?,
        qualifiedName: String?,
        doctype: DocumentType? = definedExternally,
    ): XMLDocument

    /**
     * The **`DOMImplementation.createDocumentType()`** method returns a DocumentType object which can either be used with DOMImplementation.createDocument upon document creation or can be put into the document via methods like Node.insertBefore() or Node.replaceChild().
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createDocumentType)
     */
    fun createDocumentType(
        name: String,
        publicId: String,
        systemId: String,
    ): DocumentType

    /**
     * The **`DOMImplementation.createHTMLDocument()`** method creates a new HTML Document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DOMImplementation/createHTMLDocument)
     */
    fun createHTMLDocument(title: String = definedExternally): Document
}
