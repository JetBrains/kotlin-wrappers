// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a number object, e.g. created
 * by `new Number()`.
 *
 * ```js
 * util.types.isNumberObject(0);  // Returns false
 * util.types.isNumberObject(new Number(0));   // Returns true
 * ```
 * @since v10.0.0
 */

@JsName("isNumberObject")
external fun isNumberObjectRaw(value: Any?): Boolean /* object is Number */
