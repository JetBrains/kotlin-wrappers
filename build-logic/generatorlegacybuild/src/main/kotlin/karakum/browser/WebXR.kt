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
    // TEMP
    // "XRAnchor",
    "XRTransientInputHitTestResult",
    "XRHitTestSource",
    "XRTransientInputHitTestSource",
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
    ).map {
        ConversionResult(
            name = it,
            body = "open external class $it\nprivate constructor()",
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
        .replace(Regex(""": readonly ([a-zA-Z]+\[])"""), ": $1")
