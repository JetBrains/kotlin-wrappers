// Automatically generated - do not modify!

package web.streams

sealed external interface TransformStreamDefaultController<O> {
    val desiredSize: Number?
    fun enqueue(chunk: O = definedExternally)
    fun error(reason: Any = definedExternally)
    fun terminate()
}
