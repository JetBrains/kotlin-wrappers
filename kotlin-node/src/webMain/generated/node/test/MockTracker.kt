// Automatically generated - do not modify!

package node.test

/**
 * The `MockTracker` class is used to manage mocking functionality. The test runner
 * module provides a top level `mock` export which is a `MockTracker` instance.
 * Each test also provides its own `MockTracker` instance via the test context's `mock` property.
 * @since v19.1.0, v18.13.0
 */
sealed external interface MockTracker {
    /**
     * This function is used to create a mock function.
     *
     * The following example creates a mock function that increments a counter by one
     * on each invocation. The `times` option is used to modify the mock behavior such
     * that the first two invocations add two to the counter instead of one.
     *
     * ```js
     * test('mocks a counting function', (t) => {
     *   let cnt = 0;
     *
     *   function addOne() {
     *     cnt++;
     *     return cnt;
     *   }
     *
     *   function addTwo() {
     *     cnt += 2;
     *     return cnt;
     *   }
     *
     *   const fn = t.mock.fn(addOne, addTwo, { times: 2 });
     *
     *   assert.strictEqual(fn(), 2);
     *   assert.strictEqual(fn(), 4);
     *   assert.strictEqual(fn(), 5);
     *   assert.strictEqual(fn(), 6);
     * });
     * ```
     * @since v19.1.0, v18.13.0
     * @param original An optional function to create a mock on.
     * @param implementation An optional function used as the mock implementation for `original`. This is useful for creating mocks that exhibit one behavior for a specified number of calls and
     * then restore the behavior of `original`.
     * @param options Optional configuration options for the mock function.
     * @return The mocked function. The mocked function contains a special `mock` property, which is an instance of {@link MockFunctionContext}, and can be used for inspecting and changing the
     * behavior of the mocked function.
     */
    fun <F : Function<*> /* default is Function<Nothing?> /* (...args: any[]) => undefined */ */> fn(
        original: F = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<F>

    fun <F : Function<*> /* default is Function<Nothing?> /* (...args: any[]) => undefined */ */> fn(
        original: F = definedExternally,
        implementation: Function<*> = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    /**
     * This function is used to create a mock on an existing object method. The
     * following example demonstrates how a mock is created on an existing object
     * method.
     *
     * ```js
     * test('spies on an object method', (t) => {
     *   const number = {
     *     value: 5,
     *     subtract(a) {
     *       return this.value - a;
     *     },
     *   };
     *
     *   t.mock.method(number, 'subtract');
     *   assert.strictEqual(number.subtract.mock.calls.length, 0);
     *   assert.strictEqual(number.subtract(3), 2);
     *   assert.strictEqual(number.subtract.mock.calls.length, 1);
     *
     *   const call = number.subtract.mock.calls[0];
     *
     *   assert.deepStrictEqual(call.arguments, [3]);
     *   assert.strictEqual(call.result, 2);
     *   assert.strictEqual(call.error, undefined);
     *   assert.strictEqual(call.target, undefined);
     *   assert.strictEqual(call.this, number);
     * });
     * ```
     * @since v19.1.0, v18.13.0
     * @param object The object whose method is being mocked.
     * @param methodName The identifier of the method on `object` to mock. If `object[methodName]` is not a function, an error is thrown.
     * @param implementation An optional function used as the mock implementation for `object[methodName]`.
     * @param options Optional configuration options for the mock method.
     * @return The mocked method. The mocked method contains a special `mock` property, which is an instance of {@link MockFunctionContext}, and can be used for inspecting and changing the
     * behavior of the mocked method.
     */
    fun method(
        target: Any,
        methodName: String,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    fun method(
        target: Any,
        methodName: String,
        implementation: Function<*>,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    fun method(
        target: Any,
        methodName: String,
        options: MockMethodOptions,
    ): Mock<Function<*>>

    fun method(
        target: Any,
        methodName: String,
        implementation: Function<*>,
        options: MockMethodOptions,
    ): Mock<Function<*>>

    /**
     * This function is syntax sugar for `MockTracker.method` with `options.getter` set to `true`.
     * @since v19.3.0, v18.13.0
     */
    fun getter(
        target: Any,
        methodName: String,
        options: MockFunctionOptions = definedExternally,
    ): Mock<() -> Any?>

    fun getter(
        target: Any,
        methodName: String,
        implementation: Function<*> = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    /**
     * This function is syntax sugar for `MockTracker.method` with `options.setter` set to `true`.
     * @since v19.3.0, v18.13.0
     */
    fun setter(
        target: Any,
        methodName: String,
        options: MockFunctionOptions = definedExternally,
    ): Mock<(value: Any?) -> Unit>

    fun setter(
        target: Any,
        methodName: String,
        implementation: Function<*> = definedExternally,
        options: MockFunctionOptions = definedExternally,
    ): Mock<Function<*>>

    /**
     * This function is used to mock the exports of ECMAScript modules, CommonJS modules, JSON modules, and
     * Node.js builtin modules. Any references to the original module prior to mocking are not impacted. In
     * order to enable module mocking, Node.js must be started with the
     * [`--experimental-test-module-mocks`](https://nodejs.org/docs/latest-v24.x/api/cli.html#--experimental-test-module-mocks)
     * command-line flag.
     *
     * The following example demonstrates how a mock is created for a module.
     *
     * ```js
     * test('mocks a builtin module in both module systems', async (t) => {
     *   // Create a mock of 'node:readline' with a named export named 'fn', which
     *   // does not exist in the original 'node:readline' module.
     *   const mock = t.mock.module('node:readline', {
     *     namedExports: { fn() { return 42; } },
     *   });
     *
     *   let esmImpl = await import('node:readline');
     *   let cjsImpl = require('node:readline');
     *
     *   // cursorTo() is an export of the original 'node:readline' module.
     *   assert.strictEqual(esmImpl.cursorTo, undefined);
     *   assert.strictEqual(cjsImpl.cursorTo, undefined);
     *   assert.strictEqual(esmImpl.fn(), 42);
     *   assert.strictEqual(cjsImpl.fn(), 42);
     *
     *   mock.restore();
     *
     *   // The mock is restored, so the original builtin module is returned.
     *   esmImpl = await import('node:readline');
     *   cjsImpl = require('node:readline');
     *
     *   assert.strictEqual(typeof esmImpl.cursorTo, 'function');
     *   assert.strictEqual(typeof cjsImpl.cursorTo, 'function');
     *   assert.strictEqual(esmImpl.fn, undefined);
     *   assert.strictEqual(cjsImpl.fn, undefined);
     * });
     * ```
     * @since v22.3.0
     * @experimental
     * @param specifier A string identifying the module to mock.
     * @param options Optional configuration options for the mock module.
     */
    fun module(
        specifier: String,
        options: MockModuleOptions = definedExternally,
    ): MockModuleContext

    /**
     * Creates a mock for a property value on an object. This allows you to track and control access to a specific property,
     * including how many times it is read (getter) or written (setter), and to restore the original value after mocking.
     *
     * ```js
     * test('mocks a property value', (t) => {
     *   const obj = { foo: 42 };
     *   const prop = t.mock.property(obj, 'foo', 100);
     *
     *   assert.strictEqual(obj.foo, 100);
     *   assert.strictEqual(prop.mock.accessCount(), 1);
     *   assert.strictEqual(prop.mock.accesses[0].type, 'get');
     *   assert.strictEqual(prop.mock.accesses[0].value, 100);
     *
     *   obj.foo = 200;
     *   assert.strictEqual(prop.mock.accessCount(), 2);
     *   assert.strictEqual(prop.mock.accesses[1].type, 'set');
     *   assert.strictEqual(prop.mock.accesses[1].value, 200);
     *
     *   prop.mock.restore();
     *   assert.strictEqual(obj.foo, 42);
     * });
     * ```
     * @since v24.3.0
     * @param object The object whose value is being mocked.
     * @param propertyName The identifier of the property on `object` to mock.
     * @param value An optional value used as the mock value
     * for `object[propertyName]`. **Default:** The original property value.
     * @returns A proxy to the mocked object. The mocked object contains a
     * special `mock` property, which is an instance of [`MockPropertyContext`][], and
     * can be used for inspecting and changing the behavior of the mocked property.
     */
    fun property(
        target: Any,
        property: String,
        value: Any? = definedExternally,
    ): MockTrackerPropertyResult

    /**
     * This function restores the default behavior of all mocks that were previously
     * created by this `MockTracker` and disassociates the mocks from the `MockTracker` instance. Once disassociated, the mocks can still be used, but the `MockTracker` instance can no longer be
     * used to reset their behavior or
     * otherwise interact with them.
     *
     * After each test completes, this function is called on the test context's `MockTracker`. If the global `MockTracker` is used extensively, calling this
     * function manually is recommended.
     * @since v19.1.0, v18.13.0
     */
    fun reset()

    /**
     * This function restores the default behavior of all mocks that were previously
     * created by this `MockTracker`. Unlike `mock.reset()`, `mock.restoreAll()` does
     * not disassociate the mocks from the `MockTracker` instance.
     * @since v19.1.0, v18.13.0
     */
    fun restoreAll()

    val timers: MockTimers
}
