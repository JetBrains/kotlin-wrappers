// Automatically generated - do not modify!

package web.scheduling

import js.core.UInt53
import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

@JsPlainObject
external interface SchedulerPostTaskOptions :
    Abortable {
    var delay: UInt53?
    var priority: TaskPriority?
    override var signal: AbortSignal?
}
