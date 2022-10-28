// Automatically generated - do not modify!

package web.locks

import web.abort.AbortSignal

sealed external interface LockOptions {
    var ifAvailable: Boolean?
    var mode: LockMode?
    var signal: AbortSignal?
    var steal: Boolean?
}
