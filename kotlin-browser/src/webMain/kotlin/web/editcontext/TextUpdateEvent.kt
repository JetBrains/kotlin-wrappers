package web.editcontext

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi

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
    open val updateRangeStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/updateRangeEnd)
     */
    open val updateRangeEnd: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/text)
     */
    open val text: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/selectionStart)
     */
    open val selectionStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextUpdateEvent/selectionEnd)
     */
    open val selectionEnd: Int
}
