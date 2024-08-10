// Automatically generated - do not modify!

package web.components

import web.dom.DocumentFragment
import web.html.HTMLElement

/**
 * Enables access to the contents of an HTML <template> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement)
 */
open external class HTMLTemplateElement
protected constructor() :
    HTMLElement {
    /**
     * Returns the template contents (a DocumentFragment).
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/content)
     */
    val content: DocumentFragment

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootClonable)
     */
    var shadowRootClonable: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootDelegatesFocus)
     */
    var shadowRootDelegatesFocus: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootMode)
     */
    var shadowRootMode: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootSerializable)
     */
    var shadowRootSerializable: Boolean
}
