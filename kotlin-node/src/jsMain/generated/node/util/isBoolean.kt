// Generated by Karakum - do not modify it manually!

@file:JsModule("node:util")

package node.util

/**
 * Returns `true` if the given `object` is a `Boolean`. Otherwise, returns `false`.
 *
 * ```js
 * const util = require('node:util');
 *
 * util.isBoolean(1);
 * // Returns: false
 * util.isBoolean(0);
 * // Returns: false
 * util.isBoolean(false);
 * // Returns: true
 * ```
 * @since v0.11.5
 * @deprecated Since v4.0.0 - Use `typeof value === 'boolean'` instead.
 */

@JsName("isBoolean")
external fun isBooleanRaw(value: Any?): Boolean /* object is boolean */
