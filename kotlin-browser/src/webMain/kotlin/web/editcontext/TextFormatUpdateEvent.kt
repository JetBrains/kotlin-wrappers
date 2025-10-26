package web.editcontext

import js.array.ReadonlyArray
import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormatUpdateEvent)
 */
@ExperimentalWebApi
open external class TextFormatUpdateEvent(
    override val type: EventType<TextFormatUpdateEvent>,
    init: TextFormatUpdateEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormatUpdateEvent/getTextFormats)
     */
    fun getTextFormats(): ReadonlyArray<TextFormat>
}
