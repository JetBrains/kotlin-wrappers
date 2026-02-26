// Automatically generated - do not modify!

package node.test

/**
 * Configuration options for hooks.
 * @since v18.8.0
 */
sealed external interface HookOptions {
    /**
     * Allows aborting an in-progress hook.
     */
    var signal: web.abort.AbortSignal?

    /**
     * A number of milliseconds the hook will fail after. If unspecified, subtests inherit this
     * value from their parent.
     * @default Infinity
     */
    var timeout: Double?
}
