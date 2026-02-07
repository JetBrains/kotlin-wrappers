package web.events

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface ObservableEventListenerOptions {
    var capture: Boolean?
    var passive: Boolean?
}
