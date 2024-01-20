// Automatically generated - do not modify!

package web.locks

import web.abort.AbortSignal
import web.abort.Abortable

sealed external interface LockOptions :
    Abortable {
    var ifAvailable: Boolean?
    var mode: LockMode?
    override var signal: AbortSignal?
    var steal: Boolean?
}
