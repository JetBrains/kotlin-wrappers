package electron.core


external interface Streams {
    var video: (Any /* (Video) | (WebFrameMain) */)?

    /**
     * If a string is specified, can be `loopback` or `loopbackWithMute`. Specifying a
     * loopback device will capture system audio, and is currently only supported on
     * Windows. If a WebFrameMain is specified, will capture audio from that frame.
     */
    var audio: (Any /* (('loopback' | 'loopbackWithMute')) | (WebFrameMain) */)?

    /**
     * If `audio` is a WebFrameMain and this is set to `true`, then local playback of
     * audio will not be muted (e.g. using `MediaRecorder` to record `WebFrameMain`
     * with this flag set to `true` will allow audio to pass through to the speakers
     * while recording). Default is `false`.
     */
    var enableLocalEcho: Boolean?
}
