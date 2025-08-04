package web.events

import js.objects.JsPlainObject

@JsPlainObject
external interface ObservableEventListenerOptions {
    var capture: Boolean?
    var passive: Boolean?
}
