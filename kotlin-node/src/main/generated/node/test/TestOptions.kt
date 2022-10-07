// Automatically generated - do not modify!

package node.test

import web.abort.AbortSignal

sealed external interface TestOptions {
    /**
     * The number of tests that can be run at the same time. If unspecified, subtests inherit this
     * value from their parent.
     * @default 1
     */
    var concurrency: Number?

    /**
     * If truthy, and the test context is configured to run `only` tests, then this test will be
     * run. Otherwise, the test is skipped.
     * @default false
     */
    var only: Boolean?

    /**
     * Allows aborting an in-progress test.
     * @since v18.8.0
     */
    var signal: AbortSignal?

    /**
     * If truthy, the test is skipped. If a string is provided, that string is displayed in the
     * test results as the reason for skipping the test.
     * @default false
     */
    var skip: Any? /* boolean | string */

    /**
     * A number of milliseconds the test will fail after. If unspecified, subtests inherit this
     * value from their parent.
     * @default Infinity
     * @since v18.7.0
     */
    var timeout: Number?

    /**
     * If truthy, the test marked as `TODO`. If a string is provided, that string is displayed in
     * the test results as the reason why the test is `TODO`.
     * @default false
     */
    var todo: Any? /* boolean | string */
}
