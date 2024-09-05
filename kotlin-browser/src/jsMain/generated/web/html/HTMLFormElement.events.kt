// Automatically generated - do not modify!

package web.html

import web.dom.Node
import web.dom.reset
import web.events.Event
import web.events.EventInstance
import web.form.FormDataEvent
import web.form.SubmitEvent

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/formdata_event)
 */
inline val <C : HTMLFormElement> C.formDataEvent: EventInstance<FormDataEvent, C, Node>
    get() = EventInstance(this, FormDataEvent.formData())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/reset_event)
 */
inline val <C : HTMLFormElement> C.resetEvent: EventInstance<Event, C, Node>
    get() = EventInstance(this, Event.reset())

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLFormElement/submit_event)
 */
inline val <C : HTMLFormElement> C.submitEvent: EventInstance<SubmitEvent, C, Node>
    get() = EventInstance(this, SubmitEvent.submit())
