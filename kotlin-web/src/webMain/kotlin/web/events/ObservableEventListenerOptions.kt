package web.events

import kotlinx.js.JsPlainObject
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface ObservableEventListenerOptions {
    var capture: Boolean?
    var passive: Boolean?
}
