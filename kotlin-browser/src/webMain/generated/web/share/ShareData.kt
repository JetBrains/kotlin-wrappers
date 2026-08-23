// Automatically generated - do not modify!

package web.share

import js.array.ReadonlyArray
import kotlinx.js.JsPlainObject
import web.file.File

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare#data)
 */
@JsPlainObject
external interface ShareData {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare#files)
     */
    var files: ReadonlyArray<File>?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare#text)
     */
    var text: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare#title)
     */
    var title: String?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Navigator/canShare#url)
     */
    var url: String?
}
