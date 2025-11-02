// Automatically generated - do not modify!

package web.xslt

import web.dom.Document
import web.dom.DocumentFragment
import web.dom.Node
import kotlin.js.JsAny

/**
 * An **`XSLTProcessor`** applies an XSLT stylesheet transformation to an XML document to produce a new XML document as output. It has methods to load the XSLT stylesheet, to manipulate <xsl:param> parameter values, and to apply the transformation to documents.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor)
 */
open external class XSLTProcessor {
    /**
     * The **`clearParameters()`** method of the XSLTProcessor interface removes all parameters (<xsl:param>) and their values from the stylesheet imported in the processor. The XSLTProcessor will then use the default values specified in the XSLT stylesheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/clearParameters)
     */
    fun clearParameters()

    /**
     * The **`getParameter()`** method of the XSLTProcessor interface returns the value of a parameter (<xsl:param>) from the stylesheet imported in the processor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/getParameter)
     */
    fun getParameter(
        namespaceURI: String?,
        localName: String,
    ): JsAny?

    /**
     * The **`importStylesheet()`** method of the XSLTProcessor interface imports an XSLT stylesheet for the processor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/importStylesheet)
     */
    fun importStylesheet(style: Node)

    /**
     * The **`removeParameter()`** method of the XSLTProcessor interface removes the parameter (<xsl:param>) and its value from the stylesheet imported in the processor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/removeParameter)
     */
    fun removeParameter(
        namespaceURI: String?,
        localName: String,
    )

    /**
     * The **`reset()`** method of the XSLTProcessor interface removes all parameters (<xsl:param>) and the XSLT stylesheet from the processor. The XSLTProcessor will then be in its original state when it was created.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/reset)
     */
    fun reset()

    /**
     * The **`setParameter()`** method of the XSLTProcessor interface sets the value of a parameter (<xsl:param>) in the stylesheet imported in the processor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/setParameter)
     */
    fun setParameter(
        namespaceURI: String?,
        localName: String,
        value: JsAny?,
    )

    /**
     * The **`transformToDocument()`** method of the XSLTProcessor interface transforms the provided Node source to a Document using the XSLT stylesheet associated with XSLTProcessor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToDocument)
     */
    fun transformToDocument(source: Node): Document

    /**
     * The **`transformToFragment()`** method of the XSLTProcessor interface transforms a provided Node source to a DocumentFragment using the XSLT stylesheet associated with the XSLTProcessor.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/XSLTProcessor/transformToFragment)
     */
    fun transformToFragment(
        source: Node,
        output: Document,
    ): DocumentFragment
}
