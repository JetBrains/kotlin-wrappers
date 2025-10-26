package web.editcontext

import js.objects.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface CharacterBoundsUpdateEventInit :
    EventInit {
    var rangeStart: Int
    var rangeEnd: Int
}
