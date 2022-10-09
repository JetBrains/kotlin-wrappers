// Automatically generated - do not modify!

package dom.html

import kotlinx.js.Void
import kotlin.js.Promise

sealed external class HTMLImageElement :
    HTMLElement {
    /** Sets or retrieves a text alternative to the graphic. */
    var alt: String

    /** Retrieves whether the object is fully loaded. */
    val complete: Boolean
    var crossOrigin: String?
    val currentSrc: String
    var decoding: String /* "async" | "sync" | "auto" */

    /** Sets or retrieves the height of the object. */
    var height: Number

    /** Sets or retrieves whether the image is a server-side image map. */
    var isMap: Boolean

    /** Sets or retrieves the policy for loading image elements that are outside the viewport. */
    var loading: String /* "eager" | "lazy" */

    /** The original height of the image resource before sizing. */
    val naturalHeight: Number

    /** The original width of the image resource before sizing. */
    val naturalWidth: Number
    var referrerPolicy: String
    var sizes: String

    /** The address or URL of the a media resource that is to be considered. */
    var src: String
    var srcset: String

    /** Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map. */
    var useMap: String

    /** Sets or retrieves the width of the object. */
    var width: Number
    val x: Number
    val y: Number
    fun decode(): Promise<Void>
}
