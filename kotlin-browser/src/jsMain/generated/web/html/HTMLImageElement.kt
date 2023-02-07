// Automatically generated - do not modify!

package web.html

import js.core.Void
import web.http.ReferrerPolicy
import kotlin.js.Promise

abstract external class HTMLImageElement :
    HTMLElement {
    /** Sets or retrieves a text alternative to the graphic. */
    var alt: String

    /** Retrieves whether the object is fully loaded. */
    val complete: Boolean
    var crossOrigin: CrossOrigin?
    val currentSrc: String
    var decoding: ImageDecoding

    /** Sets or retrieves the height of the object. */
    var height: Double

    /** Sets or retrieves whether the image is a server-side image map. */
    var isMap: Boolean

    /** Sets or retrieves the policy for loading image elements that are outside the viewport. */
    var loading: Loading

    /** The original height of the image resource before sizing. */
    val naturalHeight: Int

    /** The original width of the image resource before sizing. */
    val naturalWidth: Int
    var referrerPolicy: ReferrerPolicy
    var sizes: String

    /** The address or URL of the a media resource that is to be considered. */
    var src: String
    var srcset: String

    /** Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map. */
    var useMap: String

    /** Sets or retrieves the width of the object. */
    var width: Double
    val x: Double
    val y: Double
    fun decode(): Promise<Void>
}
