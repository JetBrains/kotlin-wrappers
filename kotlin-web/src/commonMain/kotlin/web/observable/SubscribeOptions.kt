package web.observable

import js.core.JsAny
import js.objects.JsPlainObject
import web.abort.Abortable

@JsPlainObject
external interface SubscribeOptions<T : JsAny?> :
    Abortable
