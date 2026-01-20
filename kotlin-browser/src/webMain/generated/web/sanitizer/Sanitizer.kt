// Automatically generated - do not modify!

package web.sanitizer

import kotlin.js.definedExternally

/**
 * The **`Sanitizer`** interface of the HTML Sanitizer API defines a configuration object that specifies what elements, attributes and comments are allowed or should be removed when inserting strings of HTML into an Element or ShadowRoot, or when parsing an HTML string into a Document.
 */
open external class Sanitizer(
    configuration: SanitizerConfig = definedExternally,
) {
    constructor(configuration: SanitizerPresets)

    /**
     * The **`allowAttribute()`** method of the Sanitizer interface sets an attribute to be allowed on all elements when the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/allowAttribute)
     */
    fun allowAttribute(attribute: SanitizerAttribute): Boolean

    /**
     * The **`allowElement()`** method of the Sanitizer interface sets that the specified element is allowed in the output when the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/allowElement)
     */
    fun allowElement(element: SanitizerElementWithAttributes): Boolean

    /**
     * The **`get()`** method of the Sanitizer interface returns a SanitizerConfig dictionary instance that represents the current Sanitizer configuration.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/get)
     */
    fun get(): SanitizerConfig

    /**
     * The **`removeAttribute()`** method of the Sanitizer interface sets an attribute to be removed from all elements when the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeAttribute)
     */
    fun removeAttribute(attribute: SanitizerAttribute): Boolean

    /**
     * The **`removeElement()`** method of the Sanitizer interface sets the specified element be removed from the output when the sanitizer is used.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeElement)
     */
    fun removeElement(element: SanitizerElement): Boolean

    /**
     * The **`removeUnsafe()`** method of the Sanitizer interface configures the sanitizer configuration so that it will remove all elements, attributes, and event handler content attributes that are considered XSS-unsafe by the browser.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/removeUnsafe)
     */
    fun removeUnsafe(): Boolean

    /**
     * The **`replaceElementWithChildren()`** method of the Sanitizer interface sets an element to be replaced by its child HTML elements when the sanitizer is used. This is primarily used for stripping styles from text.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/replaceElementWithChildren)
     */
    fun replaceElementWithChildren(element: SanitizerElement): Boolean

    /**
     * The **`setComments()`** method of the Sanitizer interface sets whether comments will be allowed or removed by the sanitizer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/setComments)
     */
    fun setComments(allow: Boolean): Boolean

    /**
     * The **`setDataAttributes()`** method of the Sanitizer interface sets whether all data-* attributes will be allowed by the sanitizer, or if they must be individually specified.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Sanitizer/setDataAttributes)
     */
    fun setDataAttributes(allow: Boolean): Boolean
}
