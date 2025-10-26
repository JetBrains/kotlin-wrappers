package web.editcontext

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

@ExperimentalWebApi
open external class TextUpdateEvent(
    override val type: EventType<TextUpdateEvent>,
    init: TextUpdateEventInit = definedExternally,
) : Event {
    val updateRangeStart: Int
    val updateRangeEnd: Int
    val text: String
    val selectionStart: Int
    val selectionEnd: Int
}
