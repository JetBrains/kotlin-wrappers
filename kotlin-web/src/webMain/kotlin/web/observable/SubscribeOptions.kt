package web.observable

import kotlinx.js.JsPlainObject
import web.abort.Abortable

@JsPlainObject
external interface SubscribeOptions :
    Abortable
