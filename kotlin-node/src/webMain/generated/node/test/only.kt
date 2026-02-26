// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test")

package node.test

/**
 * Shorthand for marking a test as `only`. This is the same as calling {@link test} with `options.only` set to `true`.
 * @since v20.2.0
 */
@JsName("only")
external fun onlyAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("only")
external fun onlyAsync(
    name: String = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("only")
external fun onlyAsync(
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("only")
external fun onlyAsync(fn: TestFn = definedExternally): js.promise.Promise<js.core.Void>

@JsName("only")
external fun onlyAsync(): js.promise.Promise<js.core.Void>
