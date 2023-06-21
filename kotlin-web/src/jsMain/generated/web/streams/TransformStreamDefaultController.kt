// Automatically generated - do not modify!

package web.streams

sealed external class TransformStreamDefaultController<O> {
    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/desiredSize) */
    val desiredSize: Int?

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/enqueue) */
    fun enqueue(chunk: O = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/error) */
    fun error(reason: Any? = definedExternally)

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/TransformStreamDefaultController/terminate) */
    fun terminate()
}
