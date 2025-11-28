package karakum.react

import karakum.browser.EVENT_CORRECTION_MAP
import karakum.browser.EVENT_INSTANCE
import karakum.common.snakeToCamel
import karakum.events.EventDataRegistry
import karakum.events.EventDataRegistry.isDomNodeTarget

internal fun FragmentInstanceEvents(): ConversionResult =
    ConversionResult(
        name = "FragmentInstance.events",
        body = events(),
        pkg = Package.REACT,
    )

private data class EventData(
    val type: String,
    val eventType: String,
    val currentTarget: String,
    val target: String,
    val docTarget: String = currentTarget,
)

private fun events(): String {
    val list = EventDataRegistry.getMergedDomDataList()
        .flatMap { data ->
            data.targets
                .filter { isDomNodeTarget(it.target) }
                .map { current ->
                    val currentTarget = current.target
                    val target = EventDataRegistry.getTarget(
                        currentTarget = currentTarget,
                        eventType = data.type,
                        defaultTarget = currentTarget,
                    )

                    EventData(
                        type = data.type,
                        eventType = data.`interface`,
                        currentTarget = currentTarget,
                        target = target,
                    )
                }
        }
        .sortedBy { it.type }
        .groupBy { it.type }
        .values
        .map { list ->
            list.singleOrNull()
                ?: EventData(
                    type = list.first().type,
                    eventType = list.map { it.eventType }.distinct().single(),
                    currentTarget = getTarget(list.map { it.currentTarget }.distinct()),
                    target = getTarget(list.map { it.target }.distinct()),
                    docTarget = getDocTarget(list.map { it.docTarget }.distinct()),
                )
        }

    val events = list.joinToString("\n\n") { data ->
        val memberName = EVENT_CORRECTION_MAP
            .getOrDefault(data.type, data.type)
            .snakeToCamel()

        """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/${data.docTarget}/${data.type}_event)
         */
        @ReactCanary
        inline val FragmentInstance.${memberName}Event: $EVENT_INSTANCE<${data.eventType}, ${data.currentTarget}, ${data.target}>
            get() = $EVENT_INSTANCE(this, "${data.type}")
        """.trimIndent()
    }

    return IMPORTS + "\n\n" + events
}

private fun getTarget(
    targets: List<String>,
): String {
    return targets.singleOrNull()
        ?: TARGET_MAP.getValue(targets.toSet())
}

private fun getDocTarget(
    targets: List<String>,
): String {
    val target = getTarget(targets)
    return if (target in targets) {
        target
    } else {
        targets.minOf { it }
    }
}

private val TARGET_MAP = mapOf(
    setOf("Element", "HTMLElement") to "Element",
    setOf("Element", "HTMLMediaElement") to "Element",
    setOf("HTMLElement", "MathMLElement", "SVGElement") to "Element",
    setOf("HTMLDialogElement", "HTMLInputElement") to "HTMLElement",
    setOf("HTMLDialogElement", "Node") to "Node",
    setOf("HTMLInputElement", "HTMLSelectElement") to "HTMLElement",
    setOf("HTMLElement", "MathMLElement", "SVGElement", "Text") to "Node",
    setOf("Element", "HTMLElement", "HTMLMediaElement", "HTMLSourceElement", "HTMLTrackElement") to "Element",
    setOf("HTMLButtonElement", "HTMLInputElement", "HTMLSelectElement", "HTMLTextAreaElement") to "HTMLElement",
    setOf("Element", "HTMLInputElement", "HTMLTextAreaElement") to "Element",
    setOf("Element", "HTMLElement", "HTMLTrackElement") to "Element",
)

private val IMPORTS = """
import react.canary.ReactCanary
import web.animations.AnimationEvent
import web.clipboard.ClipboardEvent
import web.command.CommandEvent
import web.components.HTMLSlotElement
import web.cssom.ContentVisibilityAutoStateChangeEvent
import web.cssom.TransitionEvent
import web.dnd.DragEvent
import web.dom.Element
import web.dom.Node
import web.events.Event
import web.events.EventInstance
import web.focus.FocusEvent
import web.form.FormDataEvent
import web.form.SubmitEvent
import web.gl.WebGLContextEvent
import web.html.HTMLCanvasElement
import web.html.HTMLDetailsElement
import web.html.HTMLDialogElement
import web.html.HTMLElement
import web.html.HTMLFormElement
import web.html.HTMLMediaElement
import web.html.HTMLTrackElement
import web.html.HTMLVideoElement
import web.html.MediaEncryptedEvent
import web.input.CompositionEvent
import web.input.InputEvent
import web.keyboard.KeyboardEvent
import web.messaging.MessageEvent
import web.mouse.MouseEvent
import web.mouse.WheelEvent
import web.pip.PictureInPictureEvent
import web.pointer.PointerEvent
import web.popover.ToggleEvent
import web.touch.TouchEvent
""".trimIndent()
