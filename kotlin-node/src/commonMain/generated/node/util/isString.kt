// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

/**
 * Returns `true` if the given `object` is a `string`. Otherwise, returns `false`.
 *
 * ```js
 * import util from 'node:util';
 *
 * util.isString('');
 * // Returns: true
 * util.isString('foo');
 * // Returns: true
 * util.isString(String('foo'));
 * // Returns: true
 * util.isString(5);
 * // Returns: false
 * ```
 * @since v0.11.5
 * @deprecated Since v4.0.0 - Use `typeof value === 'string'` instead.
 */

@JsName("isString")
external fun isStringRaw(value: Any?): Boolean // object is string
