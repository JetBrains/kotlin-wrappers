package karakum.browser

import karakum.common.snakeToCamel
import karakum.events.EventDataRegistry

private val OVERRIDEN_HTML_EVENTS = setOf(
    "abort",
    "error",
    "load",
    "select",
)

internal fun List<ConversionResult>.withEventInstances(
    knownEventTypes: Set<String>,
): List<ConversionResult> =
    map { declaration ->
        val name = declaration.name
        val dataList = EventDataRegistry.getDataList(name)
            ?.filter { it.type in knownEventTypes }
            ?.ifEmpty { null }
            ?: return@map declaration

        val events = dataList.joinToString("\n\n") { data ->
            val memberName = EVENT_CORRECTION_MAP
                .getOrDefault(data.type, data.type)
                .snakeToCamel()

            val thisType = when (name) {
                "IDBRequest" -> "$name<T>  /* this */"
                else -> "$name /* this */"
            }

            val targetType = EventDataRegistry.getTarget(
                currentTarget = name,
                eventType = data.type,
                defaultTarget = thisType,
            )

            val eventType = when (val eventClass = data.`interface`) {
                "MessageEvent" -> "$eventClass<JsAny?>"
                else -> eventClass
            }

            val modifier = when {
                name == "Element" -> "open"

                name.startsWith("HTML")
                        && name.endsWith("Element")
                        && data.type in OVERRIDEN_HTML_EVENTS
                    -> "override"

                data.type == "success" -> when (name) {
                    "IDBRequest" -> "open"
                    "IDBOpenDBRequest" -> "override"
                    else -> ""
                }

                else -> ""
            }

            """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$name/${data.type}_event)
             */
            @JsEvent("${data.type}")
            $modifier val ${memberName}Event: $EVENT_INSTANCE<$eventType, $thisType, $targetType>
            """.trimIndent()
        }

        val oldBody = declaration.body
        val newBody = when {
            "companion object" in oldBody
                -> oldBody.replace("companion object", "\n$events\n\ncompanion object")

            "\n}" in oldBody
                -> oldBody.replace("\n}", "\n$events\n}")

            else -> TODO()
        }

        declaration.copy(body = newBody)
    }
