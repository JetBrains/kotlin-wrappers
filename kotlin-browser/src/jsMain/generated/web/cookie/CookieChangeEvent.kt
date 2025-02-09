// Automatically generated - do not modify!

package web.cookie

import js.array.ReadonlyArray
import seskar.js.JsAlias
import seskar.js.JsAlias.Companion.THIS
import seskar.js.JsValue
import web.events.Event
import web.events.EventType

/**
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent)
 */
open external class CookieChangeEvent(
    override val type: EventType<CookieChangeEvent>,
    init: CookieChangeEventInit = definedExternally,
) : Event {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent/changed)
     */
    val changed: ReadonlyArray<CookieListItem>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CookieChangeEvent/deleted)
     */
    val deleted: ReadonlyArray<CookieListItem>

    @JsAlias(THIS)
    override fun asInit(): CookieChangeEventInit

    companion object {
        @JsValue("change")
        val CHANGE: EventType<CookieChangeEvent>
    }
}
