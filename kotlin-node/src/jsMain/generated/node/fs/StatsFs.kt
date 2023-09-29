@file:JsModule("node:fs")

package node.fs


/**
 * Provides information about a mounted file system
 *
 * Objects returned from {@link statfs} and {@link statfsSync} are of this type.
 * If `bigint` in the `options` passed to those methods is true, the numeric values
 * will be `bigint` instead of `number`.
 * @since  v18.15.0
 */

external class StatsFs
