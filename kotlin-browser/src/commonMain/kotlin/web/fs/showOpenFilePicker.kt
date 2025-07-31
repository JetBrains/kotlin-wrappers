package web.fs

import js.array.ReadonlyArray
import js.promise.Promise
import js.promise.await
import web.experimental.ExperimentalWebApi
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Window/showOpenFilePicker)
 */
@ExperimentalWebApi
@JsName("showOpenFilePicker")
external fun showOpenFilePickerAsync(
    options: OpenFilePickerOptions = definedExternally,
): Promise<ReadonlyArray<FileSystemFileHandle>>

@ExperimentalWebApi
suspend inline fun showOpenFilePicker(): ReadonlyArray<FileSystemFileHandle> =
    showOpenFilePickerAsync().await()

@ExperimentalWebApi
suspend inline fun showOpenFilePicker(
    options: OpenFilePickerOptions,
): ReadonlyArray<FileSystemFileHandle> =
    showOpenFilePickerAsync(
        options = options,
    ).await()
