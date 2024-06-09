// Automatically generated - do not modify!

package web.locks

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

@JsPlainObject
sealed external interface LockOptions :
    Abortable {
    var ifAvailable: Boolean?
    var mode: LockMode?
    override var signal: AbortSignal?
    var steal: Boolean?
}
