// Automatically generated - do not modify!

package node.workerThreads

@seskar.js.JsAsync
external suspend fun postMessageToThread(
    threadId: Number,
    value: Any?,
    timeout: Number = definedExternally,
): js.void.Void

@seskar.js.JsAsync
external suspend fun postMessageToThread(
    threadId: Number,
    value: Any?,
    transferList: js.array.ReadonlyArray<Transferable>,
    timeout: Number = definedExternally,
): js.void.Void
