package web.editcontext

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent)
 */
@ExperimentalWebApi
open external class TextUpdateEvent(
    override val type: EventType<TextUpdateEvent>,
    init: TextUpdateEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/updateRangeStart)
     */
    val updateRangeStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/updateRangeEnd)
     */
    val updateRangeEnd: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/text)
     */
    val text: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/selectionStart)
     */
    val selectionStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/selectionEnd)
     */
    val selectionEnd: Int
}
