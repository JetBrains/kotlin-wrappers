package web.scheduling

import js.objects.JsPlainObject

@JsPlainObject
external interface TaskControllerInit {
    var priority: TaskPriority
}
