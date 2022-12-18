// Automatically generated - do not modify!

package serviceworkers

import js.core.ReadonlyArray
import web.messaging.StructuredSerializeOptions
import web.messaging.Transferable

sealed external class Client {
    val frameType: FrameType
    val id: String
    val type: ClientTypes
    val url: String
    fun postMessage(
        message: Any?,
        transfer: ReadonlyArray<Transferable>,
    )

    fun postMessage(
        message: Any?,
        options: StructuredSerializeOptions = definedExternally,
    )
}
