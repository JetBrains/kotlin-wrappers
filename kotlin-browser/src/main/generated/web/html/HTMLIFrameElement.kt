// Automatically generated - do not modify!

package web.html

import dom.DOMTokenList
import dom.Document
import web.http.ReferrerPolicy
import web.window.WindowProxy

abstract external class HTMLIFrameElement :
    HTMLElement {
    var allow: String
    var allowFullscreen: Boolean

    /** Retrieves the document object of the page or frame. */
    val contentDocument: Document?

    /** Retrieves the object of the specified. */
    val contentWindow: WindowProxy?

    /** Sets or retrieves the height of the object. */
    var height: String

    /** Sets or retrieves the frame name. */
    var name: String
    var referrerPolicy: ReferrerPolicy
    val sandbox: DOMTokenList

    /** Sets or retrieves a URL to be loaded by the object. */
    var src: String

    /** Sets or retrives the content of the page that is to contain. */
    var srcdoc: String

    /** Sets or retrieves the width of the object. */
    var width: String
    fun getSVGDocument(): Document?
}
