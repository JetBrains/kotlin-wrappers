// Generated by Karakum - do not modify it manually!


package node.stream


sealed external interface ReadableOptions : StreamOptions<Stream /* Readable */> {
    var encoding: node.buffer.BufferEncoding?
    fun read(/* this: Readable, */ size: Number): Unit
}