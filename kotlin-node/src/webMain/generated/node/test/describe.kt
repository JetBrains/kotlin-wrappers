// Generated by Karakum - do not modify it manually!

@file:JsModule("node:test")

package node.test

import js.promise.Promise

/**
 * Alias for {@link suite}.
 *
 * The `describe()` function is imported from the `node:test` module.
 */
@JsName("describe")
external fun describeAsync(
    name: String = definedExternally,
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<js.core.Void>

@JsName("describe")
external fun describeAsync(
    name: String = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<js.core.Void>

@JsName("describe")
external fun describeAsync(
    options: TestOptions = definedExternally,
    fn: SuiteFn = definedExternally,
): Promise<js.core.Void>

@JsName("describe")
external fun describeAsync(fn: SuiteFn = definedExternally): Promise<js.core.Void>

@JsName("describe")
external fun describeAsync(): Promise<js.core.Void>
