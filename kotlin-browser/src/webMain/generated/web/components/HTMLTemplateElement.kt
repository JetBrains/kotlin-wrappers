// Automatically generated - do not modify!

package web.components

import web.dom.DocumentFragment
import web.html.HTMLElement

/**
 * The **`HTMLTemplateElement`** interface enables access to the contents of an HTML <template> element.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement)
 */
open external class HTMLTemplateElement
protected constructor() :
    HTMLElement {
    /**
     * The **`content`** property of the HTMLTemplateElement interface returns the <template> element's template contents as a DocumentFragment. This content's ownerDocument is a separate Document from the one that contains the <template> element itself — unless the containing document is itself constructed for the purpose of holding template content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/content)
     */
    val content: DocumentFragment

    /**
     * The **`shadowRootClonable`** property reflects the value of the shadowrootclonable attribute of the associated <template> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootClonable)
     */
    var shadowRootClonable: Boolean
    var shadowRootCustomElementRegistry: String

    /**
     * The **`shadowRootDelegatesFocus`** property of the HTMLTemplateElement interface reflects the value of the shadowrootdelegatesfocus attribute of the associated <template> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootDelegatesFocus)
     */
    var shadowRootDelegatesFocus: Boolean

    /**
     * The **`shadowRootMode`** property of the HTMLTemplateElement interface reflects the value of the shadowrootmode attribute of the associated <template> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootMode)
     */
    var shadowRootMode: String

    /**
     * The **`shadowRootSerializable`** property reflects the value of the shadowrootserializable attribute of the associated <template> element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLTemplateElement/shadowRootSerializable)
     */
    var shadowRootSerializable: Boolean
}
