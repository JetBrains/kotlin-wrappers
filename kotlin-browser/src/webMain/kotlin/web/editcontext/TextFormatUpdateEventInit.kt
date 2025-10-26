package web.editcontext

import js.array.ReadonlyArray
import js.objects.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/TextFormatUpdateEventInit/TextFormatUpdateEventInit#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface TextFormatUpdateEventInit :
    EventInit {
    var textFormats: ReadonlyArray<TextFormat>
}
