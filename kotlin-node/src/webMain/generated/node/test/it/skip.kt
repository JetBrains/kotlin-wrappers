// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")
@file:JsQualifier("it")

package node.test.it

import js.promise.Promise
import node.test.TestFn
import node.test.TestOptions

/**
 * Shorthand for skipping a test. This is the same as calling {@link it} with `options.skip` set to `true`.
 */
@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(
    name: String = definedExternally,
    fn: TestFn = definedExternally,
): Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(
    options: TestOptions = definedExternally,
    fn: TestFn = definedExternally,
): Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(fn: TestFn = definedExternally): Promise<js.core.Void>

@JsName("skip")
external fun skipAsync(): Promise<js.core.Void>
