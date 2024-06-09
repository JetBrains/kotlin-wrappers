// Automatically generated - do not modify!

package web.fs

import js.core.JsLong
import kotlinx.js.JsPlainObject

@JsPlainObject
sealed external interface WriteParams {
    var data: Any /* BufferSource | Blob | string */?
    var position: JsLong?
    var size: JsLong?
    var type: WriteCommandType
}
