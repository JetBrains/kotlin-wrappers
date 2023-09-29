@file:JsModule("node:fs")

package node.fs


/**
 * A `fs.Stats` object provides information about a file.
 *
 * Objects returned from {@link stat}, {@link lstat} and {@link fstat} and
 * their synchronous counterparts are of this type.
 * If `bigint` in the `options` passed to those methods is true, the numeric values
 * will be `bigint` instead of `number`, and the object will contain additional
 * nanosecond-precision properties suffixed with `Ns`.
 *
 * ```console
 * Stats {
 *   dev: 2114,
 *   ino: 48064969,
 *   mode: 33188,
 *   nlink: 1,
 *   uid: 85,
 *   gid: 100,
 *   rdev: 0,
 *   size: 527,
 *   blksize: 4096,
 *   blocks: 8,
 *   atimeMs: 1318289051000.1,
 *   mtimeMs: 1318289051000.1,
 *   ctimeMs: 1318289051000.1,
 *   birthtimeMs: 1318289051000.1,
 *   atime: Mon, 10 Oct 2011 23:24:11 GMT,
 *   mtime: Mon, 10 Oct 2011 23:24:11 GMT,
 *   ctime: Mon, 10 Oct 2011 23:24:11 GMT,
 *   birthtime: Mon, 10 Oct 2011 23:24:11 GMT }
 * ```
 *
 * `bigint` version:
 *
 * ```console
 * BigIntStats {
 *   dev: 2114n,
 *   ino: 48064969n,
 *   mode: 33188n,
 *   nlink: 1n,
 *   uid: 85n,
 *   gid: 100n,
 *   rdev: 0n,
 *   size: 527n,
 *   blksize: 4096n,
 *   blocks: 8n,
 *   atimeMs: 1318289051000n,
 *   mtimeMs: 1318289051000n,
 *   ctimeMs: 1318289051000n,
 *   birthtimeMs: 1318289051000n,
 *   atimeNs: 1318289051000000000n,
 *   mtimeNs: 1318289051000000000n,
 *   ctimeNs: 1318289051000000000n,
 *   birthtimeNs: 1318289051000000000n,
 *   atime: Mon, 10 Oct 2011 23:24:11 GMT,
 *   mtime: Mon, 10 Oct 2011 23:24:11 GMT,
 *   ctime: Mon, 10 Oct 2011 23:24:11 GMT,
 *   birthtime: Mon, 10 Oct 2011 23:24:11 GMT }
 * ```
 * @since v0.1.21
 */

external class Stats
