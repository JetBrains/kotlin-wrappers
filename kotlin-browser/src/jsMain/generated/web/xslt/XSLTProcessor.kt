// Automatically generated - do not modify!

package web.xslt

import web.dom.Document
import web.dom.DocumentFragment
import web.dom.Node

/**
 * An XSLTProcessor applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor)
 */
external class XSLTProcessor {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/clearParameters) */
    fun clearParameters()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/getParameter) */
    fun getParameter(
        namespaceURI: String?,
        localName: String,
    ): Any

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/importStylesheet) */
    fun importStylesheet(style: Node)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/removeParameter) */
    fun removeParameter(
        namespaceURI: String?,
        localName: String,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/reset) */
    fun reset()

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/setParameter) */
    fun setParameter(
        namespaceURI: String?,
        localName: String,
        value: Any?,
    )

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToDocument) */
    fun transformToDocument(source: Node): Document

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToFragment) */
    fun transformToFragment(
        source: Node,
        output: Document,
    ): DocumentFragment
}
