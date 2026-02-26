// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test")

package node.test

/**
 * Shorthand for skipping a test. This is the same as calling {@link test} with `options.skip` set to `true`.
 * @since v20.2.0
 */
@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(fn: TestFn = definedExternally): js.promise.Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(): js.promise.Promise<js.core.Void>
