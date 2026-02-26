// Automatically generated - do not modify!

@file:JsModule("node:stream")

package node.stream

import node.events.EventEmitter

open external class Stream : EventEmitter {
    fun <T : node.WritableStream> pipe(
        destination: T,
        options: StreamPipeOptions = definedExternally,
    ): T

    fun <T : node.ReadableStream> compose(
        stream: T,
        options: StreamComposeOptions = definedExternally,
    ): T

    fun <T : node.ReadableStream> compose(
        stream: ComposeFnParam,
        options: StreamComposeOptions = definedExternally,
    ): T

    fun <T : node.ReadableStream> compose(
        stream: js.iterable.JsIterable<T>,
        options: StreamComposeOptions = definedExternally,
    ): T

    fun <T : node.ReadableStream> compose(
        stream: js.iterable.AsyncIterable<T>,
        options: StreamComposeOptions = definedExternally,
    ): T
// Stream
// streamPromises as promises
}
