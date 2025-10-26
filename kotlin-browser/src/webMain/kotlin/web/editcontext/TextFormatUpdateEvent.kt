package web.editcontext

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

@ExperimentalWebApi
open external class TextFormatUpdateEvent(
    override val type: EventType<TextFormatUpdateEvent>,
    init: TextFormatUpdateEventInit = definedExternally,
) : Event {
    fun getTextFormats(): ReadonlyArray<TextFormat>
}
