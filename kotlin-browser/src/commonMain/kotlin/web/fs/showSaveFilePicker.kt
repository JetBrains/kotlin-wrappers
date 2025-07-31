package web.fs

import js.promise.Promise
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
