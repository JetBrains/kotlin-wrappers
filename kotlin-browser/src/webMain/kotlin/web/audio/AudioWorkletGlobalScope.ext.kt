package web.audio

inline fun AudioWorkletGlobalScope.registerProcessor(
    name: String,
    reference: AudioWorkletProcessorReference<*>,
) {
    registerProcessor(name, reference.value)
}
