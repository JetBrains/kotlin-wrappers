package karakum.browser

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
                        longest
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
            ) return@mapNotNull null

            val defaultBody = when {
                name.endsWith("Event")
                    -> """
                    // TBD
                    open external class $name(
                        type: EventType<$name>,
                        // init: ${name}Init = definedExternally,
                    ):Event
                    """.trimIndent()

                name == "XRInputSourceArray"
                    -> """
                    abstract /* open */
                    external class $name
                    private constructor() :
                        ListLike<${name.removeSuffix("Array")}>
                    """.trimIndent()

                name == "XRHand"
                    -> """
                    abstract /* open */
                    external class $name
                    private constructor() :
                        ReadonlyMap<XRHandJoint, XRJointSpace>
                    """.trimIndent()

                else -> null
            }

            if (defaultBody != null) {
                return@mapNotNull ConversionResult(
                    name = name,
                    body = defaultBody,
                    pkg = "web.xr",
                )
            }

            convertInterface(
                source = source,
                getStaticSource = { getStaticSource(it, content) },
                predefinedPkg = "web.xr",
            )?.withComment(fullSource = content, source = source)
                // TEMP
                ?.let { it.copy(body = it.body.replace("DOMPointInit", "DOMPointReadOnly")) }
        }

    val types = convertTypes(
        content = content,
        getPkg = { "web.xr" },
    ).filter { !it.name.endsWith("EventType") }

    val collections = Regex("""\ntype (XR[a-zA-Z]+) = Set<([a-zA-Z]+)>;""")
        .findAll(content)
        .map {
            val name = it.groupValues[1]
            val typeParameter = it.groupValues[2]

            ConversionResult(
                name = name,
                body = """
                abstract /* open */
                external class $name
                private constructor() :
                    MutableSetLike<$typeParameter>
                """.trimIndent(),
                pkg = "web.xr",
            )
        }

    return interfaces + types + collections
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
        .replace(Regex(""": (XR[a-zA-Z]+)EventHandler;"""), ": EventHandler<$1Event, *, *>;")
        .replace(Regex(""": (XR[a-zA-Z]+)EventHandler \| """), ": EventHandler<$1Event, *, *> | ")
        .replace("\n    // Events", "")
        .replace(": (evt: XRCompositionLayerEventMap[\"redraw\"]) => any;", ": EventHandler<XRLayerEvent, *, *>;")
        .replace(" =\n    | ", " = ")
        .replace("\n    | ", " | ")
        .replace(" {}\n", " {\n}\n")
        .replace("\n\n    ", "\n    ")
        .replace(",\n    )", ")")
        .replace(",\n        ", ", ")
        .replace("\n        ", "")
        .replace("?(): ", "?: () => ")
        .replace(" | null | undefined", " | undefined")
        .replace(Regex(""": readonly ([a-zA-Z]+\[])"""), ": $1")
        .replace(Regex("""declare abstract class (\w+) implements (\w+) \{\n}""")) { result ->
            val name = result.groupValues[1]
            require(name == result.groupValues[2])
            declareVar(name)
        }
        .replace(Regex("""declare class (\w+) \{\n {4}prototype: \w+;\n}""")) { result ->
            declareVar(result.groupValues[1])
        }
        .replace("\n// eslint-disable-next-line @typescript-eslint/no-empty-interface", "")
        .replace("\n// tslint:disable-next-line no-unnecessary-class", "")
        .replace("    // Legacy", "    /**\n     * Legacy\n     */")
        .replace(
            "cancelAnimationFrame(id: number): void;",
            "cancelAnimationFrame(id: FrameRequestId): void;",
        )
        .replace(
            "requestAnimationFrame(callback: XRFrameRequestCallback): number;",
            "requestAnimationFrame(callback: XRFrameRequestCallback): FrameRequestId;",
        )
        .patchInterface("XRWebGLSubImage") {
            it.replace("readonly textureWidth: number;", "readonly colorTextureWidth: number;")
                .replace("readonly textureHeight: number;", "readonly colorTextureHeight: number;")
        }
        .splitUnion("XRRigidTransform | DOMPointInit")
        .splitUnion("WebGLRenderingContext | WebGL2RenderingContext")
        .replace(Regex("""declare class .+? \{[\s\S]+?\n}""")) { result ->
            val content = result.value
            val name = content
                .substringAfter("declare class ")
                .substringBefore(" ")

            // TEMP
            if (name == "XRReferenceSpaceEvent")
                return@replace content

            val interfaceDeclaration = content
                .substringBefore(" {\n")
                .removePrefix("declare class ")
                .let { if (it == "$name implements $name") name else it }
                .let { "interface $it" }

            val interfaceMembers = mutableListOf<String>()
            val classMembers = mutableListOf<String>()

            content
                .substringAfter(" {\n")
                .substringBefore("\n}")
                .splitToSequence("\n")
                .filter { it.isNotEmpty() }
                .forEach { line ->
                    when {
                        line.startsWith("    static ")
                            -> classMembers.add(line.replaceFirst("static ", ""))

                        line.startsWith("    constructor(")
                            -> classMembers.add(
                            line.replaceFirst("constructor(", "new(").removeSuffix(";") + ": $name;"
                        )

                        else -> interfaceMembers.add(line)
                    }
                }

            sequenceOf("$interfaceDeclaration {")
                .plus(interfaceMembers)
                .plus("}")
                .plus("")
                .plus("declare var $name: {")
                .plus("    prototype: $name;")
                .plus(classMembers)
                .plus("};")
                .joinToString("\n")
        }

private fun declareVar(
    name: String,
): String = """
declare var $name: {
    prototype: $name;
    new(): $name;
};
""".trimIndent()
