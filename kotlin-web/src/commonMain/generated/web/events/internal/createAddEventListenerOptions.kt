// Automatically generated - do not modify!

package web.events.internal

import js.objects.JsPlainObject
import js.objects.jso
import web.events.AddEventListenerOptions

internal fun createAddEventListenerOptions(
    once: Boolean,
): AddEventListenerOptions =
    jso<MutableAddEventListenerOptions> {
        this.once = once
    }

@JsPlainObject
private external interface MutableAddEventListenerOptions :
    AddEventListenerOptions {
    override var once: Boolean?
}
