// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsNonModule

package node.test

import kotlinx.js.Void
import kotlin.js.Promise

/**
 * The `test()` function is the value imported from the test module. Each invocation of this
 * function results in the creation of a test point in the TAP output.
 *
 * The {@link TestContext} object passed to the fn argument can be used to perform actions
 * related to the current test. Examples include skipping the test, adding additional TAP
 * diagnostic information, or creating subtests.
 *
 * `test()` returns a {@link Promise} that resolves once the test completes. The return value
 * can usually be discarded for top level tests. However, the return value from subtests should
 * be used to prevent the parent test from finishing first and cancelling the subtest as shown
 * in the following example.
 *
 * ```js
 * test('top level test', async (t) => {
 *   // The setTimeout() in the following subtest would cause it to outlive its
 *   // parent test if 'await' is removed on the next line. Once the parent test
 *   // completes, it will cancel any outstanding subtests.
 *   await t.test('longer running subtest', async (t) => {
 *     return new Promise((resolve, reject) => {
 *       setTimeout(resolve, 1000);
 *     });
 *   });
 * });
 * ```
 * @since v18.0.0
 * @param name The name of the test, which is displayed when reporting test results.
 *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
 * @param options Configuration options for the test
 * @param fn The function under test. The first argument to this function is a
 *    {@link TestContext} object. If the test uses callbacks, the callback function is
 *    passed as the second argument. Default: A no-op function.
 * @returns A {@link Promise} resolved with `undefined` once the test completes.
 */
@JsName("test")
external fun testAsync(
    name: String = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Void>


/**
 * The `test()` function is the value imported from the test module. Each invocation of this
 * function results in the creation of a test point in the TAP output.
 *
 * The {@link TestContext} object passed to the fn argument can be used to perform actions
 * related to the current test. Examples include skipping the test, adding additional TAP
 * diagnostic information, or creating subtests.
 *
 * `test()` returns a {@link Promise} that resolves once the test completes. The return value
 * can usually be discarded for top level tests. However, the return value from subtests should
 * be used to prevent the parent test from finishing first and cancelling the subtest as shown
 * in the following example.
 *
 * ```js
 * test('top level test', async (t) => {
 *   // The setTimeout() in the following subtest would cause it to outlive its
 *   // parent test if 'await' is removed on the next line. Once the parent test
 *   // completes, it will cancel any outstanding subtests.
 *   await t.test('longer running subtest', async (t) => {
 *     return new Promise((resolve, reject) => {
 *       setTimeout(resolve, 1000);
 *     });
 *   });
 * });
 * ```
 * @since v18.0.0
 * @param name The name of the test, which is displayed when reporting test results.
 *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
 * @param options Configuration options for the test
 * @param fn The function under test. The first argument to this function is a
 *    {@link TestContext} object. If the test uses callbacks, the callback function is
 *    passed as the second argument. Default: A no-op function.
 * @returns A {@link Promise} resolved with `undefined` once the test completes.
 */
@JsName("test")
external fun testAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Void>


/**
 * The `test()` function is the value imported from the test module. Each invocation of this
 * function results in the creation of a test point in the TAP output.
 *
 * The {@link TestContext} object passed to the fn argument can be used to perform actions
 * related to the current test. Examples include skipping the test, adding additional TAP
 * diagnostic information, or creating subtests.
 *
 * `test()` returns a {@link Promise} that resolves once the test completes. The return value
 * can usually be discarded for top level tests. However, the return value from subtests should
 * be used to prevent the parent test from finishing first and cancelling the subtest as shown
 * in the following example.
 *
 * ```js
 * test('top level test', async (t) => {
 *   // The setTimeout() in the following subtest would cause it to outlive its
 *   // parent test if 'await' is removed on the next line. Once the parent test
 *   // completes, it will cancel any outstanding subtests.
 *   await t.test('longer running subtest', async (t) => {
 *     return new Promise((resolve, reject) => {
 *       setTimeout(resolve, 1000);
 *     });
 *   });
 * });
 * ```
 * @since v18.0.0
 * @param name The name of the test, which is displayed when reporting test results.
 *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
 * @param options Configuration options for the test
 * @param fn The function under test. The first argument to this function is a
 *    {@link TestContext} object. If the test uses callbacks, the callback function is
 *    passed as the second argument. Default: A no-op function.
 * @returns A {@link Promise} resolved with `undefined` once the test completes.
 */
@JsName("test")
external fun testAsync(
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<Void>


/**
 * The `test()` function is the value imported from the test module. Each invocation of this
 * function results in the creation of a test point in the TAP output.
 *
 * The {@link TestContext} object passed to the fn argument can be used to perform actions
 * related to the current test. Examples include skipping the test, adding additional TAP
 * diagnostic information, or creating subtests.
 *
 * `test()` returns a {@link Promise} that resolves once the test completes. The return value
 * can usually be discarded for top level tests. However, the return value from subtests should
 * be used to prevent the parent test from finishing first and cancelling the subtest as shown
 * in the following example.
 *
 * ```js
 * test('top level test', async (t) => {
 *   // The setTimeout() in the following subtest would cause it to outlive its
 *   // parent test if 'await' is removed on the next line. Once the parent test
 *   // completes, it will cancel any outstanding subtests.
 *   await t.test('longer running subtest', async (t) => {
 *     return new Promise((resolve, reject) => {
 *       setTimeout(resolve, 1000);
 *     });
 *   });
 * });
 * ```
 * @since v18.0.0
 * @param name The name of the test, which is displayed when reporting test results.
 *    Default: The `name` property of fn, or `'<anonymous>'` if `fn` does not have a name.
 * @param options Configuration options for the test
 * @param fn The function under test. The first argument to this function is a
 *    {@link TestContext} object. If the test uses callbacks, the callback function is
 *    passed as the second argument. Default: A no-op function.
 * @returns A {@link Promise} resolved with `undefined` once the test completes.
 */
@JsName("test")
external fun testAsync(
    fn: TestFn = definedExternally,
): Promise<Void>
