@file:JsModule("node:fs")

package node.fs


/**
 * Creates the link called `path` pointing to `target`. No arguments other than a
 * possible exception are given to the completion callback.
 *
 * See the POSIX [`symlink(2)`](http://man7.org/linux/man-pages/man2/symlink.2.html) documentation for more details.
 *
 * The `type` argument is only available on Windows and ignored on other platforms.
 * It can be set to `'dir'`, `'file'`, or `'junction'`. If the `type` argument is
 * not set, Node.js will autodetect `target` type and use `'file'` or `'dir'`. If
 * the `target` does not exist, `'file'` will be used. Windows junction points
 * require the destination path to be absolute. When using `'junction'`, the`target` argument will automatically be normalized to absolute path.
 *
 * Relative targets are relative to the link’s parent directory.
 *
 * ```js
 * import { symlink } from 'fs';
 *
 * symlink('./mew', './mewtwo', callback);
 * ```
 *
 * The above example creates a symbolic link `mewtwo` which points to `mew` in the
 * same directory:
 *
 * ```bash
 * $ tree .
 * .
 * ├── mew
 * └── mewtwo -> ./mew
 * ```
 * @since v0.1.31
 */
external fun symlink(target: PathLike, path: PathLike, type: symlink.Type?, callback: NoParamCallback): Unit

/**
 * Asynchronous symlink(2) - Create a new symbolic link to an existing file.
 * @param target A path to an existing file. If a URL is provided, it must use the `file:` protocol.
 * @param path A path to the new symlink. If a URL is provided, it must use the `file:` protocol.
 */
external fun symlink(target: PathLike, path: PathLike, callback: NoParamCallback): Unit
