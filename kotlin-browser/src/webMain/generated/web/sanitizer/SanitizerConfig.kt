// Automatically generated - do not modify!

package web.sanitizer

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig)
 */
@JsPlainObject
external interface SanitizerConfig {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#attributes)
     */
    var attributes: ReadonlyArray<SanitizerAttribute>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#comments)
     */
    var comments: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#dataAttributes)
     */
    var dataAttributes: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#elements)
     */
    var elements: ReadonlyArray<SanitizerElementWithAttributes>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#processingInstructions)
     */
    var processingInstructions: ReadonlyArray<SanitizerPI>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#removeAttributes)
     */
    var removeAttributes: ReadonlyArray<SanitizerAttribute>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#removeElements)
     */
    var removeElements: ReadonlyArray<SanitizerElement>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#removeProcessingInstructions)
     */
    var removeProcessingInstructions: ReadonlyArray<SanitizerPI>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#replaceWithChildrenElements)
     */
    var replaceWithChildrenElements: ReadonlyArray<SanitizerElement>?
}
