// Automatically generated - do not modify!

package web.dpip

import js.promise.Promise
import js.promise.await
import web.events.EventHandler
import web.events.EventInstance
import web.events.EventTarget
import web.window.Window
import kotlin.js.JsName
import kotlin.js.definedExternally

/**
 * The **`DocumentPictureInPicture`** interface of the Document Picture-in-Picture API is the entry point for creating and handling document picture-in-picture windows.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture)
 */
open external class DocumentPictureInPicture
private constructor() :
    EventTarget {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/enter_event)
     */
    var onenter: EventHandler<DocumentPictureInPictureEvent, DocumentPictureInPicture, DocumentPictureInPicture>?

    /**
     * The **`window`** read-only property of the DocumentPictureInPicture interface returns a Window instance representing the browsing context inside the Picture-in-Picture window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/window)
     */
    val window: Window

    /**
     * The **`requestWindow()`** method of the DocumentPictureInPicture interface opens the Picture-in-Picture window for the current main browsing context. It returns a Promise that fulfills with a Window instance representing the browsing context inside the Picture-in-Picture window.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/requestWindow)
     */
    @JsName("requestWindow")
    fun requestWindowAsync(options: DocumentPictureInPictureOptions = definedExternally): Promise<Window>
}

/**
 * The **`requestWindow()`** method of the DocumentPictureInPicture interface opens the Picture-in-Picture window for the current main browsing context. It returns a Promise that fulfills with a Window instance representing the browsing context inside the Picture-in-Picture window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/requestWindow)
 */
suspend inline fun DocumentPictureInPicture.requestWindow(): Window {
    return requestWindowAsync().await()
}

/**
 * The **`requestWindow()`** method of the DocumentPictureInPicture interface opens the Picture-in-Picture window for the current main browsing context. It returns a Promise that fulfills with a Window instance representing the browsing context inside the Picture-in-Picture window.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/requestWindow)
 */
suspend inline fun DocumentPictureInPicture.requestWindow(options: DocumentPictureInPictureOptions): Window {
    return requestWindowAsync(
        options = options,
    ).await()
}

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/DocumentPictureInPicture/enter_event)
 */
inline val <C : DocumentPictureInPicture> C.enterEvent: EventInstance<DocumentPictureInPictureEvent, C, C>
    get() = EventInstance(this, "enter")
