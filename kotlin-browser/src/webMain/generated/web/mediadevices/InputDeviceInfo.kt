// Automatically generated - do not modify!

package web.mediadevices

import web.mediastreams.MediaTrackCapabilities

/**
 * The **`InputDeviceInfo`** interface of the Media Capture and Streams API gives access to the capabilities of the input device that it represents.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo)
 */
open external class InputDeviceInfo
private constructor() :
    MediaDeviceInfo {
    /**
     * The **`getCapabilities()`** method of the InputDeviceInfo interface returns a `MediaTrackCapabilities` object describing the primary audio or video track of the device's MediaStream.
     *
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities)
     */
    fun getCapabilities(): MediaTrackCapabilities
}
