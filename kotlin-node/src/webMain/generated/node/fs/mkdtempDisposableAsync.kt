// Automatically generated - do not modify!

@file:JsModule("node:fs/promises")

package node.fs

/**
 * The resulting Promise holds an async-disposable object whose `path` property
 * holds the created directory path. When the object is disposed, the directory
 * and its contents will be removed asynchronously if it still exists. If the
 * directory cannot be deleted, disposal will throw an error. The object has an
 * async `remove()` method which will perform the same task.
 *
 * Both this function and the disposal function on the resulting object are
 * async, so it should be used with `await` + `await using` as in
 * `await using dir = await fsPromises.mkdtempDisposable('prefix')`.
 *
 * <!-- TODO: link MDN docs for disposables once https://github.com/mdn/content/pull/38027 lands -->
 *
 * For detailed information, see the documentation of `fsPromises.mkdtemp()`.
 *
 * The optional `options` argument can be a string specifying an encoding, or an
 * object with an `encoding` property specifying the character encoding to use.
 * @since v24.4.0
 */
@JsName("mkdtempDisposable")
external fun mkdtempDisposableAsync(
    prefix: PathLike,
    options: EncodingOption = definedExternally,
): js.promise.Promise<DisposableTempDir>
