// Automatically generated - do not modify!

package electron.core

external interface Metadata {
    /**
     * Updated area of frame, can be considered as the `dirty` area.
     */
    var captureUpdateRect: Rectangle?

    /**
     * May reflect the frame's contents origin if region capture is used internally.
     */
    var regionCaptureRect: Rectangle?

    /**
     * Full size of the source frame.
     */
    var sourceSize: Rectangle?

    /**
     * The increasing count of captured frame. May contain gaps if frames are dropped
     * between two consecutively received frames.
     */
    var frameCount: Double?
}
