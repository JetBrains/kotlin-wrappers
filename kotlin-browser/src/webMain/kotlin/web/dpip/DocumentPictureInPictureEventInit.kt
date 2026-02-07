package web.dpip

import kotlinx.js.JsPlainObject
import web.events.EventInit
import web.experimental.ExperimentalWebApi
import web.window.Window

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPictureEvent/DocumentPictureInPictureEvent#options)
 */
@JsPlainObject
@ExperimentalWebApi
external interface DocumentPictureInPictureEventInit :
    EventInit {
    var window: Window
}
