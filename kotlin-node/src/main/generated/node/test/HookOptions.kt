// Automatically generated - do not modify!

package node.test

import web.abort.AbortSignal

sealed external interface HookOptions {
    /**
     * Allows aborting an in-progress hook.
     */
    var signal: AbortSignal?

    /**
     * A number of milliseconds the hook will fail after. If unspecified, subtests inherit this
     * value from their parent.
     * @default Infinity
     */
    var timeout: Number?
}
