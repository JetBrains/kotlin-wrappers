package karakum.events

import karakum.browser.EVENT_DATA
import karakum.browser.SERVICE_WORKER_EVENT_DATA
import karakum.browser.WEB_WORKER_EVENT_DATA
import karakum.browser.XR_EVENT_DATA
import kotlinx.serialization.json.Json
import org.gradle.kotlin.dsl.provideDelegate
import java.io.File

private const val THIS = "<this>"

private data class EventInstance(
    val target: String,
    val type: String,
)

object EventDataRegistry {
    lateinit var sourceFile: File

    private val json = Json {
        explicitNulls = false
    }

    private val dataList: List<EventData> by lazy {
        json.decodeFromString<List<EventData>>(sourceFile.readText())
            .map { data ->
                when {
                    data.`interface` == "Event"
                            && data.targets.any { it.target == "ServiceWorkerContainer" }
                            && (data.type == "message" || data.type == "messageerror")
                        -> data.copy(
                        `interface` = "MessageEvent",
                    )

                    data.`interface` == "Event"
                            && (data.type == "blur" || data.type == "focus")
                        -> data.copy(
                        `interface` = "FocusEvent",
                    )

                    else -> data
                }
            }
    }

    fun isDomNodeTarget(
        target: String,
    ): Boolean =
        when {
            target == "Text" -> true
            target == "Element" -> true
            target == "MathMLElement" -> true

            // TEMP
            target == "HTMLPortalElement" -> false

            !target.endsWith("Element") -> false
            else -> target.startsWith("HTML") || target.startsWith("SVG")
        }

    fun getMergedDomDataList(): List<EventData> {
        return dataList.asSequence()
            .filter { !it.type.startsWith("DOM") }
            .filter { it.`interface` in KNOWN_EVENT_CLASSES }
            .filter { data ->
                data.targets.asSequence()
                    .map { it.target }
                    .any(::isDomNodeTarget)
            }
            .toList()
    }

    private fun Target.targetWithAliases(
        eventType: String,
    ): Sequence<String> {
        return sequenceOf(target)
            .plus(
                when {
                    target == "HTMLSlotElement"
                        -> sequenceOf("ShadowRoot", "GlobalEventHandlers")

                    target == "Element"
                            || (target.startsWith("HTML") && target.endsWith("Element"))
                        -> sequenceOf("GlobalEventHandlers")

                    target == "Window"
                        -> sequenceOf("WindowEventHandlers")

                    target == "Worker"
                        -> sequenceOf("AbstractWorker", "MessageEventTarget")

                    // TEMP?
                    eventType == "securitypolicyviolation"
                        -> sequenceOf("GlobalEventHandlers")

                    else -> emptySequence()
                }
            )
            .plus(bubblingPath)
            .distinct()
    }

    private val KNOWN_EVENT_CLASSES: Set<String> =
        sequenceOf(EVENT_DATA, XR_EVENT_DATA, WEB_WORKER_EVENT_DATA, SERVICE_WORKER_EVENT_DATA)
            .flatten()
            .map { it.name }
            .toSet()

    private val dataMap: Map<String, List<EventData>> by lazy {
        dataList.asSequence()
            .filter { it.`interface` in KNOWN_EVENT_CLASSES }
            .flatMap { data ->
                data.targets.asSequence()
                    .flatMap { sequenceOf(it.target) + it.bubblingPath }
                    .filter { it != "Node" }
                    .map { it to data }
            }
            .distinctBy { (target, data) -> target to data.type }
            .groupBy({ it.first }, { it.second })
    }

    private val targetMap: Map<EventInstance, String> by lazy {
        dataList.asSequence()
            .flatMap { data ->
                val type = data.type
                data.targets.asSequence().flatMap {
                    val defaultEventTarget = if (it.bubbles) {
                        it.bubblingPath.first()
                    } else null

                    it.targetWithAliases(type).map { target ->
                        val eventTarget = defaultEventTarget ?: THIS

                        EventInstance(target, type) to eventTarget
                    }
                }
            }
            .toMap()
    }

    fun getTarget(
        currentTarget: String,
        eventType: String,
        defaultTarget: String = currentTarget,
    ): String {
        val className = currentTarget.substringBefore("<")
        return targetMap.getValue(EventInstance(className, eventType))
            .takeIf { it != THIS }
            ?: defaultTarget
    }

    fun getDataList(className: String): List<EventData>? =
        dataMap[className]
}
