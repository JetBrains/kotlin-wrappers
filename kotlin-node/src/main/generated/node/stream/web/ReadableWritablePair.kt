// Automatically generated - do not modify!

package node.stream.web

sealed external interface ReadableWritablePair<R, W> {
    var readable: ReadableStream<R>

    /**
     * Provides a convenient, chainable way of piping this readable stream
     * through a transform stream (or any other { writable, readable }
     * pair). It simply pipes the stream into the writable side of the
     * supplied pair, and returns the readable side for further use.
     *
     * Piping a stream will lock it for the duration of the pipe, preventing
     * any other consumer from acquiring a reader.
     */
    var writable: WritableStream<W>
}
