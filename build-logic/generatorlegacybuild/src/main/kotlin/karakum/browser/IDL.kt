package karakum.browser

import java.io.File

private sealed class MemberNumberData {
    abstract val className: String
}

private data class PropertyData(
    override val className: String,
    val propertyName: String,
    val propertyType: String,
) : MemberNumberData()

private data class ParameterData(
    override val className: String,
    val methodName: String,
    val parameterName: String,
    val parameterType: String,
) : MemberNumberData()

private data class MethodReturnData(
    override val className: String,
    val methodName: String,
    val returnType: String,
) : MemberNumberData()

private val NUMBER_TYPE_MAP = mapOf(
    "octet" to "Short /* unsigned byte */",

    "short" to "Short",
    "unsigned short" to "Short",

    "float" to "Float",

    "double" to "Double",
    "unrestricted double" to "Double",

    "long" to "Int",
    "unsigned long" to "Int",

    "long long" to "Int53",
    "unsigned long long" to "UInt53",

    "GLenum" to "GLenum",
    "GLint64" to "GLint64",
)

internal object IDLRegistry {
    lateinit var rootDirectory: File

    private val idlData: List<String> by lazy {
        rootDirectory
            .listFiles { file -> file.extension == "idl" }!!
            .map { it.readText() }
    }

    private val serializableInterfaces: Set<String> by lazy {
        idlData.asSequence()
            .flatMap { content ->
                content
                    .splitToSequence("[Serializable]", " Serializable]", " Serializable,")
                    .drop(1)
                    .map { it.substringBefore("\n};") }
                    .map { it.substringAfter("\ninterface ") }
                    .map { it.substringBefore("\n") }
                    .map { it.substringBefore(" ") }
            }
            .toSet()
    }

    private val plainObjectInterfaces: Set<String> by lazy {
        idlData.asSequence()
            .flatMap { content ->
                content
                    .splitToSequence("\npartial dictionary ", "\ndictionary ")
                    .drop(1)
                    .map { it.substringBefore("\n") }
                    .map { it.substringBefore(" ") }
            }
            .plus("UnderlyingByteSource")
            .plus("UnderlyingDefaultSource")
            .toSet()
    }

    private val mixinInterfaces: Set<String> by lazy {
        idlData.asSequence()
            .flatMap { content ->
                content
                    .splitToSequence("\ninterface mixin ")
                    .drop(1)
                    .map { it.substringBefore("\n") }
                    .map { it.substringBefore(" ") }
            }
            // TEMP ?
            .map { if (it == "PopoverInvokerElement") "PopoverTargetAttributes" else it }
            // TEMP ?
            .plus("CSSStyleDeclarationBase")
            .toSet()
    }

    private fun hasContent(
        memberContent: String,
    ): Set<String> =
        idlData.asSequence()
            .flatMap { content ->
                content
                    .splitToSequence("\ninterface ")
                    .drop(1)
                    .map { it.substringBefore("\n};") }
                    .filter { memberContent in it }
                    .map { it.substringBefore(" ") }
                    // FileReader
                    .map { it.removeSuffix(":") }
            }
            .toSet()

    private val typesWithEmptyConstructors: Set<String> by lazy {
        hasContent("  constructor();")
    }

    private val typesWithHtmlConstructors: Set<String> by lazy {
        hasContent("[HTMLConstructor] constructor();")
    }

    private val memberNumberData: List<MemberNumberData> by lazy {
        idlData.flatMap { content ->
            content
                .splitToSequence(
                    "\ninterface ",
                    "]interface ",
                    "] interface ",
                    "\npartial interface ",
                    "]partial interface ",
                    "\ndictionary ",
                    "\npartial dictionary ",
                )
                .drop(1)
                .map { it.substringBefore("\n};") }
                .flatMap { classBody ->
                    val className = classBody
                        .removePrefix("mixin ")
                        .substringBefore("\n")
                        .substringBefore(" ")
                        // XR types
                        .removeSuffix(":")

                    val classNames = when (className) {
                        "BaseComputedKeyframe" -> listOf("ComputedKeyframe")
                        "BaseKeyframe" -> listOf("Keyframe")
                        "UnderlyingSource" -> listOf(className, "UnderlyingByteSource")
                        "Document" -> listOf(className, "DocumentOrShadowRoot")

                        "HTMLCollection" -> listOf(className, "HTMLCollectionBase")
                        "NodeList" -> listOf(className, "NodeListOf")
                        "CSSStyleDeclaration" -> listOf(className, "CSSStyleDeclarationBase")

                        "WebTransportSendStreamOptions" -> listOf(className, "WebTransportSendOptions")

                        "WebGLRenderingContextBase" -> listOf(
                            className,
                            "WebGLRenderingContext",
                            "WebGL2RenderingContext"
                        )

                        "WebGL2RenderingContextBase" -> listOf(className, "WebGL2RenderingContext")

                        // TEMP?
                        "MediaSessionSeekActionDetails" -> listOf(className, "MediaSessionActionDetails")
                        "MediaSessionSeekToActionDetails" -> listOf(className, "MediaSessionActionDetails")

                        else -> listOf(className)
                    }

                    classBody
                        .replace("\n{\n", " {\n")
                        .substringAfter(" {\n")
                        .substringBeforeLast(";")
                        .replace(Regex(""";\s+//.+?\n"""), ";\n")
                        .replace(Regex(""";\s+/\*.+?\n"""), ";\n")
                        .splitToSequence("\n")
                        .filter { !it.trim().startsWith("// ") }
                        .joinToString("\n")
                        .splitToSequence(";\n")
                        .map { it.substringAfterLast("*/\n") }
                        .map { it.trim() }
                        .flatMap { line ->
                            classNames.flatMap { cn ->
                                getMemberNumberData(className = cn, line = line)
                            }
                        }
                }
        }
    }

    private fun getMemberNumberData(
        className: String,
        line: String,
    ): Sequence<MemberNumberData> {
        if (line.startsWith("["))
            return getMemberNumberData(className, line.substringAfter("] ", ""))

        if ("  " in line) {
            return getMemberNumberData(className, line.replace(Regex("""\s+"""), " "))
        }

        if ("(" !in line || line.startsWith("(")) {
            val data = line
                .replace("[EnforceRange] ", "")
                .removePrefix("const ")
                .removePrefix("inherit ")
                .removePrefix("required ")
                .removePrefix("optional ")
                .removePrefix("readonly ")
                .removePrefix("attribute ")
                // TODO: check
                .removePrefix("unrestricted ")
                .substringBefore(" = ")

            val type = getNumberType(data.substringBeforeLast(" ").removeSuffix("?"))
                ?: return emptySequence()

            val name = data.substringAfterLast(" ")
            return sequenceOf(
                PropertyData(
                    className = className,
                    propertyName = name,
                    propertyType = type,
                )
            )
        }

        val source = line
            .substringAfter("(", "")
            .substringBeforeLast(")", "")

        val methodName = line
            .substringBefore("(")
            .trim()
            .substringAfterLast(" ")

        val parametersData = if (source.isNotEmpty()) {
            source
                .splitToSequence(",")
                .map { it.trim() }
                .map { it.substringBefore(" = ") }
                .map { it.substringAfter("] ") }
                .map { it.removePrefix("optional ") }
                .mapNotNull { psource ->
                    val type = getNumberType(psource.substringBeforeLast(" ").removeSuffix("?"))
                        ?: return@mapNotNull null

                    ParameterData(
                        className = className,
                        methodName = methodName,
                        parameterName = psource.substringAfterLast(" "),
                        parameterType = type,
                    )
                }
        } else emptySequence()

        val returnType = getNumberType(line.substringBefore(" $methodName"))
            ?: return parametersData

        return parametersData.plus(
            MethodReturnData(
                className = className,
                methodName = methodName,
                returnType = returnType,
            )
        )
    }

    private fun getNumberType(
        source: String,
    ): String? {
        val type = NUMBER_TYPE_MAP[source]
        if (type != null)
            return type

        val itemSource = source.removeSurrounding("sequence<", ">")
        if (itemSource != source) {
            val itemType = NUMBER_TYPE_MAP[itemSource]
            if (itemType != null)
                return "ReadonlyArray<$itemType>"
        }

        if (source.startsWith("GPU"))
            return source

        if (!source.startsWith("("))
            return null

        return source
            .substringAfter("(")
            .substringBefore(")")
            .splitToSequence(" or ")
            .mapNotNull { getNumberType(it) }
            .firstOrNull()
    }

    private val propertyTypeMap: Map<Pair<String, String>, String> by lazy {
        memberNumberData.asSequence()
            .filterIsInstance<PropertyData>()
            .associate { (it.className to it.propertyName) to it.propertyType }
            .plus(
                sequenceOf(
                    ("RTCEncodedAudioFrame" to "timestamp") to "Int53",
                    ("RTCEncodedVideoFrame" to "timestamp") to "Int53",
                    ("SegmentData" to "index") to "Int",
                )
            )
    }

    private val parameterTypeMap: Map<Pair<String, String>, String> by lazy {
        memberNumberData.asSequence()
            .filterIsInstance<ParameterData>()
            .associate { (it.className to it.parameterName) to it.parameterType }
            .plus(
                sequenceOf(
                    ("HTMLCanvasElement" to "quality") to "Double",

                    ("DateTimeFormat" to "date") to "Int53",
                    ("DateTimeFormat" to "endDate") to "Int53",
                    ("DateTimeFormat" to "startDate") to "Int53",
                    ("NumberFormat" to "end") to "Double",
                    ("NumberFormat" to "number") to "Double",
                    ("NumberFormat" to "start") to "Double",
                    ("NumberFormat" to "value") to "Double",
                    ("PluralRules" to "n") to "Int",
                    ("RelativeTimeFormat" to "value") to "Double",
                    ("Segments" to "codeUnitIndex") to "Int",
                )
            )
    }

    private val returnTypeMap: Map<Pair<String, String>, String> by lazy {
        memberNumberData.asSequence()
            .filterIsInstance<MethodReturnData>()
            .associate { (it.className to it.methodName) to it.returnType }
            .plus(("Collator" to "compare") to "Int")
    }

    fun hasEmptyConstructor(type: String): Boolean =
        type in typesWithEmptyConstructors

    fun hasHtmlConstructor(type: String): Boolean =
        type in typesWithHtmlConstructors

    fun getPropertyType(
        className: String,
        propertyName: String,
    ): String =
        propertyTypeMap.getValue(className to propertyName)

    fun getParameterType(
        className: String,
        parameterName: String,
    ): String {
        return parameterTypeMap.getValue(className to parameterName)
    }

    fun getReturnType(
        className: String,
        methodName: String,
    ): String =
        returnTypeMap.getValue(className to methodName)

    fun isSerializable(
        name: String,
    ): Boolean {
        return name in serializableInterfaces
    }

    fun isPlainObjectInterface(
        name: String,
    ): Boolean {
        if (name in plainObjectInterfaces)
            return true

        if (!name.endsWith("Options"))
            return false

        return when (name) {
            "LocaleOptions",
            "PushSubscriptionOptions",
                -> false

            else -> true
        }
    }

    fun isMixin(
        name: String,
    ): Boolean {
        return name in mixinInterfaces
    }
}
