package web.observable

import kotlinx.js.JsPlainObject
import web.abort.Abortable
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface SubscribeOptions :
    Abortable
