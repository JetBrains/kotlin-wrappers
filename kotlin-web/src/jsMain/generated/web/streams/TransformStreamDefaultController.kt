// Automatically generated - do not modify!

package web.streams

import js.errors.JsError

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController)
 */
external class TransformStreamDefaultController<O>
private constructor() {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/desiredSize)
     */
    val desiredSize: Double?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/enqueue)
     */
    fun enqueue(chunk: O = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/error)
     */
    fun error(reason: JsError? = definedExternally)

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/terminate)
     */
    fun terminate()
}
