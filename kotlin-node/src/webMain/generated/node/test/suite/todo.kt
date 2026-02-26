// Automatically generated - do not modify!

@file:JsModule("node:test")
@file:JsQualifier("test.suite")

package node.test.suite

import node.test.SuiteFn
import node.test.TestOptions

/**
 * Shorthand for marking a suite as `TODO`. This is the same as calling {@link suite} with `options.todo` set to `true`.
 * @since v20.13.0
 */
@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    fn: SuiteFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(fn: SuiteFn = definedExternally): js.promise.Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(): js.promise.Promise<js.core.Void>
