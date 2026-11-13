// Automatically generated - do not modify!

package web.cssom

/**
 * An object implementing the **`StyleSheet`** interface represents a single style sheet. CSS style sheets will further implement the more specialized CSSStyleSheet interface.
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
    open var disabled: Boolean

    /**
     * The **`href`** property of the StyleSheet interface returns the location of the style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href)
     */
    open val href: String?

    /**
     * The read-only **`media`** property of the StyleSheet interface contains a MediaList object representing the intended destination media for style information.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media)
     */
    open val media: MediaList

    /**
     * The **`ownerNode`** read-only property of the StyleSheet interface returns the node that associates this style sheet with the document.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode)
     */
    open val ownerNode: JsAny /* Element | ProcessingInstruction */?

    /**
     * The **`parentStyleSheet`** read-only property of the StyleSheet interface returns the style sheet, if any, that is including the given style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet)
     */
    open val parentStyleSheet: CSSStyleSheet?

    /**
     * The **`title`** read-only property of the StyleSheet interface returns the advisory title of the current style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title)
     */
    open val title: String?

    /**
     * The **`type`** read-only property of the StyleSheet interface specifies the style sheet language for the given style sheet.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type)
     */
    open val type: String
}
