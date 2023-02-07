// Automatically generated - do not modify!

package node.test

import js.core.ReadonlyArray
import web.abort.AbortSignal

sealed external interface RunOptions {
    /**
     * If a number is provided, then that many files would run in parallel.
     * If truthy, it would run (number of cpu cores - 1) files in parallel.
     * If falsy, it would only run one file at a time.
     * If unspecified, subtests inherit this value from their parent.
     * @default true
     */
    var concurrency: Any? /* number | boolean */

    /**
     * An array containing the list of files to run.
     * If unspecified, the test runner execution model will be used.
     */
    var files: ReadonlyArray<String>?

    /**
     * Allows aborting an in-progress test execution.
     * @default undefined
     */
    var signal: AbortSignal?

    /**
     * A number of milliseconds the test will fail after.
     * If unspecified, subtests inherit this value from their parent.
     * @default Infinity
     */
    var timeout: Number?

    /**
     * Sets inspector port of test child process.
     * If a nullish value is provided, each process gets its own port,
     * incremented from the primary's `process.debugPort`.
     */
    var inspectPort: Any? /* number | (() => number) */
}
