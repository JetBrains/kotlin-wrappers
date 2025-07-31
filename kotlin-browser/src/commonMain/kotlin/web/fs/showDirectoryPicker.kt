package web.fs

import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/showDirectoryPicker)
 */
@ExperimentalWebApi
@JsName("showDirectoryPicker")
external fun showDirectoryPickerAsync(
    options: DirectoryPickerOptions = definedExternally,
): Promise<FileSystemDirectoryHandle>

@ExperimentalWebApi
suspend inline fun showDirectoryPicker(): FileSystemDirectoryHandle =
    showDirectoryPickerAsync().await()

@ExperimentalWebApi
suspend inline fun showDirectoryPicker(
    options: DirectoryPickerOptions,
): FileSystemDirectoryHandle =
    showDirectoryPickerAsync(
        options = options,
    ).await()
