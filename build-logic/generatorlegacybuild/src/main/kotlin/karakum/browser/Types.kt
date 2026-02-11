package karakum.browser

import karakum.common.CommonUnionConverter.objectUnionBody
import karakum.common.CommonUnionConverter.sealedUnionBody
import karakum.common.unionConstant

private val PKG_MAP = mapOf(
    "DOMHighResTimeStamp" to "web.time",
    "EpochTimeStamp" to "web.time",

    "NavigationTimingType" to "web.performance",

    "ColorSpaceConversion" to "web.images",
    "ImageOrientation" to "web.images",
    "PredefinedColorSpace" to "web.images",
    "PremultiplyAlpha" to "web.images",
    "ResizeQuality" to "web.images",

    "GlobalCompositeOperation" to "web.canvas",
    "ImageSmoothingQuality" to "web.canvas",

    "CSSMathOperator" to "web.cssom",
    "CSSNumericBaseType" to "web.cssom",
    "HighlightType" to "web.highlight",

    "EndingType" to "web.blob",

    "InsertPosition" to "web.dom",
    "SanitizerPresets" to "web.sanitizer",
    "MutationRecordType" to "web.mutation",
    "ResizeObserverBoxOptions" to "web.resize",

    "AutoFillAddressKind" to "web.autofill",
    "AutoFillBase" to "web.autofill",
    "AutoFillContactField" to "web.autofill",
    "AutoFillContactKind" to "web.autofill",
    "AutoFillCredentialField" to "web.autofill",
    "AutoFillNormalField" to "web.autofill",

    "GPUPipelineErrorReason" to "web.gpu",

    "CanPlayTypeResult" to "web.html",
    "SelectionMode" to "web.html",
    "ShadowRootMode" to "web.components",
    "SlotAssignmentMode" to "web.components",
    "SelectionDirection" to "web.selection",
    "TouchType" to "web.touch",
    "DOMParserSupportedType" to "web.parsing",
    "CookieSameSite" to "web.cookie",

    "WriteCommandType" to "web.fs",

    "NavigationFocusReset" to "web.navigation",
    "NavigationHistoryBehavior" to "web.navigation",
    "NavigationScrollBehavior" to "web.navigation",
    "NavigationType" to "web.navigation",

    "ColorGamut" to "web.mediacapabilities",
    "HdrMetadataType" to "web.mediacapabilities",
    "MediaDecodingType" to "web.mediacapabilities",
    "MediaEncodingType" to "web.mediacapabilities",
    "TransferFunction" to "web.mediacapabilities",

    "RecordingState" to "web.mediarecorder",

    "AppendMode" to "web.mediasource",
    "EndOfStreamError" to "web.mediasource",
    "ReadyState" to "web.mediasource",

    "FillLightMode" to "web.imagecapture",
    "RedEyeReduction" to "web.imagecapture",

    "RemotePlaybackState" to "web.remoteplayback",
    "ClientTypes" to "web.serviceworker",

    "AttestationConveyancePreference" to "web.authn",
    "AuthenticatorAttachment" to "web.authn",
    "AuthenticatorTransport" to "web.authn",
    "COSEAlgorithmIdentifier" to "web.authn",
    "PublicKeyCredentialType" to "web.authn",
    "PublicKeyCredentialClientCapabilities" to "web.authn",
    "ResidentKeyRequirement" to "web.authn",
    "UserVerificationRequirement" to "web.authn",

    "CompositeOperation" to "web.animations",
    "CompositeOperationOrAuto" to "web.animations",
    "FillMode" to "web.animations",
    "IterationCompositeOperation" to "web.animations",
    "PlaybackDirection" to "web.animations",
    "ScrollAxis" to "web.animations",

    "AutomationRate" to "web.audio",
    "BiquadFilterType" to "web.audio",
    "DistanceModelType" to "web.audio",
    "OscillatorType" to "web.audio",
    "OverSampleType" to "web.audio",
    "PanningModelType" to "web.audio",

    "ImageDataPixelFormat" to "web.images",

    "PresentationStyle" to "web.clipboard",

    "AacBitstreamFormat" to "web.codecs",
    "AlphaOption" to "web.codecs",
    "AudioSampleFormat" to "web.codecs",
    "AvcBitstreamFormat" to "web.codecs",
    "BitrateMode" to "web.codecs",
    "CodecState" to "web.codecs",
    "EncodedAudioChunkType" to "web.codecs",
    "EncodedVideoChunkType" to "web.codecs",
    "HardwareAcceleration" to "web.codecs",
    "LatencyMode" to "web.codecs",
    "OpusBitstreamFormat" to "web.codecs",
    "VideoColorPrimaries" to "web.codecs",
    "VideoEncoderBitrateMode" to "web.codecs",
    "VideoMatrixCoefficients" to "web.codecs",
    "VideoPixelFormat" to "web.codecs",
    "VideoTransferCharacteristics" to "web.codecs",

    "ScrollRestoration" to "web.history",

    "PushEncryptionKeyName" to "web.push",

    "SpeechRecognitionErrorCode" to "web.speech",
    "SpeechSynthesisErrorCode" to "web.speech",

    "Base64URLString" to "web.authn",
    "PublicKeyCredentialJSON" to "web.authn",

    "CredentialMediationRequirement" to "web.credentials",
    "SecurityPolicyViolationEventDisposition" to "web.csp",
    "LoginStatus" to "web.fedcm",

    "WakeLockType" to "web.wakelock",

    "BinaryType" to "web.buffer",

    "AutoKeyword" to "web.vtt",

    "BigInteger" to "web.crypto",
    "KeyFormat" to "web.crypto",
    "KeyType" to "web.crypto",
    "KeyUsage" to "web.crypto",
    "NamedCurve" to "web.crypto",

    "ReadableStreamReaderMode" to "web.streams",
    "ReadableStreamType" to "web.streams",
    "CompressionFormat" to "web.compression",

    "WebTransportCongestionControl" to "web.transport",
    "WebTransportErrorSource" to "web.transport",

    "TaskPriority" to "web.scheduling",
)

private val EXCLUDED_TYPES = setOf(
    "OffscreenRenderingContextId",

    "DisplayCaptureSurfaceType",
    "VideoFacingModeEnum",
)

private val INTL_KEY_TYPES = setOf(
    "NumberFormatOptionsCurrencyDisplay",
    "NumberFormatOptionsSignDisplay",
    "NumberFormatOptionsSignDisplay",
    "NumberFormatOptionsStyle",
    "NumberFormatOptionsUseGrouping",
    "NumberFormatPartType",
    "ResolvedNumberFormatOptionsUseGrouping",
    "StringNumericLiteral",
)

private val ALIAS_MAP = mapOf(
    "any" to "JsAny",
    "string" to "JsString",
    "number" to "JsDouble",

    "Uint8Array<ArrayBuffer>" to "Uint8Array<ArrayBuffer>",

    "number[] | GPUColorDict" to "GPUColorDict /* number[] */",
    "GPUIntegerCoordinate[] | GPUExtent3DDict" to "GPUExtent3DDict /* GPUIntegerCoordinate[] */",
    "GPUIntegerCoordinate[] | GPUOrigin2DDict" to "GPUOrigin2DDict /* GPUIntegerCoordinate[] */",
    "GPUIntegerCoordinate[] | GPUOrigin3DDict" to "GPUOrigin3DDict /* GPUIntegerCoordinate[] */",
)

private val NUMBER_TYPE_MAP = mapOf(
    "AddressValue" to "Int /* i32 | i64 */",

    "COSEAlgorithmIdentifier" to "JsInt",
    "EpochTimeStamp" to "Int53",

    "GPUBufferDynamicOffset" to "JsInt",
    "GPUBufferUsageFlags" to "JsInt /* Bitmask */",
    "GPUColorWriteFlags" to "JsInt /* Bitmask */",
    "GPUDepthBias" to "JsInt",
    "GPUFlagsConstant" to "JsInt",
    "GPUIndex32" to "JsInt",
    "GPUIntegerCoordinate" to "JsInt",
    "GPUIntegerCoordinateOut" to "JsInt",
    "GPUMapModeFlags" to "JsInt /* Bitmask */",
    "GPUPipelineConstantValue" to "JsInt",
    "GPUSampleMask" to "JsInt",
    "GPUShaderStageFlags" to "JsInt /* Bitmask */",
    "GPUSignedOffset32" to "JsInt",
    "GPUSize32" to "JsInt",
    "GPUSize32Out" to "JsInt",
    "GPUSize64" to "JsUInt53",
    "GPUSize64Out" to "JsUInt53",
    "GPUStencilValue" to "JsInt",
    "GPUTextureUsageFlags" to "JsInt /* Bitmask */",
)

internal fun browserTypes(
    content: String,
): Sequence<ConversionResult> =
    convertTypes(content, ::getTypePkg)

internal fun convertTypes(
    content: String,
    getPkg: (name: String) -> String?,
): Sequence<ConversionResult> =
    content
        .splitToSequence("\ntype ")
        .drop(1)
        .map { it.substringBefore(";\n") }
        .mapNotNull { convertType(it, getPkg) }

private fun convertType(
    source: String,
    getPkg: (name: String) -> String?,
): ConversionResult? {
    if (" = " !in source)
        return null

    val (declaration, bodySource) = source
        .substringBefore(";")
        .split(" = ")

    val name = declaration.substringBefore("<")

    val aliasType = ALIAS_MAP[bodySource]
    if (aliasType != null) {
        // TEMP
        if (name.startsWith("GL"))
            return null

        val pkg = getPkg(name)
            ?: return null

        val numberType = NUMBER_TYPE_MAP[name]
        if (numberType != null) {
            require(bodySource == "number")
        }

        val type = numberType ?: aliasType

        val body = sequenceOf(
            if (name.endsWith("TimeStamp")) {
                """
                /**
                 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/$name)
                 */
                """.trimIndent()
            } else null,
            "typealias $name = $type"
        ).filterNotNull()
            .joinToString("\n")

        return ConversionResult(
            name = name,
            body = body,
            pkg = pkg
        )
    }

    if (!bodySource.startsWith("\"")) {
        val pkg = when (name) {
            "Transferable" -> "js.serialization"

            "TimerHandler" -> "web.timers"

            "MessageEventSource" -> "web.messaging"

            "PerformanceEntryList" -> "web.performance"

            "ImageBufferSource" -> "web.codecs"

            "ImageBitmapSource" -> "web.images"
            "ImageDataArray" -> "web.images"
            "CanvasImageSource" -> "web.canvas"

            "BlobPart" -> "web.blob"

            "HTMLOrSVGImageElement",
            "HTMLOrSVGScriptElement",
                -> "web.dom"

            "OffscreenRenderingContext" -> "web.rendering"
            "RenderingContext" -> "web.rendering"

            "AutoFill",
            "AutoFillField",
            "AutoFillSection",
                -> "web.autofill"

            "MediaProvider" -> "web.html"
            "WindowProxy" -> "web.window"

            "VibratePattern" -> "web.vibration"

            "ClipboardItems" -> "web.clipboard"
            "CookieList" -> "web.cookie"

            "FileSystemWriteChunkType" -> "web.fs"

            "IDBValidKey" -> "web.idb"

            "BodyInit" -> "web.http"
            "HeadersInit" -> "web.http"
            "FormDataEntryValue" -> "web.form"

            "TexImageSource" -> "web.gl"

            "AlgorithmIdentifier" -> "web.crypto"
            "HashAlgorithmIdentifier" -> "web.crypto"

            "ReadableStreamController" -> "web.streams"

            "ReportList" -> "web.reporting"
            "LineAndPositionSetting" -> "web.vtt"

            "XRFrameRequestCallback" -> "web.xr"

            "Base64URLString",
            "PublicKeyCredentialJSON",

            "RTCRtpReceiverTransform",
            "RTCRtpSenderTransform",

            "ExportValue",
            "ImportValue",

            "PushMessageDataInit",

            "SanitizerAttribute",
            "SanitizerElement",
            "SanitizerElementWithAttributes",

                -> getPkg(name)!!

            in INTL_KEY_TYPES,
                -> "js.intl"

            else -> when {
                name.startsWith("GPU")
                    -> "web.gpu"

                name.startsWith("CSS")
                    -> "web.cssom"

                name.startsWith("Constrain")
                    -> "web.mediastreams"

                bodySource.startsWith("Record<")
                    -> getPkg(name)!!

                else -> return null
            }
        }

        val body = when {
            bodySource.startsWith("Record<")
                -> bodySource
                .replace("Record<", "ReadonlyRecord<")
                .replace("boolean", "JsBoolean")
                .replace("string", "JsString")

            bodySource.startsWith("keyof ")
                -> "JsString /* $bodySource */"

            name.startsWith("`")
                -> "JsString /* $bodySource */"

            bodySource == "ClipboardItem[]"
                    || bodySource == "CookieListItem[]"
                    || bodySource == "PerformanceEntry[]"
                    || bodySource == "Report[]"
                -> "ReadonlyArray<${bodySource.removeSuffix("[]")}>"

            name == "VibratePattern" && bodySource == "number | number[]"
                -> "ReadonlyArray<JsInt> /* | Int */"

            bodySource == "string | Function"
                -> "() -> Unit"

            " | " in bodySource
                -> "JsAny /* $bodySource */"

            bodySource.startsWith("(")
                -> bodySource.replace(") => void", ") -> Unit")

            else -> bodySource
        }

        val finalBody = when {
            name == "BodyInit" || name == "IDBValidKey"
                -> valueInterface(
                name,
                bodySource,
            )

            bodySource == "`section-${'$'}{string}`"
                -> """
            sealed interface $name

            inline fun $name(
                value: String,
            ): $name =
                unsafeCast("section-${'$'}value")
            """.trimIndent()

            name.startsWith("AutoFill")
                -> autoFillInterface(
                name = name,
                bodySource = bodySource,
            )

            declaration in MARKER_DECLARATIONS
                -> markerInterface(
                declaration = declaration,
                types = bodySource,
            )

            else -> "typealias $declaration = $body"
        }

        return ConversionResult(
            name = name,
            body = finalBody,
            pkg = pkg
        ).withAutoFillCorrection()
    }

    val pkg = getPkg(name)
        ?: return null

    val values = bodySource
        .splitToSequence(" | ")
        .map { it.removeSurrounding("\"") }
        .toList()

    val body = when (name) {
        "KeyFormat",
        "FileSystemHandleKind",
            -> objectUnionBody(
            name = name,
            constants = values.map(::unionConstant),
        )

        else -> sealedUnionBody(name, values)
    }

    return ConversionResult(
        name = name,
        body = body,
        pkg = pkg
    ).withAutoFillCorrection()
}

private fun getTypePkg(
    name: String,
): String? =
    when {
        name in EXCLUDED_TYPES -> null

        PKG_MAP.containsKey(name) -> PKG_MAP.getValue(name)

        name.endsWith("Setting") -> "web.vtt"

        name.startsWith("Document") -> "web.dom"
        name.startsWith("Sanitizer") -> "web.sanitizer"
        name.startsWith("Fullscreen") -> "web.fullscreen"
        name.startsWith("Scroll") -> "web.scroll"

        name.startsWith("GPU") -> "web.gpu"

        name == "FontDisplay" -> "web.fonts"
        name.startsWith("FontFace") -> "web.fonts"

        name.startsWith("Animation") -> "web.animations"
        name.startsWith("Audio") -> "web.audio"
        name.startsWith("Channel") -> "web.audio"

        name.startsWith("Canvas") -> "web.canvas"

        name.startsWith("Gamepad") -> "web.gamepad"
        name.startsWith("IDB") -> "web.idb"

        name.startsWith("MIDI") -> "web.midi"

        name.startsWith("FileSystem") -> "web.fs"
        name.startsWith("Lock") -> "web.locks"

        name.startsWith("MediaDevice") -> "web.mediadevices"
        name.startsWith("MediaKey") -> "web.mediakey"
        name.startsWith("MediaSession") -> "web.mediasession"
        name.startsWith("MediaStream") -> "web.mediastreams"

        name.startsWith("Notification") -> "web.notifications"
        name.startsWith("Orientation") -> "web.screen"
        name.startsWith("Payment") -> "web.payment"
        name.startsWith("Permission") -> "web.permissions"

        name.startsWith("Referrer") -> "web.http"
        name.startsWith("Request") -> "web.http"
        name.startsWith("Response") -> "web.http"

        name.startsWith("RTC") -> "web.rtc"
        name.startsWith("ServiceWorker") -> "web.serviceworker"
        name.startsWith("TextTrack") -> "web.vtt"
        name.startsWith("Worker") -> "web.workers"

        name.startsWith("WebGL") -> "web.gl"
        name.startsWith("XMLHttp") -> "web.xhr"

        else -> TODO("Unable to find package for `$name` union")
    }

private fun valueInterface(
    name: String,
    types: String,
): String {
    val factoryMethods = types
        .splitToSequence(" | ")
        .map { valueType ->
            when (valueType) {
                "ReadableStream" -> "ReadableStream<*>"
                "string" -> "String"
                "number" -> "Int"
                "IDBValidKey[]" -> "ReadonlyArray<IDBValidKey>"
                else -> valueType
            }
        }
        .map { valueType ->
            """
            inline fun ${name}(
                value: $valueType
            ): $name =
                unsafeCast(value)
            """.trimIndent()
        }

    val type = """
        sealed external interface $name
        """.trimIndent()

    return listOf(type)
        .plus(factoryMethods)
        .joinToString("\n\n")
}

private fun markerInterface(
    declaration: String,
    types: String,
): String {
    val name = declaration.substringBefore("<")

    val additionalChildTypes = MarkerRegistry.nonProcessedChildTypes(name)
    val extensions = additionalChildTypes.map { childType ->
        """
        inline fun ${name}(
            value: $childType,
        ): $name =
            unsafeCast(value)
        """.trimIndent()
    }

    val parentTypes = MarkerRegistry.additionalParents(name)
    val parentDeclaration = if (parentTypes != null) {
        ":\n${parentTypes.joinToString(",\n")}"
    } else ""


    val comment = types
        .splitToSequence(" | ")
        .map { it.substringBefore("<") }
        .map { getMarkerChildType(it) }
        .joinToString(
            separator = "\n",
            prefix = "/**\n * Union of:\n",
            postfix = "\n */",
            transform = { " * - [$it]" },
        )

    val finalDeclaration = declaration.replace("<T>", "<T : JsAny?>")
    val type = """
        $comment
        @SubclassOptInRequired(InternalApi::class)
        external interface $finalDeclaration$parentDeclaration
        """.trimIndent()

    return listOf(type)
        .plus(extensions)
        .joinToString("\n\n")
}

private fun autoFillInterface(
    name: String,
    bodySource: String,
): String {
    val parametersMap = bodySource
        .substringAfter(" | ")
        .removeSurrounding("`")
        .removePrefix("$")
        .splitToSequence("$")
        .map { it.removeSurrounding("{", "}") }
        .associate { parameterSource ->
            val optional = "<" in parameterSource
            val parameterName = parameterSource.substringAfter("<").removeSuffix(">")
            require(!optional || parameterSource.startsWith("Optional")) {
                "Invalid parameter source '$parameterSource'"
            }

            parameterName to optional
        }

    parametersMap.values.singleOrNull { !it }
        ?: error("More then 1 optional parameter!")

    val requiredParameterIndex = parametersMap.keys
        .indexOfFirst { !parametersMap.getValue(it) }

    val factories = mutableListOf<String>()
    for (startIndex in 0..requiredParameterIndex) {
        for (endIndex in requiredParameterIndex until parametersMap.size) {
            if (startIndex == endIndex)
                continue

            val parameterTypes = parametersMap.keys.toList()
                .subList(startIndex, endIndex + 1)

            val parameterMap = parameterTypes.associateBy { type ->
                type.removePrefix("AutoFill").replaceFirstChar(Char::lowercase)
            }

            factories.add(
                """
                inline fun $name(
                    ${parameterMap.entries.joinToString("\n") { (pname, ptype) -> "$pname: $ptype," }}
                ): $name =
                    unsafeCast("${parameterMap.keys.joinToString(" ") { pname -> "$$pname" }}")
                """.trimIndent()
            )
        }
    }

    return sequenceOf("sealed external interface $name")
        .plus(factories)
        .joinToString("\n\n")
}

private fun ConversionResult.withAutoFillCorrection(): ConversionResult {
    val newBody = when (name) {
        "AutoFillBase",
        "AutoFillField",
            -> body.replaceFirst(name, "$name:\nAutoFill")

        "AutoFillContactField",
        "AutoFillNormalField",
            -> body.replaceFirst(name, "$name:\nAutoFillField")

        else -> return this
    }

    return copy(
        body = newBody,
    )
}
