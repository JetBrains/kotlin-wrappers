// Automatically generated - do not modify!

package web.mediasource

import js.serialization.Transferable

/**
 * The **`MediaSourceHandle`** interface of the Media Source Extensions API is a proxy for a MediaSource that can be transferred from a dedicated worker back to the main thread and attached to a media element via its HTMLMediaElement.srcObject property. MediaSource objects are not transferable because they are event targets, hence the need for MediaSourceHandles.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaSourceHandle)
 */
open external class MediaSourceHandle
private constructor() :
    Transferable
