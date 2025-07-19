package web.fs

import js.promise.Promise
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
