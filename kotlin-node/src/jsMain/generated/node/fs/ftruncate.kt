@file:JsModule("node:fs")

package node.fs


/**
 * Truncates the file descriptor. No arguments other than a possible exception are
 * given to the completion callback.
 *
 * See the POSIX [`ftruncate(2)`](http://man7.org/linux/man-pages/man2/ftruncate.2.html) documentation for more detail.
 *
 * If the file referred to by the file descriptor was larger than `len` bytes, only
 * the first `len` bytes will be retained in the file.
 *
 * For example, the following program retains only the first four bytes of the
 * file:
 *
 * ```js
 * import { open, close, ftruncate } from 'fs';
 *
 * function closeFd(fd) {
 *   close(fd, (err) => {
 *     if (err) throw err;
 *   });
 * }
 *
 * open('temp.txt', 'r+', (err, fd) => {
 *   if (err) throw err;
 *
 *   try {
 *     ftruncate(fd, 4, (err) => {
 *       closeFd(fd);
 *       if (err) throw err;
 *     });
 *   } catch (err) {
 *     closeFd(fd);
 *     if (err) throw err;
 *   }
 * });
 * ```
 *
 * If the file previously was shorter than `len` bytes, it is extended, and the
 * extended part is filled with null bytes (`'\0'`):
 *
 * If `len` is negative then `0` will be used.
 * @since v0.8.6
 * @param [len=0]
 */
external fun ftruncate(fd: Number, len: Double?, callback: NoParamCallback): Unit

/**
 * Asynchronous ftruncate(2) - Truncate a file to a specified length.
 * @param fd A file descriptor.
 */
external fun ftruncate(fd: Number, callback: NoParamCallback): Unit
