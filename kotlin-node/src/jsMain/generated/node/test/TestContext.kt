// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import web.abort.AbortSignal

/**
 * An instance of `TestContext` is passed to each test function in order to
 * interact with the test runner. However, the `TestContext` constructor is not
 * exposed as part of the API.
 * @since v18.0.0, v16.17.0
 */
external class TestContext {
    /**
     * This function is used to create a hook running before subtest of the current test.
     * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. **Default:** A no-op function.
     * @param options Configuration options for the hook.
     * @since v20.1.0
     */
    var before: (fn: HookFn? /* use undefined for default */, options: HookOptions? /* use undefined for default */) -> Unit

    /**
     * This function is used to create a hook running before each subtest of the current test.
     * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. **Default:** A no-op function.
     * @param options Configuration options for the hook.
     * @since v18.8.0
     */
    var beforeEach: (fn: HookFn? /* use undefined for default */, options: HookOptions? /* use undefined for default */) -> Unit

    /**
     * This function is used to create a hook that runs after the current test finishes.
     * @param [fn='A no-op function'] The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. Default: A no-op function.
     * @param options Configuration options for the hook.
     * @since v18.13.0
     */
    var after: (fn: HookFn? /* use undefined for default */, options: HookOptions? /* use undefined for default */) -> Unit

    /**
     * This function is used to create a hook running after each subtest of the current test.
     * @param fn The hook function. If the hook uses callbacks, the callback function is passed as
     *    the second argument. **Default:** A no-op function.
     * @param options Configuration options for the hook.
     * @since v18.8.0
     */
    var afterEach: (fn: HookFn? /* use undefined for default */, options: HookOptions? /* use undefined for default */) -> Unit

    /**
     * This function is used to write diagnostics to the output. Any diagnostic
     * information is included at the end of the test's results. This function does
     * not return a value.
     *
     * ```js
     * test('top level test', (t) => {
     *   t.diagnostic('A diagnostic message');
     * });
     * ```
     * @since v18.0.0, v16.17.0
     * @param message Message to be reported.
     */
    fun diagnostic(message: String): Unit

    /**
     * The name of the test.
     * @since v18.8.0, v16.18.0
     */
    val name: String

    /**
     * If `shouldRunOnlyTests` is truthy, the test context will only run tests that
     * have the `only` option set. Otherwise, all tests are run. If Node.js was not
     * started with the `--test-only` command-line option, this function is a
     * no-op.
     *
     * ```js
     * test('top level test', (t) => {
     *   // The test context can be set to run subtests with the 'only' option.
     *   t.runOnly(true);
     *   return Promise.all([
     *     t.test('this subtest is now skipped'),
     *     t.test('this subtest is run', { only: true }),
     *   ]);
     * });
     * ```
     * @since v18.0.0, v16.17.0
     * @param shouldRunOnlyTests Whether or not to run `only` tests.
     */
    fun runOnly(shouldRunOnlyTests: Boolean): Unit

    /**
     * ```js
     * test('top level test', async (t) => {
     *   await fetch('some/uri', { signal: t.signal });
     * });
     * ```
     * @since v18.7.0, v16.17.0
     */
    val signal: AbortSignal

    /**
     * This function causes the test's output to indicate the test as skipped. If `message` is provided, it is included in the output. Calling `skip()` does
     * not terminate execution of the test function. This function does not return a
     * value.
     *
     * ```js
     * test('top level test', (t) => {
     *   // Make sure to return here as well if the test contains additional logic.
     *   t.skip('this is skipped');
     * });
     * ```
     * @since v18.0.0, v16.17.0
     * @param message Optional skip message.
     */
    fun skip(message: String = definedExternally): Unit

    /**
     * This function adds a `TODO` directive to the test's output. If `message` is
     * provided, it is included in the output. Calling `todo()` does not terminate
     * execution of the test function. This function does not return a value.
     *
     * ```js
     * test('top level test', (t) => {
     *   // This test is marked as `TODO`
     *   t.todo('this is a todo');
     * });
     * ```
     * @since v18.0.0, v16.17.0
     * @param message Optional `TODO` message.
     */
    fun todo(message: String = definedExternally): Unit

    /**
     * This function is used to create subtests under the current test. This function behaves in
     * the same fashion as the top level {@link test} function.
     * @since v18.0.0
     * @param name The name of the test, which is displayed when reporting test results.
     *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
     * @param options Configuration options for the test
     * @param fn The function under test. This first argument to this function is a
     *    {@link TestContext} object. If the test uses callbacks, the callback function is
     *    passed as the second argument. **Default:** A no-op function.
     * @returns A {@link Promise} resolved with `undefined` once the test completes.
     */
    var test: Any?

    /**
     * Each test provides its own MockTracker instance.
     */
    val mock: MockTracker
}
