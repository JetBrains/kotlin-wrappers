// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise

external suspend fun digestForStream(stream: node.ReadableStream): StreamDigest

@JsName("digestForStream")
external fun digestForStreamAsync(stream: node.ReadableStream): Promise<StreamDigest>
