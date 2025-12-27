// Automatically generated - do not modify!

@file:JsModule("node:https")

package node.https

import node.stream.Duplex

/**
 * An `Agent` object for HTTPS similar to `http.Agent`. See {@link request} for more information.
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
