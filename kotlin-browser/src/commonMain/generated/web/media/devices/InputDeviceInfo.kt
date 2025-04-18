// Automatically generated - do not modify!

package web.media.devices

import web.media.streams.MediaTrackCapabilities

/**
 * The **`InputDeviceInfo`** interface of the Media Capture and Streams API gives access to the capabilities of the input device that it represents.
 * Available only in secure contexts.
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo)
 */
external class InputDeviceInfo
private constructor() :
    MediaDeviceInfo {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/InputDeviceInfo/getCapabilities)
     */
    fun getCapabilities(): MediaTrackCapabilities
}
