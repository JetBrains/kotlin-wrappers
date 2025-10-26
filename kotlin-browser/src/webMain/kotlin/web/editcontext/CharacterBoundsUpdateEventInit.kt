package web.editcontext

import js.objects.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterBoundsUpdateEvent/CharacterBoundsUpdateEvent#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface CharacterBoundsUpdateEventInit :
    EventInit {
    var rangeStart: Int
    var rangeEnd: Int
}
