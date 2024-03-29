// Generated by Karakum - do not modify it manually!

@file:JsModule("node:vm")

package node.vm

import js.array.ReadonlyArray

/**
 * Compiles the given code into the provided context (if no context is
 * supplied, the current context is used), and returns it wrapped inside a
 * function with the given `params`.
 * @since v10.10.0
 * @param code The body of the function to compile.
 * @param params An array of strings containing all parameters for the function.
 */
external fun compileFunction(
    code: String,
    params: ReadonlyArray<String> = definedExternally,
    options: CompileFunctionOptions = definedExternally,
): CompileFunctionResult
