// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

/**
 * Returns `true` if the given `object` is strictly `null`. Otherwise, returns`false`.
 *
 * ```js
 * const util = require('node:util');
 *
 * util.isNull(0);
 * // Returns: false
 * util.isNull(undefined);
 * // Returns: false
 * util.isNull(null);
 * // Returns: true
 * ```
 * @since v0.11.5
 * @deprecated Since v4.0.0 - Use `value === null` instead.
 */

@JsName("isNull")
external fun isNullRaw(value: Any?): Boolean /* object is null */
