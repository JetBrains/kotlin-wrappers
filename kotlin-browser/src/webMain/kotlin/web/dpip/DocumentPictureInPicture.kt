package web.dpip

import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.experimental.ExperimentalWebApi
import web.window.Window
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture)
 */
@ExperimentalWebApi
open external class DocumentPictureInPicture
private constructor() :
    EventTarget {

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/requestWindow)
     */
    @JsName("requestWindow")
    fun requestWindowAsync(options: DocumentPictureInPictureOptions = definedExternally): Promise<Window>

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/window)
     */
    val window: Window?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/enter_event)
     */
    var onenter: EventHandler<DocumentPictureInPictureEvent, DocumentPictureInPicture, DocumentPictureInPicture>?
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/requestWindow)
 */
@ExperimentalWebApi
suspend inline fun DocumentPictureInPicture.requestWindow(): Window =
    requestWindowAsync().await()

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/requestWindow)
 */
@ExperimentalWebApi
suspend inline fun DocumentPictureInPicture.requestWindow(
    options: DocumentPictureInPictureOptions,
): Window =
    requestWindowAsync(options).await()

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/enter_event)
 */
@ExperimentalWebApi
inline val <C : DocumentPictureInPicture> C.enterEvent: EventInstance<DocumentPictureInPictureEvent, C, C>
    get() = EventInstance(this, "enter")
