// Automatically generated - do not modify!

package web.streams

sealed external interface ReadableStreamDefaultController<R> {
    val desiredSize: Number?
    fun close()
    fun enqueue(chunk: R = definedExternally)
    fun error(e: Any = definedExternally)
}
