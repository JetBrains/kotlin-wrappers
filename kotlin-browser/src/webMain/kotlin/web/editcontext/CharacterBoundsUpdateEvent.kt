package web.editcontext

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

@ExperimentalWebApi
open external class CharacterBoundsUpdateEvent(
    override val type: EventType<CharacterBoundsUpdateEvent>,
    init: CharacterBoundsUpdateEventInit = definedExternally,
) : Event {
    val rangeStart: Int
    val rangeEnd: Int
}
