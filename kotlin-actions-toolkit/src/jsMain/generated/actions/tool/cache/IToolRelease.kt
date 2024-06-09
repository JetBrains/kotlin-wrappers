// Automatically generated - do not modify!

package actions.tool.cache

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface IToolRelease {
    var version: String
    var stable: Boolean
    var release_url: String
    var files: ReadonlyArray<IToolReleaseFile>
}
