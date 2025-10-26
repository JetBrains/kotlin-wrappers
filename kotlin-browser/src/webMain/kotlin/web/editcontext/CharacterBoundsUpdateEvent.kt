package web.editcontext

import web.events.Event
import web.events.EventType
import web.experimental.ExperimentalWebApi
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterBoundsUpdateEvent)
 */
@ExperimentalWebApi
open external class CharacterBoundsUpdateEvent(
    override val type: EventType<CharacterBoundsUpdateEvent>,
    init: CharacterBoundsUpdateEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterBoundsUpdateEvent/rangeStart)
     */
    val rangeStart: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CharacterBoundsUpdateEvent/rangeEnd)
     */
    val rangeEnd: Int
}
