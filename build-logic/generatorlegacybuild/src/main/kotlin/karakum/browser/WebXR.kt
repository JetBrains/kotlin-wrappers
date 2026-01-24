package karakum.browser

private val EXCLUDED = setOf(
    "XRInputSourceArray",
    "XRHand",
    "XRCompositionLayer",
)

internal fun webXrDeclarations(
    source: String,
): Sequence<ConversionResult> {
    val content = webXrContent(source)

    val interfaces = Regex("""\ninterface .+? \{[\s\S]*?\n}""")
        .findAll(content)
        .map { it.value.removePrefix("\n") }
        .groupBy(::getInterfaceName)
        .values
        .asSequence()
        .map { sources ->
            sources.singleOrNull() ?: run {
                val declarations = sources.asSequence()
                    .map { it.substringBefore(" {\n") }
                    .toSet()

                val declaration = declarations.singleOrNull()
                    ?: run {
                        val longest = declarations.max()
                        require(declarations.all { longest.startsWith(it) })
                    }

                val body = sources.asSequence()
                    .map { it.substringAfter(" {\n") }
                    .map { it.substringBefore("\n}") }
                    .joinToString("\n")

                "$declaration {\n$body\n}"
            }
        }
        .mapNotNull { source ->
            val name = getInterfaceName(source)

            if (
                !name.startsWith("XR")
                || name.endsWith("EventHandler")
                || name.endsWith("EventMap")
                || name in EXCLUDED
            ) return@mapNotNull null

            if (name.endsWith("Event")) {
                return@mapNotNull ConversionResult(
                    name = name,
                    body = """
                    // TBD
                    open external class $name(
                        type: EventType<$name>,
                        // init: ${name}Init = definedExternally,
                    ):Event
                    """.trimIndent(),
                    pkg = "web.xr",
                )
            }

            convertInterface(
                source = source,
                getStaticSource = { getStaticSource(it, content) },
                predefinedPkg = "web.xr",
            )?.withComment(fullSource = content, source = source)
        }

    val tempClasses = sequenceOf(
        "XRRay",
        "XRRigidTransform",
        "XRHand",
        "XRCompositionLayer",
        "XRWebGLLayer",

        "XRSession",
    ).map {
        ConversionResult(
            name = it,
            body = "// TBD\nopen external class $it\nprivate constructor()",
            pkg = "web.xr",
        )
    }

    val types = convertTypes(
        content = content,
        getPkg = { "web.xr" },
    ).filter { !it.name.endsWith("EventType") }

    return interfaces + types + tempClasses
}

private fun getInterfaceName(source: String): String = source
    .substringAfter(" ")
    .substringBefore(" ")

internal fun webXrContent(
    content: String,
): String =
    content
        .replace(Regex("""\n?\n {4}addEventListener[\s\S]*?\): void;"""), "")
        .replace(Regex("""\n?\n {4}removeEventListener[\s\S]*?\): void;"""), "")
        .replace(Regex(""": (XR\w+)EventHandler;"""), ": EventHandler<$1Event, *, *>;")
        .replace(" =\n    | ", " = ")
        .replace("\n    | ", " | ")
        .replace(" {}\n", " {\n}\n")
        .replace("\n\n    ", "\n    ")
        .replace(" | null | undefined", " | undefined")
        .replace("Set = Set<", "Set = MutableSetLike<")
        .replace(Regex(""": readonly ([a-zA-Z]+\[])"""), ": $1")
        .replace(Regex("""declare abstract class (\w+) implements (\w+) \{\n}""")) { result ->
            val name = result.groupValues[1]
            val parentName = result.groupValues[2]

            if (name == parentName) {
                """
                declare var $name: {
                    prototype: $name;
                    new(): $name;
                };
                """.trimIndent()
            } else result.value
        }
        .replace("\n// eslint-disable-next-line @typescript-eslint/no-empty-interface", "")
        .patchInterface("XRWebGLSubImage") {
            it.replace("readonly textureWidth: number;", "readonly colorTextureWidth: number;")
                .replace("readonly textureHeight: number;", "readonly colorTextureHeight: number;")
        }
