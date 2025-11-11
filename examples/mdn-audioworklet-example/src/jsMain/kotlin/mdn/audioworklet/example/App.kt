package mdn.audioworklet.example

import js.function.unsafeAsync
import kotlinx.coroutines.flow.first
import web.audio.*
import web.console.console
import web.dom.ElementId
import web.dom.clickEvent
import web.dom.document
import web.dom.inputEvent
import web.events.addHandler
import web.events.invoke
import web.html.HTMLButtonElement
import web.html.HTMLInputElement
import web.window.loadEvent
import web.window.window
import web.worklets.addModule

var _audioContext: AudioContext? = null
val audioContext: AudioContext
    get() = _audioContext ?: error("AudioContext not initialized")

lateinit var hissGainRange: HTMLInputElement
lateinit var oscGainRange: HTMLInputElement
lateinit var gainNode: GainNode
lateinit var hissGainParam: AudioParam

suspend fun main() {
    window.loadEvent().first()

    document.getElementById(ElementId("toggle"))
        .let { it as HTMLButtonElement }
        .clickEvent.addHandler { toggleSound() }

    hissGainRange = document.getElementById(ElementId("hiss-gain")) as HTMLInputElement
    oscGainRange = document.getElementById(ElementId("osc-gain")) as HTMLInputElement

    hissGainRange.inputEvent.addHandler { event ->
        val value = event.currentTarget.valueAsNumber.toFloat()
        hissGainParam.setValueAtTime(value, audioContext.currentTime)
    }

    oscGainRange.inputEvent.addHandler { event ->
        val value = event.currentTarget.valueAsNumber.toFloat()
        gainNode.gain.setValueAtTime(value, audioContext.currentTime)
    }

    hissGainRange.disabled = true
    oscGainRange.disabled = true
}

suspend fun createHissProcessor(): AudioWorkletNode? {
    if (_audioContext == null) {
        try {
            _audioContext = AudioContext()
        } catch (_: Throwable) {
            console.log("** Error: Unable to create audio context")
            return null
        }
    }

    var processorNode: AudioWorkletNode

    try {
        processorNode = AudioWorkletNode(audioContext, HISS_GENERATOR)
    } catch (_: Throwable) {
        try {
            console.log("adding...")
            audioContext.audioWorklet.addModule(HissGeneratorWorkletModule)
            processorNode = AudioWorkletNode(audioContext, HISS_GENERATOR)
        } catch (e: Throwable) {
            console.log("** Error: Unable to create worklet node: $e")
            return null
        }
    }

    audioContext.resume()
    return processorNode
}

suspend fun audioDemoStart() {
    val hissGenNode = createHissProcessor()
    if (hissGenNode == null) {
        console.log("** Error: unable to create hiss processor")
        return
    }
    val soundSource = OscillatorNode(audioContext)
    gainNode = audioContext.createGain()

    // Configure the oscillator node

    soundSource.type = OscillatorType.square
    soundSource.frequency.setValueAtTime(440f, audioContext.currentTime) // (A4)

    // Configure the gain for the oscillator

    gainNode.gain.setValueAtTime(oscGainRange.valueAsNumber.toFloat(), audioContext.currentTime)

    // Connect and start

    soundSource
        .connect(gainNode)
        .connect(hissGenNode)
        .connect(audioContext.destination)
    soundSource.start()

    // Get access to the worklet's gain parameter

    hissGainParam = hissGenNode.parameters.get(GAIN)!!
    hissGainParam.setValueAtTime(hissGainRange.valueAsNumber.toFloat(), audioContext.currentTime)
}

val toggleSound = unsafeAsync { ->
    if (_audioContext == null) {
        audioDemoStart()

        hissGainRange.disabled = false
        oscGainRange.disabled = false
    } else {
        hissGainRange.disabled = true
        oscGainRange.disabled = true

        audioContext.close()
        _audioContext = null
    }
}
