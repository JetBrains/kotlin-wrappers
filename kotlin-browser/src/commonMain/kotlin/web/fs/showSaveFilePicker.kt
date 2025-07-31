package web.fs

import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/showSaveFilePicker)
 */
@ExperimentalWebApi
@JsName("showSaveFilePicker")
external fun showSaveFilePickerAsync(
    options: SaveFilePickerOptions = definedExternally,
): Promise<FileSystemFileHandle>

@ExperimentalWebApi
suspend inline fun showSaveFilePicker(): FileSystemFileHandle =
    showSaveFilePickerAsync().await()

@ExperimentalWebApi
suspend inline fun showSaveFilePicker(
    options: SaveFilePickerOptions,
): FileSystemFileHandle =
    showSaveFilePickerAsync(
        options = options,
    ).await()
