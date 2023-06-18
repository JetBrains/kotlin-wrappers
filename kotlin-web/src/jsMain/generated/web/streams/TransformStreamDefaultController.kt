// Automatically generated - do not modify!

package web.streams

sealed external class TransformStreamDefaultController<O> {
    val desiredSize: Int?
    fun enqueue(chunk: O = definedExternally)
    fun error(reason: Any? = definedExternally)
    fun terminate()
}
