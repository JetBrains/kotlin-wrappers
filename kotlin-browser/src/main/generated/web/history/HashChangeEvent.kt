// Automatically generated - do not modify!

package web.history

import web.events.Event
import web.events.EventInit

external interface HashChangeEventInit : EventInit {
    var newURL: String?
    var oldURL: String?
}

open external class HashChangeEvent(
    type: String,
    init: HashChangeEventInit = definedExternally,
) : Event {
    /** Returns the URL of the session history entry that is now current. */
    val newURL: String

    /** Returns the URL of the session history entry that was previously current. */
    val oldURL: String

    companion object
}
