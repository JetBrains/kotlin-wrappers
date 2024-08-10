// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a generator function.
 * This only reports back what the JavaScript engine is seeing;
 * in particular, the return value may not match the original source code if
 * a transpilation tool was used.
 *
 * ```js
 * util.types.isGeneratorFunction(function foo() {});  // Returns false
 * util.types.isGeneratorFunction(function* foo() {});  // Returns true
 * ```
 * @since v10.0.0
 */

@JsName("isGeneratorFunction")
external fun isGeneratorFunctionRaw(value: Any?): Boolean /* object is GeneratorFunction */
