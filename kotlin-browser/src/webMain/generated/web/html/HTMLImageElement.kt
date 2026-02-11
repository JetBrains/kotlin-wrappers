// Automatically generated - do not modify!

package web.html

import js.core.Void
import js.promise.Promise
import js.promise.await
import web.dom.HTMLOrSVGImageElement
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy
import kotlin.js.JsName

/**
 * The **`HTMLImageElement`** interface represents an HTML <img> element, providing the properties and methods used to manipulate image elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement)
 */
open external class HTMLImageElement
protected constructor() :
    HTMLElement,
    HTMLOrSVGImageElement,
    TexImageSource,
    GPUCopyExternalImageSource {
    /**
     * The **`alt`** property of the HTMLImageElement interface provides fallback (alternate) text to display when the image specified by the <img> element is not displayed, whether because of an error, because the user has disabled the loading of images, or because the image hasn't finished loading yet. It reflects the <img> element's alt content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/alt)
     */
    var alt: String

    /**
     * The **`complete`** read-only property of the HTMLImageElement interface is a Boolean value indicating whether or not the image has completely loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/complete)
     */
    val complete: Boolean

    /**
     * The **`crossOrigin`** property of the HTMLImageElement interface is a string which specifies the Cross-Origin Resource Sharing (CORS) setting to use when retrieving the image. It reflects the <img> element's crossorigin content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * The **`currentSrc`** read-only property of the HTMLImageElement interface indicates the URL of the image selected by the browser to load.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/currentSrc)
     */
    val currentSrc: String

    /**
     * The **`decoding`** property of the HTMLImageElement interface provides a hint to the browser as to how it should decode the image. More specifically, whether it should wait for the image to be decoded before presenting other content updates or not. It reflects the <img> element's decoding content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding)
     */
    var decoding: ImageDecoding

    /**
     * The **`fetchPriority`** property of the HTMLImageElement interface represents a hint to the browser indicating how it should prioritize fetching a particular image relative to other images. It reflects the <img> element's fetchpriority content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority)
     */
    var fetchPriority: FetchPriority

    /**
     * The **`height`** property of the HTMLImageElement interface indicates the height at which the image is drawn, in CSS pixels, if the image is being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's the natural, pixel density-corrected height of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/height)
     */
    var height: Int

    /**
     * The **`isMap`** property of the HTMLImageElement interface indicates that the image is part of a server-side map. If so, the coordinates where the user clicked on the image are sent to the server. It reflects the <img> element's ismap content attribute. This attribute is allowed only if the <img> element is a descendant of an <a> element with a valid href attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/isMap)
     */
    var isMap: Boolean

    /**
     * The **`loading`** property of the HTMLImageElement interface provides a hint to the user agent on how to handle the loading of the image which is currently outside the window's visual viewport. This helps to optimize the loading of the document's contents by postponing loading the image until it's expected to be needed, rather than immediately during the initial page load. It reflects the <img> element's loading content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading)
     */
    var loading: Loading

    /**
     * The read-only **`naturalHeight`** property of the HTMLImageElement interface returns the intrinsic (natural), density-corrected height of the image in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalHeight)
     */
    val naturalHeight: Int

    /**
     * The read-only **`naturalWidth`** property of the HTMLImageElement interface returns the intrinsic (natural), density-corrected width of the image in CSS pixels.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalWidth)
     */
    val naturalWidth: Int

    /**
     * The **`referrerPolicy`** property of the HTMLImageElement interface defining which referrer is sent when fetching the resource. It reflects the <img> element's referrerpolicy content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The **`sizes`** property of the HTMLImageElement interface allows you to specify the layout width of the image for each of a list of media queries. This provides the ability to automatically select among different images—even images of different orientations or aspect ratios—as the document state changes to match different media conditions. It reflects the <img> element's sizes content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/sizes)
     */
    var sizes: String

    /**
     * The **`src`** property of the HTMLImageElement interface specifies the image to display in the <img> element. It reflects the <img> element's src content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/src)
     */
    var src: String

    /**
     * The **`srcset`** property of the HTMLImageElement interface identifies one or more image candidate strings, separated using commas (,), each specifying image resources to use under given circumstances. Each image candidate string contains an image URL and an optional width or pixel density descriptor that indicates the conditions under which that candidate should be used instead of the image specified by the src property. It reflects the <img> element's srcset content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/srcset)
     */
    var srcset: String

    /**
     * The **`useMap`** property of the HTMLImageElement interface providing the name of the client-side image map to apply to the image. It reflects the <img> element's usemap content attribute.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/useMap)
     */
    var useMap: String

    /**
     * The **`width`** property of the HTMLImageElement interface indicates the width at which the image is drawn, in CSS pixels, if the image is being drawn or rendered to any visual medium such as a screen or printer. Otherwise, it's the natural, pixel density-corrected width of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/width)
     */
    var width: Int

    /**
     * The read-only **`x`** property of the HTMLImageElement interface indicates the x-coordinate of the <img> element's left border edge relative to the root element's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/x)
     */
    val x: Int

    /**
     * The read-onl**`y`** y property of the HTMLImageElement interface indicates the y-coordinate of the <img> element's top border edge relative to the root element's origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/y)
     */
    val y: Int

    /**
     * The **`decode()`** method of the HTMLImageElement interface returns a Promise that resolves once the image is decoded and is safe to be appended to the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
     */
    @JsName("decode")
    fun decodeAsync(): Promise<Void>
}

/**
 * The **`decode()`** method of the HTMLImageElement interface returns a Promise that resolves once the image is decoded and is safe to be appended to the DOM.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
 */
suspend inline fun HTMLImageElement.decode() {
    decodeAsync().await()
}
