package web.audio

inline fun AudioWorkletGlobalScope.registerProcessor(
    name: AudioWorkletProcessorName,
    reference: AudioWorkletProcessorReference<*>,
) {
    registerProcessor(name, reference.value)
}
