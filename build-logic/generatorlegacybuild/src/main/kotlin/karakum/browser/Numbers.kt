package karakum.browser

private val WINDOW_EXCLUDED = setOf(
    // properties
    "customElements",
    "document",
    "devicePixelRatio",
    "history",
    "navigator",
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
    "CSSStyleDeclaration",
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
        when (parentType to propertyName) {
            ("AudioWorkletNodeOptions" to "outputChannelCount"),
                -> "ReadonlyArray<JsUInt>"

            ("IIRFilterOptions" to "feedback"),
                -> "ReadonlyArray<Double>"

            ("IIRFilterOptions" to "feedforward"),
                -> "ReadonlyArray<Double>"

            ("RTCEncodedFrameMetadata" to "contributingSources"),
                -> "ReadonlyArray<JsUInt>"

            ("RTCEncodedVideoFrameMetadata" to "dependencies"),
                -> "ReadonlyArray<JsUInt53>"

            else -> error("Unable to find array type for `$parentType.$propertyName`")
        }

    fun isDefined(): Boolean =
        parentType in Mixins.ALL

    fun isArrayLike(): Boolean =
        arrayType != null

    fun accepted(
        name: String,
    ): Boolean {
        if (name == "length" && isArrayLike())
            return parentType in LENGTH_REQUIRED

        if (name == "forEach" && hideForEach)
            return false

        if (parentType == "Window")
            return name !in WINDOW_EXCLUDED

        if (parentType == "WorkerGlobalScope")
            return name != "self"

        return true
    }

    fun getParameterType(name: String): String =
        IDLRegistry.getParameterType(parentType, name)

    fun getReturnType(name: String): String =
        IDLRegistry.getReturnType(parentType, name)
}
