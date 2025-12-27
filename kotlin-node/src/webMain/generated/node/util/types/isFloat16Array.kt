// Automatically generated - do not modify!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a built-in [`Float16Array`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float16Array) instance.
 *
 * ```js
 * util.types.isFloat16Array(new ArrayBuffer());  // Returns false
 * util.types.isFloat16Array(new Float16Array());  // Returns true
 * util.types.isFloat16Array(new Float32Array());  // Returns false
 * ```
 * @since v24.0.0
 */
@JsName("isFloat16Array")
external fun isFloat16ArrayRaw(value: Any?): Boolean // object is Float16Array
