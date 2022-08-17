// Automatically generated - do not modify!

package node.stream

@JsModule("node:stream")
@JsNonModule
open external class LegacyStream : node.events.EventEmitter {
    open fun <T : node.WritableStream> pipe(
        destination: T,
        options: Any /* {
        end?: boolean | undefined;
    }
 */ = definedExternally,
    ): T
}
