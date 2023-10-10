// Automatically generated - do not modify!

@file:JsModule("@actions/http-client")

package actions.http.client

import js.promise.Promise
import node.buffer.Buffer

external class HttpClientResponse {
    constructor(message: node.http.IncomingMessage)

    var message: node.http.IncomingMessage
    fun readBody(): Promise<String>
    val readBodyBuffer: (() -> Promise<Buffer>)?
}
