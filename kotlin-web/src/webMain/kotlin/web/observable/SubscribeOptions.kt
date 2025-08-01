package web.observable

import js.objects.JsPlainObject
import web.abort.Abortable

@JsPlainObject
external interface SubscribeOptions :
    Abortable
