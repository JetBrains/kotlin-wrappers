// Automatically generated - do not modify!

package web.html

import js.core.Void
import js.promise.Promise
import js.promise.internal.awaitPromiseLike
import web.dom.HTMLOrSVGImageElement
import web.gl.TexImageSource
import web.gpu.GPUCopyExternalImageSource
import web.http.CrossOrigin
import web.http.FetchPriority
import web.http.ReferrerPolicy
import kotlin.js.JsName

/**
 * The **`HTMLImageElement`** interface represents an HTML img element, providing the properties and methods used to manipulate image elements.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement)
 */
open external class HTMLImageElement
protected constructor() :
    HTMLElement,
    TexImageSource,
    HTMLOrSVGImageElement,
    GPUCopyExternalImageSource {
    /**
     * The HTMLImageElement property **`alt`** provides fallback (alternate) text to display when the image specified by the img element is not loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/alt)
     */
    var alt: String

    /**
     * The read-only HTMLImageElement interface's **`complete`** attribute is a Boolean value which indicates whether or not the image has completely loaded.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/complete)
     */
    val complete: Boolean

    /**
     * The HTMLImageElement interface's **`crossOrigin`** attribute is a string which specifies the Cross-Origin Resource Sharing (CORS) setting to use when retrieving the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/crossOrigin)
     */
    var crossOrigin: CrossOrigin?

    /**
     * The read-only HTMLImageElement property **`currentSrc`** indicates the URL of the image which is currently presented in the img element it represents.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/currentSrc)
     */
    val currentSrc: String

    /**
     * The **`decoding`** property of the HTMLImageElement interface provides a hint to the browser as to how it should decode the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decoding)
     */
    var decoding: ImageDecoding

    /**
     * The **`fetchPriority`** property of the HTMLImageElement interface represents a hint to the browser indicating how it should prioritize fetching a particular image relative to other images.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/fetchPriority)
     */
    var fetchPriority: FetchPriority

    /**
     * The **`height`** property of the drawn, in CSS pixel if the image is being drawn or rendered to any visual medium such as the screen or a printer; otherwise, it's the natural, pixel density corrected height of the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/height)
     */
    var height: Int

    /**
     * The HTMLImageElement property **`isMap`** is a Boolean value which indicates that the image is to be used by a server-side image map.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/isMap)
     */
    var isMap: Boolean

    /**
     * The HTMLImageElement property **`loading`** is a string whose value provides a hint to the user agent on how to handle the loading of the image which is currently outside the window's visual viewport.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/loading)
     */
    var loading: Loading

    /**
     * The HTMLImageElement interface's **`naturalHeight`** property is a read-only value which returns the intrinsic (natural), density-corrected height of the image in This is the height the image is if drawn with nothing constraining its height; if you don't specify a height for the image, or place the image inside a container that either limits or expressly specifies the image height, it will be rendered this tall.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalHeight)
     */
    val naturalHeight: Int

    /**
     * The HTMLImageElement interface's read-only **`naturalWidth`** property returns the intrinsic (natural), density-corrected width of the image in CSS pixel.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/naturalWidth)
     */
    val naturalWidth: Int

    /**
     * The **`HTMLImageElement.referrerPolicy`** property reflects the HTML `referrerpolicy` attribute of the resource.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/referrerPolicy)
     */
    var referrerPolicy: ReferrerPolicy

    /**
     * The HTMLImageElement property **`sizes`** allows you to specify the layout width of the image for each of a list of media conditions.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/sizes)
     */
    var sizes: String

    /**
     * The HTMLImageElement property **`src`**, which reflects the HTML `src` attribute, specifies the image to display in the img element.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/src)
     */
    var src: String

    /**
     * The HTMLImageElement property **`srcset`** is a string which identifies one or more **image candidate strings**, separated using commas (`,`) each specifying image resources to use under given circumstances.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/srcset)
     */
    var srcset: String

    /**
     * The **`useMap`** property on the providing the name of the client-side image map to apply to the image.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/useMap)
     */
    var useMap: String

    /**
     * The **`width`** property of the drawn in CSS pixel if it's being drawn or rendered to any visual medium such as a screen or printer.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/width)
     */
    var width: Int

    /**
     * The read-only HTMLImageElement property **`x`** indicates the x-coordinate of the origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/x)
     */
    val x: Int

    /**
     * The read-only HTMLImageElement property **`y`** indicates the y-coordinate of the origin.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/y)
     */
    val y: Int

    /**
     * The **`decode()`** method of the HTMLImageElement interface returns a it to the DOM.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
     */
    @JsName("decode")
    fun decodeAsync(): Promise<Void>
}

/**
 * The **`decode()`** method of the HTMLImageElement interface returns a it to the DOM.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/HTMLImageElement/decode)
 */
suspend inline fun HTMLImageElement.decode() {
    awaitPromiseLike(decodeAsync())
}
