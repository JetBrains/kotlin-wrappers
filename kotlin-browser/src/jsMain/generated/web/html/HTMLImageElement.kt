// Automatically generated - do not modify!

package web.html

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync
import web.dom.HTMLOrSVGImageElement
import web.gl.TexImageSource
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy

/**
 * Provides special properties and methods for manipulating <img> elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement)
 */
open external class HTMLImageElement
protected constructor() :
    HTMLElement,
    TexImageSource,
    HTMLOrSVGImageElement {
    /**
     * Sets or retrieves a text alternative to the graphic.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/alt)
     */
    var alt: String

    /**
     * Retrieves whether the object is fully loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/complete)
     */
    val complete: Boolean

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/currentSrc)
     */
    val currentSrc: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding)
     */
    var decoding: ImageDecoding

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority)
     */
    var fetchPriority: FetchPriority

    /**
     * Sets or retrieves the height of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/height)
     */
    var height: Int

    /**
     * Sets or retrieves whether the image is a server-side image map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/isMap)
     */
    var isMap: Boolean

    /**
     * Sets or retrieves the policy for loading image elements that are outside the viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading)
     */
    var loading: Loading

    /**
     * The original height of the image resource before sizing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalHeight)
     */
    val naturalHeight: Int

    /**
     * The original width of the image resource before sizing.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalWidth)
     */
    val naturalWidth: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/sizes)
     */
    var sizes: String

    /**
     * The address or URL of the a media resource that is to be considered.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/src)
     */
    var src: String

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/srcset)
     */
    var srcset: String

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/useMap)
     */
    var useMap: String

    /**
     * Sets or retrieves the width of the object.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/width)
     */
    var width: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/x)
     */
    val x: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/y)
     */
    val y: Int

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
     */
    @JsAsync
    suspend fun decode()

    @JsName("decode")
    fun decodeAsync(): Promise<Void>
}
