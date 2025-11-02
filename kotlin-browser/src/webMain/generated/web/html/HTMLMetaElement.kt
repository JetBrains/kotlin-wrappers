// Automatically generated - do not modify!

package web.html

import web.cssom.MediaQuery

/**
 * The **`HTMLMetaElement`** interface contains descriptive metadata about a document provided in HTML as <meta> elements. This interface inherits all of the properties and methods described in the HTMLElement interface.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement)
 */
open external class HTMLMetaElement
protected constructor() :
    HTMLElement {
    /**
     * The **`HTMLMetaElement.content`** property gets or sets the content attribute of pragma directives and named <meta> data in conjunction with HTMLMetaElement.name or HTMLMetaElement.httpEquiv. For more information, see the content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/content)
     */
    var content: String

    /**
     * The **`HTMLMetaElement.httpEquiv`** property gets or sets the pragma directive or an HTTP response header name for the HTMLMetaElement.content attribute. For more details on the possible values, see the http-equiv attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/httpEquiv)
     */
    var httpEquiv: String

    /**
     * The **`HTMLMetaElement.media`** property enables specifying the media for theme-color metadata.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/media)
     */
    var media: MediaQuery

    /**
     * The **`HTMLMetaElement.name`** property is used in combination with HTMLMetaElement.content to define the name-value pairs for the metadata of a document. The name attribute defines the metadata name and the content attribute defines the value.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLMetaElement/name)
     */
    var name: String
}
