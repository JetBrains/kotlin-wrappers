// Automatically generated - do not modify!

package web.cssom

import js.core.JsAny

/**
 * An object implementing the `StyleSheet` interface represents a single style sheet.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet)
 */
open external class StyleSheet
private constructor() {
    /**
     * The **`disabled`** property of the StyleSheet interface determines whether the style sheet is prevented from applying to the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled)
     */
    var disabled: Boolean

    /**
     * The **`href`** property of the StyleSheet interface returns the location of the style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href)
     */
    val href: String?

    /**
     * The **`media`** property of the StyleSheet interface specifies the intended destination media for style information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media)
     */
    val media: MediaList

    /**
     * The **`ownerNode`** property of the StyleSheet interface returns the node that associates this style sheet with the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode)
     */
    val ownerNode: JsAny /* Element | ProcessingInstruction */?

    /**
     * The **`parentStyleSheet`** property of the StyleSheet interface returns the style sheet, if any, that is including the given style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet)
     */
    val parentStyleSheet: CSSStyleSheet?

    /**
     * The **`title`** property of the StyleSheet interface returns the advisory title of the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title)
     */
    val title: String?

    /**
     * The **`type`** property of the StyleSheet interface specifies the style sheet language for the given style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type)
     */
    val type: String
}
