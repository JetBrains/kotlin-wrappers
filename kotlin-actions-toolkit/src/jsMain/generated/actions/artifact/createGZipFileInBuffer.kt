// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import node.buffer.Buffer
import seskar.js.JsAsync

@JsAsync
external suspend fun createGZipFileInBuffer(originalFilePath: String): Buffer

@JsName("createGZipFileInBuffer")
external fun createGZipFileInBufferAsync(originalFilePath: String): Promise<Buffer>
