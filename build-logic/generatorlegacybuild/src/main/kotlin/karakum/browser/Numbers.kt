package karakum.browser

private val WINDOW_EXCLUDED = setOf(
    // properties
    "customElements",
    "document",
    "devicePixelRatio",
    "history",
    "navigator",
    "navigation",
    "screen",
    "self",
    "speechSynthesis",
    "visualViewport",
    "window",

    // methods
    "alert",
    "cancelIdleCallback",
    "confirm",
    "getComputedStyle",
    "matchMedia",
    "prompt",
    "requestIdleCallback",
)

internal val LENGTH_REQUIRED = setOf(
    "CSSKeyframesRule",
    "CSSNumericArray",
    "CSSRuleList",
    "CSSStyleDeclarationBase",
    "CSSTransformValue",
    "CSSUnparsedValue",

    "DataTransferItemList",

    "DOMRectList",
    "DOMStringList",
    "DOMTokenList",

    "FileList",

    "HTMLFormElement",

    "ImageTrackList",

    "MediaList",

    "NodeList",
    "NamedNodeMap",

    "SourceBufferList",
    "StyleSheetList",

    "SVGLengthList",
    "SVGNumberList",
    "SVGPointList",
    "SVGStringList",
    "SVGTransformList",

    "SpeechRecognitionResult",
    "SpeechRecognitionResultList",

    "TextTrackList",
    "TextTrackCueList",

    "TouchList",
)

private val DOM_ERROR_TYPES = setOf(
    "GPUPipelineError",
    "OverconstrainedError",
    "QuotaExceededError",
    "RTCError",
    "WebTransportError",
)

private val WEBGL_CONST_RE = Regex("""[\dA-Zx_]+""")

internal class TypeProvider(
    private val parentType: String,
    private val arrayType: String? = null,
    private val hideForEach: Boolean = false,
) {
    fun numberType(
        propertyName: String,
    ): String {
        when (propertyName) {
            "button" -> return MOUSE_BUTTON
            "buttons" -> return MOUSE_BUTTONS
        }

        if (parentType.startsWith("WebGL") && propertyName.endsWith("_BIT")) {
            return "GLbitfield"
        }

        return when {
            propertyName == "lastModified" -> "EpochTimeStamp"
            propertyName == "expiration" -> "EpochTimeStamp"
            propertyName.endsWith("Digits") -> "Int"
            else -> IDLRegistry.getPropertyType(parentType, propertyName)
        }
    }

    fun numberArrayType(
        propertyName: String,
    ): String =
        IDLRegistry.getPropertyType(parentType, propertyName)

    fun isDefined(): Boolean =
        IDLRegistry.isMixin(parentType)
                && parentType != "GenericTransformStream"
                || parentType == "LocaleOptions"

    fun isArrayLike(): Boolean =
        arrayType != null

    fun accepted(
        name: String,
    ): Boolean {
        if (name == "length" && isArrayLike())
            return parentType in LENGTH_REQUIRED

        if (name == "forEach" && hideForEach)
            return false

        return when (parentType) {
            "Window" -> name !in WINDOW_EXCLUDED
            "WorkerGlobalScope" -> name != "self"

            // TEMP?
            "NavigatorPlugins" -> name != "mimeTypes" && name != "plugins"

            "WebGLRenderingContext",
            "WebGLRenderingContextBase",
            "WebGL2RenderingContext",
            "WebGL2RenderingContextBase",
                -> !WEBGL_CONST_RE.matches(name)

            else -> true
        }
    }

    fun optionalAsyncFunction(
        name: String,
    ): Boolean =
        when (parentType) {
            "Element",
            "Window",
                -> name != "scroll"
                    && name != "scrollTo"
                    && name != "scrollBy"
                    && name != "scrollIntoView"

            else -> true
        }

    fun getThrowsAnnotation(name: String): String? {
        val mdnParentPage = when (parentType) {
            "Animatable",
                -> "Element"

            "Body",
                -> "Response"

            "CanvasDrawImage",
            "CanvasDrawPath",
            "CanvasFillStrokeStyles",
            "CanvasImageData",
            "CanvasPath",
            "CanvasPathDrawingStyles",
            "CanvasRect",
            "CanvasSettings",
            "CanvasState",
            "CanvasText",
            "CanvasTransform",
            "CanvasUserInterface",
                -> "CanvasRenderingContext2D"

            "ChildNode",
                -> "Element"

            "CSSStyleDeclarationBase",
                -> "CSSStyleDeclaration"

            // TEMP
            "DigitalCredential",
                -> return null

            "DocumentOrShadowRoot",
                -> "Document"

            "GPUBindingCommandsMixin",
            "GPUDebugCommandsMixin",
            "GPUPipelineBase",
            "GPURenderCommandsMixin",
            "GPUSupportedFeatures",
                -> return null

            "HTMLCollectionBase",
                -> "HTMLCollection"

            "HTMLOrSVGOrMathMLElement",
                -> "HTMLElement"

            "NavigatorBadge",
            "NavigatorContentUtils",
            "NavigatorPlugins",
                -> "Navigator"

            "NonElementParentNode",
                -> "Document"

            "Origin",
                -> return null

            "ParentNode",
                -> "Element"

            "ReadableStreamGenericReader",
                -> "ReadableStreamDefaultReader"

            "WebGL2RenderingContextBase",
            "WebGL2RenderingContextOverloads",
                -> return null

            "WebGLRenderingContextBase",
            "WebGLRenderingContextOverloads",
                -> return null

            "XPathEvaluatorBase",
                -> "XPathEvaluator"

            "Collator",
            "NumberFormat",
            "DateTimeFormat",
            "PluralRules",
            "RelativeTimeFormat",
            "Locale",
            "DisplayNames",
            "ListFormat",
            "Segmenter",
            "Segments",
            "DurationFormat",
                -> return null

            "CompileError",
            "Exception",
            "Global",
            "LinkError",
            "Memory",
            "Module",
            "RuntimeError",
            "Table",
                -> return null

            "AudioWorkletProcessorConstructor",
                // TEMP
            "XRSession",
                -> return null

            else -> parentType
        }

        val pageContent = sequenceOf(
            "$mdnParentPage/$name",
            "$mdnParentPage/${name}_static",
        ).mapNotNull { getApiDirectory(it) }
            .map { it.resolve("index.md") }
            .map { it.readText() }
            .firstOrNull()
            ?: return null

        val exceptionsContent = pageContent
            .substringAfter("\n### Exceptions", "")
            .substringBefore("\n##")
            .ifEmpty { return null }

        return exceptionsContent
            .splitToSequence("\n- ")
            // special case?
            .drop(1)
            .mapNotNull { parseExceptionType(it) }
            .map { name ->
                if (name in DOM_ERROR_TYPES) {
                    "@JsThrows.Typed($name::class)"
                } else {
                    "@JsThrows($name::class)"
                }
            }
            .distinct()
            .sorted()
            .joinToString("\n")
            .ifEmpty { null }
    }

    fun getParameterType(name: String): String =
        IDLRegistry.getParameterType(parentType, name)

    fun getReturnType(name: String): String =
        IDLRegistry.getReturnType(parentType, name)

    fun getPropertyComment(name: String): String? {
        val anchorId = when {
            isWebglExtensionName(parentType)
                    && WEBGL_CONST_RE.matches(name)
                -> "$parentType#ext.${name.lowercase()}"

            parentType.startsWith("SVG")
                    && name.startsWith("SVG_")
                -> "$parentType#${name.lowercase()}"

            else -> return null
        }

        return """
        /**
         * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$anchorId)
         */
        """.trimIndent()
    }
}

private fun parseExceptionType(
    source: String,
): String? {
    source.replace("{DOMxRef(", "{domxref(")
        .takeIf { it != source }
        ?.let { return parseExceptionType(it) }

    for (errorType in DOM_ERROR_TYPES) {
        if (source.startsWith("""{{domxref("$errorType")}}"""))
            return errorType
    }

    if ("""{{domxref("DOMException")}}""" in source) {
        val type = source
            .substringBefore("\n")
            .substringBefore(""" {{domxref("DOMException")}}""", "")
            .also { require(it.isNotEmpty()) }
            .removeSurrounding("`")

        return when (type) {
            // deprecated
            "TypeMismatchError" -> null
            // TEMP for `GPUAdapter`
            "TypeError" -> null
            // TEMP for `DocumentPictureInPicture`
            "RangeError" -> null
            // TEMP for `IDBIndex`
            """{{jsxref("TypeError")}}""" -> null
            // TEMP for `RTCPeerConnection`
            "ResourceInUse" -> null

            // TEMP for `SubtleCrypto`
            "NotSupported" -> "NotSupportedError"

            // TEMP for `AudioScheduledSourceNode`
            "InvalidStateNode" -> "InvalidStateError"

            else -> type
        }
    }

    val isDefault = sequenceOf(
        "TypeError",
        "RangeError",
        "SyntaxError",
    ).flatMap {
        sequenceOf(
            "`$it`",
            """{jsxref("$it")}}""",
        )
    }.any { it in source }

    if (isDefault)
        return null

    return null
}
