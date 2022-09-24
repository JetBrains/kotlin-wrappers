// Automatically generated - do not modify!

package node.test

import kotlinx.js.ReadonlyArray
import node.AbortSignal

sealed external interface RunOptions {
    /**
     * @default false
     */
    var concurrency: Any? /* number | boolean */

    /**
     * An array containing the list of files to run. If unspecified, the test runner execution model will be used.
     */
    var files: ReadonlyArray<String>?

    /**
     * Allows aborting an in-progress test.
     * @default undefined
     */
    var signal: AbortSignal?

    /**
     * A number of milliseconds the test will fail after. If unspecified, subtests inherit this
     * value from their parent.
     * @default Infinity
     */
    var timeout: Number?
}
