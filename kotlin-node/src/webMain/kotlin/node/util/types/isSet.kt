@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a built-in [`Set`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Set) instance.
 *
 * ```js
 * util.types.isSet(new Set());  // Returns true
 * ```
 * @since v10.0.0
 */
@JsName("isSet")
external fun isSetRaw(target: Any?): Boolean
