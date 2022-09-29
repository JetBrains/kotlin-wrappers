// Automatically generated - do not modify!

package web.stream

sealed external interface TransformStreamDefaultController<O> {
    val desiredSize: Number?
    fun enqueue(chunk: O = definedExternally)
    fun error(reason: Any = definedExternally)
    fun terminate()
}
