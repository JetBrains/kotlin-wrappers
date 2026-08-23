// Automatically generated - do not modify!

package web.scheduling

import js.numbers.UInt53
import kotlinx.js.JsPlainObject
import web.abort.AbortSignal
import web.abort.Abortable

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask#options)
 */
@JsPlainObject
external interface SchedulerPostTaskOptions :
    Abortable {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask#delay)
     */
    var delay: UInt53?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask#priority)
     */
    var priority: TaskPriority?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Scheduler/postTask#signal)
     */
    override var signal: AbortSignal?
}
