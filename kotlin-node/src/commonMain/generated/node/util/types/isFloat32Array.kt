// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util/types")

package node.util.types

/**
 * Returns `true` if the value is a built-in [`Float32Array`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Float32Array) instance.
 *
 * ```js
 * util.types.isFloat32Array(new ArrayBuffer());  // Returns false
 * util.types.isFloat32Array(new Float32Array());  // Returns true
 * util.types.isFloat32Array(new Float64Array());  // Returns false
 * ```
 * @since v10.0.0
 */

@JsName("isFloat32Array")
external fun isFloat32ArrayRaw(value: Any?): Boolean // object is Float32Array
