// Automatically generated - do not modify!

package node.childProcess

import node.events.Abortable

sealed external interface MessagingOptions : Abortable {
    /**
     * Specify the kind of serialization used for sending messages between processes.
     * @default 'json'
     */
    var serialization: SerializationType?

    /**
     * The signal value to be used when the spawned process will be killed by the abort signal.
     * @default 'SIGTERM'
     */
    var killSignal: Any? /* NodeJS.Signals | number */

    /**
     * In milliseconds the maximum amount of time the process is allowed to run.
     */
    var timeout: Number?
}
