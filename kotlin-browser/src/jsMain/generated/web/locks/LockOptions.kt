// Automatically generated - do not modify!

package web.locks

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

@JsPlainObject
external interface LockOptions :
    Abortable {
    val ifAvailable: Boolean?
    val mode: LockMode?
    override val signal: AbortSignal?
    val steal: Boolean?
}
