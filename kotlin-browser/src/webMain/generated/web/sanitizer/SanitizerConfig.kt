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
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#dataattributes)
     */
    var dataAttributes: Boolean?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#elements)
     */
    var elements: ReadonlyArray<SanitizerElementWithAttributes>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#processinginstructions)
     */
    var processingInstructions: ReadonlyArray<SanitizerPI>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#removeattributes)
     */
    var removeAttributes: ReadonlyArray<SanitizerAttribute>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#removeelements)
     */
    var removeElements: ReadonlyArray<SanitizerElement>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#removeprocessinginstructions)
     */
    var removeProcessingInstructions: ReadonlyArray<SanitizerPI>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/SanitizerConfig#replacewithchildrenelements)
     */
    var replaceWithChildrenElements: ReadonlyArray<SanitizerElement>?
}
