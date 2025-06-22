package karakum.browser

import karakum.common.snakeToCamel
import karakum.events.EventDataRegistry

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

            val receiver = if ("open external" in declaration.body) "C" else name
            val typeParameters = when {
                receiver != "C" -> ""
                name == "IDBRequest" -> "<C : $name<*>>"
                else -> "<C : $name>"
            }

            val targetType = EventDataRegistry.getTarget(
                currentTarget = name,
                eventType = data.type,
                defaultTarget = receiver,
            )

            val eventType = when (val eventClass = data.`interface`) {
                "MessageEvent" -> "$eventClass<JsAny?>"
                else -> eventClass
            }

            """
            /**
             * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$name/${data.type}_event)
             */
            inline val $typeParameters $receiver.${memberName}Event: $EVENT_INSTANCE<$eventType, $receiver, $targetType>
                get() = $EVENT_INSTANCE(this, "${data.type}")
            """.trimIndent()
        }

        declaration.copy(body = declaration.body + "\n\n" + events)
    }
