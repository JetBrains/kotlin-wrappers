// Automatically generated - do not modify!

package web.audio

external class AudioBufferSourceNode(
    context: BaseAudioContext,
    options: AudioBufferSourceOptions = definedExternally,
) : AudioScheduledSourceNode {
    var buffer: AudioBuffer?
    val detune: AudioParam
    var loop: Boolean
    var loopEnd: Number
    var loopStart: Number
    val playbackRate: AudioParam
    fun start(
        `when`: Number = definedExternally,
        offset: Number = definedExternally,
        duration: Number = definedExternally,
    )
}
