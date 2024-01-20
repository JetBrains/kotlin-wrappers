// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * The `describe()` function imported from the `node:test` module. Each
 * invocation of this function results in the creation of a Subtest.
 * After invocation of top level `describe` functions,
 * all top level tests and suites will execute.
 * @param [name='The name'] The name of the suite, which is displayed when reporting test results.
 * @param options Configuration options for the suite. supports the same options as `test([name][, options][, fn])`.
 * @param [fn='A no-op function'] The function under suite declaring all subtests and subsuites. The first argument to this function is a {@link SuiteContext} object.
 * @return Immediately fulfilled with `undefined`.
 */

@JsName("describe")
external fun describeAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<Unit>


@JsName("describe")
external fun describeAsync(name: String = definedExternally, fn: SuiteFn = definedExternally): Promise<Unit>


@JsName("describe")
external fun describeAsync(options: TestOptions = definedExternally, fn: SuiteFn = definedExternally): Promise<Unit>


@JsName("describe")
external fun describeAsync(fn: SuiteFn = definedExternally): Promise<Unit>