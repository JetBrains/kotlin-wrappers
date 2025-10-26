package web.editcontext

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

@JsPlainObject
@ExperimentalWebApi
external interface TextFormatUpdateEventInit :
    EventInit {
    var textFormats: ReadonlyArray<TextFormat>
}
