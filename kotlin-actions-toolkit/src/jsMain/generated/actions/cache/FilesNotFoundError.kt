// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import js.array.ReadonlyArray
import js.errors.JsError

external class FilesNotFoundError : JsError {
    var files: ReadonlyArray<String>

    constructor(files: ReadonlyArray<String> = definedExternally)
}
