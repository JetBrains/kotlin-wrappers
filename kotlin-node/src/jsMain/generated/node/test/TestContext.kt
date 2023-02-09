// Automatically generated - do not modify!

package node.test

import js.core.Void
import web.abort.AbortSignal
import kotlin.js.Promise

sealed external interface TestContext {
    /**
     * This function is used to create a hook running before each subtest of the current test.
     * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. Default: A no-op function.
     * @param options Configuration options for the hook.
     * @since v18.8.0
     */
    var beforeEach: (
        fn: HookFn,
        options: HookOptions,
    ) -> Unit /* typeof beforeEach */

    /**
     * This function is used to create a hook that runs after the current test finishes.
     * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. Default: A no-op function.
     * @param options Configuration options for the hook.
     * @since v18.13.0
     */
    var after: (
        fn: HookFn,
        options: HookOptions,
    ) -> Unit /* typeof after */

    /**
     * This function is used to create a hook running after each subtest of the current test.
     * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. Default: A no-op function.
     * @param options Configuration options for the hook.
     * @since v18.8.0
     */
    var afterEach: (
        fn: HookFn,
        options: HookOptions,
    ) -> Unit /* typeof afterEach */

    /**
     * This function is used to write TAP diagnostics to the output. Any diagnostic information is
     * included at the end of the test's results. This function does not return a value.
     * @param message Message to be displayed as a TAP diagnostic.
     * @since v18.0.0
     */
    fun diagnostic(message: String)

    /**
     * The name of the test.
     * @since v18.8.0
     */
    val name: String

    /**
     * If `shouldRunOnlyTests` is truthy, the test context will only run tests that have the `only`
     * option set. Otherwise, all tests are run. If Node.js was not started with the `--test-only`
     * command-line option, this function is a no-op.
     * @param shouldRunOnlyTests Whether or not to run `only` tests.
     * @since v18.0.0
     */
    fun runOnly(shouldRunOnlyTests: Boolean)

    /**
     * Can be used to abort test subtasks when the test has been aborted.
     * @since v18.7.0
     */
    val signal: AbortSignal

    /**
     * This function causes the test's output to indicate the test as skipped. If `message` is
     * provided, it is included in the TAP output. Calling `skip()` does not terminate execution of
     * the test function. This function does not return a value.
     * @param message Optional skip message to be displayed in TAP output.
     * @since v18.0.0
     */
    fun skip(message: String = definedExternally)

    /**
     * This function adds a `TODO` directive to the test's output. If `message` is provided, it is
     * included in the TAP output. Calling `todo()` does not terminate execution of the test
     * function. This function does not return a value.
     * @param message Optional `TODO` message to be displayed in TAP output.
     * @since v18.0.0
     */
    fun todo(message: String = definedExternally)

    /**
     * This function is used to create subtests under the current test. This function behaves in
     * the same fashion as the top level {@link test} function.
     * @since v18.0.0
     * @param name The name of the test, which is displayed when reporting test results.
     *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
     * @param options Configuration options for the test
     * @param fn The function under test. This first argument to this function is a
     *    {@link TestContext} object. If the test uses callbacks, the callback function is
     *    passed as the second argument. Default: A no-op function.
     * @returns A {@link Promise} resolved with `undefined` once the test completes.
     */
    var test: Function<Promise<Void>> /* typeof test */
}
