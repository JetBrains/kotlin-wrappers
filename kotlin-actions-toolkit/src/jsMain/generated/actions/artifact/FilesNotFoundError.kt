// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.array.ReadonlyArray
import js.errors.JsError

external class FilesNotFoundError : JsError {
    var files: ReadonlyArray<String>

    constructor(files: ReadonlyArray<String> = definedExternally)
}
