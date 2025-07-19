package web.fs

import js.array.ReadonlyArray
import js.promise.Promise
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
