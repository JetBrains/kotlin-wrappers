// Automatically generated - do not modify!

@file:JsModule("node:stream/promises")
@file:JsNonModule

package node.stream

import js.core.Void
import kotlin.js.Promise

@JsName("finished")
external fun finishedAsync(
    stream: Any, /* NodeJS.ReadableStream | NodeJS.WritableStream | NodeJS.ReadWriteStream */
    options: FinishedOptions = definedExternally,
): Promise<Void>
