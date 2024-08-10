// Generated by Karakum - do not modify it manually!

@file:JsModule("node:fs")

package node.fs


/**
 * Provides information about a mounted file system.
 *
 * Objects returned from {@link statfs} and its synchronous counterpart are of
 * this type. If `bigint` in the `options` passed to those methods is `true`, the
 * numeric values will be `bigint` instead of `number`.
 *
 * ```console
 * StatFs {
 *   type: 1397114950,
 *   bsize: 4096,
 *   blocks: 121938943,
 *   bfree: 61058895,
 *   bavail: 61058895,
 *   files: 999,
 *   ffree: 1000000
 * }
 * ```
 *
 * `bigint` version:
 *
 * ```console
 * StatFs {
 *   type: 1397114950n,
 *   bsize: 4096n,
 *   blocks: 121938943n,
 *   bfree: 61058895n,
 *   bavail: 61058895n,
 *   files: 999n,
 *   ffree: 1000000n
 * }
 * ```
 * @since v19.6.0, v18.15.0
 */
external class StatsFs : StatsFsBase<Double> {

    override var type: Double
    override var bsize: Double
    override var blocks: Double
    override var bfree: Double
    override var bavail: Double
    override var files: Double
    override var ffree: Double
}
