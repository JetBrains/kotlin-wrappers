// Automatically generated - do not modify!

@file:JsModule("node:https")

package node.https

import node.stream.Duplex

/**
 * An `Agent` object for HTTPS similar to `http.Agent`. See {@link request} for more information.
 *
 * Like `http.Agent`, the `createConnection(options[, callback])` method can be overridden to customize
 * how TLS connections are established.
 *
 * > See [`agent.createConnection()`](https://nodejs.org/docs/latest-v24.x/api/http.html#agentcreateconnectionoptions-callback)
 * for details on overriding this method, including asynchronous socket creation with a callback.
 * @since v0.4.5
 */
external class Agent : node.http.Agent {
    constructor (options: AgentOptions = definedExternally)

    var options: AgentOptions

    fun createConnection(
        options: RequestOptions,
        callback: (err: js.errors.JsError?, stream: Duplex) -> Unit = definedExternally,
    ): Duplex?

    fun getName(options: RequestOptions = definedExternally): String
}
