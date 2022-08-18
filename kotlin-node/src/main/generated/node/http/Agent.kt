// Automatically generated - do not modify!

@file:JsModule("node:http")
@file:JsNonModule

package node.http

import kotlinx.js.ReadonlyArray
import node.ReadOnlyDict
import node.net.Socket

external class Agent {
    /**
     * By default set to 256\. For agents with `keepAlive` enabled, this
     * sets the maximum number of sockets that will be left open in the free
     * state.
     * @since v0.11.7
     */
    var maxFreeSockets: Number

    /**
     * By default set to `Infinity`. Determines how many concurrent sockets the agent
     * can have open per origin. Origin is the returned value of `agent.getName()`.
     * @since v0.3.6
     */
    var maxSockets: Number

    /**
     * By default set to `Infinity`. Determines how many concurrent sockets the agent
     * can have open. Unlike `maxSockets`, this parameter applies across all origins.
     * @since v14.5.0, v12.19.0
     */
    var maxTotalSockets: Number

    /**
     * An object which contains arrays of sockets currently awaiting use by
     * the agent when `keepAlive` is enabled. Do not modify.
     *
     * Sockets in the `freeSockets` list will be automatically destroyed and
     * removed from the array on `'timeout'`.
     * @since v0.11.4
     */
    val freeSockets: ReadOnlyDict<ReadonlyArray<Socket>>

    /**
     * An object which contains arrays of sockets currently in use by the
     * agent. Do not modify.
     * @since v0.3.6
     */
    val sockets: ReadOnlyDict<ReadonlyArray<Socket>>

    /**
     * An object which contains queues of requests that have not yet been assigned to
     * sockets. Do not modify.
     * @since v0.5.9
     */
    val requests: ReadOnlyDict<ReadonlyArray<IncomingMessage>>

    constructor(opts: AgentOptions = definedExternally)

    /**
     * Destroy any sockets that are currently in use by the agent.
     *
     * It is usually not necessary to do this. However, if using an
     * agent with `keepAlive` enabled, then it is best to explicitly shut down
     * the agent when it is no longer needed. Otherwise,
     * sockets might stay open for quite a long time before the server
     * terminates them.
     * @since v0.11.4
     */
    fun destroy()
}
