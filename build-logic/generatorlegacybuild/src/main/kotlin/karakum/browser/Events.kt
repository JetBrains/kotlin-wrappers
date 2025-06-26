package karakum.browser

private const val EVENT = "Event"

private data class EventData(
    val name: String,
    val type: String,
) {
    val typeName: String = type.substringBefore("<")
}

private val ADDITIONAL_EVENTS = listOf(
    EventData(
        name = "webkitfullscreenchange",
        type = "Event",
    ),

    // TEMP
    EventData(
        name = "uncapturederror",
        type = "GPUUncapturedErrorEvent",
    ),

    // Payment
    EventData(
        name = "shippingaddresschange",
        type = "PaymentRequestUpdateEvent",
    ),
    EventData(
        name = "shippingoptionchange",
        type = "PaymentRequestUpdateEvent",
    ),
    EventData(
        name = "payerdetailchange",
        type = "PaymentRequestUpdateEvent",
    ),

    // Document
    EventData(
        name = "resume",
        type = "Event",
    ),
    // HTMLMediaElement
    EventData(
        name = "progress",
        type = "Event",
    ),
    EventData(
        name = "input",
        type = "InputEvent",
    ),
    EventData(
        name = "toggle",
        type = "ToggleEvent",
    ),
    EventData(
        name = "beforetoggle",
        type = "ToggleEvent",
    ),
    EventData(
        name = "success",
        type = "IDBVersionChangeEvent",
    ),
)

private val EXCLUDED = setOf(
    // deprecated
    "AudioProcessingEvent",
    "MediaRecorderErrorEvent",
    "TextEvent",
)

internal fun eventDeclarations(
    content: String,
    webWorkerContent: String,
    serviceWorkersContent: String,
): Pair<List<ConversionResult>, Set<String>> {
    val dataMap = EventDataMap(content + "\n\n" + webWorkerContent + "\n\n" + serviceWorkersContent)
    val results = sequenceOf<ConversionResult>()
        .plus(EventType())
        .plus(EventHandler())
        .plus(eventInstanceTypes())
        .plus(eventTargetTypes())
        .plus(HasTargets())
        .plus(eventPlaceholders(content, EVENT_DATA, dataMap, strict = true))
        .toList()

    return results to dataMap.knownEventTypes
}

internal fun webWorkersEventDeclarations(
    webWorkersContent: String,
): List<ConversionResult> {
    val dataMap = EventDataMap(webWorkersContent)
    return eventPlaceholders(webWorkersContent, WEB_WORKER_EVENT_DATA, dataMap)
}

internal fun serviceWorkersEventDeclarations(
    content: String,
    serviceWorkersContent: String,
): List<ConversionResult> {
    val dataMap = EventDataMap(content + "\n\n" + serviceWorkersContent)
    return eventPlaceholders(serviceWorkersContent, SERVICE_WORKER_EVENT_DATA, dataMap)
}

private fun eventPlaceholders(
    source: String,
    data: List<EventInfo>,
    dataMap: EventDataMap,
    strict: Boolean = false,
): List<ConversionResult> {
    if (strict) {
        val eventNames = Regex("""interface ([\w\d]+Event) extends """)
            .findAll(source)
            .map { it.groupValues[1] }
            .filter { it !in EXCLUDED }
            .toList()

        val knownEventNames = data.map { it.name }.toSet()
        val unknownEventNames = eventNames.filter { it !in knownEventNames }

        check(unknownEventNames.isEmpty()) {
            "Unknown events:\n" + unknownEventNames.joinToString("\n")
        }
    }

    return data.flatMap { info ->
        val types = eventTypes(
            eventName = info.name,
            types = dataMap.getEventTypes(info.name),
        )

        event(
            source = source,
            name = info.name,
            pkg = info.pkg,
            types = types,
        )
    }
}

private fun event(
    source: String,
    name: String,
    pkg: String,
    types: String?,
): Sequence<ConversionResult> {
    var initName = "${name}Init" +
            (if (name == "CustomEvent" || name == "MessageEvent") "<D = any>" else "")

    var initSource = source
        .substringAfter("\ninterface $initName ", "")
        .substringBefore(";\n}\n")

    if ("{\n}" in initSource)
        initSource = initSource.substringBefore("}")

    var initBody = if (initSource.isNotEmpty()) {
        val parentDeclaration = initSource
            .substringBefore("{\n")
            .replace("extends ", ":\n")

        val typeProvider = TypeProvider(initName)

        val membersSource = initSource
            .substringAfter("{\n")
            .trimIndent()

        val members = if (membersSource.isNotEmpty()) {
            membersSource
                .splitToSequence(";\n")
                .mapNotNull { convertMember(it, typeProvider) }
                .joinToString("\n")
        } else ""

        val declaration = initName
            .replace("<D = any>", "<D : JsAny?>") +
                " $parentDeclaration"

        sequenceOf(
            "@JsPlainObject",
            "external interface $declaration {",
            members,
            "}",
        ).joinToString("\n")
    } else ""

    val eventSource = source
        // MessageEvent
        .replace("<D = any>", "")
        .let {
            when (name) {
                EVENT -> " {\n" + it.substringAfter("\ninterface $name {\n")
                else -> it.substringAfter("\ninterface $name extends ")
            }
        }
        .substringBefore(";\n}\n")

    val eventParent = eventSource.substringBefore(" {\n")
    val eventIsInitLike = initBody.isNotEmpty()

    val eventParents = listOfNotNull(
        eventParent.takeIf { name != EVENT },
    )
    var eventParentDeclaration = if (eventParents.isNotEmpty()) {
        ": " + eventParents.joinToString(",\n")
    } else ""

    val typeProvider = TypeProvider(name)

    val eventMembers = eventSource.substringAfter(" {\n")
        .trimIndent()
        .splitToSequence(";\n")
        .mapNotNull { convertMember(it, typeProvider) }
        .joinToString("\n")
        // Event
        .replace("val type: String", "    // val type: String")

    val eventClassBody = source
        .substringAfter("\ndeclare var $name: {\n")
        .substringBefore(";\n};")
        .trimIndent()
        .removePrefix("prototype: $name;\n")

    val constructorSource = eventClassBody
        .removePrefix("new(")
        .removePrefix("new<T>(")
        .substringBefore("): $name")

    var eventConstructor = if (constructorSource.isNotEmpty()) {
        val withDataSupport = when (name) {
            "CustomEvent",
            "MessageEvent",
                -> true

            else -> false
        }

        val typeParameter = if (withDataSupport) "<D>" else ""
        val eventType = "EventType<$name$typeParameter>"

        val eventParameters = constructorSource
            .splitToSequence(", ")
            .map { p ->
                if ("?: " in p) {
                    p.replace("?: ", ": ") + " = definedExternally"
                } else {
                    val typeModifier = if (name == EVENT) "open" else "override"
                    val typeDeclaration = "$typeModifier val type: $eventType"

                    p.replace("type: string", typeDeclaration)
                        .replace(": string", ": String")
                }
            }
            .map {
                if ("InitDict: " in it || "Init: " in it) {
                    "init: " + it.substringAfter(": ")
                } else it
            }
            .joinToString(",\n")

        "(\n$eventParameters\n)"
    } else ""

    val companionSource = eventClassBody
        .substringAfter("\n", "")

    val companionMembers = if (companionSource.isNotEmpty()) {
        companionSource
            .splitToSequence(";\n")
            .mapNotNull { convertMember(it, typeProvider) }
            .joinToString("\n")
    } else null

    val companion = if (companionMembers != null) {
        "companion object {\n$companionMembers\n}"
    } else if (types != null) {
        "companion object"
    } else {
        null
    }

    val modifier = if (eventConstructor.isNotEmpty()) "open" else ""
    if (eventConstructor.isEmpty()) {
        eventConstructor = "\nprivate constructor()"
        eventParentDeclaration = eventParentDeclaration.replaceFirst(":", ":\n")
    }

    val typeParameters = when (name) {
        "CustomEvent",
        "MessageEvent",
            -> "<out D : JsAny?>"

        else -> ""
    }

    val body = listOfNotNull(
        eventMembers,
        companion,
    ).joinToString("\n\n")

    var eventBody = """
    $modifier external class $name$typeParameters $eventConstructor $eventParentDeclaration {
        $body
    }
    """.trimIndent()

    eventBody = eventBody
        .withComment(
            fullSource = source,
            source = "interface $name ",
        )
        // CustomEvent, MessageEvent
        .withComment(
            fullSource = source,
            source = "interface $name<",
        )

    if (eventIsInitLike) {
        val receiver = name + (if (typeParameters.isNotEmpty()) "<D>" else "")
        val extensionTypeParameters = typeParameters.replace("<out ", "<")

        val resultType = initName.replace("<D = any>", "<D>")

        eventBody += "\n\n" + """
                inline fun $extensionTypeParameters $receiver.asInit(): $resultType =
                    unsafeCast(this)
                """.trimIndent()
    }

    if (types != null) {
        eventBody += "\n\n$types"
    }

    if (name == "MediaQueryListEvent") {
        initBody = initBody.applyMediaQueryPatch()
        eventBody = eventBody.applyMediaQueryPatch()
    }

    initName = initName.substringBefore("<")

    return sequenceOf(
        ConversionResult(
            name = initName,
            body = initBody,
            pkg = pkg,
        ),
        ConversionResult(
            name = name,
            body = eventBody,
            pkg = pkg,
        ),
    ).filter { it.body.isNotEmpty() }
}

private class EventDataMap(
    content: String,
) {
    private val map = Regex("""interface .+?EventMap \{\n    "[\s\S]+?\n\}""")
        .findAll(content)
        .flatMap { parseEvents(it.value) }
        .filter { it.name != "orientationchange" }
        .filter { it.name != "pushsubscriptionchange" }
        .plus(ADDITIONAL_EVENTS)
        .distinct()
        .groupBy { it.typeName }
        .filter { it.key !in EXCLUDED }

    val knownEventTypes: Set<String> = map.values
        .flatMap { it.map(EventData::name) }
        .toSet()

    fun getEventTypes(
        eventName: String,
    ): List<String>? {
        val data = map[eventName]
            ?: return null

        return data.map { it.name }
    }
}

private fun eventTypes(
    eventName: String,
    types: List<String>?,
): String? {
    types ?: return null

    val eventType = when (eventName) {
        "MessageEvent",
            -> "$eventName<*>"

        else -> eventName
    }

    return types
        .sorted()
        .joinToString("\n\n") { name ->
            val memberName = EVENT_CORRECTION_MAP
                .getOrDefault(name, name)
                .uppercase()

            """
            inline val $eventName.Companion.$memberName: $EVENT_TYPE<$eventType>
                get() = $EVENT_TYPE("$name")
            """.trimIndent()
        }
}

private fun parseEvents(
    source: String,
): Sequence<EventData> {
    return source.splitToSequence("\n")
        .mapNotNull { parseEventData(it) }
}

private fun parseEventData(
    source: String,
): EventData? {
    if (!source.endsWith(";")) return null

    val (name, type) = source
        .removeSurrounding("    \"", ";")
        .split("\": ", "<")

    return EventData(
        name = name,
        type = type,
    )
}
