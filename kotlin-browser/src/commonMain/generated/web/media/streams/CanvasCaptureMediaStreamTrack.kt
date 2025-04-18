// Automatically generated - do not modify!

package web.media.streams

import web.html.HTMLCanvasElement

/**
 * The **`CanvasCaptureMediaStreamTrack`** interface of the Media Capture and Streams API represents the video track contained in a MediaStream being generated from a canvas following a call to HTMLCanvasElement.captureStream().
 *
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack)
 */
external class CanvasCaptureMediaStreamTrack
private constructor() :
    MediaStreamTrack {
    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack/canvas)
     */
    val canvas: HTMLCanvasElement

    /**
     * [MDN Reference](https://developer.mozilla.org/docs/Web/API/CanvasCaptureMediaStreamTrack/requestFrame)
     */
    fun requestFrame()
}
