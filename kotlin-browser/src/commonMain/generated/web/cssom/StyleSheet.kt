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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/disabled)
     */
    var disabled: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/href)
     */
    val href: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/media)
     */
    val media: MediaList

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/ownerNode)
     */
    val ownerNode: JsAny /* Element | ProcessingInstruction */?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/parentStyleSheet)
     */
    val parentStyleSheet: CSSStyleSheet?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/title)
     */
    val title: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/StyleSheet/type)
     */
    val type: String
}
