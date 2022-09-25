// Automatically generated - do not modify!

package node.stream.web

sealed external interface TransformStreamDefaultController<O> {
    val desiredSize: Number?
    fun enqueue(chunk: O = definedExternally)
    fun error(reason: Any = definedExternally)
    fun terminate()
}
