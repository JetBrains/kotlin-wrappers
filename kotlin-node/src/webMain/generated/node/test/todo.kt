// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test")

package node.test

/**
 * Shorthand for marking a test as `TODO`. This is the same as calling {@link test} with `options.todo` set to `true`.
 * @since v20.2.0
 */
@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(fn: TestFn = definedExternally): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(): js.promise.Promise<js.core.Void>
