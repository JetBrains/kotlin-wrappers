// Automatically generated - do not modify!

package node.stream

import node.PipeOptions

@JsModule("node:stream")
@JsNonModule
open external class LegacyStream : node.events.EventEmitter {
    open fun <T : node.WritableStream> pipe(
        destination: T,
        options: PipeOptions = definedExternally,
    ): T
}
