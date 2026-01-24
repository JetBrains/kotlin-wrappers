// Automatically generated - do not modify!

package web.xr

import js.promise.Promise
import kotlin.js.JsString

open external class XRAnchor
private constructor() {
    /**
     * An XRSpace object to locate the anchor relative to other XRSpace objects.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xranchor-anchorspace
     */
    val anchorSpace: XRSpace

    /**
     * When persistent anchors are supported, this method can be used to request a persistent
     * handle for the anchor. The returned handle is a string which uniquely identifies the anchor.
     *
     * If the anchor is deleted, the promise will be rejected with a InvalidStateError.
     *
     * @see https://immersive-web.github.io/anchors/#dom-xranchor-requestpersistenthandle
     */
    var requestPersistentHandle: (() -> Promise<JsString>)?
    fun delete()
}
