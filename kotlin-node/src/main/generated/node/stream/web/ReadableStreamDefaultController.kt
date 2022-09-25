// Automatically generated - do not modify!

package node.stream.web

sealed external interface ReadableStreamDefaultController<R> {
    val desiredSize: Number?
    fun close()
    fun enqueue(chunk: R = definedExternally)
    fun error(e: Any = definedExternally)
}
