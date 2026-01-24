package karakum.browser

private val INCLUDED = setOf(
    "XRHitResult",
    "XRViewport",
    // "XRRenderState",
    "XRInputSource",
    "XRPose",
    // "XRFrame",
    "XRViewerPose",
    "XRView",
    "XRAnchor",
    "XRTransientInputHitTestResult",
    "XRHitTestSource",
    "XRTransientInputHitTestSource",
    "XRPlane",
    "XRMesh",
    // "XRSpace",
    // "XRLayer",
    "XRJointSpace",
    // "XRJointPose",
    "XRProjectionLayer",
    "XRCylinderLayer",
    "XRQuadLayer",
    "XREquirectLayer",
    "XRCubeLayer",
    "XRSubImage",
    // "XRWebGLSubImage",
    "XRSessionGrant",
    "XRDepthInformation",
    "XRWebGLDepthInformation",
    "XRWebGLBinding",
)

internal fun webXrDeclarations(
    source: String,
): Sequence<ConversionResult> {
    val content = webXrContent(source)

    val interfaces = Regex("""interface .+? \{[\s\S]+?\n}""")
        .findAll(content)
        .map { it.value }
        .mapNotNull { source ->
            val name = source
                .substringAfter(" ")
                .substringBefore(" ")

            if (name !in INCLUDED && (!name.startsWith("XR") || !name.endsWith("Init")))
                return@mapNotNull null

            if (name == "XRRenderStateInit" || name == "XRSessionInit")
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
        "XRSpace",
        "XRHitTestResult",
        "XRHand",
        "XRCompositionLayer",
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

internal fun webXrContent(
    content: String,
): String =
    content
        .replace(" =\n    | ", " = ")
        .replace("\n    | ", " | ")
        .replace(" {}\n", " {\n}\n")
        .replace("\n\n    ", "\n    ")
        .replace(" | null | undefined", " | undefined")
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
