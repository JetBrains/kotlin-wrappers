// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test.suite")

package node.test.suite

import node.test.SuiteFn
import node.test.TestOptions

/**
 * Shorthand for skipping a suite. This is the same as calling {@link suite} with `options.skip` set to `true`.
 * @since v20.13.0
 */
@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    fn: SuiteFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(fn: SuiteFn = definedExternally): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(): js.promise.Promise<js.core.Void>
