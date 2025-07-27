package web.scheduling

import js.core.UInt53
import js.objects.JsPlainObject
import web.abort.Abortable

@JsPlainObject
external interface SchedulerPostTaskOptions :
    Abortable {
    var priority: TaskPriority?
    var delay: UInt53?
}
