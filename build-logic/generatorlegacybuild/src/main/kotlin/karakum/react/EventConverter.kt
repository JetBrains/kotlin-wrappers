package karakum.react

import karakum.browser.EVENT_INFO_MAP

internal fun convertNativeEvents(
    source: String,
): ConversionResult {
    val body = source.splitToSequence("\n")
        .filter { it.startsWith("type Native") }
        .joinToString("\n\n", postfix = "\n") { line ->
            val name = line.removePrefix("type ")
                .substringBefore(" = ")

            val alias = line.substringAfter(" = ")
                .removeSuffix(";")
                .let { EVENT_INFO_MAP.getValue(it).fqn }

            "typealias $name = $alias"
        }

    return ConversionResult("NativeEvents", body, Package.EVENTS)
}

private const val EVENT_HANDLER = "typealias EventHandler<E /* : SyntheticEvent */> = (event: E) -> Unit"

internal fun convertEventHandlers(
    source: String,
): ConversionResult {
    val handlers = source.splitToSequence("\n")
        .filter { it.startsWith("type ") && " = EventHandler<" in it }
        .joinToString("\n\n") { line ->
            line.replaceFirst("type ", "typealias ")
                .removeSuffix(";")
                .replace("<T = Element>", "<T>")
                .replace("SyntheticEvent<T>", "SyntheticEvent<T, *>")
                .replace("MouseEvent<T>", "MouseEvent<T, *>")
                .replace("UIEvent<T>", "UIEvent<T, *>")
        }

    val body = EVENT_HANDLER + "\n\n" + handlers

    return ConversionResult("EventHandlers", body, Package.EVENTS)
}

private const val DEFAULT_EVENT_IMPORTS = """
import web.dom.Element
import web.window.Window
import web.events.Event
import web.events.EventTarget
import web.events.EventType
import web.keyboard.ModifierKeyCode
import web.keyboard.KeyCode
import web.data.DataTransfer
import web.mouse.MouseButton
import web.mouse.MouseButtons
import web.time.DOMHighResTimeStamp
import web.popover.ToggleState
"""

internal fun convertEventInterface(
    name: String,
    source: String,
    typeConverter: TypeConverter,
): ConversionResult {
    val declaration = source.substringBefore(" {")
        .replaceFirst(" extends ", " : ")
        .replace(" = ", " : ")
        .replace(": object", ": Any")
        .replace(": any", ": Any")
        .replace("EventTarget & T", "T")
        .replace("SyntheticEvent<T>", "SyntheticEvent<T, Event>")
        .replace(
            "BaseSyntheticEvent<E : Any, C : Any, T : Any>",
            "BaseSyntheticEvent<E : Event, C : EventTarget, T : EventTarget>"
        )
        .replace("E :", "out E :")
        .replace("C :", "out C :")
        .replace("T :", "out T :")

    var members = convertMembers(source, true, typeConverter)
    when (name) {
        "ChangeEvent",
        "FocusEvent",
        "InvalidEvent",
            -> members = members
            .replaceFirst("val target:", "override val target:")

        "KeyboardEvent",
            -> members = members
            .replaceFirst("val code: String", "val code: KeyCode")

        "MouseEvent",
            -> members = members
            .replaceFirst("val button: Int", "val button: MouseButton")
            .replaceFirst("val buttons: Int", "val buttons: MouseButtons")

        "BaseSyntheticEvent",
            -> members = members
            .replaceFirst("val type: String", "val type: EventType<E>")

        "ToggleEvent",
            -> members = members
            .replaceFirst("val oldState: OldState", "val oldState: ToggleState")
            .replaceFirst("val newState: NewState", "val newState: ToggleState")
    }

    val body = DEFAULT_EVENT_IMPORTS.removePrefix("\n") +
            "\nexternal interface $declaration {\n" +
            members +
            "\n}\n"

    return ConversionResult(name, body, Package.EVENTS)
}
