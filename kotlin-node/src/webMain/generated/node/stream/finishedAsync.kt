// Automatically generated - do not modify!

@file:JsModule("node:stream/promises")

package node.stream

@JsName("finished")
external fun finishedAsync(
    stream: node.ReadableStream,
    options: FinishedOptions = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("finished")
external fun finishedAsync(
    stream: node.WritableStream,
    options: FinishedOptions = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("finished")
external fun finishedAsync(
    stream: node.ReadWriteStream,
    options: FinishedOptions = definedExternally,
): js.promise.Promise<js.core.Void>
