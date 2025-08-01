// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * Shorthand for marking a test as `TODO`. This is the same as calling {@link test} with `options.todo` set to `true`.
 * @since v20.2.0
 */
@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(
    name: String = definedExternally,
    fn: TestFn = definedExternally,
): Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(fn: TestFn = definedExternally): Promise<js.core.Void>

@JsName("todo")
external fun todoAsync(): Promise<js.core.Void>
