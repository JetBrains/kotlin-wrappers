// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("it")

package node.test.it

import js.promise.Promise
import node.test.TestFn
import node.test.TestOptions

/**
 * Shorthand for marking a test as `TODO`. This is the same as calling {@link it} with `options.todo` set to `true`.
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
