// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.events.EventType
import web.form.FormDataEvent
import web.form.SubmitEvent

inline val <C : HTMLFormElement> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, EventType("formdata"))

inline val <C : HTMLFormElement> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, EventType("reset"))

inline val <C : HTMLFormElement> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, EventType("submit"))
