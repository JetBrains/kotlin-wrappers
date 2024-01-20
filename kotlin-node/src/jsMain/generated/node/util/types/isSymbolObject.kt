// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types


/**
 * Returns `true` if the value is a symbol object, created
 * by calling `Object()` on a `Symbol` primitive.
 *
 * ```js
 * const symbol = Symbol('foo');
 * util.types.isSymbolObject(symbol);  // Returns false
 * util.types.isSymbolObject(Object(symbol));   // Returns true
 * ```
 * @since v10.0.0
 */
external fun isSymbolObject(`object`: Any?): Boolean