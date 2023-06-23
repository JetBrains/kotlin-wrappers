// Automatically generated - do not modify!

package web.html

import web.dom.DOMTokenList
import web.http.ReferrerPolicy
import web.window.WindowTarget

/**
 * Provides special properties and methods (beyond those of the regular object HTMLElement interface it also has available to it by inheritance) for manipulating the layout and presentation of <area> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement)
 */
abstract external class HTMLAreaElement :
    HTMLElement,
    HTMLHyperlinkElementUtils {
    /**
     * Sets or retrieves a text alternative to the graphic.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/alt)
     */
    var alt: String

    /**
     * Sets or retrieves the coordinates of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/coords)
     */
    var coords: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/download) */
    var download: String
    var ping: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/referrerPolicy) */
    var referrerPolicy: ReferrerPolicy

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/rel) */
    var rel: String

    /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/relList) */
    val relList: DOMTokenList

    /**
     * Sets or retrieves the shape of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/shape)
     */
    var shape: String

    /**
     * Sets or retrieves the window or frame at which to target content.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLAreaElement/target)
     */
    var target: WindowTarget
}
