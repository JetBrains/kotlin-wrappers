package karakum.browser

private val INCLUDED = setOf(
    "XRHitResult",
    "XRViewport",
    "XRRenderState",
    "XRInputSource",
    "XRPose",
    "XRFrame",
    "XRViewerPose",
    "XRView",
    "XRAnchor",
    "XRTransientInputHitTestResult",
    "XRHitTestSource",
    "XRTransientInputHitTestSource",
    "XRPlane",
    "XRMesh",
    "XRSpace",
    "XRLayer",
    "XRJointSpace",
    "XRJointPose",
    "XRProjectionLayer",
    "XRCylinderLayer",
    "XRQuadLayer",
    "XREquirectLayer",
    "XRCubeLayer",
    "XRSubImage",
    "XRWebGLSubImage",
    "XRSessionGrant",
    "XRDepthInformation",
    "XRCPUDepthInformation",
    "XRWebGLDepthInformation",
    "XRWebGLBinding",
    "XRHitTestResult",
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

            if (name !in INCLUDED && (!name.startsWith("XR") || !name.endsWith("Init")))
                return@mapNotNull null

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
        "XRReferenceSpace",
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
