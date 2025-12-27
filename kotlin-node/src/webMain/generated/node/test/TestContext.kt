// Automatically generated - do not modify!

package node.test

import js.promise.Promise
import web.abort.AbortSignal

/**
 * An instance of `TestContext` is passed to each test function in order to
 * interact with the test runner. However, the `TestContext` constructor is not
 * exposed as part of the API.
 * @since v18.0.0, v16.17.0
 */
sealed external interface TestContext {
    /**
     * An object containing assertion methods bound to the test context.
     * The top-level functions from the `node:assert` module are exposed here for the purpose of creating test plans.
     *
     * **Note:** Some of the functions from `node:assert` contain type assertions. If these are called via the
     * TestContext `assert` object, then the context parameter in the test's function signature **must be explicitly typed**
     * (ie. the parameter must have a type annotation), otherwise an error will be raised by the TypeScript compiler:
     * ```ts
     * import { test, type TestContext } from 'node:test';
     *
     * // The test function's context parameter must have a type annotation.
     * test('example', (t: TestContext) => {
     *   t.assert.deepStrictEqual(actual, expected);
     * });
     *
     * // Omitting the type annotation will result in a compilation error.
     * test('example', t => {
     *   t.assert.deepStrictEqual(actual, expected); // Error: 't' needs an explicit type annotation.
     * });
     * ```
     * @since v22.2.0, v20.15.0
     */
    val assert: TestContextAssert
    val attempt: Double

    /**
     * This function is used to create a hook running before subtest of the current test.
     * @param fn The hook function. The first argument to this function is a `TestContext` object.
     * If the hook uses callbacks, the callback function is passed as the second argument.
     * @param options Configuration options for the hook.
     * @since v20.1.0, v18.17.0
     */
    fun before(
        fn: TestContextHookFn = definedExternally,
        options: HookOptions = definedExternally,
    )

    /**
     * This function is used to create a hook running before each subtest of the current test.
     * @param fn The hook function. The first argument to this function is a `TestContext` object.
     * If the hook uses callbacks, the callback function is passed as the second argument.
     * @param options Configuration options for the hook.
     * @since v18.8.0
     */
    fun beforeEach(
        fn: TestContextHookFn = definedExternally,
        options: HookOptions = definedExternally,
    )

    /**
     * This function is used to create a hook that runs after the current test finishes.
     * @param fn The hook function. The first argument to this function is a `TestContext` object.
     * If the hook uses callbacks, the callback function is passed as the second argument.
     * @param options Configuration options for the hook.
     * @since v18.13.0
     */
    fun after(
        fn: TestContextHookFn = definedExternally,
        options: HookOptions = definedExternally,
    )

    /**
     * This function is used to create a hook running after each subtest of the current test.
     * @param fn The hook function. The first argument to this function is a `TestContext` object.
     * If the hook uses callbacks, the callback function is passed as the second argument.
     * @param options Configuration options for the hook.
     * @since v18.8.0
     */
    fun afterEach(
        fn: TestContextHookFn = definedExternally,
        options: HookOptions = definedExternally,
    )

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
    fun diagnostic(message: String)

    /**
     * The absolute path of the test file that created the current test. If a test file imports
     * additional modules that generate tests, the imported tests will return the path of the root test file.
     * @since v22.6.0
     */
    val filePath: String?

    /**
     * The name of the test and each of its ancestors, separated by `>`.
     * @since v22.3.0
     */
    val fullName: String

    /**
     * The name of the test.
     * @since v18.8.0, v16.18.0
     */
    val name: String

    /**
     * This function is used to set the number of assertions and subtests that are expected to run
     * within the test. If the number of assertions and subtests that run does not match the
     * expected count, the test will fail.
     *
     * > Note: To make sure assertions are tracked, `t.assert` must be used instead of `assert` directly.
     *
     * ```js
     * test('top level test', (t) => {
     *   t.plan(2);
     *   t.assert.ok('some relevant assertion here');
     *   t.test('subtest', () => {});
     * });
     * ```
     *
     * When working with asynchronous code, the `plan` function can be used to ensure that the
     * correct number of assertions are run:
     *
     * ```js
     * test('planning with streams', (t, done) => {
     *   function* generate() {
     *     yield 'a';
     *     yield 'b';
     *     yield 'c';
     *   }
     *   const expected = ['a', 'b', 'c'];
     *   t.plan(expected.length);
     *   const stream = Readable.from(generate());
     *   stream.on('data', (chunk) => {
     *     t.assert.strictEqual(chunk, expected.shift());
     *   });
     *
     *   stream.on('end', () => {
     *     done();
     *   });
     * });
     * ```
     *
     * When using the `wait` option, you can control how long the test will wait for the expected assertions.
     * For example, setting a maximum wait time ensures that the test will wait for asynchronous assertions
     * to complete within the specified timeframe:
     *
     * ```js
     * test('plan with wait: 2000 waits for async assertions', (t) => {
     *   t.plan(1, { wait: 2000 }); // Waits for up to 2 seconds for the assertion to complete.
     *
     *   const asyncActivity = () => {
     *     setTimeout(() => {
     *          *       t.assert.ok(true, 'Async assertion completed within the wait time');
     *     }, 1000); // Completes after 1 second, within the 2-second wait time.
     *   };
     *
     *   asyncActivity(); // The test will pass because the assertion is completed in time.
     * });
     * ```
     *
     * Note: If a `wait` timeout is specified, it begins counting down only after the test function finishes executing.
     * @since v22.2.0
     */
    fun plan(
        count: Number,
        options: TestContextPlanOptions = definedExternally,
    )

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
    fun runOnly(shouldRunOnlyTests: Boolean)

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
    fun skip(message: String = definedExternally)

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
    fun todo(message: String = definedExternally)

    /**
     * This function is used to create subtests under the current test. This function behaves in
     * the same fashion as the top level {@link test} function.
     * @since v18.0.0
     * @param name The name of the test, which is displayed when reporting test results.
     * Defaults to the `name` property of `fn`, or `'<anonymous>'` if `fn` does not have a name.
     * @param options Configuration options for the test.
     * @param fn The function under test. This first argument to this function is a {@link TestContext} object.
     * If the test uses callbacks, the callback function is passed as the second argument.
     * @returns A {@link Promise} resolved with `undefined` once the test completes.
     */
    var test: Any // typeof test

    /**
     * This method polls a `condition` function until that function either returns
     * successfully or the operation times out.
     * @since v22.14.0
     * @param condition An assertion function that is invoked
     * periodically until it completes successfully or the defined polling timeout
     * elapses. Successful completion is defined as not throwing or rejecting. This
     * function does not accept any arguments, and is allowed to return any value.
     * @param options An optional configuration object for the polling operation.
     * @returns Fulfilled with the value returned by `condition`.
     */
    @JsName("waitFor")
    fun <T> waitForAsync(
        condition: () -> Promise<T>,
        options: TestContextWaitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T> waitFor(
        condition: () -> Promise<T>,
        options: TestContextWaitForOptions = definedExternally,
    ): T

    /**
     * Each test provides its own MockTracker instance.
     */
    val mock: MockTracker
}
