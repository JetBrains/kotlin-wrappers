data class BrowserType(
    val jsName: String,
    val kotlinFqn: String,
)

val BROWSER_TYPES: List<BrowserType> = listOf(
    BrowserType(
        jsName = "ANGLE_instanced_arrays",
        kotlinFqn = "web.gl.ANGLE_instanced_arrays",
    ),
    BrowserType(
        jsName = "ARIAMixin",
        kotlinFqn = "web.aria.ARIAMixin",
    ),
    BrowserType(
        jsName = "AacBitstreamFormat",
        kotlinFqn = "web.codecs.AacBitstreamFormat",
    ),
    BrowserType(
        jsName = "AacEncoderConfig",
        kotlinFqn = "web.codecs.AacEncoderConfig",
    ),
    BrowserType(
        jsName = "AbortController",
        kotlinFqn = "web.abort.AbortController",
    ),
    BrowserType(
        jsName = "AbortSignal",
        kotlinFqn = "web.abort.AbortSignal",
    ),
    BrowserType(
        jsName = "Abortable",
        kotlinFqn = "web.abort.Abortable",
    ),
    BrowserType(
        jsName = "AbortableLike",
        kotlinFqn = "web.abort.AbortableLike",
    ),
    BrowserType(
        jsName = "AbstractRange",
        kotlinFqn = "web.ranges.AbstractRange",
    ),
    BrowserType(
        jsName = "AbstractWorker",
        kotlinFqn = "web.workers.AbstractWorker",
    ),
    BrowserType(
        jsName = "AddEventListenerOptions",
        kotlinFqn = "web.events.AddEventListenerOptions",
    ),
    BrowserType(
        jsName = "AddressErrors",
        kotlinFqn = "web.payment.AddressErrors",
    ),
    BrowserType(
        jsName = "AesCbcParams",
        kotlinFqn = "web.crypto.AesCbcParams",
    ),
    BrowserType(
        jsName = "AesCtrParams",
        kotlinFqn = "web.crypto.AesCtrParams",
    ),
    BrowserType(
        jsName = "AesDerivedKeyParams",
        kotlinFqn = "web.crypto.AesDerivedKeyParams",
    ),
    BrowserType(
        jsName = "AesGcmParams",
        kotlinFqn = "web.crypto.AesGcmParams",
    ),
    BrowserType(
        jsName = "AesKeyAlgorithm",
        kotlinFqn = "web.crypto.AesKeyAlgorithm",
    ),
    BrowserType(
        jsName = "AesKeyGenParams",
        kotlinFqn = "web.crypto.AesKeyGenParams",
    ),
    BrowserType(
        jsName = "AggregateError",
        kotlinFqn = "js.errors.AggregateError",
    ),
    BrowserType(
        jsName = "Algorithm",
        kotlinFqn = "web.crypto.Algorithm",
    ),
    BrowserType(
        jsName = "AlgorithmIdentifier",
        kotlinFqn = "web.crypto.AlgorithmIdentifier",
    ),
    BrowserType(
        jsName = "AlignSetting",
        kotlinFqn = "web.vtt.AlignSetting",
    ),
    BrowserType(
        jsName = "AllAcceptedCredentialsOptions",
        kotlinFqn = "web.authn.AllAcceptedCredentialsOptions",
    ),
    BrowserType(
        jsName = "AllowSharedBufferSource",
        kotlinFqn = "js.buffer.AllowSharedBufferSource",
    ),
    BrowserType(
        jsName = "AllowedEffect",
        kotlinFqn = "web.data.AllowedEffect",
    ),
    BrowserType(
        jsName = "AlphaOption",
        kotlinFqn = "web.codecs.AlphaOption",
    ),
    BrowserType(
        jsName = "Alphabet",
        kotlinFqn = "js.typedarrays.Alphabet",
    ),
    BrowserType(
        jsName = "AnalyserNode",
        kotlinFqn = "web.audio.AnalyserNode",
    ),
    BrowserType(
        jsName = "AnalyserOptions",
        kotlinFqn = "web.audio.AnalyserOptions",
    ),
    BrowserType(
        jsName = "Animatable",
        kotlinFqn = "web.animations.Animatable",
    ),
    BrowserType(
        jsName = "Animation",
        kotlinFqn = "web.animations.Animation",
    ),
    BrowserType(
        jsName = "AnimationEffect",
        kotlinFqn = "web.animations.AnimationEffect",
    ),
    BrowserType(
        jsName = "AnimationEvent",
        kotlinFqn = "web.animations.AnimationEvent",
    ),
    BrowserType(
        jsName = "AnimationEventInit",
        kotlinFqn = "web.animations.AnimationEventInit",
    ),
    BrowserType(
        jsName = "AnimationPlayState",
        kotlinFqn = "web.animations.AnimationPlayState",
    ),
    BrowserType(
        jsName = "AnimationPlaybackEvent",
        kotlinFqn = "web.animations.AnimationPlaybackEvent",
    ),
    BrowserType(
        jsName = "AnimationPlaybackEventInit",
        kotlinFqn = "web.animations.AnimationPlaybackEventInit",
    ),
    BrowserType(
        jsName = "AnimationReplaceState",
        kotlinFqn = "web.animations.AnimationReplaceState",
    ),
    BrowserType(
        jsName = "AnimationTimeline",
        kotlinFqn = "web.animations.AnimationTimeline",
    ),
    BrowserType(
        jsName = "AppendMode",
        kotlinFqn = "web.mediasource.AppendMode",
    ),
    BrowserType(
        jsName = "ArrayBuffer",
        kotlinFqn = "js.buffer.ArrayBuffer",
    ),
    BrowserType(
        jsName = "ArrayBufferLike",
        kotlinFqn = "js.buffer.ArrayBufferLike",
    ),
    BrowserType(
        jsName = "ArrayBufferOptions",
        kotlinFqn = "js.buffer.ArrayBufferOptions",
    ),
    BrowserType(
        jsName = "ArrayBufferView",
        kotlinFqn = "js.buffer.ArrayBufferView",
    ),
    BrowserType(
        jsName = "ArrayLike",
        kotlinFqn = "js.array.ArrayLike",
    ),
    BrowserType(
        jsName = "AssignedNodesOptions",
        kotlinFqn = "web.components.AssignedNodesOptions",
    ),
    BrowserType(
        jsName = "AsyncDisposable",
        kotlinFqn = "js.disposable.AsyncDisposable",
    ),
    BrowserType(
        jsName = "AsyncDisposableStack",
        kotlinFqn = "js.disposable.AsyncDisposableStack",
    ),
    BrowserType(
        jsName = "AsyncGenerator",
        kotlinFqn = "js.generator.AsyncGenerator",
    ),
    BrowserType(
        jsName = "AsyncGeneratorFunction",
        kotlinFqn = "js.generator.AsyncGeneratorFunction",
    ),
    BrowserType(
        jsName = "AsyncIterable",
        kotlinFqn = "js.iterable.AsyncIterable",
    ),
    BrowserType(
        jsName = "AsyncIterator",
        kotlinFqn = "js.iterable.AsyncIterator",
    ),
    BrowserType(
        jsName = "AsyncIteratorLike",
        kotlinFqn = "js.iterable.AsyncIteratorLike",
    ),
    BrowserType(
        jsName = "AttestationConveyancePreference",
        kotlinFqn = "web.authn.AttestationConveyancePreference",
    ),
    BrowserType(
        jsName = "Attr",
        kotlinFqn = "web.dom.Attr",
    ),
    BrowserType(
        jsName = "AttributeChangedCallback",
        kotlinFqn = "web.components.AttributeChangedCallback",
    ),
    BrowserType(
        jsName = "Audio",
        kotlinFqn = "web.html.Audio",
    ),
    BrowserType(
        jsName = "AudioBuffer",
        kotlinFqn = "web.audio.AudioBuffer",
    ),
    BrowserType(
        jsName = "AudioBufferOptions",
        kotlinFqn = "web.audio.AudioBufferOptions",
    ),
    BrowserType(
        jsName = "AudioBufferSourceNode",
        kotlinFqn = "web.audio.AudioBufferSourceNode",
    ),
    BrowserType(
        jsName = "AudioBufferSourceOptions",
        kotlinFqn = "web.audio.AudioBufferSourceOptions",
    ),
    BrowserType(
        jsName = "AudioConfiguration",
        kotlinFqn = "web.mediacapabilities.AudioConfiguration",
    ),
    BrowserType(
        jsName = "AudioContent",
        kotlinFqn = "web.mcp.AudioContent",
    ),
    BrowserType(
        jsName = "AudioContext",
        kotlinFqn = "web.audio.AudioContext",
    ),
    BrowserType(
        jsName = "AudioContextLatencyCategory",
        kotlinFqn = "web.audio.AudioContextLatencyCategory",
    ),
    BrowserType(
        jsName = "AudioContextOptions",
        kotlinFqn = "web.audio.AudioContextOptions",
    ),
    BrowserType(
        jsName = "AudioContextState",
        kotlinFqn = "web.audio.AudioContextState",
    ),
    BrowserType(
        jsName = "AudioData",
        kotlinFqn = "web.codecs.AudioData",
    ),
    BrowserType(
        jsName = "AudioDataCopyToOptions",
        kotlinFqn = "web.codecs.AudioDataCopyToOptions",
    ),
    BrowserType(
        jsName = "AudioDataInit",
        kotlinFqn = "web.codecs.AudioDataInit",
    ),
    BrowserType(
        jsName = "AudioDataOutputCallback",
        kotlinFqn = "web.codecs.AudioDataOutputCallback",
    ),
    BrowserType(
        jsName = "AudioDecoder",
        kotlinFqn = "web.codecs.AudioDecoder",
    ),
    BrowserType(
        jsName = "AudioDecoderConfig",
        kotlinFqn = "web.codecs.AudioDecoderConfig",
    ),
    BrowserType(
        jsName = "AudioDecoderInit",
        kotlinFqn = "web.codecs.AudioDecoderInit",
    ),
    BrowserType(
        jsName = "AudioDecoderSupport",
        kotlinFqn = "web.codecs.AudioDecoderSupport",
    ),
    BrowserType(
        jsName = "AudioDestinationNode",
        kotlinFqn = "web.audio.AudioDestinationNode",
    ),
    BrowserType(
        jsName = "AudioEncoder",
        kotlinFqn = "web.codecs.AudioEncoder",
    ),
    BrowserType(
        jsName = "AudioEncoderConfig",
        kotlinFqn = "web.codecs.AudioEncoderConfig",
    ),
    BrowserType(
        jsName = "AudioEncoderInit",
        kotlinFqn = "web.codecs.AudioEncoderInit",
    ),
    BrowserType(
        jsName = "AudioEncoderSupport",
        kotlinFqn = "web.codecs.AudioEncoderSupport",
    ),
    BrowserType(
        jsName = "AudioListener",
        kotlinFqn = "web.audio.AudioListener",
    ),
    BrowserType(
        jsName = "AudioNode",
        kotlinFqn = "web.audio.AudioNode",
    ),
    BrowserType(
        jsName = "AudioNodeOptions",
        kotlinFqn = "web.audio.AudioNodeOptions",
    ),
    BrowserType(
        jsName = "AudioParam",
        kotlinFqn = "web.audio.AudioParam",
    ),
    BrowserType(
        jsName = "AudioParamDescriptor",
        kotlinFqn = "web.audio.AudioParamDescriptor",
    ),
    BrowserType(
        jsName = "AudioParamMap",
        kotlinFqn = "web.audio.AudioParamMap",
    ),
    BrowserType(
        jsName = "AudioParamName",
        kotlinFqn = "web.audio.AudioParamName",
    ),
    BrowserType(
        jsName = "AudioSampleFormat",
        kotlinFqn = "web.codecs.AudioSampleFormat",
    ),
    BrowserType(
        jsName = "AudioScheduledSourceNode",
        kotlinFqn = "web.audio.AudioScheduledSourceNode",
    ),
    BrowserType(
        jsName = "AudioTimestamp",
        kotlinFqn = "web.audio.AudioTimestamp",
    ),
    BrowserType(
        jsName = "AudioWorklet",
        kotlinFqn = "web.audio.AudioWorklet",
    ),
    BrowserType(
        jsName = "AudioWorkletGlobalScope",
        kotlinFqn = "web.audio.AudioWorkletGlobalScope",
    ),
    BrowserType(
        jsName = "AudioWorkletModule",
        kotlinFqn = "web.audio.AudioWorkletModule",
    ),
    BrowserType(
        jsName = "AudioWorkletNode",
        kotlinFqn = "web.audio.AudioWorkletNode",
    ),
    BrowserType(
        jsName = "AudioWorkletNodeOptions",
        kotlinFqn = "web.audio.AudioWorkletNodeOptions",
    ),
    BrowserType(
        jsName = "AudioWorkletProcessor",
        kotlinFqn = "web.audio.AudioWorkletProcessor",
    ),
    BrowserType(
        jsName = "AudioWorkletProcessorConstructor",
        kotlinFqn = "web.audio.AudioWorkletProcessorConstructor",
    ),
    BrowserType(
        jsName = "AudioWorkletProcessorName",
        kotlinFqn = "web.audio.AudioWorkletProcessorName",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsClientInputs",
        kotlinFqn = "web.authn.AuthenticationExtensionsClientInputs",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsClientInputsJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsClientInputsJSON",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsClientOutputs",
        kotlinFqn = "web.authn.AuthenticationExtensionsClientOutputs",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsClientOutputsJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsClientOutputsJSON",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsLargeBlobInputs",
        kotlinFqn = "web.authn.AuthenticationExtensionsLargeBlobInputs",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsLargeBlobInputsJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsLargeBlobInputsJSON",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsLargeBlobOutputs",
        kotlinFqn = "web.authn.AuthenticationExtensionsLargeBlobOutputs",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsLargeBlobOutputsJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsLargeBlobOutputsJSON",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsPRFInputs",
        kotlinFqn = "web.authn.AuthenticationExtensionsPRFInputs",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsPRFInputsJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsPRFInputsJSON",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsPRFOutputs",
        kotlinFqn = "web.authn.AuthenticationExtensionsPRFOutputs",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsPRFOutputsJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsPRFOutputsJSON",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsPRFValues",
        kotlinFqn = "web.authn.AuthenticationExtensionsPRFValues",
    ),
    BrowserType(
        jsName = "AuthenticationExtensionsPRFValuesJSON",
        kotlinFqn = "web.authn.AuthenticationExtensionsPRFValuesJSON",
    ),
    BrowserType(
        jsName = "AuthenticationResponseJSON",
        kotlinFqn = "web.authn.AuthenticationResponseJSON",
    ),
    BrowserType(
        jsName = "AuthenticatorAssertionResponse",
        kotlinFqn = "web.authn.AuthenticatorAssertionResponse",
    ),
    BrowserType(
        jsName = "AuthenticatorAssertionResponseJSON",
        kotlinFqn = "web.authn.AuthenticatorAssertionResponseJSON",
    ),
    BrowserType(
        jsName = "AuthenticatorAttachment",
        kotlinFqn = "web.authn.AuthenticatorAttachment",
    ),
    BrowserType(
        jsName = "AuthenticatorAttestationResponse",
        kotlinFqn = "web.authn.AuthenticatorAttestationResponse",
    ),
    BrowserType(
        jsName = "AuthenticatorAttestationResponseJSON",
        kotlinFqn = "web.authn.AuthenticatorAttestationResponseJSON",
    ),
    BrowserType(
        jsName = "AuthenticatorResponse",
        kotlinFqn = "web.authn.AuthenticatorResponse",
    ),
    BrowserType(
        jsName = "AuthenticatorSelectionCriteria",
        kotlinFqn = "web.authn.AuthenticatorSelectionCriteria",
    ),
    BrowserType(
        jsName = "AuthenticatorTransport",
        kotlinFqn = "web.authn.AuthenticatorTransport",
    ),
    BrowserType(
        jsName = "AutoCapitalize",
        kotlinFqn = "web.html.AutoCapitalize",
    ),
    BrowserType(
        jsName = "AutoFill",
        kotlinFqn = "web.autofill.AutoFill",
    ),
    BrowserType(
        jsName = "AutoFillAddressKind",
        kotlinFqn = "web.autofill.AutoFillAddressKind",
    ),
    BrowserType(
        jsName = "AutoFillBase",
        kotlinFqn = "web.autofill.AutoFillBase",
    ),
    BrowserType(
        jsName = "AutoFillContactField",
        kotlinFqn = "web.autofill.AutoFillContactField",
    ),
    BrowserType(
        jsName = "AutoFillContactKind",
        kotlinFqn = "web.autofill.AutoFillContactKind",
    ),
    BrowserType(
        jsName = "AutoFillCredentialField",
        kotlinFqn = "web.autofill.AutoFillCredentialField",
    ),
    BrowserType(
        jsName = "AutoFillField",
        kotlinFqn = "web.autofill.AutoFillField",
    ),
    BrowserType(
        jsName = "AutoFillNormalField",
        kotlinFqn = "web.autofill.AutoFillNormalField",
    ),
    BrowserType(
        jsName = "AutoKeyword",
        kotlinFqn = "web.vtt.AutoKeyword",
    ),
    BrowserType(
        jsName = "AutomationRate",
        kotlinFqn = "web.audio.AutomationRate",
    ),
    BrowserType(
        jsName = "AvcBitstreamFormat",
        kotlinFqn = "web.codecs.AvcBitstreamFormat",
    ),
    BrowserType(
        jsName = "AvcEncoderConfig",
        kotlinFqn = "web.codecs.AvcEncoderConfig",
    ),
    BrowserType(
        jsName = "BarProp",
        kotlinFqn = "web.window.BarProp",
    ),
    BrowserType(
        jsName = "Base64URLString",
        kotlinFqn = "web.authn.Base64URLString",
    ),
    BrowserType(
        jsName = "BaseAudioContext",
        kotlinFqn = "web.audio.BaseAudioContext",
    ),
    BrowserType(
        jsName = "BeforeUnloadEvent",
        kotlinFqn = "web.window.BeforeUnloadEvent",
    ),
    BrowserType(
        jsName = "BigInt",
        kotlinFqn = "js.numbers.BigInt",
    ),
    BrowserType(
        jsName = "BigInt64Array",
        kotlinFqn = "js.typedarrays.BigInt64Array",
    ),
    BrowserType(
        jsName = "BigInteger",
        kotlinFqn = "web.crypto.BigInteger",
    ),
    BrowserType(
        jsName = "BigUint64Array",
        kotlinFqn = "js.typedarrays.BigUint64Array",
    ),
    BrowserType(
        jsName = "BinaryType",
        kotlinFqn = "web.buffer.BinaryType",
    ),
    BrowserType(
        jsName = "BiquadFilterNode",
        kotlinFqn = "web.audio.BiquadFilterNode",
    ),
    BrowserType(
        jsName = "BiquadFilterOptions",
        kotlinFqn = "web.audio.BiquadFilterOptions",
    ),
    BrowserType(
        jsName = "BiquadFilterType",
        kotlinFqn = "web.audio.BiquadFilterType",
    ),
    BrowserType(
        jsName = "Bitmask",
        kotlinFqn = "js.numbers.Bitmask",
    ),
    BrowserType(
        jsName = "BitrateMode",
        kotlinFqn = "web.codecs.BitrateMode",
    ),
    BrowserType(
        jsName = "Blob",
        kotlinFqn = "web.blob.Blob",
    ),
    BrowserType(
        jsName = "BlobCallback",
        kotlinFqn = "web.html.BlobCallback",
    ),
    BrowserType(
        jsName = "BlobEvent",
        kotlinFqn = "web.mediarecorder.BlobEvent",
    ),
    BrowserType(
        jsName = "BlobEventInit",
        kotlinFqn = "web.mediarecorder.BlobEventInit",
    ),
    BrowserType(
        jsName = "BlobPart",
        kotlinFqn = "web.blob.BlobPart",
    ),
    BrowserType(
        jsName = "BlobPropertyBag",
        kotlinFqn = "web.blob.BlobPropertyBag",
    ),
    BrowserType(
        jsName = "BlobResourceContents",
        kotlinFqn = "web.mcp.BlobResourceContents",
    ),
    BrowserType(
        jsName = "Blocking",
        kotlinFqn = "web.html.Blocking",
    ),
    BrowserType(
        jsName = "BluetoothServiceUUID",
        kotlinFqn = "web.bluetooth.BluetoothServiceUUID",
    ),
    BrowserType(
        jsName = "Body",
        kotlinFqn = "web.http.Body",
    ),
    BrowserType(
        jsName = "BodyInit",
        kotlinFqn = "web.http.BodyInit",
    ),
    BrowserType(
        jsName = "BroadcastChannel",
        kotlinFqn = "web.broadcast.BroadcastChannel",
    ),
    BrowserType(
        jsName = "BufferSource",
        kotlinFqn = "js.buffer.BufferSource",
    ),
    BrowserType(
        jsName = "ButtonType",
        kotlinFqn = "web.html.ButtonType",
    ),
    BrowserType(
        jsName = "ByteLengthQueuingStrategy",
        kotlinFqn = "web.streams.ByteLengthQueuingStrategy",
    ),
    BrowserType(
        jsName = "CDATASection",
        kotlinFqn = "web.dom.CDATASection",
    ),
    BrowserType(
        jsName = "COSEAlgorithmIdentifier",
        kotlinFqn = "web.authn.COSEAlgorithmIdentifier",
    ),
    BrowserType(
        jsName = "CSSAnimation",
        kotlinFqn = "web.cssom.CSSAnimation",
    ),
    BrowserType(
        jsName = "CSSConditionRule",
        kotlinFqn = "web.cssom.CSSConditionRule",
    ),
    BrowserType(
        jsName = "CSSContainerCondition",
        kotlinFqn = "web.cssom.CSSContainerCondition",
    ),
    BrowserType(
        jsName = "CSSContainerRule",
        kotlinFqn = "web.cssom.CSSContainerRule",
    ),
    BrowserType(
        jsName = "CSSCounterStyleRule",
        kotlinFqn = "web.cssom.CSSCounterStyleRule",
    ),
    BrowserType(
        jsName = "CSSFontFaceDescriptors",
        kotlinFqn = "web.cssom.CSSFontFaceDescriptors",
    ),
    BrowserType(
        jsName = "CSSFontFaceRule",
        kotlinFqn = "web.cssom.CSSFontFaceRule",
    ),
    BrowserType(
        jsName = "CSSFontFeatureValuesRule",
        kotlinFqn = "web.cssom.CSSFontFeatureValuesRule",
    ),
    BrowserType(
        jsName = "CSSFontPaletteValuesRule",
        kotlinFqn = "web.cssom.CSSFontPaletteValuesRule",
    ),
    BrowserType(
        jsName = "CSSGroupingRule",
        kotlinFqn = "web.cssom.CSSGroupingRule",
    ),
    BrowserType(
        jsName = "CSSImageValue",
        kotlinFqn = "web.cssom.CSSImageValue",
    ),
    BrowserType(
        jsName = "CSSImportRule",
        kotlinFqn = "web.cssom.CSSImportRule",
    ),
    BrowserType(
        jsName = "CSSKeyframeRule",
        kotlinFqn = "web.cssom.CSSKeyframeRule",
    ),
    BrowserType(
        jsName = "CSSKeyframesRule",
        kotlinFqn = "web.cssom.CSSKeyframesRule",
    ),
    BrowserType(
        jsName = "CSSKeywordValue",
        kotlinFqn = "web.cssom.CSSKeywordValue",
    ),
    BrowserType(
        jsName = "CSSKeywordish",
        kotlinFqn = "web.cssom.CSSKeywordish",
    ),
    BrowserType(
        jsName = "CSSLayerBlockRule",
        kotlinFqn = "web.cssom.CSSLayerBlockRule",
    ),
    BrowserType(
        jsName = "CSSLayerStatementRule",
        kotlinFqn = "web.cssom.CSSLayerStatementRule",
    ),
    BrowserType(
        jsName = "CSSMathClamp",
        kotlinFqn = "web.cssom.CSSMathClamp",
    ),
    BrowserType(
        jsName = "CSSMathInvert",
        kotlinFqn = "web.cssom.CSSMathInvert",
    ),
    BrowserType(
        jsName = "CSSMathMax",
        kotlinFqn = "web.cssom.CSSMathMax",
    ),
    BrowserType(
        jsName = "CSSMathMin",
        kotlinFqn = "web.cssom.CSSMathMin",
    ),
    BrowserType(
        jsName = "CSSMathNegate",
        kotlinFqn = "web.cssom.CSSMathNegate",
    ),
    BrowserType(
        jsName = "CSSMathOperator",
        kotlinFqn = "web.cssom.CSSMathOperator",
    ),
    BrowserType(
        jsName = "CSSMathProduct",
        kotlinFqn = "web.cssom.CSSMathProduct",
    ),
    BrowserType(
        jsName = "CSSMathSum",
        kotlinFqn = "web.cssom.CSSMathSum",
    ),
    BrowserType(
        jsName = "CSSMathValue",
        kotlinFqn = "web.cssom.CSSMathValue",
    ),
    BrowserType(
        jsName = "CSSMatrixComponent",
        kotlinFqn = "web.cssom.CSSMatrixComponent",
    ),
    BrowserType(
        jsName = "CSSMatrixComponentOptions",
        kotlinFqn = "web.cssom.CSSMatrixComponentOptions",
    ),
    BrowserType(
        jsName = "CSSMediaRule",
        kotlinFqn = "web.cssom.CSSMediaRule",
    ),
    BrowserType(
        jsName = "CSSNamespaceRule",
        kotlinFqn = "web.cssom.CSSNamespaceRule",
    ),
    BrowserType(
        jsName = "CSSNestedDeclarations",
        kotlinFqn = "web.cssom.CSSNestedDeclarations",
    ),
    BrowserType(
        jsName = "CSSNumberish",
        kotlinFqn = "web.cssom.CSSNumberish",
    ),
    BrowserType(
        jsName = "CSSNumericArray",
        kotlinFqn = "web.cssom.CSSNumericArray",
    ),
    BrowserType(
        jsName = "CSSNumericBaseType",
        kotlinFqn = "web.cssom.CSSNumericBaseType",
    ),
    BrowserType(
        jsName = "CSSNumericType",
        kotlinFqn = "web.cssom.CSSNumericType",
    ),
    BrowserType(
        jsName = "CSSNumericValue",
        kotlinFqn = "web.cssom.CSSNumericValue",
    ),
    BrowserType(
        jsName = "CSSPageDescriptors",
        kotlinFqn = "web.cssom.CSSPageDescriptors",
    ),
    BrowserType(
        jsName = "CSSPageRule",
        kotlinFqn = "web.cssom.CSSPageRule",
    ),
    BrowserType(
        jsName = "CSSPerspective",
        kotlinFqn = "web.cssom.CSSPerspective",
    ),
    BrowserType(
        jsName = "CSSPerspectiveValue",
        kotlinFqn = "web.cssom.CSSPerspectiveValue",
    ),
    BrowserType(
        jsName = "CSSPositionTryDescriptors",
        kotlinFqn = "web.cssom.CSSPositionTryDescriptors",
    ),
    BrowserType(
        jsName = "CSSPositionTryRule",
        kotlinFqn = "web.cssom.CSSPositionTryRule",
    ),
    BrowserType(
        jsName = "CSSPropertyRule",
        kotlinFqn = "web.cssom.CSSPropertyRule",
    ),
    BrowserType(
        jsName = "CSSRotate",
        kotlinFqn = "web.cssom.CSSRotate",
    ),
    BrowserType(
        jsName = "CSSRule",
        kotlinFqn = "web.cssom.CSSRule",
    ),
    BrowserType(
        jsName = "CSSRuleList",
        kotlinFqn = "web.cssom.CSSRuleList",
    ),
    BrowserType(
        jsName = "CSSScale",
        kotlinFqn = "web.cssom.CSSScale",
    ),
    BrowserType(
        jsName = "CSSScopeRule",
        kotlinFqn = "web.cssom.CSSScopeRule",
    ),
    BrowserType(
        jsName = "CSSSkew",
        kotlinFqn = "web.cssom.CSSSkew",
    ),
    BrowserType(
        jsName = "CSSSkewX",
        kotlinFqn = "web.cssom.CSSSkewX",
    ),
    BrowserType(
        jsName = "CSSSkewY",
        kotlinFqn = "web.cssom.CSSSkewY",
    ),
    BrowserType(
        jsName = "CSSStartingStyleRule",
        kotlinFqn = "web.cssom.CSSStartingStyleRule",
    ),
    BrowserType(
        jsName = "CSSStyleDeclaration",
        kotlinFqn = "web.cssom.CSSStyleDeclaration",
    ),
    BrowserType(
        jsName = "CSSStyleDeclarationBase",
        kotlinFqn = "web.cssom.CSSStyleDeclarationBase",
    ),
    BrowserType(
        jsName = "CSSStyleProperties",
        kotlinFqn = "web.cssom.CSSStyleProperties",
    ),
    BrowserType(
        jsName = "CSSStyleRule",
        kotlinFqn = "web.cssom.CSSStyleRule",
    ),
    BrowserType(
        jsName = "CSSStyleSheet",
        kotlinFqn = "web.cssom.CSSStyleSheet",
    ),
    BrowserType(
        jsName = "CSSStyleSheetInit",
        kotlinFqn = "web.cssom.CSSStyleSheetInit",
    ),
    BrowserType(
        jsName = "CSSStyleValue",
        kotlinFqn = "web.cssom.CSSStyleValue",
    ),
    BrowserType(
        jsName = "CSSSupportsRule",
        kotlinFqn = "web.cssom.CSSSupportsRule",
    ),
    BrowserType(
        jsName = "CSSTransformComponent",
        kotlinFqn = "web.cssom.CSSTransformComponent",
    ),
    BrowserType(
        jsName = "CSSTransformValue",
        kotlinFqn = "web.cssom.CSSTransformValue",
    ),
    BrowserType(
        jsName = "CSSTransition",
        kotlinFqn = "web.cssom.CSSTransition",
    ),
    BrowserType(
        jsName = "CSSTranslate",
        kotlinFqn = "web.cssom.CSSTranslate",
    ),
    BrowserType(
        jsName = "CSSUnitValue",
        kotlinFqn = "web.cssom.CSSUnitValue",
    ),
    BrowserType(
        jsName = "CSSUnparsedSegment",
        kotlinFqn = "web.cssom.CSSUnparsedSegment",
    ),
    BrowserType(
        jsName = "CSSUnparsedValue",
        kotlinFqn = "web.cssom.CSSUnparsedValue",
    ),
    BrowserType(
        jsName = "CSSVariableReferenceValue",
        kotlinFqn = "web.cssom.CSSVariableReferenceValue",
    ),
    BrowserType(
        jsName = "CSSViewTransitionRule",
        kotlinFqn = "web.cssom.CSSViewTransitionRule",
    ),
    BrowserType(
        jsName = "Cache",
        kotlinFqn = "web.cache.Cache",
    ),
    BrowserType(
        jsName = "CacheQueryOptions",
        kotlinFqn = "web.cache.CacheQueryOptions",
    ),
    BrowserType(
        jsName = "CacheStorage",
        kotlinFqn = "web.cache.CacheStorage",
    ),
    BrowserType(
        jsName = "CanPlayTypeResult",
        kotlinFqn = "web.html.CanPlayTypeResult",
    ),
    BrowserType(
        jsName = "CanvasCaptureMediaStreamTrack",
        kotlinFqn = "web.mediastreams.CanvasCaptureMediaStreamTrack",
    ),
    BrowserType(
        jsName = "CanvasCompositing",
        kotlinFqn = "web.canvas.CanvasCompositing",
    ),
    BrowserType(
        jsName = "CanvasDirection",
        kotlinFqn = "web.canvas.CanvasDirection",
    ),
    BrowserType(
        jsName = "CanvasDrawImage",
        kotlinFqn = "web.canvas.CanvasDrawImage",
    ),
    BrowserType(
        jsName = "CanvasDrawPath",
        kotlinFqn = "web.canvas.CanvasDrawPath",
    ),
    BrowserType(
        jsName = "CanvasFillRule",
        kotlinFqn = "web.canvas.CanvasFillRule",
    ),
    BrowserType(
        jsName = "CanvasFillStrokeStyles",
        kotlinFqn = "web.canvas.CanvasFillStrokeStyles",
    ),
    BrowserType(
        jsName = "CanvasFilters",
        kotlinFqn = "web.canvas.CanvasFilters",
    ),
    BrowserType(
        jsName = "CanvasFontKerning",
        kotlinFqn = "web.canvas.CanvasFontKerning",
    ),
    BrowserType(
        jsName = "CanvasFontStretch",
        kotlinFqn = "web.canvas.CanvasFontStretch",
    ),
    BrowserType(
        jsName = "CanvasFontVariantCaps",
        kotlinFqn = "web.canvas.CanvasFontVariantCaps",
    ),
    BrowserType(
        jsName = "CanvasGradient",
        kotlinFqn = "web.canvas.CanvasGradient",
    ),
    BrowserType(
        jsName = "CanvasImageData",
        kotlinFqn = "web.canvas.CanvasImageData",
    ),
    BrowserType(
        jsName = "CanvasImageSmoothing",
        kotlinFqn = "web.canvas.CanvasImageSmoothing",
    ),
    BrowserType(
        jsName = "CanvasImageSource",
        kotlinFqn = "web.canvas.CanvasImageSource",
    ),
    BrowserType(
        jsName = "CanvasLineCap",
        kotlinFqn = "web.canvas.CanvasLineCap",
    ),
    BrowserType(
        jsName = "CanvasLineJoin",
        kotlinFqn = "web.canvas.CanvasLineJoin",
    ),
    BrowserType(
        jsName = "CanvasPath",
        kotlinFqn = "web.canvas.CanvasPath",
    ),
    BrowserType(
        jsName = "CanvasPathDrawingStyles",
        kotlinFqn = "web.canvas.CanvasPathDrawingStyles",
    ),
    BrowserType(
        jsName = "CanvasPattern",
        kotlinFqn = "web.canvas.CanvasPattern",
    ),
    BrowserType(
        jsName = "CanvasRect",
        kotlinFqn = "web.canvas.CanvasRect",
    ),
    BrowserType(
        jsName = "CanvasRenderingContext2D",
        kotlinFqn = "web.canvas.CanvasRenderingContext2D",
    ),
    BrowserType(
        jsName = "CanvasRenderingContext2DSettings",
        kotlinFqn = "web.canvas.CanvasRenderingContext2DSettings",
    ),
    BrowserType(
        jsName = "CanvasSettings",
        kotlinFqn = "web.canvas.CanvasSettings",
    ),
    BrowserType(
        jsName = "CanvasShadowStyles",
        kotlinFqn = "web.canvas.CanvasShadowStyles",
    ),
    BrowserType(
        jsName = "CanvasState",
        kotlinFqn = "web.canvas.CanvasState",
    ),
    BrowserType(
        jsName = "CanvasText",
        kotlinFqn = "web.canvas.CanvasText",
    ),
    BrowserType(
        jsName = "CanvasTextAlign",
        kotlinFqn = "web.canvas.CanvasTextAlign",
    ),
    BrowserType(
        jsName = "CanvasTextBaseline",
        kotlinFqn = "web.canvas.CanvasTextBaseline",
    ),
    BrowserType(
        jsName = "CanvasTextDrawingStyles",
        kotlinFqn = "web.canvas.CanvasTextDrawingStyles",
    ),
    BrowserType(
        jsName = "CanvasTextRendering",
        kotlinFqn = "web.canvas.CanvasTextRendering",
    ),
    BrowserType(
        jsName = "CanvasTransform",
        kotlinFqn = "web.canvas.CanvasTransform",
    ),
    BrowserType(
        jsName = "CanvasUserInterface",
        kotlinFqn = "web.canvas.CanvasUserInterface",
    ),
    BrowserType(
        jsName = "CaretPosition",
        kotlinFqn = "web.dom.CaretPosition",
    ),
    BrowserType(
        jsName = "CaretPositionFromPointOptions",
        kotlinFqn = "web.dom.CaretPositionFromPointOptions",
    ),
    BrowserType(
        jsName = "ChannelCountMode",
        kotlinFqn = "web.audio.ChannelCountMode",
    ),
    BrowserType(
        jsName = "ChannelInterpretation",
        kotlinFqn = "web.audio.ChannelInterpretation",
    ),
    BrowserType(
        jsName = "ChannelMergerNode",
        kotlinFqn = "web.audio.ChannelMergerNode",
    ),
    BrowserType(
        jsName = "ChannelMergerOptions",
        kotlinFqn = "web.audio.ChannelMergerOptions",
    ),
    BrowserType(
        jsName = "ChannelSplitterNode",
        kotlinFqn = "web.audio.ChannelSplitterNode",
    ),
    BrowserType(
        jsName = "ChannelSplitterOptions",
        kotlinFqn = "web.audio.ChannelSplitterOptions",
    ),
    BrowserType(
        jsName = "CharacterBoundsUpdateEvent",
        kotlinFqn = "web.editcontext.CharacterBoundsUpdateEvent",
    ),
    BrowserType(
        jsName = "CharacterBoundsUpdateEventInit",
        kotlinFqn = "web.editcontext.CharacterBoundsUpdateEventInit",
    ),
    BrowserType(
        jsName = "CharacterData",
        kotlinFqn = "web.dom.CharacterData",
    ),
    BrowserType(
        jsName = "CheckVisibilityOptions",
        kotlinFqn = "web.dom.CheckVisibilityOptions",
    ),
    BrowserType(
        jsName = "ChildNode",
        kotlinFqn = "web.dom.ChildNode",
    ),
    BrowserType(
        jsName = "ClassAccessorDecoratorContext",
        kotlinFqn = "js.decorators.ClassAccessorDecoratorContext",
    ),
    BrowserType(
        jsName = "ClassDecoratorContext",
        kotlinFqn = "js.decorators.ClassDecoratorContext",
    ),
    BrowserType(
        jsName = "ClassFieldDecoratorContext",
        kotlinFqn = "js.decorators.ClassFieldDecoratorContext",
    ),
    BrowserType(
        jsName = "ClassGetterDecoratorContext",
        kotlinFqn = "js.decorators.ClassGetterDecoratorContext",
    ),
    BrowserType(
        jsName = "ClassMethodDecoratorContext",
        kotlinFqn = "js.decorators.ClassMethodDecoratorContext",
    ),
    BrowserType(
        jsName = "ClassSetterDecoratorContext",
        kotlinFqn = "js.decorators.ClassSetterDecoratorContext",
    ),
    BrowserType(
        jsName = "Client",
        kotlinFqn = "web.serviceworker.Client",
    ),
    BrowserType(
        jsName = "ClientQueryOptions",
        kotlinFqn = "web.serviceworker.ClientQueryOptions",
    ),
    BrowserType(
        jsName = "ClientTypes",
        kotlinFqn = "web.serviceworker.ClientTypes",
    ),
    BrowserType(
        jsName = "Clients",
        kotlinFqn = "web.serviceworker.Clients",
    ),
    BrowserType(
        jsName = "Clipboard",
        kotlinFqn = "web.clipboard.Clipboard",
    ),
    BrowserType(
        jsName = "ClipboardEvent",
        kotlinFqn = "web.clipboard.ClipboardEvent",
    ),
    BrowserType(
        jsName = "ClipboardEventInit",
        kotlinFqn = "web.clipboard.ClipboardEventInit",
    ),
    BrowserType(
        jsName = "ClipboardItem",
        kotlinFqn = "web.clipboard.ClipboardItem",
    ),
    BrowserType(
        jsName = "ClipboardItemOptions",
        kotlinFqn = "web.clipboard.ClipboardItemOptions",
    ),
    BrowserType(
        jsName = "ClipboardItems",
        kotlinFqn = "web.clipboard.ClipboardItems",
    ),
    BrowserType(
        jsName = "CloseEvent",
        kotlinFqn = "web.sockets.CloseEvent",
    ),
    BrowserType(
        jsName = "CloseEventInit",
        kotlinFqn = "web.sockets.CloseEventInit",
    ),
    BrowserType(
        jsName = "CloseWatcher",
        kotlinFqn = "web.close.CloseWatcher",
    ),
    BrowserType(
        jsName = "CloseWatcherOptions",
        kotlinFqn = "web.close.CloseWatcherOptions",
    ),
    BrowserType(
        jsName = "ClosedBy",
        kotlinFqn = "web.html.ClosedBy",
    ),
    BrowserType(
        jsName = "CodecState",
        kotlinFqn = "web.codecs.CodecState",
    ),
    BrowserType(
        jsName = "CollectionLike",
        kotlinFqn = "js.collections.CollectionLike",
    ),
    BrowserType(
        jsName = "ColorGamut",
        kotlinFqn = "web.mediacapabilities.ColorGamut",
    ),
    BrowserType(
        jsName = "ColorSpaceConversion",
        kotlinFqn = "web.images.ColorSpaceConversion",
    ),
    BrowserType(
        jsName = "Command",
        kotlinFqn = "web.command.Command",
    ),
    BrowserType(
        jsName = "CommandEvent",
        kotlinFqn = "web.command.CommandEvent",
    ),
    BrowserType(
        jsName = "CommandEventInit",
        kotlinFqn = "web.command.CommandEventInit",
    ),
    BrowserType(
        jsName = "Comment",
        kotlinFqn = "web.dom.Comment",
    ),
    BrowserType(
        jsName = "CompositeOperation",
        kotlinFqn = "web.animations.CompositeOperation",
    ),
    BrowserType(
        jsName = "CompositeOperationOrAuto",
        kotlinFqn = "web.animations.CompositeOperationOrAuto",
    ),
    BrowserType(
        jsName = "CompositionEvent",
        kotlinFqn = "web.input.CompositionEvent",
    ),
    BrowserType(
        jsName = "CompositionEventInit",
        kotlinFqn = "web.input.CompositionEventInit",
    ),
    BrowserType(
        jsName = "CompressionFormat",
        kotlinFqn = "web.compression.CompressionFormat",
    ),
    BrowserType(
        jsName = "CompressionStream",
        kotlinFqn = "web.compression.CompressionStream",
    ),
    BrowserType(
        jsName = "ComputedEffectTiming",
        kotlinFqn = "web.animations.ComputedEffectTiming",
    ),
    BrowserType(
        jsName = "ComputedKeyframe",
        kotlinFqn = "web.animations.ComputedKeyframe",
    ),
    BrowserType(
        jsName = "Console",
        kotlinFqn = "web.console.Console",
    ),
    BrowserType(
        jsName = "ConstantSourceNode",
        kotlinFqn = "web.audio.ConstantSourceNode",
    ),
    BrowserType(
        jsName = "ConstantSourceOptions",
        kotlinFqn = "web.audio.ConstantSourceOptions",
    ),
    BrowserType(
        jsName = "ConstrainBoolean",
        kotlinFqn = "web.mediastreams.ConstrainBoolean",
    ),
    BrowserType(
        jsName = "ConstrainBooleanOrDOMString",
        kotlinFqn = "web.mediastreams.ConstrainBooleanOrDOMString",
    ),
    BrowserType(
        jsName = "ConstrainBooleanOrDOMStringParameters",
        kotlinFqn = "web.mediastreams.ConstrainBooleanOrDOMStringParameters",
    ),
    BrowserType(
        jsName = "ConstrainBooleanParameters",
        kotlinFqn = "web.mediastreams.ConstrainBooleanParameters",
    ),
    BrowserType(
        jsName = "ConstrainDOMString",
        kotlinFqn = "web.mediastreams.ConstrainDOMString",
    ),
    BrowserType(
        jsName = "ConstrainDOMStringParameters",
        kotlinFqn = "web.mediastreams.ConstrainDOMStringParameters",
    ),
    BrowserType(
        jsName = "ConstrainDouble",
        kotlinFqn = "web.mediastreams.ConstrainDouble",
    ),
    BrowserType(
        jsName = "ConstrainDoubleRange",
        kotlinFqn = "web.mediastreams.ConstrainDoubleRange",
    ),
    BrowserType(
        jsName = "ConstrainULong",
        kotlinFqn = "web.mediastreams.ConstrainULong",
    ),
    BrowserType(
        jsName = "ConstrainULongRange",
        kotlinFqn = "web.mediastreams.ConstrainULongRange",
    ),
    BrowserType(
        jsName = "ContentBlock",
        kotlinFqn = "web.mcp.ContentBlock",
    ),
    BrowserType(
        jsName = "ContentBlockBase",
        kotlinFqn = "web.mcp.ContentBlockBase",
    ),
    BrowserType(
        jsName = "ContentVisibilityAutoStateChangeEvent",
        kotlinFqn = "web.cssom.ContentVisibilityAutoStateChangeEvent",
    ),
    BrowserType(
        jsName = "ContentVisibilityAutoStateChangeEventInit",
        kotlinFqn = "web.cssom.ContentVisibilityAutoStateChangeEventInit",
    ),
    BrowserType(
        jsName = "ConvolverNode",
        kotlinFqn = "web.audio.ConvolverNode",
    ),
    BrowserType(
        jsName = "ConvolverOptions",
        kotlinFqn = "web.audio.ConvolverOptions",
    ),
    BrowserType(
        jsName = "CookieChangeEvent",
        kotlinFqn = "web.cookie.CookieChangeEvent",
    ),
    BrowserType(
        jsName = "CookieChangeEventInit",
        kotlinFqn = "web.cookie.CookieChangeEventInit",
    ),
    BrowserType(
        jsName = "CookieInit",
        kotlinFqn = "web.cookie.CookieInit",
    ),
    BrowserType(
        jsName = "CookieList",
        kotlinFqn = "web.cookie.CookieList",
    ),
    BrowserType(
        jsName = "CookieListItem",
        kotlinFqn = "web.cookie.CookieListItem",
    ),
    BrowserType(
        jsName = "CookieSameSite",
        kotlinFqn = "web.cookie.CookieSameSite",
    ),
    BrowserType(
        jsName = "CookieStore",
        kotlinFqn = "web.cookie.CookieStore",
    ),
    BrowserType(
        jsName = "CookieStoreDeleteOptions",
        kotlinFqn = "web.cookie.CookieStoreDeleteOptions",
    ),
    BrowserType(
        jsName = "CookieStoreGetOptions",
        kotlinFqn = "web.cookie.CookieStoreGetOptions",
    ),
    BrowserType(
        jsName = "CookieStoreManager",
        kotlinFqn = "web.cookie.CookieStoreManager",
    ),
    BrowserType(
        jsName = "CountQueuingStrategy",
        kotlinFqn = "web.streams.CountQueuingStrategy",
    ),
    BrowserType(
        jsName = "CreateHTMLCallback",
        kotlinFqn = "web.trustedtypes.CreateHTMLCallback",
    ),
    BrowserType(
        jsName = "CreateScriptCallback",
        kotlinFqn = "web.trustedtypes.CreateScriptCallback",
    ),
    BrowserType(
        jsName = "CreateScriptURLCallback",
        kotlinFqn = "web.trustedtypes.CreateScriptURLCallback",
    ),
    BrowserType(
        jsName = "Credential",
        kotlinFqn = "web.credentials.Credential",
    ),
    BrowserType(
        jsName = "CredentialCreationOptions",
        kotlinFqn = "web.credentials.CredentialCreationOptions",
    ),
    BrowserType(
        jsName = "CredentialMediationRequirement",
        kotlinFqn = "web.credentials.CredentialMediationRequirement",
    ),
    BrowserType(
        jsName = "CredentialPropertiesOutput",
        kotlinFqn = "web.authn.CredentialPropertiesOutput",
    ),
    BrowserType(
        jsName = "CredentialRequestOptions",
        kotlinFqn = "web.credentials.CredentialRequestOptions",
    ),
    BrowserType(
        jsName = "CredentialsContainer",
        kotlinFqn = "web.credentials.CredentialsContainer",
    ),
    BrowserType(
        jsName = "CrossOrigin",
        kotlinFqn = "web.http.CrossOrigin",
    ),
    BrowserType(
        jsName = "Crypto",
        kotlinFqn = "web.crypto.Crypto",
    ),
    BrowserType(
        jsName = "CryptoKey",
        kotlinFqn = "web.crypto.CryptoKey",
    ),
    BrowserType(
        jsName = "CryptoKeyPair",
        kotlinFqn = "web.crypto.CryptoKeyPair",
    ),
    BrowserType(
        jsName = "CurrentUserDetailsOptions",
        kotlinFqn = "web.authn.CurrentUserDetailsOptions",
    ),
    BrowserType(
        jsName = "CustomElement",
        kotlinFqn = "web.components.CustomElement",
    ),
    BrowserType(
        jsName = "CustomElementConstructor",
        kotlinFqn = "web.components.CustomElementConstructor",
    ),
    BrowserType(
        jsName = "CustomElementRegistry",
        kotlinFqn = "web.components.CustomElementRegistry",
    ),
    BrowserType(
        jsName = "CustomEvent",
        kotlinFqn = "web.events.CustomEvent",
    ),
    BrowserType(
        jsName = "CustomEventInit",
        kotlinFqn = "web.events.CustomEventInit",
    ),
    BrowserType(
        jsName = "CustomFormControl",
        kotlinFqn = "web.form.CustomFormControl",
    ),
    BrowserType(
        jsName = "CustomStateSet",
        kotlinFqn = "web.components.CustomStateSet",
    ),
    BrowserType(
        jsName = "DOMException",
        kotlinFqn = "web.errors.DOMException",
    ),
    BrowserType(
        jsName = "DOMExceptionName",
        kotlinFqn = "web.errors.DOMExceptionName",
    ),
    BrowserType(
        jsName = "DOMHighResTimeStamp",
        kotlinFqn = "web.time.DOMHighResTimeStamp",
    ),
    BrowserType(
        jsName = "DOMImplementation",
        kotlinFqn = "web.dom.DOMImplementation",
    ),
    BrowserType(
        jsName = "DOMMatrix",
        kotlinFqn = "web.geometry.DOMMatrix",
    ),
    BrowserType(
        jsName = "DOMMatrixReadOnly",
        kotlinFqn = "web.geometry.DOMMatrixReadOnly",
    ),
    BrowserType(
        jsName = "DOMParser",
        kotlinFqn = "web.parsing.DOMParser",
    ),
    BrowserType(
        jsName = "DOMParserSupportedType",
        kotlinFqn = "web.parsing.DOMParserSupportedType",
    ),
    BrowserType(
        jsName = "DOMPoint",
        kotlinFqn = "web.geometry.DOMPoint",
    ),
    BrowserType(
        jsName = "DOMPointReadOnly",
        kotlinFqn = "web.geometry.DOMPointReadOnly",
    ),
    BrowserType(
        jsName = "DOMQuad",
        kotlinFqn = "web.geometry.DOMQuad",
    ),
    BrowserType(
        jsName = "DOMRect",
        kotlinFqn = "web.geometry.DOMRect",
    ),
    BrowserType(
        jsName = "DOMRectList",
        kotlinFqn = "web.geometry.DOMRectList",
    ),
    BrowserType(
        jsName = "DOMRectReadOnly",
        kotlinFqn = "web.geometry.DOMRectReadOnly",
    ),
    BrowserType(
        jsName = "DOMStringList",
        kotlinFqn = "web.dom.DOMStringList",
    ),
    BrowserType(
        jsName = "DOMStringMap",
        kotlinFqn = "web.dom.DOMStringMap",
    ),
    BrowserType(
        jsName = "DOMTokenList",
        kotlinFqn = "web.dom.DOMTokenList",
    ),
    BrowserType(
        jsName = "DataTestId",
        kotlinFqn = "web.dom.DataTestId",
    ),
    BrowserType(
        jsName = "DataTransfer",
        kotlinFqn = "web.data.DataTransfer",
    ),
    BrowserType(
        jsName = "DataTransferItem",
        kotlinFqn = "web.data.DataTransferItem",
    ),
    BrowserType(
        jsName = "DataTransferItemList",
        kotlinFqn = "web.data.DataTransferItemList",
    ),
    BrowserType(
        jsName = "DataView",
        kotlinFqn = "js.buffer.DataView",
    ),
    BrowserType(
        jsName = "Date",
        kotlinFqn = "js.date.Date",
    ),
    BrowserType(
        jsName = "DecompressionStream",
        kotlinFqn = "web.compression.DecompressionStream",
    ),
    BrowserType(
        jsName = "DecoratorContextKind",
        kotlinFqn = "js.decorators.DecoratorContextKind",
    ),
    BrowserType(
        jsName = "DecoratorMetadata",
        kotlinFqn = "js.decorators.DecoratorMetadata",
    ),
    BrowserType(
        jsName = "DedicatedWorkerGlobalScope",
        kotlinFqn = "web.workers.DedicatedWorkerGlobalScope",
    ),
    BrowserType(
        jsName = "DeferredRequestInit",
        kotlinFqn = "web.http.DeferredRequestInit",
    ),
    BrowserType(
        jsName = "DelayNode",
        kotlinFqn = "web.audio.DelayNode",
    ),
    BrowserType(
        jsName = "DelayOptions",
        kotlinFqn = "web.audio.DelayOptions",
    ),
    BrowserType(
        jsName = "DeltaMode",
        kotlinFqn = "web.mouse.DeltaMode",
    ),
    BrowserType(
        jsName = "Destructible",
        kotlinFqn = "js.objects.Destructible",
    ),
    BrowserType(
        jsName = "DeviceMotionEvent",
        kotlinFqn = "web.device.DeviceMotionEvent",
    ),
    BrowserType(
        jsName = "DeviceMotionEventAcceleration",
        kotlinFqn = "web.device.DeviceMotionEventAcceleration",
    ),
    BrowserType(
        jsName = "DeviceMotionEventAccelerationInit",
        kotlinFqn = "web.device.DeviceMotionEventAccelerationInit",
    ),
    BrowserType(
        jsName = "DeviceMotionEventInit",
        kotlinFqn = "web.device.DeviceMotionEventInit",
    ),
    BrowserType(
        jsName = "DeviceMotionEventRotationRate",
        kotlinFqn = "web.device.DeviceMotionEventRotationRate",
    ),
    BrowserType(
        jsName = "DeviceMotionEventRotationRateInit",
        kotlinFqn = "web.device.DeviceMotionEventRotationRateInit",
    ),
    BrowserType(
        jsName = "DeviceOrientationEvent",
        kotlinFqn = "web.device.DeviceOrientationEvent",
    ),
    BrowserType(
        jsName = "DeviceOrientationEventInit",
        kotlinFqn = "web.device.DeviceOrientationEventInit",
    ),
    BrowserType(
        jsName = "DigitalCredential",
        kotlinFqn = "web.credentials.DigitalCredential",
    ),
    BrowserType(
        jsName = "DigitalCredentialPresentationProtocol",
        kotlinFqn = "web.credentials.DigitalCredentialPresentationProtocol",
    ),
    BrowserType(
        jsName = "DirectionSetting",
        kotlinFqn = "web.vtt.DirectionSetting",
    ),
    BrowserType(
        jsName = "DirectoryPickerOptions",
        kotlinFqn = "web.fs.DirectoryPickerOptions",
    ),
    BrowserType(
        jsName = "DisplayMediaStreamOptions",
        kotlinFqn = "web.mediadevices.DisplayMediaStreamOptions",
    ),
    BrowserType(
        jsName = "Disposable",
        kotlinFqn = "js.disposable.Disposable",
    ),
    BrowserType(
        jsName = "DisposableStack",
        kotlinFqn = "js.disposable.DisposableStack",
    ),
    BrowserType(
        jsName = "DistanceModelType",
        kotlinFqn = "web.audio.DistanceModelType",
    ),
    BrowserType(
        jsName = "Document",
        kotlinFqn = "web.dom.Document",
    ),
    BrowserType(
        jsName = "DocumentFragment",
        kotlinFqn = "web.dom.DocumentFragment",
    ),
    BrowserType(
        jsName = "DocumentOrShadowRoot",
        kotlinFqn = "web.dom.DocumentOrShadowRoot",
    ),
    BrowserType(
        jsName = "DocumentPictureInPicture",
        kotlinFqn = "web.dpip.DocumentPictureInPicture",
    ),
    BrowserType(
        jsName = "DocumentPictureInPictureEvent",
        kotlinFqn = "web.dpip.DocumentPictureInPictureEvent",
    ),
    BrowserType(
        jsName = "DocumentPictureInPictureEventInit",
        kotlinFqn = "web.dpip.DocumentPictureInPictureEventInit",
    ),
    BrowserType(
        jsName = "DocumentPictureInPictureOptions",
        kotlinFqn = "web.dpip.DocumentPictureInPictureOptions",
    ),
    BrowserType(
        jsName = "DocumentReadyState",
        kotlinFqn = "web.dom.DocumentReadyState",
    ),
    BrowserType(
        jsName = "DocumentTimeline",
        kotlinFqn = "web.animations.DocumentTimeline",
    ),
    BrowserType(
        jsName = "DocumentTimelineOptions",
        kotlinFqn = "web.animations.DocumentTimelineOptions",
    ),
    BrowserType(
        jsName = "DocumentType",
        kotlinFqn = "web.dom.DocumentType",
    ),
    BrowserType(
        jsName = "DocumentVisibilityState",
        kotlinFqn = "web.dom.DocumentVisibilityState",
    ),
    BrowserType(
        jsName = "DoubleRange",
        kotlinFqn = "web.mediastreams.DoubleRange",
    ),
    BrowserType(
        jsName = "DragEvent",
        kotlinFqn = "web.dnd.DragEvent",
    ),
    BrowserType(
        jsName = "DragEventInit",
        kotlinFqn = "web.dnd.DragEventInit",
    ),
    BrowserType(
        jsName = "DropEffect",
        kotlinFqn = "web.data.DropEffect",
    ),
    BrowserType(
        jsName = "DynamicsCompressorNode",
        kotlinFqn = "web.audio.DynamicsCompressorNode",
    ),
    BrowserType(
        jsName = "DynamicsCompressorOptions",
        kotlinFqn = "web.audio.DynamicsCompressorOptions",
    ),
    BrowserType(
        jsName = "EXT_blend_minmax",
        kotlinFqn = "web.gl.EXT_blend_minmax",
    ),
    BrowserType(
        jsName = "EXT_color_buffer_float",
        kotlinFqn = "web.gl.EXT_color_buffer_float",
    ),
    BrowserType(
        jsName = "EXT_color_buffer_half_float",
        kotlinFqn = "web.gl.EXT_color_buffer_half_float",
    ),
    BrowserType(
        jsName = "EXT_float_blend",
        kotlinFqn = "web.gl.EXT_float_blend",
    ),
    BrowserType(
        jsName = "EXT_frag_depth",
        kotlinFqn = "web.gl.EXT_frag_depth",
    ),
    BrowserType(
        jsName = "EXT_sRGB",
        kotlinFqn = "web.gl.EXT_sRGB",
    ),
    BrowserType(
        jsName = "EXT_shader_texture_lod",
        kotlinFqn = "web.gl.EXT_shader_texture_lod",
    ),
    BrowserType(
        jsName = "EXT_texture_compression_bptc",
        kotlinFqn = "web.gl.EXT_texture_compression_bptc",
    ),
    BrowserType(
        jsName = "EXT_texture_compression_rgtc",
        kotlinFqn = "web.gl.EXT_texture_compression_rgtc",
    ),
    BrowserType(
        jsName = "EXT_texture_filter_anisotropic",
        kotlinFqn = "web.gl.EXT_texture_filter_anisotropic",
    ),
    BrowserType(
        jsName = "EXT_texture_norm16",
        kotlinFqn = "web.gl.EXT_texture_norm16",
    ),
    BrowserType(
        jsName = "EcKeyAlgorithm",
        kotlinFqn = "web.crypto.EcKeyAlgorithm",
    ),
    BrowserType(
        jsName = "EcKeyGenParams",
        kotlinFqn = "web.crypto.EcKeyGenParams",
    ),
    BrowserType(
        jsName = "EcKeyImportParams",
        kotlinFqn = "web.crypto.EcKeyImportParams",
    ),
    BrowserType(
        jsName = "EcdhKeyDeriveParams",
        kotlinFqn = "web.crypto.EcdhKeyDeriveParams",
    ),
    BrowserType(
        jsName = "EcdsaParams",
        kotlinFqn = "web.crypto.EcdsaParams",
    ),
    BrowserType(
        jsName = "EditContext",
        kotlinFqn = "web.editcontext.EditContext",
    ),
    BrowserType(
        jsName = "EditContextInit",
        kotlinFqn = "web.editcontext.EditContextInit",
    ),
    BrowserType(
        jsName = "EffectTiming",
        kotlinFqn = "web.animations.EffectTiming",
    ),
    BrowserType(
        jsName = "Element",
        kotlinFqn = "web.dom.Element",
    ),
    BrowserType(
        jsName = "ElementCSSInlineStyle",
        kotlinFqn = "web.cssom.ElementCSSInlineStyle",
    ),
    BrowserType(
        jsName = "ElementContentEditable",
        kotlinFqn = "web.html.ElementContentEditable",
    ),
    BrowserType(
        jsName = "ElementCreationOptions",
        kotlinFqn = "web.dom.ElementCreationOptions",
    ),
    BrowserType(
        jsName = "ElementDefinitionOptions",
        kotlinFqn = "web.components.ElementDefinitionOptions",
    ),
    BrowserType(
        jsName = "ElementId",
        kotlinFqn = "web.dom.ElementId",
    ),
    BrowserType(
        jsName = "ElementInternals",
        kotlinFqn = "web.components.ElementInternals",
    ),
    BrowserType(
        jsName = "ElicitationAction",
        kotlinFqn = "web.mcp.ElicitationAction",
    ),
    BrowserType(
        jsName = "ElicitationFormParams",
        kotlinFqn = "web.mcp.ElicitationFormParams",
    ),
    BrowserType(
        jsName = "ElicitationParams",
        kotlinFqn = "web.mcp.ElicitationParams",
    ),
    BrowserType(
        jsName = "ElicitationResult",
        kotlinFqn = "web.mcp.ElicitationResult",
    ),
    BrowserType(
        jsName = "ElicitationUrlParams",
        kotlinFqn = "web.mcp.ElicitationUrlParams",
    ),
    BrowserType(
        jsName = "EmbeddedResource",
        kotlinFqn = "web.mcp.EmbeddedResource",
    ),
    BrowserType(
        jsName = "EncodedAudioChunk",
        kotlinFqn = "web.codecs.EncodedAudioChunk",
    ),
    BrowserType(
        jsName = "EncodedAudioChunkInit",
        kotlinFqn = "web.codecs.EncodedAudioChunkInit",
    ),
    BrowserType(
        jsName = "EncodedAudioChunkMetadata",
        kotlinFqn = "web.codecs.EncodedAudioChunkMetadata",
    ),
    BrowserType(
        jsName = "EncodedAudioChunkOutputCallback",
        kotlinFqn = "web.codecs.EncodedAudioChunkOutputCallback",
    ),
    BrowserType(
        jsName = "EncodedAudioChunkType",
        kotlinFqn = "web.codecs.EncodedAudioChunkType",
    ),
    BrowserType(
        jsName = "EncodedVideoChunk",
        kotlinFqn = "web.codecs.EncodedVideoChunk",
    ),
    BrowserType(
        jsName = "EncodedVideoChunkInit",
        kotlinFqn = "web.codecs.EncodedVideoChunkInit",
    ),
    BrowserType(
        jsName = "EncodedVideoChunkMetadata",
        kotlinFqn = "web.codecs.EncodedVideoChunkMetadata",
    ),
    BrowserType(
        jsName = "EncodedVideoChunkOutputCallback",
        kotlinFqn = "web.codecs.EncodedVideoChunkOutputCallback",
    ),
    BrowserType(
        jsName = "EncodedVideoChunkType",
        kotlinFqn = "web.codecs.EncodedVideoChunkType",
    ),
    BrowserType(
        jsName = "EndOfStreamError",
        kotlinFqn = "web.mediasource.EndOfStreamError",
    ),
    BrowserType(
        jsName = "EndingType",
        kotlinFqn = "web.blob.EndingType",
    ),
    BrowserType(
        jsName = "EnterKeyHint",
        kotlinFqn = "web.html.EnterKeyHint",
    ),
    BrowserType(
        jsName = "EpochTimeStamp",
        kotlinFqn = "web.time.EpochTimeStamp",
    ),
    BrowserType(
        jsName = "Error",
        kotlinFqn = "js.errors.JsError",
    ),
    BrowserType(
        jsName = "ErrorCallback",
        kotlinFqn = "web.fs.ErrorCallback",
    ),
    BrowserType(
        jsName = "ErrorEvent",
        kotlinFqn = "web.errors.ErrorEvent",
    ),
    BrowserType(
        jsName = "ErrorEventInit",
        kotlinFqn = "web.errors.ErrorEventInit",
    ),
    BrowserType(
        jsName = "ErrorOptions",
        kotlinFqn = "js.errors.ErrorOptions",
    ),
    BrowserType(
        jsName = "EvalError",
        kotlinFqn = "js.errors.EvalError",
    ),
    BrowserType(
        jsName = "Event",
        kotlinFqn = "web.events.Event",
    ),
    BrowserType(
        jsName = "EventCounts",
        kotlinFqn = "web.performance.EventCounts",
    ),
    BrowserType(
        jsName = "EventHandler",
        kotlinFqn = "web.events.EventHandler",
    ),
    BrowserType(
        jsName = "EventInit",
        kotlinFqn = "web.events.EventInit",
    ),
    BrowserType(
        jsName = "EventListenerOptions",
        kotlinFqn = "web.events.EventListenerOptions",
    ),
    BrowserType(
        jsName = "EventModifierInit",
        kotlinFqn = "web.uievents.EventModifierInit",
    ),
    BrowserType(
        jsName = "EventPhase",
        kotlinFqn = "web.events.EventPhase",
    ),
    BrowserType(
        jsName = "EventSource",
        kotlinFqn = "web.sse.EventSource",
    ),
    BrowserType(
        jsName = "EventSourceInit",
        kotlinFqn = "web.sse.EventSourceInit",
    ),
    BrowserType(
        jsName = "EventTarget",
        kotlinFqn = "web.events.EventTarget",
    ),
    BrowserType(
        jsName = "EventTargetLike",
        kotlinFqn = "web.events.EventTargetLike",
    ),
    BrowserType(
        jsName = "EventType",
        kotlinFqn = "web.events.EventType",
    ),
    BrowserType(
        jsName = "ExtendableCookieChangeEvent",
        kotlinFqn = "web.cookie.ExtendableCookieChangeEvent",
    ),
    BrowserType(
        jsName = "ExtendableCookieChangeEventInit",
        kotlinFqn = "web.cookie.ExtendableCookieChangeEventInit",
    ),
    BrowserType(
        jsName = "ExtendableEvent",
        kotlinFqn = "web.serviceworker.ExtendableEvent",
    ),
    BrowserType(
        jsName = "ExtendableEventInit",
        kotlinFqn = "web.serviceworker.ExtendableEventInit",
    ),
    BrowserType(
        jsName = "ExtendableMessageEvent",
        kotlinFqn = "web.serviceworker.ExtendableMessageEvent",
    ),
    BrowserType(
        jsName = "ExtendableMessageEventInit",
        kotlinFqn = "web.serviceworker.ExtendableMessageEventInit",
    ),
    BrowserType(
        jsName = "FetchEvent",
        kotlinFqn = "web.serviceworker.FetchEvent",
    ),
    BrowserType(
        jsName = "FetchEventInit",
        kotlinFqn = "web.serviceworker.FetchEventInit",
    ),
    BrowserType(
        jsName = "FetchLaterResult",
        kotlinFqn = "web.http.FetchLaterResult",
    ),
    BrowserType(
        jsName = "FetchPriority",
        kotlinFqn = "web.http.FetchPriority",
    ),
    BrowserType(
        jsName = "FetchResult",
        kotlinFqn = "web.http.FetchResult",
    ),
    BrowserType(
        jsName = "File",
        kotlinFqn = "web.file.File",
    ),
    BrowserType(
        jsName = "FileCallback",
        kotlinFqn = "web.fs.FileCallback",
    ),
    BrowserType(
        jsName = "FileList",
        kotlinFqn = "web.file.FileList",
    ),
    BrowserType(
        jsName = "FilePickerAcceptType",
        kotlinFqn = "web.fs.FilePickerAcceptType",
    ),
    BrowserType(
        jsName = "FilePickerOptions",
        kotlinFqn = "web.fs.FilePickerOptions",
    ),
    BrowserType(
        jsName = "FilePropertyBag",
        kotlinFqn = "web.file.FilePropertyBag",
    ),
    BrowserType(
        jsName = "FileReader",
        kotlinFqn = "web.file.FileReader",
    ),
    BrowserType(
        jsName = "FileReaderSync",
        kotlinFqn = "web.file.FileReaderSync",
    ),
    BrowserType(
        jsName = "FileSystem",
        kotlinFqn = "web.fs.FileSystem",
    ),
    BrowserType(
        jsName = "FileSystemCreateWritableOptions",
        kotlinFqn = "web.fs.FileSystemCreateWritableOptions",
    ),
    BrowserType(
        jsName = "FileSystemDirectoryEntry",
        kotlinFqn = "web.fs.FileSystemDirectoryEntry",
    ),
    BrowserType(
        jsName = "FileSystemDirectoryHandle",
        kotlinFqn = "web.fs.FileSystemDirectoryHandle",
    ),
    BrowserType(
        jsName = "FileSystemDirectoryReader",
        kotlinFqn = "web.fs.FileSystemDirectoryReader",
    ),
    BrowserType(
        jsName = "FileSystemEntriesCallback",
        kotlinFqn = "web.fs.FileSystemEntriesCallback",
    ),
    BrowserType(
        jsName = "FileSystemEntry",
        kotlinFqn = "web.fs.FileSystemEntry",
    ),
    BrowserType(
        jsName = "FileSystemEntryCallback",
        kotlinFqn = "web.fs.FileSystemEntryCallback",
    ),
    BrowserType(
        jsName = "FileSystemFileEntry",
        kotlinFqn = "web.fs.FileSystemFileEntry",
    ),
    BrowserType(
        jsName = "FileSystemFileHandle",
        kotlinFqn = "web.fs.FileSystemFileHandle",
    ),
    BrowserType(
        jsName = "FileSystemFlags",
        kotlinFqn = "web.fs.FileSystemFlags",
    ),
    BrowserType(
        jsName = "FileSystemGetDirectoryOptions",
        kotlinFqn = "web.fs.FileSystemGetDirectoryOptions",
    ),
    BrowserType(
        jsName = "FileSystemGetFileOptions",
        kotlinFqn = "web.fs.FileSystemGetFileOptions",
    ),
    BrowserType(
        jsName = "FileSystemHandle",
        kotlinFqn = "web.fs.FileSystemHandle",
    ),
    BrowserType(
        jsName = "FileSystemHandleKind",
        kotlinFqn = "web.fs.FileSystemHandleKind",
    ),
    BrowserType(
        jsName = "FileSystemPermissionMode",
        kotlinFqn = "web.fs.FileSystemPermissionMode",
    ),
    BrowserType(
        jsName = "FileSystemReadWriteOptions",
        kotlinFqn = "web.fs.FileSystemReadWriteOptions",
    ),
    BrowserType(
        jsName = "FileSystemRemoveOptions",
        kotlinFqn = "web.fs.FileSystemRemoveOptions",
    ),
    BrowserType(
        jsName = "FileSystemSyncAccessHandle",
        kotlinFqn = "web.fs.FileSystemSyncAccessHandle",
    ),
    BrowserType(
        jsName = "FileSystemWritableFileStream",
        kotlinFqn = "web.fs.FileSystemWritableFileStream",
    ),
    BrowserType(
        jsName = "FileSystemWriteChunkType",
        kotlinFqn = "web.fs.FileSystemWriteChunkType",
    ),
    BrowserType(
        jsName = "FillLightMode",
        kotlinFqn = "web.imagecapture.FillLightMode",
    ),
    BrowserType(
        jsName = "FillMode",
        kotlinFqn = "web.animations.FillMode",
    ),
    BrowserType(
        jsName = "FinalizationRegistry",
        kotlinFqn = "js.memory.FinalizationRegistry",
    ),
    BrowserType(
        jsName = "Float16",
        kotlinFqn = "js.numbers.Float16",
    ),
    BrowserType(
        jsName = "Float16Array",
        kotlinFqn = "js.typedarrays.Float16Array",
    ),
    BrowserType(
        jsName = "Float32Array",
        kotlinFqn = "js.typedarrays.Float32Array",
    ),
    BrowserType(
        jsName = "Float32List",
        kotlinFqn = "web.gl.Float32List",
    ),
    BrowserType(
        jsName = "Float64Array",
        kotlinFqn = "js.typedarrays.Float64Array",
    ),
    BrowserType(
        jsName = "FlowControlType",
        kotlinFqn = "web.serial.FlowControlType",
    ),
    BrowserType(
        jsName = "FocusEvent",
        kotlinFqn = "web.focus.FocusEvent",
    ),
    BrowserType(
        jsName = "FocusEventInit",
        kotlinFqn = "web.focus.FocusEventInit",
    ),
    BrowserType(
        jsName = "FocusOptions",
        kotlinFqn = "web.dom.FocusOptions",
    ),
    BrowserType(
        jsName = "FontDisplay",
        kotlinFqn = "web.fonts.FontDisplay",
    ),
    BrowserType(
        jsName = "FontFace",
        kotlinFqn = "web.fonts.FontFace",
    ),
    BrowserType(
        jsName = "FontFaceDescriptors",
        kotlinFqn = "web.fonts.FontFaceDescriptors",
    ),
    BrowserType(
        jsName = "FontFaceLoadStatus",
        kotlinFqn = "web.fonts.FontFaceLoadStatus",
    ),
    BrowserType(
        jsName = "FontFaceSet",
        kotlinFqn = "web.fonts.FontFaceSet",
    ),
    BrowserType(
        jsName = "FontFaceSetLoadEvent",
        kotlinFqn = "web.fonts.FontFaceSetLoadEvent",
    ),
    BrowserType(
        jsName = "FontFaceSetLoadEventInit",
        kotlinFqn = "web.fonts.FontFaceSetLoadEventInit",
    ),
    BrowserType(
        jsName = "FontFaceSetLoadStatus",
        kotlinFqn = "web.fonts.FontFaceSetLoadStatus",
    ),
    BrowserType(
        jsName = "FontFaceSource",
        kotlinFqn = "web.fonts.FontFaceSource",
    ),
    BrowserType(
        jsName = "FormAssociatedCallback",
        kotlinFqn = "web.form.FormAssociatedCallback",
    ),
    BrowserType(
        jsName = "FormControl",
        kotlinFqn = "web.form.FormControl",
    ),
    BrowserType(
        jsName = "FormData",
        kotlinFqn = "web.form.FormData",
    ),
    BrowserType(
        jsName = "FormDataEntryValue",
        kotlinFqn = "web.form.FormDataEntryValue",
    ),
    BrowserType(
        jsName = "FormDataEvent",
        kotlinFqn = "web.form.FormDataEvent",
    ),
    BrowserType(
        jsName = "FormDataEventInit",
        kotlinFqn = "web.form.FormDataEventInit",
    ),
    BrowserType(
        jsName = "FormDisabledCallback",
        kotlinFqn = "web.form.FormDisabledCallback",
    ),
    BrowserType(
        jsName = "FormEncType",
        kotlinFqn = "web.form.FormEncType",
    ),
    BrowserType(
        jsName = "FormMethod",
        kotlinFqn = "web.form.FormMethod",
    ),
    BrowserType(
        jsName = "FormResetCallback",
        kotlinFqn = "web.form.FormResetCallback",
    ),
    BrowserType(
        jsName = "FormStateRestoreCallback",
        kotlinFqn = "web.form.FormStateRestoreCallback",
    ),
    BrowserType(
        jsName = "FormStateRestoreMode",
        kotlinFqn = "web.form.FormStateRestoreMode",
    ),
    BrowserType(
        jsName = "FragmentDirective",
        kotlinFqn = "web.url.FragmentDirective",
    ),
    BrowserType(
        jsName = "FrameRequestCallback",
        kotlinFqn = "web.animations.FrameRequestCallback",
    ),
    BrowserType(
        jsName = "FrameRequestId",
        kotlinFqn = "web.animations.FrameRequestId",
    ),
    BrowserType(
        jsName = "FrameType",
        kotlinFqn = "web.serviceworker.FrameType",
    ),
    BrowserType(
        jsName = "FromBase64Options",
        kotlinFqn = "js.typedarrays.FromBase64Options",
    ),
    BrowserType(
        jsName = "FullscreenKeyboardLock",
        kotlinFqn = "web.fullscreen.FullscreenKeyboardLock",
    ),
    BrowserType(
        jsName = "FullscreenNavigationUI",
        kotlinFqn = "web.fullscreen.FullscreenNavigationUI",
    ),
    BrowserType(
        jsName = "FullscreenOptions",
        kotlinFqn = "web.fullscreen.FullscreenOptions",
    ),
    BrowserType(
        jsName = "FunctionStringCallback",
        kotlinFqn = "web.data.FunctionStringCallback",
    ),
    BrowserType(
        jsName = "GLbitfield",
        kotlinFqn = "web.gl.GLbitfield",
    ),
    BrowserType(
        jsName = "GLboolean",
        kotlinFqn = "web.gl.GLboolean",
    ),
    BrowserType(
        jsName = "GLclampf",
        kotlinFqn = "web.gl.GLclampf",
    ),
    BrowserType(
        jsName = "GLenum",
        kotlinFqn = "web.gl.GLenum",
    ),
    BrowserType(
        jsName = "GLfloat",
        kotlinFqn = "web.gl.GLfloat",
    ),
    BrowserType(
        jsName = "GLint",
        kotlinFqn = "web.gl.GLint",
    ),
    BrowserType(
        jsName = "GLint64",
        kotlinFqn = "web.gl.GLint64",
    ),
    BrowserType(
        jsName = "GLintptr",
        kotlinFqn = "web.gl.GLintptr",
    ),
    BrowserType(
        jsName = "GLsizei",
        kotlinFqn = "web.gl.GLsizei",
    ),
    BrowserType(
        jsName = "GLsizeiptr",
        kotlinFqn = "web.gl.GLsizeiptr",
    ),
    BrowserType(
        jsName = "GLuint",
        kotlinFqn = "web.gl.GLuint",
    ),
    BrowserType(
        jsName = "GLuint64",
        kotlinFqn = "web.gl.GLuint64",
    ),
    BrowserType(
        jsName = "GPU",
        kotlinFqn = "web.gpu.GPU",
    ),
    BrowserType(
        jsName = "GPUAdapter",
        kotlinFqn = "web.gpu.GPUAdapter",
    ),
    BrowserType(
        jsName = "GPUAdapterInfo",
        kotlinFqn = "web.gpu.GPUAdapterInfo",
    ),
    BrowserType(
        jsName = "GPUAddressMode",
        kotlinFqn = "web.gpu.GPUAddressMode",
    ),
    BrowserType(
        jsName = "GPUAutoLayoutMode",
        kotlinFqn = "web.gpu.GPUAutoLayoutMode",
    ),
    BrowserType(
        jsName = "GPUBindGroup",
        kotlinFqn = "web.gpu.GPUBindGroup",
    ),
    BrowserType(
        jsName = "GPUBindGroupDescriptor",
        kotlinFqn = "web.gpu.GPUBindGroupDescriptor",
    ),
    BrowserType(
        jsName = "GPUBindGroupEntry",
        kotlinFqn = "web.gpu.GPUBindGroupEntry",
    ),
    BrowserType(
        jsName = "GPUBindGroupLayout",
        kotlinFqn = "web.gpu.GPUBindGroupLayout",
    ),
    BrowserType(
        jsName = "GPUBindGroupLayoutDescriptor",
        kotlinFqn = "web.gpu.GPUBindGroupLayoutDescriptor",
    ),
    BrowserType(
        jsName = "GPUBindGroupLayoutEntry",
        kotlinFqn = "web.gpu.GPUBindGroupLayoutEntry",
    ),
    BrowserType(
        jsName = "GPUBindingCommandsMixin",
        kotlinFqn = "web.gpu.GPUBindingCommandsMixin",
    ),
    BrowserType(
        jsName = "GPUBindingResource",
        kotlinFqn = "web.gpu.GPUBindingResource",
    ),
    BrowserType(
        jsName = "GPUBlendComponent",
        kotlinFqn = "web.gpu.GPUBlendComponent",
    ),
    BrowserType(
        jsName = "GPUBlendFactor",
        kotlinFqn = "web.gpu.GPUBlendFactor",
    ),
    BrowserType(
        jsName = "GPUBlendOperation",
        kotlinFqn = "web.gpu.GPUBlendOperation",
    ),
    BrowserType(
        jsName = "GPUBlendState",
        kotlinFqn = "web.gpu.GPUBlendState",
    ),
    BrowserType(
        jsName = "GPUBuffer",
        kotlinFqn = "web.gpu.GPUBuffer",
    ),
    BrowserType(
        jsName = "GPUBufferBinding",
        kotlinFqn = "web.gpu.GPUBufferBinding",
    ),
    BrowserType(
        jsName = "GPUBufferBindingLayout",
        kotlinFqn = "web.gpu.GPUBufferBindingLayout",
    ),
    BrowserType(
        jsName = "GPUBufferBindingType",
        kotlinFqn = "web.gpu.GPUBufferBindingType",
    ),
    BrowserType(
        jsName = "GPUBufferDescriptor",
        kotlinFqn = "web.gpu.GPUBufferDescriptor",
    ),
    BrowserType(
        jsName = "GPUBufferDynamicOffset",
        kotlinFqn = "web.gpu.GPUBufferDynamicOffset",
    ),
    BrowserType(
        jsName = "GPUBufferMapState",
        kotlinFqn = "web.gpu.GPUBufferMapState",
    ),
    BrowserType(
        jsName = "GPUBufferUsage",
        kotlinFqn = "web.gpu.GPUBufferUsage",
    ),
    BrowserType(
        jsName = "GPUCanvasAlphaMode",
        kotlinFqn = "web.gpu.GPUCanvasAlphaMode",
    ),
    BrowserType(
        jsName = "GPUCanvasConfiguration",
        kotlinFqn = "web.gpu.GPUCanvasConfiguration",
    ),
    BrowserType(
        jsName = "GPUCanvasContext",
        kotlinFqn = "web.gpu.GPUCanvasContext",
    ),
    BrowserType(
        jsName = "GPUCanvasToneMapping",
        kotlinFqn = "web.gpu.GPUCanvasToneMapping",
    ),
    BrowserType(
        jsName = "GPUCanvasToneMappingMode",
        kotlinFqn = "web.gpu.GPUCanvasToneMappingMode",
    ),
    BrowserType(
        jsName = "GPUColor",
        kotlinFqn = "web.gpu.GPUColor",
    ),
    BrowserType(
        jsName = "GPUColorDict",
        kotlinFqn = "web.gpu.GPUColorDict",
    ),
    BrowserType(
        jsName = "GPUColorTargetState",
        kotlinFqn = "web.gpu.GPUColorTargetState",
    ),
    BrowserType(
        jsName = "GPUColorWrite",
        kotlinFqn = "web.gpu.GPUColorWrite",
    ),
    BrowserType(
        jsName = "GPUCommandBuffer",
        kotlinFqn = "web.gpu.GPUCommandBuffer",
    ),
    BrowserType(
        jsName = "GPUCommandBufferDescriptor",
        kotlinFqn = "web.gpu.GPUCommandBufferDescriptor",
    ),
    BrowserType(
        jsName = "GPUCommandEncoder",
        kotlinFqn = "web.gpu.GPUCommandEncoder",
    ),
    BrowserType(
        jsName = "GPUCommandEncoderDescriptor",
        kotlinFqn = "web.gpu.GPUCommandEncoderDescriptor",
    ),
    BrowserType(
        jsName = "GPUCompareFunction",
        kotlinFqn = "web.gpu.GPUCompareFunction",
    ),
    BrowserType(
        jsName = "GPUCompilationInfo",
        kotlinFqn = "web.gpu.GPUCompilationInfo",
    ),
    BrowserType(
        jsName = "GPUCompilationMessage",
        kotlinFqn = "web.gpu.GPUCompilationMessage",
    ),
    BrowserType(
        jsName = "GPUCompilationMessageType",
        kotlinFqn = "web.gpu.GPUCompilationMessageType",
    ),
    BrowserType(
        jsName = "GPUComputePassDescriptor",
        kotlinFqn = "web.gpu.GPUComputePassDescriptor",
    ),
    BrowserType(
        jsName = "GPUComputePassEncoder",
        kotlinFqn = "web.gpu.GPUComputePassEncoder",
    ),
    BrowserType(
        jsName = "GPUComputePassTimestampWrites",
        kotlinFqn = "web.gpu.GPUComputePassTimestampWrites",
    ),
    BrowserType(
        jsName = "GPUComputePipeline",
        kotlinFqn = "web.gpu.GPUComputePipeline",
    ),
    BrowserType(
        jsName = "GPUComputePipelineDescriptor",
        kotlinFqn = "web.gpu.GPUComputePipelineDescriptor",
    ),
    BrowserType(
        jsName = "GPUCopyExternalImageDestInfo",
        kotlinFqn = "web.gpu.GPUCopyExternalImageDestInfo",
    ),
    BrowserType(
        jsName = "GPUCopyExternalImageSource",
        kotlinFqn = "web.gpu.GPUCopyExternalImageSource",
    ),
    BrowserType(
        jsName = "GPUCopyExternalImageSourceInfo",
        kotlinFqn = "web.gpu.GPUCopyExternalImageSourceInfo",
    ),
    BrowserType(
        jsName = "GPUCullMode",
        kotlinFqn = "web.gpu.GPUCullMode",
    ),
    BrowserType(
        jsName = "GPUDebugCommandsMixin",
        kotlinFqn = "web.gpu.GPUDebugCommandsMixin",
    ),
    BrowserType(
        jsName = "GPUDepthBias",
        kotlinFqn = "web.gpu.GPUDepthBias",
    ),
    BrowserType(
        jsName = "GPUDepthStencilState",
        kotlinFqn = "web.gpu.GPUDepthStencilState",
    ),
    BrowserType(
        jsName = "GPUDevice",
        kotlinFqn = "web.gpu.GPUDevice",
    ),
    BrowserType(
        jsName = "GPUDeviceDescriptor",
        kotlinFqn = "web.gpu.GPUDeviceDescriptor",
    ),
    BrowserType(
        jsName = "GPUDeviceLostInfo",
        kotlinFqn = "web.gpu.GPUDeviceLostInfo",
    ),
    BrowserType(
        jsName = "GPUDeviceLostReason",
        kotlinFqn = "web.gpu.GPUDeviceLostReason",
    ),
    BrowserType(
        jsName = "GPUError",
        kotlinFqn = "web.gpu.GPUError",
    ),
    BrowserType(
        jsName = "GPUErrorFilter",
        kotlinFqn = "web.gpu.GPUErrorFilter",
    ),
    BrowserType(
        jsName = "GPUExtent3D",
        kotlinFqn = "web.gpu.GPUExtent3D",
    ),
    BrowserType(
        jsName = "GPUExtent3DDict",
        kotlinFqn = "web.gpu.GPUExtent3DDict",
    ),
    BrowserType(
        jsName = "GPUExternalTexture",
        kotlinFqn = "web.gpu.GPUExternalTexture",
    ),
    BrowserType(
        jsName = "GPUExternalTextureBindingLayout",
        kotlinFqn = "web.gpu.GPUExternalTextureBindingLayout",
    ),
    BrowserType(
        jsName = "GPUExternalTextureDescriptor",
        kotlinFqn = "web.gpu.GPUExternalTextureDescriptor",
    ),
    BrowserType(
        jsName = "GPUFeatureName",
        kotlinFqn = "web.gpu.GPUFeatureName",
    ),
    BrowserType(
        jsName = "GPUFilterMode",
        kotlinFqn = "web.gpu.GPUFilterMode",
    ),
    BrowserType(
        jsName = "GPUFragmentState",
        kotlinFqn = "web.gpu.GPUFragmentState",
    ),
    BrowserType(
        jsName = "GPUFrontFace",
        kotlinFqn = "web.gpu.GPUFrontFace",
    ),
    BrowserType(
        jsName = "GPUIndex32",
        kotlinFqn = "web.gpu.GPUIndex32",
    ),
    BrowserType(
        jsName = "GPUIndexFormat",
        kotlinFqn = "web.gpu.GPUIndexFormat",
    ),
    BrowserType(
        jsName = "GPUIntegerCoordinate",
        kotlinFqn = "web.gpu.GPUIntegerCoordinate",
    ),
    BrowserType(
        jsName = "GPUIntegerCoordinateOut",
        kotlinFqn = "web.gpu.GPUIntegerCoordinateOut",
    ),
    BrowserType(
        jsName = "GPUInternalError",
        kotlinFqn = "web.gpu.GPUInternalError",
    ),
    BrowserType(
        jsName = "GPULoadOp",
        kotlinFqn = "web.gpu.GPULoadOp",
    ),
    BrowserType(
        jsName = "GPUMapMode",
        kotlinFqn = "web.gpu.GPUMapMode",
    ),
    BrowserType(
        jsName = "GPUMipmapFilterMode",
        kotlinFqn = "web.gpu.GPUMipmapFilterMode",
    ),
    BrowserType(
        jsName = "GPUMultisampleState",
        kotlinFqn = "web.gpu.GPUMultisampleState",
    ),
    BrowserType(
        jsName = "GPUObjectBase",
        kotlinFqn = "web.gpu.GPUObjectBase",
    ),
    BrowserType(
        jsName = "GPUObjectDescriptorBase",
        kotlinFqn = "web.gpu.GPUObjectDescriptorBase",
    ),
    BrowserType(
        jsName = "GPUOrigin2D",
        kotlinFqn = "web.gpu.GPUOrigin2D",
    ),
    BrowserType(
        jsName = "GPUOrigin2DDict",
        kotlinFqn = "web.gpu.GPUOrigin2DDict",
    ),
    BrowserType(
        jsName = "GPUOrigin3D",
        kotlinFqn = "web.gpu.GPUOrigin3D",
    ),
    BrowserType(
        jsName = "GPUOrigin3DDict",
        kotlinFqn = "web.gpu.GPUOrigin3DDict",
    ),
    BrowserType(
        jsName = "GPUOutOfMemoryError",
        kotlinFqn = "web.gpu.GPUOutOfMemoryError",
    ),
    BrowserType(
        jsName = "GPUPipelineBase",
        kotlinFqn = "web.gpu.GPUPipelineBase",
    ),
    BrowserType(
        jsName = "GPUPipelineConstantValue",
        kotlinFqn = "web.gpu.GPUPipelineConstantValue",
    ),
    BrowserType(
        jsName = "GPUPipelineDescriptorBase",
        kotlinFqn = "web.gpu.GPUPipelineDescriptorBase",
    ),
    BrowserType(
        jsName = "GPUPipelineError",
        kotlinFqn = "web.gpu.GPUPipelineError",
    ),
    BrowserType(
        jsName = "GPUPipelineErrorInit",
        kotlinFqn = "web.gpu.GPUPipelineErrorInit",
    ),
    BrowserType(
        jsName = "GPUPipelineErrorReason",
        kotlinFqn = "web.gpu.GPUPipelineErrorReason",
    ),
    BrowserType(
        jsName = "GPUPipelineLayout",
        kotlinFqn = "web.gpu.GPUPipelineLayout",
    ),
    BrowserType(
        jsName = "GPUPipelineLayoutDescriptor",
        kotlinFqn = "web.gpu.GPUPipelineLayoutDescriptor",
    ),
    BrowserType(
        jsName = "GPUPowerPreference",
        kotlinFqn = "web.gpu.GPUPowerPreference",
    ),
    BrowserType(
        jsName = "GPUPrimitiveState",
        kotlinFqn = "web.gpu.GPUPrimitiveState",
    ),
    BrowserType(
        jsName = "GPUPrimitiveTopology",
        kotlinFqn = "web.gpu.GPUPrimitiveTopology",
    ),
    BrowserType(
        jsName = "GPUProgrammableStage",
        kotlinFqn = "web.gpu.GPUProgrammableStage",
    ),
    BrowserType(
        jsName = "GPUQuerySet",
        kotlinFqn = "web.gpu.GPUQuerySet",
    ),
    BrowserType(
        jsName = "GPUQuerySetDescriptor",
        kotlinFqn = "web.gpu.GPUQuerySetDescriptor",
    ),
    BrowserType(
        jsName = "GPUQueryType",
        kotlinFqn = "web.gpu.GPUQueryType",
    ),
    BrowserType(
        jsName = "GPUQueue",
        kotlinFqn = "web.gpu.GPUQueue",
    ),
    BrowserType(
        jsName = "GPUQueueDescriptor",
        kotlinFqn = "web.gpu.GPUQueueDescriptor",
    ),
    BrowserType(
        jsName = "GPURenderBundle",
        kotlinFqn = "web.gpu.GPURenderBundle",
    ),
    BrowserType(
        jsName = "GPURenderBundleDescriptor",
        kotlinFqn = "web.gpu.GPURenderBundleDescriptor",
    ),
    BrowserType(
        jsName = "GPURenderBundleEncoder",
        kotlinFqn = "web.gpu.GPURenderBundleEncoder",
    ),
    BrowserType(
        jsName = "GPURenderBundleEncoderDescriptor",
        kotlinFqn = "web.gpu.GPURenderBundleEncoderDescriptor",
    ),
    BrowserType(
        jsName = "GPURenderCommandsMixin",
        kotlinFqn = "web.gpu.GPURenderCommandsMixin",
    ),
    BrowserType(
        jsName = "GPURenderPassColorAttachment",
        kotlinFqn = "web.gpu.GPURenderPassColorAttachment",
    ),
    BrowserType(
        jsName = "GPURenderPassDepthStencilAttachment",
        kotlinFqn = "web.gpu.GPURenderPassDepthStencilAttachment",
    ),
    BrowserType(
        jsName = "GPURenderPassDescriptor",
        kotlinFqn = "web.gpu.GPURenderPassDescriptor",
    ),
    BrowserType(
        jsName = "GPURenderPassEncoder",
        kotlinFqn = "web.gpu.GPURenderPassEncoder",
    ),
    BrowserType(
        jsName = "GPURenderPassLayout",
        kotlinFqn = "web.gpu.GPURenderPassLayout",
    ),
    BrowserType(
        jsName = "GPURenderPassTimestampWrites",
        kotlinFqn = "web.gpu.GPURenderPassTimestampWrites",
    ),
    BrowserType(
        jsName = "GPURenderPipeline",
        kotlinFqn = "web.gpu.GPURenderPipeline",
    ),
    BrowserType(
        jsName = "GPURenderPipelineDescriptor",
        kotlinFqn = "web.gpu.GPURenderPipelineDescriptor",
    ),
    BrowserType(
        jsName = "GPURequestAdapterOptions",
        kotlinFqn = "web.gpu.GPURequestAdapterOptions",
    ),
    BrowserType(
        jsName = "GPUSampleMask",
        kotlinFqn = "web.gpu.GPUSampleMask",
    ),
    BrowserType(
        jsName = "GPUSampler",
        kotlinFqn = "web.gpu.GPUSampler",
    ),
    BrowserType(
        jsName = "GPUSamplerBindingLayout",
        kotlinFqn = "web.gpu.GPUSamplerBindingLayout",
    ),
    BrowserType(
        jsName = "GPUSamplerBindingType",
        kotlinFqn = "web.gpu.GPUSamplerBindingType",
    ),
    BrowserType(
        jsName = "GPUSamplerDescriptor",
        kotlinFqn = "web.gpu.GPUSamplerDescriptor",
    ),
    BrowserType(
        jsName = "GPUShaderModule",
        kotlinFqn = "web.gpu.GPUShaderModule",
    ),
    BrowserType(
        jsName = "GPUShaderModuleDescriptor",
        kotlinFqn = "web.gpu.GPUShaderModuleDescriptor",
    ),
    BrowserType(
        jsName = "GPUShaderStage",
        kotlinFqn = "web.gpu.GPUShaderStage",
    ),
    BrowserType(
        jsName = "GPUSignedOffset32",
        kotlinFqn = "web.gpu.GPUSignedOffset32",
    ),
    BrowserType(
        jsName = "GPUSize32",
        kotlinFqn = "web.gpu.GPUSize32",
    ),
    BrowserType(
        jsName = "GPUSize32Out",
        kotlinFqn = "web.gpu.GPUSize32Out",
    ),
    BrowserType(
        jsName = "GPUSize64",
        kotlinFqn = "web.gpu.GPUSize64",
    ),
    BrowserType(
        jsName = "GPUSize64Out",
        kotlinFqn = "web.gpu.GPUSize64Out",
    ),
    BrowserType(
        jsName = "GPUStencilFaceState",
        kotlinFqn = "web.gpu.GPUStencilFaceState",
    ),
    BrowserType(
        jsName = "GPUStencilOperation",
        kotlinFqn = "web.gpu.GPUStencilOperation",
    ),
    BrowserType(
        jsName = "GPUStencilValue",
        kotlinFqn = "web.gpu.GPUStencilValue",
    ),
    BrowserType(
        jsName = "GPUStorageTextureAccess",
        kotlinFqn = "web.gpu.GPUStorageTextureAccess",
    ),
    BrowserType(
        jsName = "GPUStorageTextureBindingLayout",
        kotlinFqn = "web.gpu.GPUStorageTextureBindingLayout",
    ),
    BrowserType(
        jsName = "GPUStoreOp",
        kotlinFqn = "web.gpu.GPUStoreOp",
    ),
    BrowserType(
        jsName = "GPUSupportedFeatures",
        kotlinFqn = "web.gpu.GPUSupportedFeatures",
    ),
    BrowserType(
        jsName = "GPUSupportedLimits",
        kotlinFqn = "web.gpu.GPUSupportedLimits",
    ),
    BrowserType(
        jsName = "GPUTexelCopyBufferInfo",
        kotlinFqn = "web.gpu.GPUTexelCopyBufferInfo",
    ),
    BrowserType(
        jsName = "GPUTexelCopyBufferLayout",
        kotlinFqn = "web.gpu.GPUTexelCopyBufferLayout",
    ),
    BrowserType(
        jsName = "GPUTexelCopyTextureInfo",
        kotlinFqn = "web.gpu.GPUTexelCopyTextureInfo",
    ),
    BrowserType(
        jsName = "GPUTexture",
        kotlinFqn = "web.gpu.GPUTexture",
    ),
    BrowserType(
        jsName = "GPUTextureAspect",
        kotlinFqn = "web.gpu.GPUTextureAspect",
    ),
    BrowserType(
        jsName = "GPUTextureBindingLayout",
        kotlinFqn = "web.gpu.GPUTextureBindingLayout",
    ),
    BrowserType(
        jsName = "GPUTextureDescriptor",
        kotlinFqn = "web.gpu.GPUTextureDescriptor",
    ),
    BrowserType(
        jsName = "GPUTextureDimension",
        kotlinFqn = "web.gpu.GPUTextureDimension",
    ),
    BrowserType(
        jsName = "GPUTextureFormat",
        kotlinFqn = "web.gpu.GPUTextureFormat",
    ),
    BrowserType(
        jsName = "GPUTextureSampleType",
        kotlinFqn = "web.gpu.GPUTextureSampleType",
    ),
    BrowserType(
        jsName = "GPUTextureUsage",
        kotlinFqn = "web.gpu.GPUTextureUsage",
    ),
    BrowserType(
        jsName = "GPUTextureView",
        kotlinFqn = "web.gpu.GPUTextureView",
    ),
    BrowserType(
        jsName = "GPUTextureViewDescriptor",
        kotlinFqn = "web.gpu.GPUTextureViewDescriptor",
    ),
    BrowserType(
        jsName = "GPUTextureViewDimension",
        kotlinFqn = "web.gpu.GPUTextureViewDimension",
    ),
    BrowserType(
        jsName = "GPUUncapturedErrorEvent",
        kotlinFqn = "web.gpu.GPUUncapturedErrorEvent",
    ),
    BrowserType(
        jsName = "GPUUncapturedErrorEventInit",
        kotlinFqn = "web.gpu.GPUUncapturedErrorEventInit",
    ),
    BrowserType(
        jsName = "GPUValidationError",
        kotlinFqn = "web.gpu.GPUValidationError",
    ),
    BrowserType(
        jsName = "GPUVertexAttribute",
        kotlinFqn = "web.gpu.GPUVertexAttribute",
    ),
    BrowserType(
        jsName = "GPUVertexBufferLayout",
        kotlinFqn = "web.gpu.GPUVertexBufferLayout",
    ),
    BrowserType(
        jsName = "GPUVertexFormat",
        kotlinFqn = "web.gpu.GPUVertexFormat",
    ),
    BrowserType(
        jsName = "GPUVertexState",
        kotlinFqn = "web.gpu.GPUVertexState",
    ),
    BrowserType(
        jsName = "GPUVertexStepMode",
        kotlinFqn = "web.gpu.GPUVertexStepMode",
    ),
    BrowserType(
        jsName = "GainNode",
        kotlinFqn = "web.audio.GainNode",
    ),
    BrowserType(
        jsName = "GainOptions",
        kotlinFqn = "web.audio.GainOptions",
    ),
    BrowserType(
        jsName = "Gamepad",
        kotlinFqn = "web.gamepad.Gamepad",
    ),
    BrowserType(
        jsName = "GamepadButton",
        kotlinFqn = "web.gamepad.GamepadButton",
    ),
    BrowserType(
        jsName = "GamepadEffectParameters",
        kotlinFqn = "web.gamepad.GamepadEffectParameters",
    ),
    BrowserType(
        jsName = "GamepadEvent",
        kotlinFqn = "web.gamepad.GamepadEvent",
    ),
    BrowserType(
        jsName = "GamepadEventInit",
        kotlinFqn = "web.gamepad.GamepadEventInit",
    ),
    BrowserType(
        jsName = "GamepadHapticActuator",
        kotlinFqn = "web.gamepad.GamepadHapticActuator",
    ),
    BrowserType(
        jsName = "GamepadHapticEffectType",
        kotlinFqn = "web.gamepad.GamepadHapticEffectType",
    ),
    BrowserType(
        jsName = "GamepadHapticsResult",
        kotlinFqn = "web.gamepad.GamepadHapticsResult",
    ),
    BrowserType(
        jsName = "GamepadMappingType",
        kotlinFqn = "web.gamepad.GamepadMappingType",
    ),
    BrowserType(
        jsName = "Generator",
        kotlinFqn = "js.generator.Generator",
    ),
    BrowserType(
        jsName = "GeneratorFunction",
        kotlinFqn = "js.generator.GeneratorFunction",
    ),
    BrowserType(
        jsName = "GenericTransformStream",
        kotlinFqn = "web.streams.GenericTransformStream",
    ),
    BrowserType(
        jsName = "Geolocation",
        kotlinFqn = "web.geolocation.Geolocation",
    ),
    BrowserType(
        jsName = "GeolocationCoordinates",
        kotlinFqn = "web.geolocation.GeolocationCoordinates",
    ),
    BrowserType(
        jsName = "GeolocationPosition",
        kotlinFqn = "web.geolocation.GeolocationPosition",
    ),
    BrowserType(
        jsName = "GeolocationPositionError",
        kotlinFqn = "web.geolocation.GeolocationPositionError",
    ),
    BrowserType(
        jsName = "GeolocationWatchId",
        kotlinFqn = "web.geolocation.GeolocationWatchId",
    ),
    BrowserType(
        jsName = "GetAnimationsOptions",
        kotlinFqn = "web.animations.GetAnimationsOptions",
    ),
    BrowserType(
        jsName = "GetComposedRangesOptions",
        kotlinFqn = "web.selection.GetComposedRangesOptions",
    ),
    BrowserType(
        jsName = "GetHTMLOptions",
        kotlinFqn = "web.dom.GetHTMLOptions",
    ),
    BrowserType(
        jsName = "GetNotificationOptions",
        kotlinFqn = "web.serviceworker.GetNotificationOptions",
    ),
    BrowserType(
        jsName = "GetRootNodeOptions",
        kotlinFqn = "web.dom.GetRootNodeOptions",
    ),
    BrowserType(
        jsName = "GlobalCompositeOperation",
        kotlinFqn = "web.canvas.GlobalCompositeOperation",
    ),
    BrowserType(
        jsName = "GlobalEventHandlers",
        kotlinFqn = "web.globals.GlobalEventHandlers",
    ),
    BrowserType(
        jsName = "GlobalScope",
        kotlinFqn = "js.globals.GlobalScope",
    ),
    BrowserType(
        jsName = "HTMLAnchorElement",
        kotlinFqn = "web.html.HTMLAnchorElement",
    ),
    BrowserType(
        jsName = "HTMLAreaElement",
        kotlinFqn = "web.html.HTMLAreaElement",
    ),
    BrowserType(
        jsName = "HTMLAudioElement",
        kotlinFqn = "web.html.HTMLAudioElement",
    ),
    BrowserType(
        jsName = "HTMLBRElement",
        kotlinFqn = "web.html.HTMLBRElement",
    ),
    BrowserType(
        jsName = "HTMLBaseElement",
        kotlinFqn = "web.html.HTMLBaseElement",
    ),
    BrowserType(
        jsName = "HTMLBodyElement",
        kotlinFqn = "web.html.HTMLBodyElement",
    ),
    BrowserType(
        jsName = "HTMLButtonElement",
        kotlinFqn = "web.html.HTMLButtonElement",
    ),
    BrowserType(
        jsName = "HTMLCameraElement",
        kotlinFqn = "web.html.HTMLCameraElement",
    ),
    BrowserType(
        jsName = "HTMLCanvasElement",
        kotlinFqn = "web.html.HTMLCanvasElement",
    ),
    BrowserType(
        jsName = "HTMLCollection",
        kotlinFqn = "web.html.HTMLCollection",
    ),
    BrowserType(
        jsName = "HTMLCollectionBase",
        kotlinFqn = "web.html.HTMLCollectionBase",
    ),
    BrowserType(
        jsName = "HTMLDListElement",
        kotlinFqn = "web.html.HTMLDListElement",
    ),
    BrowserType(
        jsName = "HTMLDataElement",
        kotlinFqn = "web.html.HTMLDataElement",
    ),
    BrowserType(
        jsName = "HTMLDataListElement",
        kotlinFqn = "web.html.HTMLDataListElement",
    ),
    BrowserType(
        jsName = "HTMLDetailsElement",
        kotlinFqn = "web.html.HTMLDetailsElement",
    ),
    BrowserType(
        jsName = "HTMLDialogElement",
        kotlinFqn = "web.html.HTMLDialogElement",
    ),
    BrowserType(
        jsName = "HTMLDivElement",
        kotlinFqn = "web.html.HTMLDivElement",
    ),
    BrowserType(
        jsName = "HTMLDocument",
        kotlinFqn = "web.html.HTMLDocument",
    ),
    BrowserType(
        jsName = "HTMLElement",
        kotlinFqn = "web.html.HTMLElement",
    ),
    BrowserType(
        jsName = "HTMLEmbedElement",
        kotlinFqn = "web.html.HTMLEmbedElement",
    ),
    BrowserType(
        jsName = "HTMLFieldSetElement",
        kotlinFqn = "web.html.HTMLFieldSetElement",
    ),
    BrowserType(
        jsName = "HTMLFormControlsCollection",
        kotlinFqn = "web.html.HTMLFormControlsCollection",
    ),
    BrowserType(
        jsName = "HTMLFormElement",
        kotlinFqn = "web.html.HTMLFormElement",
    ),
    BrowserType(
        jsName = "HTMLGeolocationElement",
        kotlinFqn = "web.html.HTMLGeolocationElement",
    ),
    BrowserType(
        jsName = "HTMLHRElement",
        kotlinFqn = "web.html.HTMLHRElement",
    ),
    BrowserType(
        jsName = "HTMLHeadElement",
        kotlinFqn = "web.html.HTMLHeadElement",
    ),
    BrowserType(
        jsName = "HTMLHeadingElement",
        kotlinFqn = "web.html.HTMLHeadingElement",
    ),
    BrowserType(
        jsName = "HTMLHtmlElement",
        kotlinFqn = "web.html.HTMLHtmlElement",
    ),
    BrowserType(
        jsName = "HTMLHyperlinkElementUtils",
        kotlinFqn = "web.html.HTMLHyperlinkElementUtils",
    ),
    BrowserType(
        jsName = "HTMLIFrameElement",
        kotlinFqn = "web.html.HTMLIFrameElement",
    ),
    BrowserType(
        jsName = "HTMLImageElement",
        kotlinFqn = "web.html.HTMLImageElement",
    ),
    BrowserType(
        jsName = "HTMLInputElement",
        kotlinFqn = "web.html.HTMLInputElement",
    ),
    BrowserType(
        jsName = "HTMLLIElement",
        kotlinFqn = "web.html.HTMLLIElement",
    ),
    BrowserType(
        jsName = "HTMLLabelElement",
        kotlinFqn = "web.html.HTMLLabelElement",
    ),
    BrowserType(
        jsName = "HTMLLegendElement",
        kotlinFqn = "web.html.HTMLLegendElement",
    ),
    BrowserType(
        jsName = "HTMLLinkElement",
        kotlinFqn = "web.html.HTMLLinkElement",
    ),
    BrowserType(
        jsName = "HTMLMapElement",
        kotlinFqn = "web.html.HTMLMapElement",
    ),
    BrowserType(
        jsName = "HTMLMediaElement",
        kotlinFqn = "web.html.HTMLMediaElement",
    ),
    BrowserType(
        jsName = "HTMLMenuElement",
        kotlinFqn = "web.html.HTMLMenuElement",
    ),
    BrowserType(
        jsName = "HTMLMetaElement",
        kotlinFqn = "web.html.HTMLMetaElement",
    ),
    BrowserType(
        jsName = "HTMLMeterElement",
        kotlinFqn = "web.html.HTMLMeterElement",
    ),
    BrowserType(
        jsName = "HTMLMicrophoneElement",
        kotlinFqn = "web.html.HTMLMicrophoneElement",
    ),
    BrowserType(
        jsName = "HTMLModElement",
        kotlinFqn = "web.html.HTMLModElement",
    ),
    BrowserType(
        jsName = "HTMLOListElement",
        kotlinFqn = "web.html.HTMLOListElement",
    ),
    BrowserType(
        jsName = "HTMLObjectElement",
        kotlinFqn = "web.html.HTMLObjectElement",
    ),
    BrowserType(
        jsName = "HTMLOptGroupElement",
        kotlinFqn = "web.html.HTMLOptGroupElement",
    ),
    BrowserType(
        jsName = "HTMLOptionElement",
        kotlinFqn = "web.html.HTMLOptionElement",
    ),
    BrowserType(
        jsName = "HTMLOptionsCollection",
        kotlinFqn = "web.html.HTMLOptionsCollection",
    ),
    BrowserType(
        jsName = "HTMLOrSVGImageElement",
        kotlinFqn = "web.dom.HTMLOrSVGImageElement",
    ),
    BrowserType(
        jsName = "HTMLOrSVGOrMathMLElement",
        kotlinFqn = "web.dom.HTMLOrSVGOrMathMLElement",
    ),
    BrowserType(
        jsName = "HTMLOrSVGScriptElement",
        kotlinFqn = "web.dom.HTMLOrSVGScriptElement",
    ),
    BrowserType(
        jsName = "HTMLOutputElement",
        kotlinFqn = "web.html.HTMLOutputElement",
    ),
    BrowserType(
        jsName = "HTMLParagraphElement",
        kotlinFqn = "web.html.HTMLParagraphElement",
    ),
    BrowserType(
        jsName = "HTMLPermissionElement",
        kotlinFqn = "web.html.HTMLPermissionElement",
    ),
    BrowserType(
        jsName = "HTMLPictureElement",
        kotlinFqn = "web.html.HTMLPictureElement",
    ),
    BrowserType(
        jsName = "HTMLPreElement",
        kotlinFqn = "web.html.HTMLPreElement",
    ),
    BrowserType(
        jsName = "HTMLProgressElement",
        kotlinFqn = "web.html.HTMLProgressElement",
    ),
    BrowserType(
        jsName = "HTMLQuoteElement",
        kotlinFqn = "web.html.HTMLQuoteElement",
    ),
    BrowserType(
        jsName = "HTMLScriptElement",
        kotlinFqn = "web.html.HTMLScriptElement",
    ),
    BrowserType(
        jsName = "HTMLSelectElement",
        kotlinFqn = "web.html.HTMLSelectElement",
    ),
    BrowserType(
        jsName = "HTMLSlotElement",
        kotlinFqn = "web.components.HTMLSlotElement",
    ),
    BrowserType(
        jsName = "HTMLSourceElement",
        kotlinFqn = "web.html.HTMLSourceElement",
    ),
    BrowserType(
        jsName = "HTMLSpanElement",
        kotlinFqn = "web.html.HTMLSpanElement",
    ),
    BrowserType(
        jsName = "HTMLStyleElement",
        kotlinFqn = "web.html.HTMLStyleElement",
    ),
    BrowserType(
        jsName = "HTMLTableCaptionElement",
        kotlinFqn = "web.html.HTMLTableCaptionElement",
    ),
    BrowserType(
        jsName = "HTMLTableCellElement",
        kotlinFqn = "web.html.HTMLTableCellElement",
    ),
    BrowserType(
        jsName = "HTMLTableColElement",
        kotlinFqn = "web.html.HTMLTableColElement",
    ),
    BrowserType(
        jsName = "HTMLTableElement",
        kotlinFqn = "web.html.HTMLTableElement",
    ),
    BrowserType(
        jsName = "HTMLTableRowElement",
        kotlinFqn = "web.html.HTMLTableRowElement",
    ),
    BrowserType(
        jsName = "HTMLTableSectionElement",
        kotlinFqn = "web.html.HTMLTableSectionElement",
    ),
    BrowserType(
        jsName = "HTMLTemplateElement",
        kotlinFqn = "web.components.HTMLTemplateElement",
    ),
    BrowserType(
        jsName = "HTMLTextAreaElement",
        kotlinFqn = "web.html.HTMLTextAreaElement",
    ),
    BrowserType(
        jsName = "HTMLTimeElement",
        kotlinFqn = "web.html.HTMLTimeElement",
    ),
    BrowserType(
        jsName = "HTMLTitleElement",
        kotlinFqn = "web.html.HTMLTitleElement",
    ),
    BrowserType(
        jsName = "HTMLTrackElement",
        kotlinFqn = "web.html.HTMLTrackElement",
    ),
    BrowserType(
        jsName = "HTMLUListElement",
        kotlinFqn = "web.html.HTMLUListElement",
    ),
    BrowserType(
        jsName = "HTMLUnknownElement",
        kotlinFqn = "web.html.HTMLUnknownElement",
    ),
    BrowserType(
        jsName = "HTMLUserMediaElement",
        kotlinFqn = "web.html.HTMLUserMediaElement",
    ),
    BrowserType(
        jsName = "HTMLVideoElement",
        kotlinFqn = "web.html.HTMLVideoElement",
    ),
    BrowserType(
        jsName = "HardwareAcceleration",
        kotlinFqn = "web.codecs.HardwareAcceleration",
    ),
    BrowserType(
        jsName = "HasInstance",
        kotlinFqn = "js.reflect.HasInstance",
    ),
    BrowserType(
        jsName = "HasTargets",
        kotlinFqn = "web.events.HasTargets",
    ),
    BrowserType(
        jsName = "HashAlgorithmIdentifier",
        kotlinFqn = "web.crypto.HashAlgorithmIdentifier",
    ),
    BrowserType(
        jsName = "HashChangeEvent",
        kotlinFqn = "web.history.HashChangeEvent",
    ),
    BrowserType(
        jsName = "HashChangeEventInit",
        kotlinFqn = "web.history.HashChangeEventInit",
    ),
    BrowserType(
        jsName = "HdrMetadataType",
        kotlinFqn = "web.mediacapabilities.HdrMetadataType",
    ),
    BrowserType(
        jsName = "Headers",
        kotlinFqn = "web.http.Headers",
    ),
    BrowserType(
        jsName = "HeadersInit",
        kotlinFqn = "web.http.HeadersInit",
    ),
    BrowserType(
        jsName = "Hidden",
        kotlinFqn = "web.html.Hidden",
    ),
    BrowserType(
        jsName = "Highlight",
        kotlinFqn = "web.highlight.Highlight",
    ),
    BrowserType(
        jsName = "HighlightHitResult",
        kotlinFqn = "web.highlight.HighlightHitResult",
    ),
    BrowserType(
        jsName = "HighlightRegistry",
        kotlinFqn = "web.highlight.HighlightRegistry",
    ),
    BrowserType(
        jsName = "HighlightType",
        kotlinFqn = "web.highlight.HighlightType",
    ),
    BrowserType(
        jsName = "HighlightsFromPointOptions",
        kotlinFqn = "web.highlight.HighlightsFromPointOptions",
    ),
    BrowserType(
        jsName = "History",
        kotlinFqn = "web.history.History",
    ),
    BrowserType(
        jsName = "HkdfParams",
        kotlinFqn = "web.crypto.HkdfParams",
    ),
    BrowserType(
        jsName = "HmacImportParams",
        kotlinFqn = "web.crypto.HmacImportParams",
    ),
    BrowserType(
        jsName = "HmacKeyAlgorithm",
        kotlinFqn = "web.crypto.HmacKeyAlgorithm",
    ),
    BrowserType(
        jsName = "HmacKeyGenParams",
        kotlinFqn = "web.crypto.HmacKeyGenParams",
    ),
    BrowserType(
        jsName = "HtmlSource",
        kotlinFqn = "web.html.HtmlSource",
    ),
    BrowserType(
        jsName = "HyperlinkElementUtils",
        kotlinFqn = "web.html.HyperlinkElementUtils",
    ),
    BrowserType(
        jsName = "IDBCursor",
        kotlinFqn = "web.idb.IDBCursor",
    ),
    BrowserType(
        jsName = "IDBCursorDirection",
        kotlinFqn = "web.idb.IDBCursorDirection",
    ),
    BrowserType(
        jsName = "IDBCursorWithValue",
        kotlinFqn = "web.idb.IDBCursorWithValue",
    ),
    BrowserType(
        jsName = "IDBDatabase",
        kotlinFqn = "web.idb.IDBDatabase",
    ),
    BrowserType(
        jsName = "IDBDatabaseInfo",
        kotlinFqn = "web.idb.IDBDatabaseInfo",
    ),
    BrowserType(
        jsName = "IDBFactory",
        kotlinFqn = "web.idb.IDBFactory",
    ),
    BrowserType(
        jsName = "IDBIndex",
        kotlinFqn = "web.idb.IDBIndex",
    ),
    BrowserType(
        jsName = "IDBIndexParameters",
        kotlinFqn = "web.idb.IDBIndexParameters",
    ),
    BrowserType(
        jsName = "IDBKeyRange",
        kotlinFqn = "web.idb.IDBKeyRange",
    ),
    BrowserType(
        jsName = "IDBObjectStore",
        kotlinFqn = "web.idb.IDBObjectStore",
    ),
    BrowserType(
        jsName = "IDBObjectStoreParameters",
        kotlinFqn = "web.idb.IDBObjectStoreParameters",
    ),
    BrowserType(
        jsName = "IDBOpenDBRequest",
        kotlinFqn = "web.idb.IDBOpenDBRequest",
    ),
    BrowserType(
        jsName = "IDBRequest",
        kotlinFqn = "web.idb.IDBRequest",
    ),
    BrowserType(
        jsName = "IDBRequestReadyState",
        kotlinFqn = "web.idb.IDBRequestReadyState",
    ),
    BrowserType(
        jsName = "IDBTransaction",
        kotlinFqn = "web.idb.IDBTransaction",
    ),
    BrowserType(
        jsName = "IDBTransactionDurability",
        kotlinFqn = "web.idb.IDBTransactionDurability",
    ),
    BrowserType(
        jsName = "IDBTransactionMode",
        kotlinFqn = "web.idb.IDBTransactionMode",
    ),
    BrowserType(
        jsName = "IDBTransactionOptions",
        kotlinFqn = "web.idb.IDBTransactionOptions",
    ),
    BrowserType(
        jsName = "IDBValidKey",
        kotlinFqn = "web.idb.IDBValidKey",
    ),
    BrowserType(
        jsName = "IDBVersionChangeEvent",
        kotlinFqn = "web.idb.IDBVersionChangeEvent",
    ),
    BrowserType(
        jsName = "IDBVersionChangeEventInit",
        kotlinFqn = "web.idb.IDBVersionChangeEventInit",
    ),
    BrowserType(
        jsName = "IIRFilterNode",
        kotlinFqn = "web.audio.IIRFilterNode",
    ),
    BrowserType(
        jsName = "IIRFilterOptions",
        kotlinFqn = "web.audio.IIRFilterOptions",
    ),
    BrowserType(
        jsName = "IdleDeadline",
        kotlinFqn = "web.scheduling.IdleDeadline",
    ),
    BrowserType(
        jsName = "IdleRequestCallback",
        kotlinFqn = "web.scheduling.IdleRequestCallback",
    ),
    BrowserType(
        jsName = "IdleRequestId",
        kotlinFqn = "web.scheduling.IdleRequestId",
    ),
    BrowserType(
        jsName = "IdleRequestOptions",
        kotlinFqn = "web.scheduling.IdleRequestOptions",
    ),
    BrowserType(
        jsName = "Image",
        kotlinFqn = "web.html.Image",
    ),
    BrowserType(
        jsName = "ImageBitmap",
        kotlinFqn = "web.images.ImageBitmap",
    ),
    BrowserType(
        jsName = "ImageBitmapOptions",
        kotlinFqn = "web.images.ImageBitmapOptions",
    ),
    BrowserType(
        jsName = "ImageBitmapRenderingContext",
        kotlinFqn = "web.images.ImageBitmapRenderingContext",
    ),
    BrowserType(
        jsName = "ImageBitmapRenderingContextSettings",
        kotlinFqn = "web.images.ImageBitmapRenderingContextSettings",
    ),
    BrowserType(
        jsName = "ImageBitmapSource",
        kotlinFqn = "web.images.ImageBitmapSource",
    ),
    BrowserType(
        jsName = "ImageBufferSource",
        kotlinFqn = "web.codecs.ImageBufferSource",
    ),
    BrowserType(
        jsName = "ImageCapture",
        kotlinFqn = "web.imagecapture.ImageCapture",
    ),
    BrowserType(
        jsName = "ImageContent",
        kotlinFqn = "web.mcp.ImageContent",
    ),
    BrowserType(
        jsName = "ImageData",
        kotlinFqn = "web.images.ImageData",
    ),
    BrowserType(
        jsName = "ImageDataArray",
        kotlinFqn = "web.images.ImageDataArray",
    ),
    BrowserType(
        jsName = "ImageDataPixelFormat",
        kotlinFqn = "web.images.ImageDataPixelFormat",
    ),
    BrowserType(
        jsName = "ImageDataSettings",
        kotlinFqn = "web.images.ImageDataSettings",
    ),
    BrowserType(
        jsName = "ImageDecodeOptions",
        kotlinFqn = "web.codecs.ImageDecodeOptions",
    ),
    BrowserType(
        jsName = "ImageDecodeResult",
        kotlinFqn = "web.codecs.ImageDecodeResult",
    ),
    BrowserType(
        jsName = "ImageDecoder",
        kotlinFqn = "web.codecs.ImageDecoder",
    ),
    BrowserType(
        jsName = "ImageDecoderInit",
        kotlinFqn = "web.codecs.ImageDecoderInit",
    ),
    BrowserType(
        jsName = "ImageDecoding",
        kotlinFqn = "web.html.ImageDecoding",
    ),
    BrowserType(
        jsName = "ImageEncodeOptions",
        kotlinFqn = "web.canvas.ImageEncodeOptions",
    ),
    BrowserType(
        jsName = "ImageOrientation",
        kotlinFqn = "web.images.ImageOrientation",
    ),
    BrowserType(
        jsName = "ImageSmoothingQuality",
        kotlinFqn = "web.canvas.ImageSmoothingQuality",
    ),
    BrowserType(
        jsName = "ImageTrack",
        kotlinFqn = "web.codecs.ImageTrack",
    ),
    BrowserType(
        jsName = "ImageTrackList",
        kotlinFqn = "web.codecs.ImageTrackList",
    ),
    BrowserType(
        jsName = "ImportAttributes",
        kotlinFqn = "js.import.ImportAttributes",
    ),
    BrowserType(
        jsName = "ImportCallOptions",
        kotlinFqn = "js.import.ImportCallOptions",
    ),
    BrowserType(
        jsName = "ImportMeta",
        kotlinFqn = "js.import.ImportMeta",
    ),
    BrowserType(
        jsName = "ImportNodeOptions",
        kotlinFqn = "web.dom.ImportNodeOptions",
    ),
    BrowserType(
        jsName = "InputDeviceInfo",
        kotlinFqn = "web.mediadevices.InputDeviceInfo",
    ),
    BrowserType(
        jsName = "InputEvent",
        kotlinFqn = "web.input.InputEvent",
    ),
    BrowserType(
        jsName = "InputEventInit",
        kotlinFqn = "web.input.InputEventInit",
    ),
    BrowserType(
        jsName = "InputMode",
        kotlinFqn = "web.html.InputMode",
    ),
    BrowserType(
        jsName = "InputSchema",
        kotlinFqn = "web.mcp.InputSchema",
    ),
    BrowserType(
        jsName = "InputSchemaProperty",
        kotlinFqn = "web.mcp.InputSchemaProperty",
    ),
    BrowserType(
        jsName = "InputType",
        kotlinFqn = "web.html.InputType",
    ),
    BrowserType(
        jsName = "InsertPosition",
        kotlinFqn = "web.dom.InsertPosition",
    ),
    BrowserType(
        jsName = "Int16Array",
        kotlinFqn = "js.typedarrays.Int16Array",
    ),
    BrowserType(
        jsName = "Int32Array",
        kotlinFqn = "js.typedarrays.Int32Array",
    ),
    BrowserType(
        jsName = "Int32List",
        kotlinFqn = "web.gl.Int32List",
    ),
    BrowserType(
        jsName = "Int53",
        kotlinFqn = "js.numbers.Int53",
    ),
    BrowserType(
        jsName = "Int8Array",
        kotlinFqn = "js.typedarrays.Int8Array",
    ),
    BrowserType(
        jsName = "IntersectionObserver",
        kotlinFqn = "web.intersection.IntersectionObserver",
    ),
    BrowserType(
        jsName = "IntersectionObserverCallback",
        kotlinFqn = "web.intersection.IntersectionObserverCallback",
    ),
    BrowserType(
        jsName = "IntersectionObserverEntry",
        kotlinFqn = "web.intersection.IntersectionObserverEntry",
    ),
    BrowserType(
        jsName = "IntersectionObserverInit",
        kotlinFqn = "web.intersection.IntersectionObserverInit",
    ),
    BrowserType(
        jsName = "Interval",
        kotlinFqn = "web.timers.Interval",
    ),
    BrowserType(
        jsName = "Intl.CaseFirst",
        kotlinFqn = "js.intl.CaseFirst",
    ),
    BrowserType(
        jsName = "Intl.Collation",
        kotlinFqn = "js.intl.Collation",
    ),
    BrowserType(
        jsName = "Intl.Collator",
        kotlinFqn = "js.intl.Collator",
    ),
    BrowserType(
        jsName = "Intl.CollatorOptions",
        kotlinFqn = "js.intl.CollatorOptions",
    ),
    BrowserType(
        jsName = "Intl.CollatorUsage",
        kotlinFqn = "js.intl.CollatorUsage",
    ),
    BrowserType(
        jsName = "Intl.CompactDisplay",
        kotlinFqn = "js.intl.CompactDisplay",
    ),
    BrowserType(
        jsName = "Intl.CurrencySign",
        kotlinFqn = "js.intl.CurrencySign",
    ),
    BrowserType(
        jsName = "Intl.DateStyle",
        kotlinFqn = "js.intl.DateStyle",
    ),
    BrowserType(
        jsName = "Intl.DateTimeFormat",
        kotlinFqn = "js.intl.DateTimeFormat",
    ),
    BrowserType(
        jsName = "Intl.DateTimeFormatOptions",
        kotlinFqn = "js.intl.DateTimeFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.DateTimeFormatPart",
        kotlinFqn = "js.intl.DateTimeFormatPart",
    ),
    BrowserType(
        jsName = "Intl.DateTimeRangeFormatPart",
        kotlinFqn = "js.intl.DateTimeRangeFormatPart",
    ),
    BrowserType(
        jsName = "Intl.DayFormat",
        kotlinFqn = "js.intl.DayFormat",
    ),
    BrowserType(
        jsName = "Intl.DayPeriod",
        kotlinFqn = "js.intl.DayPeriod",
    ),
    BrowserType(
        jsName = "Intl.DaysFormat",
        kotlinFqn = "js.intl.DaysFormat",
    ),
    BrowserType(
        jsName = "Intl.Direction",
        kotlinFqn = "js.intl.Direction",
    ),
    BrowserType(
        jsName = "Intl.DisplayNames",
        kotlinFqn = "js.intl.DisplayNames",
    ),
    BrowserType(
        jsName = "Intl.DisplayNamesFallback",
        kotlinFqn = "js.intl.DisplayNamesFallback",
    ),
    BrowserType(
        jsName = "Intl.DisplayNamesLanguageDisplay",
        kotlinFqn = "js.intl.DisplayNamesLanguageDisplay",
    ),
    BrowserType(
        jsName = "Intl.DisplayNamesOptions",
        kotlinFqn = "js.intl.DisplayNamesOptions",
    ),
    BrowserType(
        jsName = "Intl.DisplayNamesType",
        kotlinFqn = "js.intl.DisplayNamesType",
    ),
    BrowserType(
        jsName = "Intl.DurationFormat",
        kotlinFqn = "js.intl.DurationFormat",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatDisplayOption",
        kotlinFqn = "js.intl.DurationFormatDisplayOption",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatLocaleMatcher",
        kotlinFqn = "js.intl.DurationFormatLocaleMatcher",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatOptions",
        kotlinFqn = "js.intl.DurationFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatPart",
        kotlinFqn = "js.intl.DurationFormatPart",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatStyle",
        kotlinFqn = "js.intl.DurationFormatStyle",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatUnit",
        kotlinFqn = "js.intl.DurationFormatUnit",
    ),
    BrowserType(
        jsName = "Intl.DurationFormatUnitSingular",
        kotlinFqn = "js.intl.DurationFormatUnitSingular",
    ),
    BrowserType(
        jsName = "Intl.EraFormat",
        kotlinFqn = "js.intl.EraFormat",
    ),
    BrowserType(
        jsName = "Intl.FormatMatcher",
        kotlinFqn = "js.intl.FormatMatcher",
    ),
    BrowserType(
        jsName = "Intl.Granularity",
        kotlinFqn = "js.intl.Granularity",
    ),
    BrowserType(
        jsName = "Intl.HourCycle",
        kotlinFqn = "js.intl.HourCycle",
    ),
    BrowserType(
        jsName = "Intl.HourFormat",
        kotlinFqn = "js.intl.HourFormat",
    ),
    BrowserType(
        jsName = "Intl.HoursFormat",
        kotlinFqn = "js.intl.HoursFormat",
    ),
    BrowserType(
        jsName = "Intl.LDMLPluralRule",
        kotlinFqn = "js.intl.LDMLPluralRule",
    ),
    BrowserType(
        jsName = "Intl.ListFormat",
        kotlinFqn = "js.intl.ListFormat",
    ),
    BrowserType(
        jsName = "Intl.ListFormatLocaleMatcher",
        kotlinFqn = "js.intl.ListFormatLocaleMatcher",
    ),
    BrowserType(
        jsName = "Intl.ListFormatOptions",
        kotlinFqn = "js.intl.ListFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.ListFormatStyle",
        kotlinFqn = "js.intl.ListFormatStyle",
    ),
    BrowserType(
        jsName = "Intl.ListFormatType",
        kotlinFqn = "js.intl.ListFormatType",
    ),
    BrowserType(
        jsName = "Intl.Locale",
        kotlinFqn = "js.intl.Locale",
    ),
    BrowserType(
        jsName = "Intl.LocaleMatcher",
        kotlinFqn = "js.intl.LocaleMatcher",
    ),
    BrowserType(
        jsName = "Intl.LocaleOptions",
        kotlinFqn = "js.intl.LocaleOptions",
    ),
    BrowserType(
        jsName = "Intl.Localizable",
        kotlinFqn = "js.intl.Localizable",
    ),
    BrowserType(
        jsName = "Intl.MicrosecondsFormat",
        kotlinFqn = "js.intl.MicrosecondsFormat",
    ),
    BrowserType(
        jsName = "Intl.MillisecondsFormat",
        kotlinFqn = "js.intl.MillisecondsFormat",
    ),
    BrowserType(
        jsName = "Intl.MinuteFormat",
        kotlinFqn = "js.intl.MinuteFormat",
    ),
    BrowserType(
        jsName = "Intl.MinutesFormat",
        kotlinFqn = "js.intl.MinutesFormat",
    ),
    BrowserType(
        jsName = "Intl.MonthFormat",
        kotlinFqn = "js.intl.MonthFormat",
    ),
    BrowserType(
        jsName = "Intl.MonthsFormat",
        kotlinFqn = "js.intl.MonthsFormat",
    ),
    BrowserType(
        jsName = "Intl.NanosecondsFormat",
        kotlinFqn = "js.intl.NanosecondsFormat",
    ),
    BrowserType(
        jsName = "Intl.Notation",
        kotlinFqn = "js.intl.Notation",
    ),
    BrowserType(
        jsName = "Intl.NumberFormat",
        kotlinFqn = "js.intl.NumberFormat",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatOptions",
        kotlinFqn = "js.intl.NumberFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatOptionsCurrencyDisplay",
        kotlinFqn = "js.intl.NumberFormatOptionsCurrencyDisplay",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatOptionsSignDisplay",
        kotlinFqn = "js.intl.NumberFormatOptionsSignDisplay",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatOptionsStyle",
        kotlinFqn = "js.intl.NumberFormatOptionsStyle",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatOptionsUseGrouping",
        kotlinFqn = "js.intl.NumberFormatOptionsUseGrouping",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatPart",
        kotlinFqn = "js.intl.NumberFormatPart",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatPartType",
        kotlinFqn = "js.intl.NumberFormatPartType",
    ),
    BrowserType(
        jsName = "Intl.NumberFormatRangePartTypes",
        kotlinFqn = "js.intl.NumberFormatRangePartTypes",
    ),
    BrowserType(
        jsName = "Intl.NumberRangeFormatPart",
        kotlinFqn = "js.intl.NumberRangeFormatPart",
    ),
    BrowserType(
        jsName = "Intl.PartSource",
        kotlinFqn = "js.intl.PartSource",
    ),
    BrowserType(
        jsName = "Intl.PluralRuleType",
        kotlinFqn = "js.intl.PluralRuleType",
    ),
    BrowserType(
        jsName = "Intl.PluralRules",
        kotlinFqn = "js.intl.PluralRules",
    ),
    BrowserType(
        jsName = "Intl.PluralRulesOptions",
        kotlinFqn = "js.intl.PluralRulesOptions",
    ),
    BrowserType(
        jsName = "Intl.RelativeTimeFormat",
        kotlinFqn = "js.intl.RelativeTimeFormat",
    ),
    BrowserType(
        jsName = "Intl.RelativeTimeFormatNumeric",
        kotlinFqn = "js.intl.RelativeTimeFormatNumeric",
    ),
    BrowserType(
        jsName = "Intl.RelativeTimeFormatOptions",
        kotlinFqn = "js.intl.RelativeTimeFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.RelativeTimeFormatStyle",
        kotlinFqn = "js.intl.RelativeTimeFormatStyle",
    ),
    BrowserType(
        jsName = "Intl.RelativeTimeFormatUnit",
        kotlinFqn = "js.intl.RelativeTimeFormatUnit",
    ),
    BrowserType(
        jsName = "Intl.RelativeTimeFormatUnitSingular",
        kotlinFqn = "js.intl.RelativeTimeFormatUnitSingular",
    ),
    BrowserType(
        jsName = "Intl.ResolvedCollatorOptions",
        kotlinFqn = "js.intl.ResolvedCollatorOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedDateTimeFormatOptions",
        kotlinFqn = "js.intl.ResolvedDateTimeFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedDisplayNamesOptions",
        kotlinFqn = "js.intl.ResolvedDisplayNamesOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedDurationFormatOptions",
        kotlinFqn = "js.intl.ResolvedDurationFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedListFormatOptions",
        kotlinFqn = "js.intl.ResolvedListFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedNumberFormatOptions",
        kotlinFqn = "js.intl.ResolvedNumberFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedNumberFormatOptionsUseGrouping",
        kotlinFqn = "js.intl.ResolvedNumberFormatOptionsUseGrouping",
    ),
    BrowserType(
        jsName = "Intl.ResolvedPluralRulesOptions",
        kotlinFqn = "js.intl.ResolvedPluralRulesOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedRelativeTimeFormatOptions",
        kotlinFqn = "js.intl.ResolvedRelativeTimeFormatOptions",
    ),
    BrowserType(
        jsName = "Intl.ResolvedSegmenterOptions",
        kotlinFqn = "js.intl.ResolvedSegmenterOptions",
    ),
    BrowserType(
        jsName = "Intl.RoundingMode",
        kotlinFqn = "js.intl.RoundingMode",
    ),
    BrowserType(
        jsName = "Intl.RoundingPriority",
        kotlinFqn = "js.intl.RoundingPriority",
    ),
    BrowserType(
        jsName = "Intl.SecondFormat",
        kotlinFqn = "js.intl.SecondFormat",
    ),
    BrowserType(
        jsName = "Intl.SecondsFormat",
        kotlinFqn = "js.intl.SecondsFormat",
    ),
    BrowserType(
        jsName = "Intl.SegmentData",
        kotlinFqn = "js.intl.SegmentData",
    ),
    BrowserType(
        jsName = "Intl.Segmenter",
        kotlinFqn = "js.intl.Segmenter",
    ),
    BrowserType(
        jsName = "Intl.SegmenterOptions",
        kotlinFqn = "js.intl.SegmenterOptions",
    ),
    BrowserType(
        jsName = "Intl.Segments",
        kotlinFqn = "js.intl.Segments",
    ),
    BrowserType(
        jsName = "Intl.Sensitivity",
        kotlinFqn = "js.intl.Sensitivity",
    ),
    BrowserType(
        jsName = "Intl.StringNumericLiteral",
        kotlinFqn = "js.intl.StringNumericLiteral",
    ),
    BrowserType(
        jsName = "Intl.SupportedLocalesOptions",
        kotlinFqn = "js.intl.SupportedLocalesOptions",
    ),
    BrowserType(
        jsName = "Intl.TextInfo",
        kotlinFqn = "js.intl.TextInfo",
    ),
    BrowserType(
        jsName = "Intl.TimeStyle",
        kotlinFqn = "js.intl.TimeStyle",
    ),
    BrowserType(
        jsName = "Intl.TimeZoneNameFormat",
        kotlinFqn = "js.intl.TimeZoneNameFormat",
    ),
    BrowserType(
        jsName = "Intl.TrailingZeroDisplay",
        kotlinFqn = "js.intl.TrailingZeroDisplay",
    ),
    BrowserType(
        jsName = "Intl.UnicodeBCP47LocaleIdentifier",
        kotlinFqn = "js.intl.UnicodeBCP47LocaleIdentifier",
    ),
    BrowserType(
        jsName = "Intl.UnitDisplay",
        kotlinFqn = "js.intl.UnitDisplay",
    ),
    BrowserType(
        jsName = "Intl.WeekInfo",
        kotlinFqn = "js.intl.WeekInfo",
    ),
    BrowserType(
        jsName = "Intl.WeekdayFormat",
        kotlinFqn = "js.intl.WeekdayFormat",
    ),
    BrowserType(
        jsName = "Intl.WeeksFormat",
        kotlinFqn = "js.intl.WeeksFormat",
    ),
    BrowserType(
        jsName = "Intl.YearFormat",
        kotlinFqn = "js.intl.YearFormat",
    ),
    BrowserType(
        jsName = "Intl.YearsFormat",
        kotlinFqn = "js.intl.YearsFormat",
    ),
    BrowserType(
        jsName = "Iterable",
        kotlinFqn = "js.iterable.JsIterable",
    ),
    BrowserType(
        jsName = "IterationCompositeOperation",
        kotlinFqn = "web.animations.IterationCompositeOperation",
    ),
    BrowserType(
        jsName = "Iterator",
        kotlinFqn = "js.iterable.JsIterator",
    ),
    BrowserType(
        jsName = "IteratorLike",
        kotlinFqn = "js.iterable.JsIteratorLike",
    ),
    BrowserType(
        jsName = "IteratorResult",
        kotlinFqn = "js.iterable.IteratorResult",
    ),
    BrowserType(
        jsName = "IteratorReturnResult",
        kotlinFqn = "js.iterable.IteratorReturnResult",
    ),
    BrowserType(
        jsName = "IteratorYieldResult",
        kotlinFqn = "js.iterable.IteratorYieldResult",
    ),
    BrowserType(
        jsName = "JsArray",
        kotlinFqn = "js.array.JsArray",
    ),
    BrowserType(
        jsName = "JsByte",
        kotlinFqn = "js.numbers.JsByte",
    ),
    BrowserType(
        jsName = "JsDouble",
        kotlinFqn = "js.numbers.JsDouble",
    ),
    BrowserType(
        jsName = "JsFloat",
        kotlinFqn = "js.numbers.JsFloat",
    ),
    BrowserType(
        jsName = "JsFloat16",
        kotlinFqn = "js.numbers.JsFloat16",
    ),
    BrowserType(
        jsName = "JsInt",
        kotlinFqn = "js.numbers.JsInt",
    ),
    BrowserType(
        jsName = "JsInt53",
        kotlinFqn = "js.numbers.JsInt53",
    ),
    BrowserType(
        jsName = "JsShort",
        kotlinFqn = "js.numbers.JsShort",
    ),
    BrowserType(
        jsName = "JsUByte",
        kotlinFqn = "js.numbers.JsUByte",
    ),
    BrowserType(
        jsName = "JsUInt",
        kotlinFqn = "js.numbers.JsUInt",
    ),
    BrowserType(
        jsName = "JsUInt53",
        kotlinFqn = "js.numbers.JsUInt53",
    ),
    BrowserType(
        jsName = "JsUShort",
        kotlinFqn = "js.numbers.JsUShort",
    ),
    BrowserType(
        jsName = "JsonWebKey",
        kotlinFqn = "web.crypto.JsonWebKey",
    ),
    BrowserType(
        jsName = "KHR_parallel_shader_compile",
        kotlinFqn = "web.gl.KHR_parallel_shader_compile",
    ),
    BrowserType(
        jsName = "KeyAlgorithm",
        kotlinFqn = "web.crypto.KeyAlgorithm",
    ),
    BrowserType(
        jsName = "KeyCode",
        kotlinFqn = "web.keyboard.KeyCode",
    ),
    BrowserType(
        jsName = "KeyFormat",
        kotlinFqn = "web.crypto.KeyFormat",
    ),
    BrowserType(
        jsName = "KeyLocation",
        kotlinFqn = "web.keyboard.KeyLocation",
    ),
    BrowserType(
        jsName = "KeySystemTrackConfiguration",
        kotlinFqn = "web.mediacapabilities.KeySystemTrackConfiguration",
    ),
    BrowserType(
        jsName = "KeyType",
        kotlinFqn = "web.crypto.KeyType",
    ),
    BrowserType(
        jsName = "KeyUsage",
        kotlinFqn = "web.crypto.KeyUsage",
    ),
    BrowserType(
        jsName = "Keyboard",
        kotlinFqn = "web.keyboard.Keyboard",
    ),
    BrowserType(
        jsName = "KeyboardEvent",
        kotlinFqn = "web.keyboard.KeyboardEvent",
    ),
    BrowserType(
        jsName = "KeyboardEventInit",
        kotlinFqn = "web.keyboard.KeyboardEventInit",
    ),
    BrowserType(
        jsName = "KeyboardLayoutMap",
        kotlinFqn = "web.keyboard.KeyboardLayoutMap",
    ),
    BrowserType(
        jsName = "Keyframe",
        kotlinFqn = "web.animations.Keyframe",
    ),
    BrowserType(
        jsName = "KeyframeAnimationOptions",
        kotlinFqn = "web.animations.KeyframeAnimationOptions",
    ),
    BrowserType(
        jsName = "KeyframeEffect",
        kotlinFqn = "web.animations.KeyframeEffect",
    ),
    BrowserType(
        jsName = "KeyframeEffectOptions",
        kotlinFqn = "web.animations.KeyframeEffectOptions",
    ),
    BrowserType(
        jsName = "LargestContentfulPaint",
        kotlinFqn = "web.performance.LargestContentfulPaint",
    ),
    BrowserType(
        jsName = "LastChunkHandling",
        kotlinFqn = "js.typedarrays.LastChunkHandling",
    ),
    BrowserType(
        jsName = "LatencyMode",
        kotlinFqn = "web.codecs.LatencyMode",
    ),
    BrowserType(
        jsName = "LaunchConsumer",
        kotlinFqn = "web.launch.LaunchConsumer",
    ),
    BrowserType(
        jsName = "LaunchParams",
        kotlinFqn = "web.launch.LaunchParams",
    ),
    BrowserType(
        jsName = "LaunchQueue",
        kotlinFqn = "web.launch.LaunchQueue",
    ),
    BrowserType(
        jsName = "LineAlignSetting",
        kotlinFqn = "web.vtt.LineAlignSetting",
    ),
    BrowserType(
        jsName = "LineAndPositionSetting",
        kotlinFqn = "web.vtt.LineAndPositionSetting",
    ),
    BrowserType(
        jsName = "LinkStyle",
        kotlinFqn = "web.cssom.LinkStyle",
    ),
    BrowserType(
        jsName = "ListLike",
        kotlinFqn = "js.collections.ListLike",
    ),
    BrowserType(
        jsName = "Loading",
        kotlinFqn = "web.html.Loading",
    ),
    BrowserType(
        jsName = "Location",
        kotlinFqn = "web.location.Location",
    ),
    BrowserType(
        jsName = "Lock",
        kotlinFqn = "web.locks.Lock",
    ),
    BrowserType(
        jsName = "LockGrantedCallback",
        kotlinFqn = "web.locks.LockGrantedCallback",
    ),
    BrowserType(
        jsName = "LockInfo",
        kotlinFqn = "web.locks.LockInfo",
    ),
    BrowserType(
        jsName = "LockManager",
        kotlinFqn = "web.locks.LockManager",
    ),
    BrowserType(
        jsName = "LockManagerSnapshot",
        kotlinFqn = "web.locks.LockManagerSnapshot",
    ),
    BrowserType(
        jsName = "LockMode",
        kotlinFqn = "web.locks.LockMode",
    ),
    BrowserType(
        jsName = "LockOptions",
        kotlinFqn = "web.locks.LockOptions",
    ),
    BrowserType(
        jsName = "LoginStatus",
        kotlinFqn = "web.fedcm.LoginStatus",
    ),
    BrowserType(
        jsName = "LooseContentBlock",
        kotlinFqn = "web.mcp.LooseContentBlock",
    ),
    BrowserType(
        jsName = "MIDIAccess",
        kotlinFqn = "web.midi.MIDIAccess",
    ),
    BrowserType(
        jsName = "MIDIConnectionEvent",
        kotlinFqn = "web.midi.MIDIConnectionEvent",
    ),
    BrowserType(
        jsName = "MIDIConnectionEventInit",
        kotlinFqn = "web.midi.MIDIConnectionEventInit",
    ),
    BrowserType(
        jsName = "MIDIInput",
        kotlinFqn = "web.midi.MIDIInput",
    ),
    BrowserType(
        jsName = "MIDIInputMap",
        kotlinFqn = "web.midi.MIDIInputMap",
    ),
    BrowserType(
        jsName = "MIDIMessageEvent",
        kotlinFqn = "web.midi.MIDIMessageEvent",
    ),
    BrowserType(
        jsName = "MIDIMessageEventInit",
        kotlinFqn = "web.midi.MIDIMessageEventInit",
    ),
    BrowserType(
        jsName = "MIDIOptions",
        kotlinFqn = "web.midi.MIDIOptions",
    ),
    BrowserType(
        jsName = "MIDIOutput",
        kotlinFqn = "web.midi.MIDIOutput",
    ),
    BrowserType(
        jsName = "MIDIOutputMap",
        kotlinFqn = "web.midi.MIDIOutputMap",
    ),
    BrowserType(
        jsName = "MIDIPort",
        kotlinFqn = "web.midi.MIDIPort",
    ),
    BrowserType(
        jsName = "MIDIPortConnectionState",
        kotlinFqn = "web.midi.MIDIPortConnectionState",
    ),
    BrowserType(
        jsName = "MIDIPortDeviceState",
        kotlinFqn = "web.midi.MIDIPortDeviceState",
    ),
    BrowserType(
        jsName = "MIDIPortType",
        kotlinFqn = "web.midi.MIDIPortType",
    ),
    BrowserType(
        jsName = "Map",
        kotlinFqn = "js.collections.JsMap",
    ),
    BrowserType(
        jsName = "MapLike",
        kotlinFqn = "js.collections.MapLike",
    ),
    BrowserType(
        jsName = "MathMLElement",
        kotlinFqn = "web.mathml.MathMLElement",
    ),
    BrowserType(
        jsName = "MediaCapabilities",
        kotlinFqn = "web.mediacapabilities.MediaCapabilities",
    ),
    BrowserType(
        jsName = "MediaCapabilitiesDecodingInfo",
        kotlinFqn = "web.mediacapabilities.MediaCapabilitiesDecodingInfo",
    ),
    BrowserType(
        jsName = "MediaCapabilitiesEncodingInfo",
        kotlinFqn = "web.mediacapabilities.MediaCapabilitiesEncodingInfo",
    ),
    BrowserType(
        jsName = "MediaCapabilitiesInfo",
        kotlinFqn = "web.mediacapabilities.MediaCapabilitiesInfo",
    ),
    BrowserType(
        jsName = "MediaCapabilitiesKeySystemConfiguration",
        kotlinFqn = "web.mediacapabilities.MediaCapabilitiesKeySystemConfiguration",
    ),
    BrowserType(
        jsName = "MediaConfiguration",
        kotlinFqn = "web.mediacapabilities.MediaConfiguration",
    ),
    BrowserType(
        jsName = "MediaDecodingConfiguration",
        kotlinFqn = "web.mediacapabilities.MediaDecodingConfiguration",
    ),
    BrowserType(
        jsName = "MediaDecodingType",
        kotlinFqn = "web.mediacapabilities.MediaDecodingType",
    ),
    BrowserType(
        jsName = "MediaDeviceInfo",
        kotlinFqn = "web.mediadevices.MediaDeviceInfo",
    ),
    BrowserType(
        jsName = "MediaDeviceKind",
        kotlinFqn = "web.mediadevices.MediaDeviceKind",
    ),
    BrowserType(
        jsName = "MediaDevices",
        kotlinFqn = "web.mediadevices.MediaDevices",
    ),
    BrowserType(
        jsName = "MediaElementAudioSourceNode",
        kotlinFqn = "web.audio.MediaElementAudioSourceNode",
    ),
    BrowserType(
        jsName = "MediaElementAudioSourceOptions",
        kotlinFqn = "web.audio.MediaElementAudioSourceOptions",
    ),
    BrowserType(
        jsName = "MediaEncodingConfiguration",
        kotlinFqn = "web.mediacapabilities.MediaEncodingConfiguration",
    ),
    BrowserType(
        jsName = "MediaEncodingType",
        kotlinFqn = "web.mediacapabilities.MediaEncodingType",
    ),
    BrowserType(
        jsName = "MediaEncryptedEvent",
        kotlinFqn = "web.mediaencrypted.MediaEncryptedEvent",
    ),
    BrowserType(
        jsName = "MediaEncryptedEventInit",
        kotlinFqn = "web.mediaencrypted.MediaEncryptedEventInit",
    ),
    BrowserType(
        jsName = "MediaError",
        kotlinFqn = "web.html.MediaError",
    ),
    BrowserType(
        jsName = "MediaImage",
        kotlinFqn = "web.mediasession.MediaImage",
    ),
    BrowserType(
        jsName = "MediaKeyMessageEvent",
        kotlinFqn = "web.mediaencrypted.MediaKeyMessageEvent",
    ),
    BrowserType(
        jsName = "MediaKeyMessageEventInit",
        kotlinFqn = "web.mediaencrypted.MediaKeyMessageEventInit",
    ),
    BrowserType(
        jsName = "MediaKeyMessageType",
        kotlinFqn = "web.mediaencrypted.MediaKeyMessageType",
    ),
    BrowserType(
        jsName = "MediaKeySession",
        kotlinFqn = "web.mediaencrypted.MediaKeySession",
    ),
    BrowserType(
        jsName = "MediaKeySessionClosedReason",
        kotlinFqn = "web.mediaencrypted.MediaKeySessionClosedReason",
    ),
    BrowserType(
        jsName = "MediaKeySessionType",
        kotlinFqn = "web.mediaencrypted.MediaKeySessionType",
    ),
    BrowserType(
        jsName = "MediaKeyStatus",
        kotlinFqn = "web.mediaencrypted.MediaKeyStatus",
    ),
    BrowserType(
        jsName = "MediaKeyStatusMap",
        kotlinFqn = "web.mediaencrypted.MediaKeyStatusMap",
    ),
    BrowserType(
        jsName = "MediaKeySystemAccess",
        kotlinFqn = "web.mediaencrypted.MediaKeySystemAccess",
    ),
    BrowserType(
        jsName = "MediaKeySystemConfiguration",
        kotlinFqn = "web.mediaencrypted.MediaKeySystemConfiguration",
    ),
    BrowserType(
        jsName = "MediaKeySystemMediaCapability",
        kotlinFqn = "web.mediaencrypted.MediaKeySystemMediaCapability",
    ),
    BrowserType(
        jsName = "MediaKeys",
        kotlinFqn = "web.mediaencrypted.MediaKeys",
    ),
    BrowserType(
        jsName = "MediaKeysPolicy",
        kotlinFqn = "web.mediaencrypted.MediaKeysPolicy",
    ),
    BrowserType(
        jsName = "MediaKeysRequirement",
        kotlinFqn = "web.mediaencrypted.MediaKeysRequirement",
    ),
    BrowserType(
        jsName = "MediaList",
        kotlinFqn = "web.cssom.MediaList",
    ),
    BrowserType(
        jsName = "MediaMetadata",
        kotlinFqn = "web.mediasession.MediaMetadata",
    ),
    BrowserType(
        jsName = "MediaMetadataInit",
        kotlinFqn = "web.mediasession.MediaMetadataInit",
    ),
    BrowserType(
        jsName = "MediaPositionState",
        kotlinFqn = "web.mediasession.MediaPositionState",
    ),
    BrowserType(
        jsName = "MediaProvider",
        kotlinFqn = "web.html.MediaProvider",
    ),
    BrowserType(
        jsName = "MediaQueryList",
        kotlinFqn = "web.cssom.MediaQueryList",
    ),
    BrowserType(
        jsName = "MediaQueryListEvent",
        kotlinFqn = "web.cssom.MediaQueryListEvent",
    ),
    BrowserType(
        jsName = "MediaQueryListEventInit",
        kotlinFqn = "web.cssom.MediaQueryListEventInit",
    ),
    BrowserType(
        jsName = "MediaRecorder",
        kotlinFqn = "web.mediarecorder.MediaRecorder",
    ),
    BrowserType(
        jsName = "MediaRecorderOptions",
        kotlinFqn = "web.mediarecorder.MediaRecorderOptions",
    ),
    BrowserType(
        jsName = "MediaSession",
        kotlinFqn = "web.mediasession.MediaSession",
    ),
    BrowserType(
        jsName = "MediaSessionAction",
        kotlinFqn = "web.mediasession.MediaSessionAction",
    ),
    BrowserType(
        jsName = "MediaSessionActionDetails",
        kotlinFqn = "web.mediasession.MediaSessionActionDetails",
    ),
    BrowserType(
        jsName = "MediaSessionActionHandler",
        kotlinFqn = "web.mediasession.MediaSessionActionHandler",
    ),
    BrowserType(
        jsName = "MediaSessionPlaybackState",
        kotlinFqn = "web.mediasession.MediaSessionPlaybackState",
    ),
    BrowserType(
        jsName = "MediaSettingsRange",
        kotlinFqn = "web.imagecapture.MediaSettingsRange",
    ),
    BrowserType(
        jsName = "MediaSource",
        kotlinFqn = "web.mediasource.MediaSource",
    ),
    BrowserType(
        jsName = "MediaSourceHandle",
        kotlinFqn = "web.mediasource.MediaSourceHandle",
    ),
    BrowserType(
        jsName = "MediaStream",
        kotlinFqn = "web.mediastreams.MediaStream",
    ),
    BrowserType(
        jsName = "MediaStreamAudioDestinationNode",
        kotlinFqn = "web.audio.MediaStreamAudioDestinationNode",
    ),
    BrowserType(
        jsName = "MediaStreamAudioSourceNode",
        kotlinFqn = "web.audio.MediaStreamAudioSourceNode",
    ),
    BrowserType(
        jsName = "MediaStreamAudioSourceOptions",
        kotlinFqn = "web.audio.MediaStreamAudioSourceOptions",
    ),
    BrowserType(
        jsName = "MediaStreamConstraints",
        kotlinFqn = "web.mediastreams.MediaStreamConstraints",
    ),
    BrowserType(
        jsName = "MediaStreamTrack",
        kotlinFqn = "web.mediastreams.MediaStreamTrack",
    ),
    BrowserType(
        jsName = "MediaStreamTrackEvent",
        kotlinFqn = "web.mediastreams.MediaStreamTrackEvent",
    ),
    BrowserType(
        jsName = "MediaStreamTrackEventInit",
        kotlinFqn = "web.mediastreams.MediaStreamTrackEventInit",
    ),
    BrowserType(
        jsName = "MediaStreamTrackProcessor",
        kotlinFqn = "web.mediastreams.MediaStreamTrackProcessor",
    ),
    BrowserType(
        jsName = "MediaStreamTrackProcessorInit",
        kotlinFqn = "web.mediastreams.MediaStreamTrackProcessorInit",
    ),
    BrowserType(
        jsName = "MediaStreamTrackState",
        kotlinFqn = "web.mediastreams.MediaStreamTrackState",
    ),
    BrowserType(
        jsName = "MediaTrackCapabilities",
        kotlinFqn = "web.mediastreams.MediaTrackCapabilities",
    ),
    BrowserType(
        jsName = "MediaTrackConstraintSet",
        kotlinFqn = "web.mediastreams.MediaTrackConstraintSet",
    ),
    BrowserType(
        jsName = "MediaTrackConstraints",
        kotlinFqn = "web.mediastreams.MediaTrackConstraints",
    ),
    BrowserType(
        jsName = "MediaTrackSettings",
        kotlinFqn = "web.mediastreams.MediaTrackSettings",
    ),
    BrowserType(
        jsName = "MediaTrackSupportedConstraints",
        kotlinFqn = "web.mediastreams.MediaTrackSupportedConstraints",
    ),
    BrowserType(
        jsName = "MessageChannel",
        kotlinFqn = "web.messaging.MessageChannel",
    ),
    BrowserType(
        jsName = "MessageEvent",
        kotlinFqn = "web.messaging.MessageEvent",
    ),
    BrowserType(
        jsName = "MessageEventInit",
        kotlinFqn = "web.messaging.MessageEventInit",
    ),
    BrowserType(
        jsName = "MessageEventSource",
        kotlinFqn = "web.messaging.MessageEventSource",
    ),
    BrowserType(
        jsName = "MessageEventTarget",
        kotlinFqn = "web.messaging.MessageEventTarget",
    ),
    BrowserType(
        jsName = "MessagePort",
        kotlinFqn = "web.messaging.MessagePort",
    ),
    BrowserType(
        jsName = "ModelContext",
        kotlinFqn = "web.mcp.ModelContext",
    ),
    BrowserType(
        jsName = "ModelContextRegisterToolOptions",
        kotlinFqn = "web.mcp.ModelContextRegisterToolOptions",
    ),
    BrowserType(
        jsName = "ModelContextTool",
        kotlinFqn = "web.mcp.ModelContextTool",
    ),
    BrowserType(
        jsName = "ModifierKeyCode",
        kotlinFqn = "web.keyboard.ModifierKeyCode",
    ),
    BrowserType(
        jsName = "MouseButton",
        kotlinFqn = "web.mouse.MouseButton",
    ),
    BrowserType(
        jsName = "MouseButtons",
        kotlinFqn = "web.mouse.MouseButtons",
    ),
    BrowserType(
        jsName = "MouseEvent",
        kotlinFqn = "web.mouse.MouseEvent",
    ),
    BrowserType(
        jsName = "MouseEventInit",
        kotlinFqn = "web.mouse.MouseEventInit",
    ),
    BrowserType(
        jsName = "MultiCacheQueryOptions",
        kotlinFqn = "web.cache.MultiCacheQueryOptions",
    ),
    BrowserType(
        jsName = "MutableArrayLike",
        kotlinFqn = "js.array.MutableArrayLike",
    ),
    BrowserType(
        jsName = "MutableMapLike",
        kotlinFqn = "js.collections.MutableMapLike",
    ),
    BrowserType(
        jsName = "MutableSetLike",
        kotlinFqn = "js.collections.MutableSetLike",
    ),
    BrowserType(
        jsName = "MutationCallback",
        kotlinFqn = "web.mutation.MutationCallback",
    ),
    BrowserType(
        jsName = "MutationObserver",
        kotlinFqn = "web.mutation.MutationObserver",
    ),
    BrowserType(
        jsName = "MutationObserverInit",
        kotlinFqn = "web.mutation.MutationObserverInit",
    ),
    BrowserType(
        jsName = "MutationRecord",
        kotlinFqn = "web.mutation.MutationRecord",
    ),
    BrowserType(
        jsName = "MutationRecordType",
        kotlinFqn = "web.mutation.MutationRecordType",
    ),
    BrowserType(
        jsName = "NamedCurve",
        kotlinFqn = "web.crypto.NamedCurve",
    ),
    BrowserType(
        jsName = "NamedNodeMap",
        kotlinFqn = "web.dom.NamedNodeMap",
    ),
    BrowserType(
        jsName = "NavigateEvent",
        kotlinFqn = "web.navigation.NavigateEvent",
    ),
    BrowserType(
        jsName = "NavigateEventInit",
        kotlinFqn = "web.navigation.NavigateEventInit",
    ),
    BrowserType(
        jsName = "Navigation",
        kotlinFqn = "web.navigation.Navigation",
    ),
    BrowserType(
        jsName = "NavigationActivation",
        kotlinFqn = "web.navigation.NavigationActivation",
    ),
    BrowserType(
        jsName = "NavigationCurrentEntryChangeEvent",
        kotlinFqn = "web.navigation.NavigationCurrentEntryChangeEvent",
    ),
    BrowserType(
        jsName = "NavigationCurrentEntryChangeEventInit",
        kotlinFqn = "web.navigation.NavigationCurrentEntryChangeEventInit",
    ),
    BrowserType(
        jsName = "NavigationDestination",
        kotlinFqn = "web.navigation.NavigationDestination",
    ),
    BrowserType(
        jsName = "NavigationFocusReset",
        kotlinFqn = "web.navigation.NavigationFocusReset",
    ),
    BrowserType(
        jsName = "NavigationHistoryBehavior",
        kotlinFqn = "web.navigation.NavigationHistoryBehavior",
    ),
    BrowserType(
        jsName = "NavigationHistoryEntry",
        kotlinFqn = "web.navigation.NavigationHistoryEntry",
    ),
    BrowserType(
        jsName = "NavigationInterceptHandler",
        kotlinFqn = "web.navigation.NavigationInterceptHandler",
    ),
    BrowserType(
        jsName = "NavigationInterceptOptions",
        kotlinFqn = "web.navigation.NavigationInterceptOptions",
    ),
    BrowserType(
        jsName = "NavigationNavigateOptions",
        kotlinFqn = "web.navigation.NavigationNavigateOptions",
    ),
    BrowserType(
        jsName = "NavigationOptions",
        kotlinFqn = "web.navigation.NavigationOptions",
    ),
    BrowserType(
        jsName = "NavigationPrecommitController",
        kotlinFqn = "web.navigation.NavigationPrecommitController",
    ),
    BrowserType(
        jsName = "NavigationPrecommitHandler",
        kotlinFqn = "web.navigation.NavigationPrecommitHandler",
    ),
    BrowserType(
        jsName = "NavigationPreloadManager",
        kotlinFqn = "web.serviceworker.NavigationPreloadManager",
    ),
    BrowserType(
        jsName = "NavigationPreloadState",
        kotlinFqn = "web.serviceworker.NavigationPreloadState",
    ),
    BrowserType(
        jsName = "NavigationReloadOptions",
        kotlinFqn = "web.navigation.NavigationReloadOptions",
    ),
    BrowserType(
        jsName = "NavigationResult",
        kotlinFqn = "web.navigation.NavigationResult",
    ),
    BrowserType(
        jsName = "NavigationScrollBehavior",
        kotlinFqn = "web.navigation.NavigationScrollBehavior",
    ),
    BrowserType(
        jsName = "NavigationTimingType",
        kotlinFqn = "web.performance.NavigationTimingType",
    ),
    BrowserType(
        jsName = "NavigationTransition",
        kotlinFqn = "web.navigation.NavigationTransition",
    ),
    BrowserType(
        jsName = "NavigationType",
        kotlinFqn = "web.navigation.NavigationType",
    ),
    BrowserType(
        jsName = "NavigationUpdateCurrentEntryOptions",
        kotlinFqn = "web.navigation.NavigationUpdateCurrentEntryOptions",
    ),
    BrowserType(
        jsName = "Navigator",
        kotlinFqn = "web.navigator.Navigator",
    ),
    BrowserType(
        jsName = "NavigatorAutomationInformation",
        kotlinFqn = "web.navigator.NavigatorAutomationInformation",
    ),
    BrowserType(
        jsName = "NavigatorBadge",
        kotlinFqn = "web.badging.NavigatorBadge",
    ),
    BrowserType(
        jsName = "NavigatorConcurrentHardware",
        kotlinFqn = "web.navigator.NavigatorConcurrentHardware",
    ),
    BrowserType(
        jsName = "NavigatorContentUtils",
        kotlinFqn = "web.navigator.NavigatorContentUtils",
    ),
    BrowserType(
        jsName = "NavigatorCookies",
        kotlinFqn = "web.navigator.NavigatorCookies",
    ),
    BrowserType(
        jsName = "NavigatorGPU",
        kotlinFqn = "web.gpu.NavigatorGPU",
    ),
    BrowserType(
        jsName = "NavigatorID",
        kotlinFqn = "web.navigator.NavigatorID",
    ),
    BrowserType(
        jsName = "NavigatorLanguage",
        kotlinFqn = "web.navigator.NavigatorLanguage",
    ),
    BrowserType(
        jsName = "NavigatorLocks",
        kotlinFqn = "web.locks.NavigatorLocks",
    ),
    BrowserType(
        jsName = "NavigatorLogin",
        kotlinFqn = "web.fedcm.NavigatorLogin",
    ),
    BrowserType(
        jsName = "NavigatorOnLine",
        kotlinFqn = "web.navigator.NavigatorOnLine",
    ),
    BrowserType(
        jsName = "NavigatorPlugins",
        kotlinFqn = "web.navigator.NavigatorPlugins",
    ),
    BrowserType(
        jsName = "NavigatorStorage",
        kotlinFqn = "web.storage.NavigatorStorage",
    ),
    BrowserType(
        jsName = "Node",
        kotlinFqn = "web.dom.Node",
    ),
    BrowserType(
        jsName = "NodeFilter",
        kotlinFqn = "web.dom.NodeFilter",
    ),
    BrowserType(
        jsName = "NodeFilterResult",
        kotlinFqn = "web.dom.NodeFilterResult",
    ),
    BrowserType(
        jsName = "NodeIterator",
        kotlinFqn = "web.dom.NodeIterator",
    ),
    BrowserType(
        jsName = "NodeList",
        kotlinFqn = "web.dom.NodeList",
    ),
    BrowserType(
        jsName = "NodePosition",
        kotlinFqn = "web.dom.NodePosition",
    ),
    BrowserType(
        jsName = "NodeType",
        kotlinFqn = "web.dom.NodeType",
    ),
    BrowserType(
        jsName = "NonDocumentTypeChildNode",
        kotlinFqn = "web.dom.NonDocumentTypeChildNode",
    ),
    BrowserType(
        jsName = "NonElementParentNode",
        kotlinFqn = "web.dom.NonElementParentNode",
    ),
    BrowserType(
        jsName = "Notification",
        kotlinFqn = "web.notifications.Notification",
    ),
    BrowserType(
        jsName = "NotificationAction",
        kotlinFqn = "web.notifications.NotificationAction",
    ),
    BrowserType(
        jsName = "NotificationDirection",
        kotlinFqn = "web.notifications.NotificationDirection",
    ),
    BrowserType(
        jsName = "NotificationEvent",
        kotlinFqn = "web.serviceworker.NotificationEvent",
    ),
    BrowserType(
        jsName = "NotificationEventInit",
        kotlinFqn = "web.serviceworker.NotificationEventInit",
    ),
    BrowserType(
        jsName = "NotificationOptions",
        kotlinFqn = "web.notifications.NotificationOptions",
    ),
    BrowserType(
        jsName = "NotificationPermission",
        kotlinFqn = "web.notifications.NotificationPermission",
    ),
    BrowserType(
        jsName = "NotificationPermissionCallback",
        kotlinFqn = "web.notifications.NotificationPermissionCallback",
    ),
    BrowserType(
        jsName = "OES_draw_buffers_indexed",
        kotlinFqn = "web.gl.OES_draw_buffers_indexed",
    ),
    BrowserType(
        jsName = "OES_element_index_uint",
        kotlinFqn = "web.gl.OES_element_index_uint",
    ),
    BrowserType(
        jsName = "OES_fbo_render_mipmap",
        kotlinFqn = "web.gl.OES_fbo_render_mipmap",
    ),
    BrowserType(
        jsName = "OES_standard_derivatives",
        kotlinFqn = "web.gl.OES_standard_derivatives",
    ),
    BrowserType(
        jsName = "OES_texture_float",
        kotlinFqn = "web.gl.OES_texture_float",
    ),
    BrowserType(
        jsName = "OES_texture_float_linear",
        kotlinFqn = "web.gl.OES_texture_float_linear",
    ),
    BrowserType(
        jsName = "OES_texture_half_float",
        kotlinFqn = "web.gl.OES_texture_half_float",
    ),
    BrowserType(
        jsName = "OES_texture_half_float_linear",
        kotlinFqn = "web.gl.OES_texture_half_float_linear",
    ),
    BrowserType(
        jsName = "OES_vertex_array_object",
        kotlinFqn = "web.gl.OES_vertex_array_object",
    ),
    BrowserType(
        jsName = "OVR_multiview2",
        kotlinFqn = "web.gl.OVR_multiview2",
    ),
    BrowserType(
        jsName = "Observable",
        kotlinFqn = "web.observable.Observable",
    ),
    BrowserType(
        jsName = "ObservableEventListenerOptions",
        kotlinFqn = "web.events.ObservableEventListenerOptions",
    ),
    BrowserType(
        jsName = "ObservableInspector",
        kotlinFqn = "web.observable.ObservableInspector",
    ),
    BrowserType(
        jsName = "OfflineAudioCompletionEvent",
        kotlinFqn = "web.audio.OfflineAudioCompletionEvent",
    ),
    BrowserType(
        jsName = "OfflineAudioCompletionEventInit",
        kotlinFqn = "web.audio.OfflineAudioCompletionEventInit",
    ),
    BrowserType(
        jsName = "OfflineAudioContext",
        kotlinFqn = "web.audio.OfflineAudioContext",
    ),
    BrowserType(
        jsName = "OfflineAudioContextOptions",
        kotlinFqn = "web.audio.OfflineAudioContextOptions",
    ),
    BrowserType(
        jsName = "OffscreenCanvas",
        kotlinFqn = "web.canvas.OffscreenCanvas",
    ),
    BrowserType(
        jsName = "OffscreenCanvasRenderingContext2D",
        kotlinFqn = "web.canvas.OffscreenCanvasRenderingContext2D",
    ),
    BrowserType(
        jsName = "OffscreenRenderingContext",
        kotlinFqn = "web.rendering.OffscreenRenderingContext",
    ),
    BrowserType(
        jsName = "OpenFilePickerOptions",
        kotlinFqn = "web.fs.OpenFilePickerOptions",
    ),
    BrowserType(
        jsName = "Option",
        kotlinFqn = "web.html.Option",
    ),
    BrowserType(
        jsName = "OptionalEffectTiming",
        kotlinFqn = "web.animations.OptionalEffectTiming",
    ),
    BrowserType(
        jsName = "OpusBitstreamFormat",
        kotlinFqn = "web.codecs.OpusBitstreamFormat",
    ),
    BrowserType(
        jsName = "OpusEncoderConfig",
        kotlinFqn = "web.codecs.OpusEncoderConfig",
    ),
    BrowserType(
        jsName = "OrientationLockType",
        kotlinFqn = "web.screen.OrientationLockType",
    ),
    BrowserType(
        jsName = "OrientationType",
        kotlinFqn = "web.screen.OrientationType",
    ),
    BrowserType(
        jsName = "Origin",
        kotlinFqn = "web.origin.Origin",
    ),
    BrowserType(
        jsName = "OriginSource",
        kotlinFqn = "web.origin.OriginSource",
    ),
    BrowserType(
        jsName = "OscillatorNode",
        kotlinFqn = "web.audio.OscillatorNode",
    ),
    BrowserType(
        jsName = "OscillatorOptions",
        kotlinFqn = "web.audio.OscillatorOptions",
    ),
    BrowserType(
        jsName = "OscillatorType",
        kotlinFqn = "web.audio.OscillatorType",
    ),
    BrowserType(
        jsName = "OverSampleType",
        kotlinFqn = "web.audio.OverSampleType",
    ),
    BrowserType(
        jsName = "OverconstrainedError",
        kotlinFqn = "web.mediastreams.OverconstrainedError",
    ),
    BrowserType(
        jsName = "PageRevealEvent",
        kotlinFqn = "web.viewtransition.PageRevealEvent",
    ),
    BrowserType(
        jsName = "PageRevealEventInit",
        kotlinFqn = "web.viewtransition.PageRevealEventInit",
    ),
    BrowserType(
        jsName = "PageSwapEvent",
        kotlinFqn = "web.viewtransition.PageSwapEvent",
    ),
    BrowserType(
        jsName = "PageSwapEventInit",
        kotlinFqn = "web.viewtransition.PageSwapEventInit",
    ),
    BrowserType(
        jsName = "PageTransitionEvent",
        kotlinFqn = "web.history.PageTransitionEvent",
    ),
    BrowserType(
        jsName = "PageTransitionEventInit",
        kotlinFqn = "web.history.PageTransitionEventInit",
    ),
    BrowserType(
        jsName = "Paint",
        kotlinFqn = "web.css.painting.Paint",
    ),
    BrowserType(
        jsName = "PaintName",
        kotlinFqn = "web.css.painting.PaintName",
    ),
    BrowserType(
        jsName = "PaintRenderingContext2D",
        kotlinFqn = "web.css.painting.PaintRenderingContext2D",
    ),
    BrowserType(
        jsName = "PaintRenderingContext2DSettings",
        kotlinFqn = "web.css.painting.PaintRenderingContext2DSettings",
    ),
    BrowserType(
        jsName = "PaintSize",
        kotlinFqn = "web.css.painting.PaintSize",
    ),
    BrowserType(
        jsName = "PaintTimingMixin",
        kotlinFqn = "web.performance.PaintTimingMixin",
    ),
    BrowserType(
        jsName = "PaintWorkletGlobalScope",
        kotlinFqn = "web.css.painting.PaintWorkletGlobalScope",
    ),
    BrowserType(
        jsName = "PaintWorkletModule",
        kotlinFqn = "web.css.painting.PaintWorkletModule",
    ),
    BrowserType(
        jsName = "PannerNode",
        kotlinFqn = "web.audio.PannerNode",
    ),
    BrowserType(
        jsName = "PannerOptions",
        kotlinFqn = "web.audio.PannerOptions",
    ),
    BrowserType(
        jsName = "PanningModelType",
        kotlinFqn = "web.audio.PanningModelType",
    ),
    BrowserType(
        jsName = "ParentNode",
        kotlinFqn = "web.dom.ParentNode",
    ),
    BrowserType(
        jsName = "ParityType",
        kotlinFqn = "web.serial.ParityType",
    ),
    BrowserType(
        jsName = "ParseHTMLUnsafeOptions",
        kotlinFqn = "web.html.ParseHTMLUnsafeOptions",
    ),
    BrowserType(
        jsName = "Path2D",
        kotlinFqn = "web.canvas.Path2D",
    ),
    BrowserType(
        jsName = "PayerErrors",
        kotlinFqn = "web.payment.PayerErrors",
    ),
    BrowserType(
        jsName = "PaymentAddress",
        kotlinFqn = "web.payment.PaymentAddress",
    ),
    BrowserType(
        jsName = "PaymentComplete",
        kotlinFqn = "web.payment.PaymentComplete",
    ),
    BrowserType(
        jsName = "PaymentCurrencyAmount",
        kotlinFqn = "web.payment.PaymentCurrencyAmount",
    ),
    BrowserType(
        jsName = "PaymentDetailsBase",
        kotlinFqn = "web.payment.PaymentDetailsBase",
    ),
    BrowserType(
        jsName = "PaymentDetailsInit",
        kotlinFqn = "web.payment.PaymentDetailsInit",
    ),
    BrowserType(
        jsName = "PaymentDetailsModifier",
        kotlinFqn = "web.payment.PaymentDetailsModifier",
    ),
    BrowserType(
        jsName = "PaymentDetailsUpdate",
        kotlinFqn = "web.payment.PaymentDetailsUpdate",
    ),
    BrowserType(
        jsName = "PaymentItem",
        kotlinFqn = "web.payment.PaymentItem",
    ),
    BrowserType(
        jsName = "PaymentMethodChangeEvent",
        kotlinFqn = "web.payment.PaymentMethodChangeEvent",
    ),
    BrowserType(
        jsName = "PaymentMethodChangeEventInit",
        kotlinFqn = "web.payment.PaymentMethodChangeEventInit",
    ),
    BrowserType(
        jsName = "PaymentMethodData",
        kotlinFqn = "web.payment.PaymentMethodData",
    ),
    BrowserType(
        jsName = "PaymentOptions",
        kotlinFqn = "web.payment.PaymentOptions",
    ),
    BrowserType(
        jsName = "PaymentRequest",
        kotlinFqn = "web.payment.PaymentRequest",
    ),
    BrowserType(
        jsName = "PaymentRequestUpdateEvent",
        kotlinFqn = "web.payment.PaymentRequestUpdateEvent",
    ),
    BrowserType(
        jsName = "PaymentRequestUpdateEventInit",
        kotlinFqn = "web.payment.PaymentRequestUpdateEventInit",
    ),
    BrowserType(
        jsName = "PaymentResponse",
        kotlinFqn = "web.payment.PaymentResponse",
    ),
    BrowserType(
        jsName = "PaymentShippingOption",
        kotlinFqn = "web.payment.PaymentShippingOption",
    ),
    BrowserType(
        jsName = "PaymentShippingType",
        kotlinFqn = "web.payment.PaymentShippingType",
    ),
    BrowserType(
        jsName = "PaymentValidationErrors",
        kotlinFqn = "web.payment.PaymentValidationErrors",
    ),
    BrowserType(
        jsName = "Pbkdf2Params",
        kotlinFqn = "web.crypto.Pbkdf2Params",
    ),
    BrowserType(
        jsName = "Performance",
        kotlinFqn = "web.performance.Performance",
    ),
    BrowserType(
        jsName = "PerformanceEntry",
        kotlinFqn = "web.performance.PerformanceEntry",
    ),
    BrowserType(
        jsName = "PerformanceEntryList",
        kotlinFqn = "web.performance.PerformanceEntryList",
    ),
    BrowserType(
        jsName = "PerformanceEventTiming",
        kotlinFqn = "web.performance.PerformanceEventTiming",
    ),
    BrowserType(
        jsName = "PerformanceMark",
        kotlinFqn = "web.performance.PerformanceMark",
    ),
    BrowserType(
        jsName = "PerformanceMarkOptions",
        kotlinFqn = "web.performance.PerformanceMarkOptions",
    ),
    BrowserType(
        jsName = "PerformanceMeasure",
        kotlinFqn = "web.performance.PerformanceMeasure",
    ),
    BrowserType(
        jsName = "PerformanceMeasureOptions",
        kotlinFqn = "web.performance.PerformanceMeasureOptions",
    ),
    BrowserType(
        jsName = "PerformanceNavigationTiming",
        kotlinFqn = "web.performance.PerformanceNavigationTiming",
    ),
    BrowserType(
        jsName = "PerformanceObserver",
        kotlinFqn = "web.performance.PerformanceObserver",
    ),
    BrowserType(
        jsName = "PerformanceObserverCallback",
        kotlinFqn = "web.performance.PerformanceObserverCallback",
    ),
    BrowserType(
        jsName = "PerformanceObserverEntryList",
        kotlinFqn = "web.performance.PerformanceObserverEntryList",
    ),
    BrowserType(
        jsName = "PerformanceObserverInit",
        kotlinFqn = "web.performance.PerformanceObserverInit",
    ),
    BrowserType(
        jsName = "PerformancePaintTiming",
        kotlinFqn = "web.performance.PerformancePaintTiming",
    ),
    BrowserType(
        jsName = "PerformanceResourceTiming",
        kotlinFqn = "web.performance.PerformanceResourceTiming",
    ),
    BrowserType(
        jsName = "PerformanceServerTiming",
        kotlinFqn = "web.performance.PerformanceServerTiming",
    ),
    BrowserType(
        jsName = "PeriodicWave",
        kotlinFqn = "web.audio.PeriodicWave",
    ),
    BrowserType(
        jsName = "PeriodicWaveConstraints",
        kotlinFqn = "web.audio.PeriodicWaveConstraints",
    ),
    BrowserType(
        jsName = "PeriodicWaveOptions",
        kotlinFqn = "web.audio.PeriodicWaveOptions",
    ),
    BrowserType(
        jsName = "PermissionDescriptor",
        kotlinFqn = "web.permissions.PermissionDescriptor",
    ),
    BrowserType(
        jsName = "PermissionName",
        kotlinFqn = "web.permissions.PermissionName",
    ),
    BrowserType(
        jsName = "PermissionState",
        kotlinFqn = "web.permissions.PermissionState",
    ),
    BrowserType(
        jsName = "PermissionStatus",
        kotlinFqn = "web.permissions.PermissionStatus",
    ),
    BrowserType(
        jsName = "Permissions",
        kotlinFqn = "web.permissions.Permissions",
    ),
    BrowserType(
        jsName = "PhotoCapabilities",
        kotlinFqn = "web.imagecapture.PhotoCapabilities",
    ),
    BrowserType(
        jsName = "PhotoSettings",
        kotlinFqn = "web.imagecapture.PhotoSettings",
    ),
    BrowserType(
        jsName = "PictureInPictureEvent",
        kotlinFqn = "web.pip.PictureInPictureEvent",
    ),
    BrowserType(
        jsName = "PictureInPictureEventInit",
        kotlinFqn = "web.pip.PictureInPictureEventInit",
    ),
    BrowserType(
        jsName = "PictureInPictureWindow",
        kotlinFqn = "web.pip.PictureInPictureWindow",
    ),
    BrowserType(
        jsName = "PlaneLayout",
        kotlinFqn = "web.codecs.PlaneLayout",
    ),
    BrowserType(
        jsName = "PlaybackDirection",
        kotlinFqn = "web.animations.PlaybackDirection",
    ),
    BrowserType(
        jsName = "PointerEvent",
        kotlinFqn = "web.pointer.PointerEvent",
    ),
    BrowserType(
        jsName = "PointerEventInit",
        kotlinFqn = "web.pointer.PointerEventInit",
    ),
    BrowserType(
        jsName = "PointerLockOptions",
        kotlinFqn = "web.dom.PointerLockOptions",
    ),
    BrowserType(
        jsName = "PopStateEvent",
        kotlinFqn = "web.history.PopStateEvent",
    ),
    BrowserType(
        jsName = "PopStateEventInit",
        kotlinFqn = "web.history.PopStateEventInit",
    ),
    BrowserType(
        jsName = "Popover",
        kotlinFqn = "web.popover.Popover",
    ),
    BrowserType(
        jsName = "PopoverTargetAction",
        kotlinFqn = "web.popover.PopoverTargetAction",
    ),
    BrowserType(
        jsName = "PopoverTargetAttributes",
        kotlinFqn = "web.popover.PopoverTargetAttributes",
    ),
    BrowserType(
        jsName = "PositionAlignSetting",
        kotlinFqn = "web.vtt.PositionAlignSetting",
    ),
    BrowserType(
        jsName = "PositionCallback",
        kotlinFqn = "web.geolocation.PositionCallback",
    ),
    BrowserType(
        jsName = "PositionErrorCallback",
        kotlinFqn = "web.geolocation.PositionErrorCallback",
    ),
    BrowserType(
        jsName = "PositionOptions",
        kotlinFqn = "web.geolocation.PositionOptions",
    ),
    BrowserType(
        jsName = "PredefinedColorSpace",
        kotlinFqn = "web.images.PredefinedColorSpace",
    ),
    BrowserType(
        jsName = "Preload",
        kotlinFqn = "web.html.Preload",
    ),
    BrowserType(
        jsName = "PremultiplyAlpha",
        kotlinFqn = "web.images.PremultiplyAlpha",
    ),
    BrowserType(
        jsName = "Presentation",
        kotlinFqn = "web.presentation.Presentation",
    ),
    BrowserType(
        jsName = "PresentationAvailability",
        kotlinFqn = "web.presentation.PresentationAvailability",
    ),
    BrowserType(
        jsName = "PresentationConnection",
        kotlinFqn = "web.presentation.PresentationConnection",
    ),
    BrowserType(
        jsName = "PresentationConnectionAvailableEvent",
        kotlinFqn = "web.presentation.PresentationConnectionAvailableEvent",
    ),
    BrowserType(
        jsName = "PresentationConnectionAvailableEventInit",
        kotlinFqn = "web.presentation.PresentationConnectionAvailableEventInit",
    ),
    BrowserType(
        jsName = "PresentationConnectionCloseEvent",
        kotlinFqn = "web.presentation.PresentationConnectionCloseEvent",
    ),
    BrowserType(
        jsName = "PresentationConnectionCloseEventInit",
        kotlinFqn = "web.presentation.PresentationConnectionCloseEventInit",
    ),
    BrowserType(
        jsName = "PresentationConnectionCloseReason",
        kotlinFqn = "web.presentation.PresentationConnectionCloseReason",
    ),
    BrowserType(
        jsName = "PresentationConnectionList",
        kotlinFqn = "web.presentation.PresentationConnectionList",
    ),
    BrowserType(
        jsName = "PresentationConnectionState",
        kotlinFqn = "web.presentation.PresentationConnectionState",
    ),
    BrowserType(
        jsName = "PresentationReceiver",
        kotlinFqn = "web.presentation.PresentationReceiver",
    ),
    BrowserType(
        jsName = "PresentationRequest",
        kotlinFqn = "web.presentation.PresentationRequest",
    ),
    BrowserType(
        jsName = "PresentationStyle",
        kotlinFqn = "web.clipboard.PresentationStyle",
    ),
    BrowserType(
        jsName = "PrimitiveHint",
        kotlinFqn = "js.primitive.PrimitiveHint",
    ),
    BrowserType(
        jsName = "ProcessingInstruction",
        kotlinFqn = "web.dom.ProcessingInstruction",
    ),
    BrowserType(
        jsName = "Profiler",
        kotlinFqn = "web.profiler.Profiler",
    ),
    BrowserType(
        jsName = "ProfilerFrame",
        kotlinFqn = "web.profiler.ProfilerFrame",
    ),
    BrowserType(
        jsName = "ProfilerInitOptions",
        kotlinFqn = "web.profiler.ProfilerInitOptions",
    ),
    BrowserType(
        jsName = "ProfilerResource",
        kotlinFqn = "web.profiler.ProfilerResource",
    ),
    BrowserType(
        jsName = "ProfilerSample",
        kotlinFqn = "web.profiler.ProfilerSample",
    ),
    BrowserType(
        jsName = "ProfilerStack",
        kotlinFqn = "web.profiler.ProfilerStack",
    ),
    BrowserType(
        jsName = "ProfilerTrace",
        kotlinFqn = "web.profiler.ProfilerTrace",
    ),
    BrowserType(
        jsName = "ProgressEvent",
        kotlinFqn = "web.events.ProgressEvent",
    ),
    BrowserType(
        jsName = "ProgressEventInit",
        kotlinFqn = "web.events.ProgressEventInit",
    ),
    BrowserType(
        jsName = "Promise",
        kotlinFqn = "js.promise.Promise",
    ),
    BrowserType(
        jsName = "PromiseFulfilledResult",
        kotlinFqn = "js.promise.PromiseFulfilledResult",
    ),
    BrowserType(
        jsName = "PromiseLike",
        kotlinFqn = "js.promise.PromiseLike",
    ),
    BrowserType(
        jsName = "PromiseReject",
        kotlinFqn = "js.promise.PromiseReject",
    ),
    BrowserType(
        jsName = "PromiseRejectedResult",
        kotlinFqn = "js.promise.PromiseRejectedResult",
    ),
    BrowserType(
        jsName = "PromiseRejectionEvent",
        kotlinFqn = "web.promise.PromiseRejectionEvent",
    ),
    BrowserType(
        jsName = "PromiseRejectionEventInit",
        kotlinFqn = "web.promise.PromiseRejectionEventInit",
    ),
    BrowserType(
        jsName = "PromiseResolve",
        kotlinFqn = "js.promise.PromiseResolve",
    ),
    BrowserType(
        jsName = "PromiseResult",
        kotlinFqn = "js.promise.PromiseResult",
    ),
    BrowserType(
        jsName = "PromiseSettledResult",
        kotlinFqn = "js.promise.PromiseSettledResult",
    ),
    BrowserType(
        jsName = "PromiseSettledStatus",
        kotlinFqn = "js.promise.PromiseSettledStatus",
    ),
    BrowserType(
        jsName = "PromiseWithResolvers",
        kotlinFqn = "js.promise.PromiseWithResolvers",
    ),
    BrowserType(
        jsName = "PropertyDefinition",
        kotlinFqn = "web.cssom.PropertyDefinition",
    ),
    BrowserType(
        jsName = "PropertyDescriptorMap",
        kotlinFqn = "js.objects.PropertyDescriptorMap",
    ),
    BrowserType(
        jsName = "PropertyIndexedKeyframes",
        kotlinFqn = "web.animations.PropertyIndexedKeyframes",
    ),
    BrowserType(
        jsName = "PropertyKey",
        kotlinFqn = "js.objects.PropertyKey",
    ),
    BrowserType(
        jsName = "Proxy",
        kotlinFqn = "js.reflect.Proxy",
    ),
    BrowserType(
        jsName = "ProxyHandler",
        kotlinFqn = "js.reflect.ProxyHandler",
    ),
    BrowserType(
        jsName = "PublicKeyCredential",
        kotlinFqn = "web.authn.PublicKeyCredential",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialClientCapabilities",
        kotlinFqn = "web.authn.PublicKeyCredentialClientCapabilities",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialCreationOptions",
        kotlinFqn = "web.authn.PublicKeyCredentialCreationOptions",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialCreationOptionsJSON",
        kotlinFqn = "web.authn.PublicKeyCredentialCreationOptionsJSON",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialDescriptor",
        kotlinFqn = "web.authn.PublicKeyCredentialDescriptor",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialDescriptorJSON",
        kotlinFqn = "web.authn.PublicKeyCredentialDescriptorJSON",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialEntity",
        kotlinFqn = "web.authn.PublicKeyCredentialEntity",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialParameters",
        kotlinFqn = "web.authn.PublicKeyCredentialParameters",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialRequestOptions",
        kotlinFqn = "web.authn.PublicKeyCredentialRequestOptions",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialRequestOptionsJSON",
        kotlinFqn = "web.authn.PublicKeyCredentialRequestOptionsJSON",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialRpEntity",
        kotlinFqn = "web.authn.PublicKeyCredentialRpEntity",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialType",
        kotlinFqn = "web.authn.PublicKeyCredentialType",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialUserEntity",
        kotlinFqn = "web.authn.PublicKeyCredentialUserEntity",
    ),
    BrowserType(
        jsName = "PublicKeyCredentialUserEntityJSON",
        kotlinFqn = "web.authn.PublicKeyCredentialUserEntityJSON",
    ),
    BrowserType(
        jsName = "PushEncryptionKeyName",
        kotlinFqn = "web.push.PushEncryptionKeyName",
    ),
    BrowserType(
        jsName = "PushEvent",
        kotlinFqn = "web.push.PushEvent",
    ),
    BrowserType(
        jsName = "PushEventInit",
        kotlinFqn = "web.push.PushEventInit",
    ),
    BrowserType(
        jsName = "PushManager",
        kotlinFqn = "web.push.PushManager",
    ),
    BrowserType(
        jsName = "PushManagerAttribute",
        kotlinFqn = "web.push.PushManagerAttribute",
    ),
    BrowserType(
        jsName = "PushMessageData",
        kotlinFqn = "web.push.PushMessageData",
    ),
    BrowserType(
        jsName = "PushMessageDataInit",
        kotlinFqn = "web.push.PushMessageDataInit",
    ),
    BrowserType(
        jsName = "PushSubscription",
        kotlinFqn = "web.push.PushSubscription",
    ),
    BrowserType(
        jsName = "PushSubscriptionChangeEvent",
        kotlinFqn = "web.push.PushSubscriptionChangeEvent",
    ),
    BrowserType(
        jsName = "PushSubscriptionChangeEventInit",
        kotlinFqn = "web.push.PushSubscriptionChangeEventInit",
    ),
    BrowserType(
        jsName = "PushSubscriptionJSON",
        kotlinFqn = "web.push.PushSubscriptionJSON",
    ),
    BrowserType(
        jsName = "PushSubscriptionOptions",
        kotlinFqn = "web.push.PushSubscriptionOptions",
    ),
    BrowserType(
        jsName = "PushSubscriptionOptionsInit",
        kotlinFqn = "web.push.PushSubscriptionOptionsInit",
    ),
    BrowserType(
        jsName = "QueuingStrategy",
        kotlinFqn = "web.streams.QueuingStrategy",
    ),
    BrowserType(
        jsName = "QueuingStrategyInit",
        kotlinFqn = "web.streams.QueuingStrategyInit",
    ),
    BrowserType(
        jsName = "QueuingStrategySize",
        kotlinFqn = "web.streams.QueuingStrategySize",
    ),
    BrowserType(
        jsName = "QuotaExceededError",
        kotlinFqn = "web.errors.QuotaExceededError",
    ),
    BrowserType(
        jsName = "QuotaExceededErrorOptions",
        kotlinFqn = "web.errors.QuotaExceededErrorOptions",
    ),
    BrowserType(
        jsName = "RTCAnswerOptions",
        kotlinFqn = "web.rtc.RTCAnswerOptions",
    ),
    BrowserType(
        jsName = "RTCBundlePolicy",
        kotlinFqn = "web.rtc.RTCBundlePolicy",
    ),
    BrowserType(
        jsName = "RTCCertificate",
        kotlinFqn = "web.rtc.RTCCertificate",
    ),
    BrowserType(
        jsName = "RTCCertificateExpiration",
        kotlinFqn = "web.rtc.RTCCertificateExpiration",
    ),
    BrowserType(
        jsName = "RTCConfiguration",
        kotlinFqn = "web.rtc.RTCConfiguration",
    ),
    BrowserType(
        jsName = "RTCDTMFSender",
        kotlinFqn = "web.rtc.RTCDTMFSender",
    ),
    BrowserType(
        jsName = "RTCDTMFToneChangeEvent",
        kotlinFqn = "web.rtc.RTCDTMFToneChangeEvent",
    ),
    BrowserType(
        jsName = "RTCDTMFToneChangeEventInit",
        kotlinFqn = "web.rtc.RTCDTMFToneChangeEventInit",
    ),
    BrowserType(
        jsName = "RTCDataChannel",
        kotlinFqn = "web.rtc.RTCDataChannel",
    ),
    BrowserType(
        jsName = "RTCDataChannelEvent",
        kotlinFqn = "web.rtc.RTCDataChannelEvent",
    ),
    BrowserType(
        jsName = "RTCDataChannelEventInit",
        kotlinFqn = "web.rtc.RTCDataChannelEventInit",
    ),
    BrowserType(
        jsName = "RTCDataChannelInit",
        kotlinFqn = "web.rtc.RTCDataChannelInit",
    ),
    BrowserType(
        jsName = "RTCDataChannelState",
        kotlinFqn = "web.rtc.RTCDataChannelState",
    ),
    BrowserType(
        jsName = "RTCDegradationPreference",
        kotlinFqn = "web.rtc.RTCDegradationPreference",
    ),
    BrowserType(
        jsName = "RTCDtlsFingerprint",
        kotlinFqn = "web.rtc.RTCDtlsFingerprint",
    ),
    BrowserType(
        jsName = "RTCDtlsRole",
        kotlinFqn = "web.rtc.RTCDtlsRole",
    ),
    BrowserType(
        jsName = "RTCDtlsTransport",
        kotlinFqn = "web.rtc.RTCDtlsTransport",
    ),
    BrowserType(
        jsName = "RTCDtlsTransportState",
        kotlinFqn = "web.rtc.RTCDtlsTransportState",
    ),
    BrowserType(
        jsName = "RTCEncodedAudioFrame",
        kotlinFqn = "web.rtc.RTCEncodedAudioFrame",
    ),
    BrowserType(
        jsName = "RTCEncodedAudioFrameMetadata",
        kotlinFqn = "web.rtc.RTCEncodedAudioFrameMetadata",
    ),
    BrowserType(
        jsName = "RTCEncodedFrameMetadata",
        kotlinFqn = "web.rtc.RTCEncodedFrameMetadata",
    ),
    BrowserType(
        jsName = "RTCEncodedVideoFrame",
        kotlinFqn = "web.rtc.RTCEncodedVideoFrame",
    ),
    BrowserType(
        jsName = "RTCEncodedVideoFrameMetadata",
        kotlinFqn = "web.rtc.RTCEncodedVideoFrameMetadata",
    ),
    BrowserType(
        jsName = "RTCError",
        kotlinFqn = "web.rtc.RTCError",
    ),
    BrowserType(
        jsName = "RTCErrorDetailType",
        kotlinFqn = "web.rtc.RTCErrorDetailType",
    ),
    BrowserType(
        jsName = "RTCErrorEvent",
        kotlinFqn = "web.rtc.RTCErrorEvent",
    ),
    BrowserType(
        jsName = "RTCErrorEventInit",
        kotlinFqn = "web.rtc.RTCErrorEventInit",
    ),
    BrowserType(
        jsName = "RTCErrorInit",
        kotlinFqn = "web.rtc.RTCErrorInit",
    ),
    BrowserType(
        jsName = "RTCIceCandidate",
        kotlinFqn = "web.rtc.RTCIceCandidate",
    ),
    BrowserType(
        jsName = "RTCIceCandidateInit",
        kotlinFqn = "web.rtc.RTCIceCandidateInit",
    ),
    BrowserType(
        jsName = "RTCIceCandidatePair",
        kotlinFqn = "web.rtc.RTCIceCandidatePair",
    ),
    BrowserType(
        jsName = "RTCIceCandidatePairStats",
        kotlinFqn = "web.rtc.RTCIceCandidatePairStats",
    ),
    BrowserType(
        jsName = "RTCIceCandidateType",
        kotlinFqn = "web.rtc.RTCIceCandidateType",
    ),
    BrowserType(
        jsName = "RTCIceComponent",
        kotlinFqn = "web.rtc.RTCIceComponent",
    ),
    BrowserType(
        jsName = "RTCIceConnectionState",
        kotlinFqn = "web.rtc.RTCIceConnectionState",
    ),
    BrowserType(
        jsName = "RTCIceGathererState",
        kotlinFqn = "web.rtc.RTCIceGathererState",
    ),
    BrowserType(
        jsName = "RTCIceGatheringState",
        kotlinFqn = "web.rtc.RTCIceGatheringState",
    ),
    BrowserType(
        jsName = "RTCIceProtocol",
        kotlinFqn = "web.rtc.RTCIceProtocol",
    ),
    BrowserType(
        jsName = "RTCIceRole",
        kotlinFqn = "web.rtc.RTCIceRole",
    ),
    BrowserType(
        jsName = "RTCIceServer",
        kotlinFqn = "web.rtc.RTCIceServer",
    ),
    BrowserType(
        jsName = "RTCIceTcpCandidateType",
        kotlinFqn = "web.rtc.RTCIceTcpCandidateType",
    ),
    BrowserType(
        jsName = "RTCIceTransport",
        kotlinFqn = "web.rtc.RTCIceTransport",
    ),
    BrowserType(
        jsName = "RTCIceTransportPolicy",
        kotlinFqn = "web.rtc.RTCIceTransportPolicy",
    ),
    BrowserType(
        jsName = "RTCIceTransportState",
        kotlinFqn = "web.rtc.RTCIceTransportState",
    ),
    BrowserType(
        jsName = "RTCInboundRtpStreamStats",
        kotlinFqn = "web.rtc.RTCInboundRtpStreamStats",
    ),
    BrowserType(
        jsName = "RTCLocalIceCandidateInit",
        kotlinFqn = "web.rtc.RTCLocalIceCandidateInit",
    ),
    BrowserType(
        jsName = "RTCLocalSessionDescriptionInit",
        kotlinFqn = "web.rtc.RTCLocalSessionDescriptionInit",
    ),
    BrowserType(
        jsName = "RTCOfferAnswerOptions",
        kotlinFqn = "web.rtc.RTCOfferAnswerOptions",
    ),
    BrowserType(
        jsName = "RTCOfferOptions",
        kotlinFqn = "web.rtc.RTCOfferOptions",
    ),
    BrowserType(
        jsName = "RTCOutboundRtpStreamStats",
        kotlinFqn = "web.rtc.RTCOutboundRtpStreamStats",
    ),
    BrowserType(
        jsName = "RTCPeerConnection",
        kotlinFqn = "web.rtc.RTCPeerConnection",
    ),
    BrowserType(
        jsName = "RTCPeerConnectionErrorCallback",
        kotlinFqn = "web.rtc.RTCPeerConnectionErrorCallback",
    ),
    BrowserType(
        jsName = "RTCPeerConnectionIceErrorEvent",
        kotlinFqn = "web.rtc.RTCPeerConnectionIceErrorEvent",
    ),
    BrowserType(
        jsName = "RTCPeerConnectionIceErrorEventInit",
        kotlinFqn = "web.rtc.RTCPeerConnectionIceErrorEventInit",
    ),
    BrowserType(
        jsName = "RTCPeerConnectionIceEvent",
        kotlinFqn = "web.rtc.RTCPeerConnectionIceEvent",
    ),
    BrowserType(
        jsName = "RTCPeerConnectionIceEventInit",
        kotlinFqn = "web.rtc.RTCPeerConnectionIceEventInit",
    ),
    BrowserType(
        jsName = "RTCPeerConnectionState",
        kotlinFqn = "web.rtc.RTCPeerConnectionState",
    ),
    BrowserType(
        jsName = "RTCPriorityType",
        kotlinFqn = "web.rtc.RTCPriorityType",
    ),
    BrowserType(
        jsName = "RTCQualityLimitationReason",
        kotlinFqn = "web.rtc.RTCQualityLimitationReason",
    ),
    BrowserType(
        jsName = "RTCReceivedRtpStreamStats",
        kotlinFqn = "web.rtc.RTCReceivedRtpStreamStats",
    ),
    BrowserType(
        jsName = "RTCRtcpMuxPolicy",
        kotlinFqn = "web.rtc.RTCRtcpMuxPolicy",
    ),
    BrowserType(
        jsName = "RTCRtcpParameters",
        kotlinFqn = "web.rtc.RTCRtcpParameters",
    ),
    BrowserType(
        jsName = "RTCRtpCapabilities",
        kotlinFqn = "web.rtc.RTCRtpCapabilities",
    ),
    BrowserType(
        jsName = "RTCRtpCodec",
        kotlinFqn = "web.rtc.RTCRtpCodec",
    ),
    BrowserType(
        jsName = "RTCRtpCodecParameters",
        kotlinFqn = "web.rtc.RTCRtpCodecParameters",
    ),
    BrowserType(
        jsName = "RTCRtpCodingParameters",
        kotlinFqn = "web.rtc.RTCRtpCodingParameters",
    ),
    BrowserType(
        jsName = "RTCRtpContributingSource",
        kotlinFqn = "web.rtc.RTCRtpContributingSource",
    ),
    BrowserType(
        jsName = "RTCRtpEncodingParameters",
        kotlinFqn = "web.rtc.RTCRtpEncodingParameters",
    ),
    BrowserType(
        jsName = "RTCRtpHeaderExtensionCapability",
        kotlinFqn = "web.rtc.RTCRtpHeaderExtensionCapability",
    ),
    BrowserType(
        jsName = "RTCRtpHeaderExtensionParameters",
        kotlinFqn = "web.rtc.RTCRtpHeaderExtensionParameters",
    ),
    BrowserType(
        jsName = "RTCRtpParameters",
        kotlinFqn = "web.rtc.RTCRtpParameters",
    ),
    BrowserType(
        jsName = "RTCRtpReceiveParameters",
        kotlinFqn = "web.rtc.RTCRtpReceiveParameters",
    ),
    BrowserType(
        jsName = "RTCRtpReceiver",
        kotlinFqn = "web.rtc.RTCRtpReceiver",
    ),
    BrowserType(
        jsName = "RTCRtpReceiverTransform",
        kotlinFqn = "web.rtc.RTCRtpReceiverTransform",
    ),
    BrowserType(
        jsName = "RTCRtpScriptTransform",
        kotlinFqn = "web.rtc.RTCRtpScriptTransform",
    ),
    BrowserType(
        jsName = "RTCRtpScriptTransformer",
        kotlinFqn = "web.rtc.RTCRtpScriptTransformer",
    ),
    BrowserType(
        jsName = "RTCRtpSendParameters",
        kotlinFqn = "web.rtc.RTCRtpSendParameters",
    ),
    BrowserType(
        jsName = "RTCRtpSender",
        kotlinFqn = "web.rtc.RTCRtpSender",
    ),
    BrowserType(
        jsName = "RTCRtpSenderTransform",
        kotlinFqn = "web.rtc.RTCRtpSenderTransform",
    ),
    BrowserType(
        jsName = "RTCRtpStreamStats",
        kotlinFqn = "web.rtc.RTCRtpStreamStats",
    ),
    BrowserType(
        jsName = "RTCRtpSynchronizationSource",
        kotlinFqn = "web.rtc.RTCRtpSynchronizationSource",
    ),
    BrowserType(
        jsName = "RTCRtpTransceiver",
        kotlinFqn = "web.rtc.RTCRtpTransceiver",
    ),
    BrowserType(
        jsName = "RTCRtpTransceiverDirection",
        kotlinFqn = "web.rtc.RTCRtpTransceiverDirection",
    ),
    BrowserType(
        jsName = "RTCRtpTransceiverInit",
        kotlinFqn = "web.rtc.RTCRtpTransceiverInit",
    ),
    BrowserType(
        jsName = "RTCSctpTransport",
        kotlinFqn = "web.rtc.RTCSctpTransport",
    ),
    BrowserType(
        jsName = "RTCSctpTransportState",
        kotlinFqn = "web.rtc.RTCSctpTransportState",
    ),
    BrowserType(
        jsName = "RTCSdpType",
        kotlinFqn = "web.rtc.RTCSdpType",
    ),
    BrowserType(
        jsName = "RTCSentRtpStreamStats",
        kotlinFqn = "web.rtc.RTCSentRtpStreamStats",
    ),
    BrowserType(
        jsName = "RTCSessionDescription",
        kotlinFqn = "web.rtc.RTCSessionDescription",
    ),
    BrowserType(
        jsName = "RTCSessionDescriptionCallback",
        kotlinFqn = "web.rtc.RTCSessionDescriptionCallback",
    ),
    BrowserType(
        jsName = "RTCSessionDescriptionInit",
        kotlinFqn = "web.rtc.RTCSessionDescriptionInit",
    ),
    BrowserType(
        jsName = "RTCSetParameterOptions",
        kotlinFqn = "web.rtc.RTCSetParameterOptions",
    ),
    BrowserType(
        jsName = "RTCSignalingState",
        kotlinFqn = "web.rtc.RTCSignalingState",
    ),
    BrowserType(
        jsName = "RTCStats",
        kotlinFqn = "web.rtc.RTCStats",
    ),
    BrowserType(
        jsName = "RTCStatsIceCandidatePairState",
        kotlinFqn = "web.rtc.RTCStatsIceCandidatePairState",
    ),
    BrowserType(
        jsName = "RTCStatsReport",
        kotlinFqn = "web.rtc.RTCStatsReport",
    ),
    BrowserType(
        jsName = "RTCStatsType",
        kotlinFqn = "web.rtc.RTCStatsType",
    ),
    BrowserType(
        jsName = "RTCTrackEvent",
        kotlinFqn = "web.rtc.RTCTrackEvent",
    ),
    BrowserType(
        jsName = "RTCTrackEventInit",
        kotlinFqn = "web.rtc.RTCTrackEventInit",
    ),
    BrowserType(
        jsName = "RTCTransformEvent",
        kotlinFqn = "web.rtc.RTCTransformEvent",
    ),
    BrowserType(
        jsName = "RTCTransportStats",
        kotlinFqn = "web.rtc.RTCTransportStats",
    ),
    BrowserType(
        jsName = "RadioNodeList",
        kotlinFqn = "web.html.RadioNodeList",
    ),
    BrowserType(
        jsName = "Range",
        kotlinFqn = "web.ranges.Range",
    ),
    BrowserType(
        jsName = "RangeError",
        kotlinFqn = "js.errors.RangeError",
    ),
    BrowserType(
        jsName = "RawJSON",
        kotlinFqn = "js.json.RawJSON",
    ),
    BrowserType(
        jsName = "ReadableByteStreamController",
        kotlinFqn = "web.streams.ReadableByteStreamController",
    ),
    BrowserType(
        jsName = "ReadableStream",
        kotlinFqn = "web.streams.ReadableStream",
    ),
    BrowserType(
        jsName = "ReadableStreamBYOBReader",
        kotlinFqn = "web.streams.ReadableStreamBYOBReader",
    ),
    BrowserType(
        jsName = "ReadableStreamBYOBReaderReadOptions",
        kotlinFqn = "web.streams.ReadableStreamBYOBReaderReadOptions",
    ),
    BrowserType(
        jsName = "ReadableStreamBYOBRequest",
        kotlinFqn = "web.streams.ReadableStreamBYOBRequest",
    ),
    BrowserType(
        jsName = "ReadableStreamController",
        kotlinFqn = "web.streams.ReadableStreamController",
    ),
    BrowserType(
        jsName = "ReadableStreamDefaultController",
        kotlinFqn = "web.streams.ReadableStreamDefaultController",
    ),
    BrowserType(
        jsName = "ReadableStreamDefaultReader",
        kotlinFqn = "web.streams.ReadableStreamDefaultReader",
    ),
    BrowserType(
        jsName = "ReadableStreamGenericReader",
        kotlinFqn = "web.streams.ReadableStreamGenericReader",
    ),
    BrowserType(
        jsName = "ReadableStreamGetReaderOptions",
        kotlinFqn = "web.streams.ReadableStreamGetReaderOptions",
    ),
    BrowserType(
        jsName = "ReadableStreamIteratorOptions",
        kotlinFqn = "web.streams.ReadableStreamIteratorOptions",
    ),
    BrowserType(
        jsName = "ReadableStreamReadResult",
        kotlinFqn = "web.streams.ReadableStreamReadResult",
    ),
    BrowserType(
        jsName = "ReadableStreamReader",
        kotlinFqn = "web.streams.ReadableStreamReader",
    ),
    BrowserType(
        jsName = "ReadableStreamReaderMode",
        kotlinFqn = "web.streams.ReadableStreamReaderMode",
    ),
    BrowserType(
        jsName = "ReadableStreamType",
        kotlinFqn = "web.streams.ReadableStreamType",
    ),
    BrowserType(
        jsName = "ReadableWritablePair",
        kotlinFqn = "web.streams.ReadableWritablePair",
    ),
    BrowserType(
        jsName = "ReadonlyArray",
        kotlinFqn = "js.array.ReadonlyArray",
    ),
    BrowserType(
        jsName = "ReadonlyMap",
        kotlinFqn = "js.collections.ReadonlyMap",
    ),
    BrowserType(
        jsName = "ReadonlyRecord",
        kotlinFqn = "js.objects.ReadonlyRecord",
    ),
    BrowserType(
        jsName = "ReadonlySet",
        kotlinFqn = "js.collections.ReadonlySet",
    ),
    BrowserType(
        jsName = "ReadonlySetLike",
        kotlinFqn = "js.collections.ReadonlySetLike",
    ),
    BrowserType(
        jsName = "ReadyState",
        kotlinFqn = "web.mediasource.ReadyState",
    ),
    BrowserType(
        jsName = "Record",
        kotlinFqn = "js.objects.Record",
    ),
    BrowserType(
        jsName = "RecordingState",
        kotlinFqn = "web.mediarecorder.RecordingState",
    ),
    BrowserType(
        jsName = "RedEyeReduction",
        kotlinFqn = "web.imagecapture.RedEyeReduction",
    ),
    BrowserType(
        jsName = "ReferenceError",
        kotlinFqn = "js.errors.ReferenceError",
    ),
    BrowserType(
        jsName = "ReferrerPolicy",
        kotlinFqn = "web.http.ReferrerPolicy",
    ),
    BrowserType(
        jsName = "RegExp",
        kotlinFqn = "js.regexp.RegExp",
    ),
    BrowserType(
        jsName = "RegExpExecArray",
        kotlinFqn = "js.regexp.RegExpExecArray",
    ),
    BrowserType(
        jsName = "RegExpIndex",
        kotlinFqn = "js.regexp.RegExpIndex",
    ),
    BrowserType(
        jsName = "RegExpIndicesArray",
        kotlinFqn = "js.regexp.RegExpIndicesArray",
    ),
    BrowserType(
        jsName = "RegExpMatchArray",
        kotlinFqn = "js.regexp.RegExpMatchArray",
    ),
    BrowserType(
        jsName = "RegistrationHandle",
        kotlinFqn = "web.mcp.RegistrationHandle",
    ),
    BrowserType(
        jsName = "RegistrationOptions",
        kotlinFqn = "web.serviceworker.RegistrationOptions",
    ),
    BrowserType(
        jsName = "RegistrationResponseJSON",
        kotlinFqn = "web.authn.RegistrationResponseJSON",
    ),
    BrowserType(
        jsName = "RemotePlayback",
        kotlinFqn = "web.remoteplayback.RemotePlayback",
    ),
    BrowserType(
        jsName = "RemotePlaybackAvailabilityCallback",
        kotlinFqn = "web.remoteplayback.RemotePlaybackAvailabilityCallback",
    ),
    BrowserType(
        jsName = "RemotePlaybackState",
        kotlinFqn = "web.remoteplayback.RemotePlaybackState",
    ),
    BrowserType(
        jsName = "RenderingContext",
        kotlinFqn = "web.rendering.RenderingContext",
    ),
    BrowserType(
        jsName = "RenderingContextId",
        kotlinFqn = "web.rendering.RenderingContextId",
    ),
    BrowserType(
        jsName = "RepeatCount",
        kotlinFqn = "web.svg.RepeatCount",
    ),
    BrowserType(
        jsName = "Replacer",
        kotlinFqn = "js.json.Replacer",
    ),
    BrowserType(
        jsName = "Report",
        kotlinFqn = "web.reporting.Report",
    ),
    BrowserType(
        jsName = "ReportBody",
        kotlinFqn = "web.reporting.ReportBody",
    ),
    BrowserType(
        jsName = "ReportList",
        kotlinFqn = "web.reporting.ReportList",
    ),
    BrowserType(
        jsName = "ReportingObserver",
        kotlinFqn = "web.reporting.ReportingObserver",
    ),
    BrowserType(
        jsName = "ReportingObserverCallback",
        kotlinFqn = "web.reporting.ReportingObserverCallback",
    ),
    BrowserType(
        jsName = "ReportingObserverOptions",
        kotlinFqn = "web.reporting.ReportingObserverOptions",
    ),
    BrowserType(
        jsName = "Request",
        kotlinFqn = "web.http.Request",
    ),
    BrowserType(
        jsName = "RequestCache",
        kotlinFqn = "web.http.RequestCache",
    ),
    BrowserType(
        jsName = "RequestCredentials",
        kotlinFqn = "web.http.RequestCredentials",
    ),
    BrowserType(
        jsName = "RequestDestination",
        kotlinFqn = "web.http.RequestDestination",
    ),
    BrowserType(
        jsName = "RequestInit",
        kotlinFqn = "web.http.RequestInit",
    ),
    BrowserType(
        jsName = "RequestMethod",
        kotlinFqn = "web.http.RequestMethod",
    ),
    BrowserType(
        jsName = "RequestMode",
        kotlinFqn = "web.http.RequestMode",
    ),
    BrowserType(
        jsName = "RequestPriority",
        kotlinFqn = "web.http.RequestPriority",
    ),
    BrowserType(
        jsName = "RequestRedirect",
        kotlinFqn = "web.http.RequestRedirect",
    ),
    BrowserType(
        jsName = "ResidentKeyRequirement",
        kotlinFqn = "web.authn.ResidentKeyRequirement",
    ),
    BrowserType(
        jsName = "ResizeObserver",
        kotlinFqn = "web.resize.ResizeObserver",
    ),
    BrowserType(
        jsName = "ResizeObserverBoxOptions",
        kotlinFqn = "web.resize.ResizeObserverBoxOptions",
    ),
    BrowserType(
        jsName = "ResizeObserverCallback",
        kotlinFqn = "web.resize.ResizeObserverCallback",
    ),
    BrowserType(
        jsName = "ResizeObserverEntry",
        kotlinFqn = "web.resize.ResizeObserverEntry",
    ),
    BrowserType(
        jsName = "ResizeObserverOptions",
        kotlinFqn = "web.resize.ResizeObserverOptions",
    ),
    BrowserType(
        jsName = "ResizeObserverSize",
        kotlinFqn = "web.resize.ResizeObserverSize",
    ),
    BrowserType(
        jsName = "ResizeQuality",
        kotlinFqn = "web.images.ResizeQuality",
    ),
    BrowserType(
        jsName = "ResourceContents",
        kotlinFqn = "web.mcp.ResourceContents",
    ),
    BrowserType(
        jsName = "ResourceLink",
        kotlinFqn = "web.mcp.ResourceLink",
    ),
    BrowserType(
        jsName = "Response",
        kotlinFqn = "web.http.Response",
    ),
    BrowserType(
        jsName = "ResponseInit",
        kotlinFqn = "web.http.ResponseInit",
    ),
    BrowserType(
        jsName = "ResponseType",
        kotlinFqn = "web.http.ResponseType",
    ),
    BrowserType(
        jsName = "Reviver",
        kotlinFqn = "js.json.Reviver",
    ),
    BrowserType(
        jsName = "RsaHashedImportParams",
        kotlinFqn = "web.crypto.RsaHashedImportParams",
    ),
    BrowserType(
        jsName = "RsaHashedKeyAlgorithm",
        kotlinFqn = "web.crypto.RsaHashedKeyAlgorithm",
    ),
    BrowserType(
        jsName = "RsaHashedKeyGenParams",
        kotlinFqn = "web.crypto.RsaHashedKeyGenParams",
    ),
    BrowserType(
        jsName = "RsaKeyAlgorithm",
        kotlinFqn = "web.crypto.RsaKeyAlgorithm",
    ),
    BrowserType(
        jsName = "RsaKeyGenParams",
        kotlinFqn = "web.crypto.RsaKeyGenParams",
    ),
    BrowserType(
        jsName = "RsaOaepParams",
        kotlinFqn = "web.crypto.RsaOaepParams",
    ),
    BrowserType(
        jsName = "RsaOtherPrimesInfo",
        kotlinFqn = "web.crypto.RsaOtherPrimesInfo",
    ),
    BrowserType(
        jsName = "RsaPssParams",
        kotlinFqn = "web.crypto.RsaPssParams",
    ),
    BrowserType(
        jsName = "SVGAElement",
        kotlinFqn = "web.svg.SVGAElement",
    ),
    BrowserType(
        jsName = "SVGAngle",
        kotlinFqn = "web.svg.SVGAngle",
    ),
    BrowserType(
        jsName = "SVGAnimateElement",
        kotlinFqn = "web.svg.SVGAnimateElement",
    ),
    BrowserType(
        jsName = "SVGAnimateMotionElement",
        kotlinFqn = "web.svg.SVGAnimateMotionElement",
    ),
    BrowserType(
        jsName = "SVGAnimateTransformElement",
        kotlinFqn = "web.svg.SVGAnimateTransformElement",
    ),
    BrowserType(
        jsName = "SVGAnimatedAngle",
        kotlinFqn = "web.svg.SVGAnimatedAngle",
    ),
    BrowserType(
        jsName = "SVGAnimatedBoolean",
        kotlinFqn = "web.svg.SVGAnimatedBoolean",
    ),
    BrowserType(
        jsName = "SVGAnimatedEnumeration",
        kotlinFqn = "web.svg.SVGAnimatedEnumeration",
    ),
    BrowserType(
        jsName = "SVGAnimatedInteger",
        kotlinFqn = "web.svg.SVGAnimatedInteger",
    ),
    BrowserType(
        jsName = "SVGAnimatedLength",
        kotlinFqn = "web.svg.SVGAnimatedLength",
    ),
    BrowserType(
        jsName = "SVGAnimatedLengthList",
        kotlinFqn = "web.svg.SVGAnimatedLengthList",
    ),
    BrowserType(
        jsName = "SVGAnimatedNumber",
        kotlinFqn = "web.svg.SVGAnimatedNumber",
    ),
    BrowserType(
        jsName = "SVGAnimatedNumberList",
        kotlinFqn = "web.svg.SVGAnimatedNumberList",
    ),
    BrowserType(
        jsName = "SVGAnimatedPoints",
        kotlinFqn = "web.svg.SVGAnimatedPoints",
    ),
    BrowserType(
        jsName = "SVGAnimatedPreserveAspectRatio",
        kotlinFqn = "web.svg.SVGAnimatedPreserveAspectRatio",
    ),
    BrowserType(
        jsName = "SVGAnimatedRect",
        kotlinFqn = "web.svg.SVGAnimatedRect",
    ),
    BrowserType(
        jsName = "SVGAnimatedString",
        kotlinFqn = "web.svg.SVGAnimatedString",
    ),
    BrowserType(
        jsName = "SVGAnimatedTransformList",
        kotlinFqn = "web.svg.SVGAnimatedTransformList",
    ),
    BrowserType(
        jsName = "SVGAnimationElement",
        kotlinFqn = "web.svg.SVGAnimationElement",
    ),
    BrowserType(
        jsName = "SVGBoundingBoxOptions",
        kotlinFqn = "web.svg.SVGBoundingBoxOptions",
    ),
    BrowserType(
        jsName = "SVGCircleElement",
        kotlinFqn = "web.svg.SVGCircleElement",
    ),
    BrowserType(
        jsName = "SVGClipPathElement",
        kotlinFqn = "web.svg.SVGClipPathElement",
    ),
    BrowserType(
        jsName = "SVGComponentTransferFunctionElement",
        kotlinFqn = "web.svg.SVGComponentTransferFunctionElement",
    ),
    BrowserType(
        jsName = "SVGDefsElement",
        kotlinFqn = "web.svg.SVGDefsElement",
    ),
    BrowserType(
        jsName = "SVGDescElement",
        kotlinFqn = "web.svg.SVGDescElement",
    ),
    BrowserType(
        jsName = "SVGElement",
        kotlinFqn = "web.svg.SVGElement",
    ),
    BrowserType(
        jsName = "SVGEllipseElement",
        kotlinFqn = "web.svg.SVGEllipseElement",
    ),
    BrowserType(
        jsName = "SVGFEBlendElement",
        kotlinFqn = "web.svg.SVGFEBlendElement",
    ),
    BrowserType(
        jsName = "SVGFEColorMatrixElement",
        kotlinFqn = "web.svg.SVGFEColorMatrixElement",
    ),
    BrowserType(
        jsName = "SVGFEComponentTransferElement",
        kotlinFqn = "web.svg.SVGFEComponentTransferElement",
    ),
    BrowserType(
        jsName = "SVGFECompositeElement",
        kotlinFqn = "web.svg.SVGFECompositeElement",
    ),
    BrowserType(
        jsName = "SVGFEConvolveMatrixElement",
        kotlinFqn = "web.svg.SVGFEConvolveMatrixElement",
    ),
    BrowserType(
        jsName = "SVGFEDiffuseLightingElement",
        kotlinFqn = "web.svg.SVGFEDiffuseLightingElement",
    ),
    BrowserType(
        jsName = "SVGFEDisplacementMapElement",
        kotlinFqn = "web.svg.SVGFEDisplacementMapElement",
    ),
    BrowserType(
        jsName = "SVGFEDistantLightElement",
        kotlinFqn = "web.svg.SVGFEDistantLightElement",
    ),
    BrowserType(
        jsName = "SVGFEDropShadowElement",
        kotlinFqn = "web.svg.SVGFEDropShadowElement",
    ),
    BrowserType(
        jsName = "SVGFEFloodElement",
        kotlinFqn = "web.svg.SVGFEFloodElement",
    ),
    BrowserType(
        jsName = "SVGFEFuncAElement",
        kotlinFqn = "web.svg.SVGFEFuncAElement",
    ),
    BrowserType(
        jsName = "SVGFEFuncBElement",
        kotlinFqn = "web.svg.SVGFEFuncBElement",
    ),
    BrowserType(
        jsName = "SVGFEFuncGElement",
        kotlinFqn = "web.svg.SVGFEFuncGElement",
    ),
    BrowserType(
        jsName = "SVGFEFuncRElement",
        kotlinFqn = "web.svg.SVGFEFuncRElement",
    ),
    BrowserType(
        jsName = "SVGFEGaussianBlurElement",
        kotlinFqn = "web.svg.SVGFEGaussianBlurElement",
    ),
    BrowserType(
        jsName = "SVGFEImageElement",
        kotlinFqn = "web.svg.SVGFEImageElement",
    ),
    BrowserType(
        jsName = "SVGFEMergeElement",
        kotlinFqn = "web.svg.SVGFEMergeElement",
    ),
    BrowserType(
        jsName = "SVGFEMergeNodeElement",
        kotlinFqn = "web.svg.SVGFEMergeNodeElement",
    ),
    BrowserType(
        jsName = "SVGFEMorphologyElement",
        kotlinFqn = "web.svg.SVGFEMorphologyElement",
    ),
    BrowserType(
        jsName = "SVGFEOffsetElement",
        kotlinFqn = "web.svg.SVGFEOffsetElement",
    ),
    BrowserType(
        jsName = "SVGFEPointLightElement",
        kotlinFqn = "web.svg.SVGFEPointLightElement",
    ),
    BrowserType(
        jsName = "SVGFESpecularLightingElement",
        kotlinFqn = "web.svg.SVGFESpecularLightingElement",
    ),
    BrowserType(
        jsName = "SVGFESpotLightElement",
        kotlinFqn = "web.svg.SVGFESpotLightElement",
    ),
    BrowserType(
        jsName = "SVGFETileElement",
        kotlinFqn = "web.svg.SVGFETileElement",
    ),
    BrowserType(
        jsName = "SVGFETurbulenceElement",
        kotlinFqn = "web.svg.SVGFETurbulenceElement",
    ),
    BrowserType(
        jsName = "SVGFilterElement",
        kotlinFqn = "web.svg.SVGFilterElement",
    ),
    BrowserType(
        jsName = "SVGFilterPrimitiveStandardAttributes",
        kotlinFqn = "web.svg.SVGFilterPrimitiveStandardAttributes",
    ),
    BrowserType(
        jsName = "SVGFitToViewBox",
        kotlinFqn = "web.svg.SVGFitToViewBox",
    ),
    BrowserType(
        jsName = "SVGForeignObjectElement",
        kotlinFqn = "web.svg.SVGForeignObjectElement",
    ),
    BrowserType(
        jsName = "SVGGElement",
        kotlinFqn = "web.svg.SVGGElement",
    ),
    BrowserType(
        jsName = "SVGGeometryElement",
        kotlinFqn = "web.svg.SVGGeometryElement",
    ),
    BrowserType(
        jsName = "SVGGradientElement",
        kotlinFqn = "web.svg.SVGGradientElement",
    ),
    BrowserType(
        jsName = "SVGGraphicsElement",
        kotlinFqn = "web.svg.SVGGraphicsElement",
    ),
    BrowserType(
        jsName = "SVGImageElement",
        kotlinFqn = "web.svg.SVGImageElement",
    ),
    BrowserType(
        jsName = "SVGLength",
        kotlinFqn = "web.svg.SVGLength",
    ),
    BrowserType(
        jsName = "SVGLengthList",
        kotlinFqn = "web.svg.SVGLengthList",
    ),
    BrowserType(
        jsName = "SVGLineElement",
        kotlinFqn = "web.svg.SVGLineElement",
    ),
    BrowserType(
        jsName = "SVGLinearGradientElement",
        kotlinFqn = "web.svg.SVGLinearGradientElement",
    ),
    BrowserType(
        jsName = "SVGMPathElement",
        kotlinFqn = "web.svg.SVGMPathElement",
    ),
    BrowserType(
        jsName = "SVGMarkerElement",
        kotlinFqn = "web.svg.SVGMarkerElement",
    ),
    BrowserType(
        jsName = "SVGMaskElement",
        kotlinFqn = "web.svg.SVGMaskElement",
    ),
    BrowserType(
        jsName = "SVGMatrix",
        kotlinFqn = "web.svg.SVGMatrix",
    ),
    BrowserType(
        jsName = "SVGMetadataElement",
        kotlinFqn = "web.svg.SVGMetadataElement",
    ),
    BrowserType(
        jsName = "SVGNumber",
        kotlinFqn = "web.svg.SVGNumber",
    ),
    BrowserType(
        jsName = "SVGNumberList",
        kotlinFqn = "web.svg.SVGNumberList",
    ),
    BrowserType(
        jsName = "SVGPathElement",
        kotlinFqn = "web.svg.SVGPathElement",
    ),
    BrowserType(
        jsName = "SVGPatternElement",
        kotlinFqn = "web.svg.SVGPatternElement",
    ),
    BrowserType(
        jsName = "SVGPoint",
        kotlinFqn = "web.svg.SVGPoint",
    ),
    BrowserType(
        jsName = "SVGPointList",
        kotlinFqn = "web.svg.SVGPointList",
    ),
    BrowserType(
        jsName = "SVGPolygonElement",
        kotlinFqn = "web.svg.SVGPolygonElement",
    ),
    BrowserType(
        jsName = "SVGPolylineElement",
        kotlinFqn = "web.svg.SVGPolylineElement",
    ),
    BrowserType(
        jsName = "SVGPreserveAspectRatio",
        kotlinFqn = "web.svg.SVGPreserveAspectRatio",
    ),
    BrowserType(
        jsName = "SVGRadialGradientElement",
        kotlinFqn = "web.svg.SVGRadialGradientElement",
    ),
    BrowserType(
        jsName = "SVGRect",
        kotlinFqn = "web.svg.SVGRect",
    ),
    BrowserType(
        jsName = "SVGRectElement",
        kotlinFqn = "web.svg.SVGRectElement",
    ),
    BrowserType(
        jsName = "SVGSVGElement",
        kotlinFqn = "web.svg.SVGSVGElement",
    ),
    BrowserType(
        jsName = "SVGScriptElement",
        kotlinFqn = "web.svg.SVGScriptElement",
    ),
    BrowserType(
        jsName = "SVGSetElement",
        kotlinFqn = "web.svg.SVGSetElement",
    ),
    BrowserType(
        jsName = "SVGStopElement",
        kotlinFqn = "web.svg.SVGStopElement",
    ),
    BrowserType(
        jsName = "SVGStringList",
        kotlinFqn = "web.svg.SVGStringList",
    ),
    BrowserType(
        jsName = "SVGStyleElement",
        kotlinFqn = "web.svg.SVGStyleElement",
    ),
    BrowserType(
        jsName = "SVGSwitchElement",
        kotlinFqn = "web.svg.SVGSwitchElement",
    ),
    BrowserType(
        jsName = "SVGSymbolElement",
        kotlinFqn = "web.svg.SVGSymbolElement",
    ),
    BrowserType(
        jsName = "SVGTSpanElement",
        kotlinFqn = "web.svg.SVGTSpanElement",
    ),
    BrowserType(
        jsName = "SVGTests",
        kotlinFqn = "web.svg.SVGTests",
    ),
    BrowserType(
        jsName = "SVGTextContentElement",
        kotlinFqn = "web.svg.SVGTextContentElement",
    ),
    BrowserType(
        jsName = "SVGTextElement",
        kotlinFqn = "web.svg.SVGTextElement",
    ),
    BrowserType(
        jsName = "SVGTextPathElement",
        kotlinFqn = "web.svg.SVGTextPathElement",
    ),
    BrowserType(
        jsName = "SVGTextPositioningElement",
        kotlinFqn = "web.svg.SVGTextPositioningElement",
    ),
    BrowserType(
        jsName = "SVGTitleElement",
        kotlinFqn = "web.svg.SVGTitleElement",
    ),
    BrowserType(
        jsName = "SVGTransform",
        kotlinFqn = "web.svg.SVGTransform",
    ),
    BrowserType(
        jsName = "SVGTransformList",
        kotlinFqn = "web.svg.SVGTransformList",
    ),
    BrowserType(
        jsName = "SVGURIReference",
        kotlinFqn = "web.svg.SVGURIReference",
    ),
    BrowserType(
        jsName = "SVGUnitTypes",
        kotlinFqn = "web.svg.SVGUnitTypes",
    ),
    BrowserType(
        jsName = "SVGUseElement",
        kotlinFqn = "web.svg.SVGUseElement",
    ),
    BrowserType(
        jsName = "SVGViewElement",
        kotlinFqn = "web.svg.SVGViewElement",
    ),
    BrowserType(
        jsName = "Sanitizer",
        kotlinFqn = "web.sanitizer.Sanitizer",
    ),
    BrowserType(
        jsName = "SanitizerAttribute",
        kotlinFqn = "web.sanitizer.SanitizerAttribute",
    ),
    BrowserType(
        jsName = "SanitizerAttributeNamespace",
        kotlinFqn = "web.sanitizer.SanitizerAttributeNamespace",
    ),
    BrowserType(
        jsName = "SanitizerConfig",
        kotlinFqn = "web.sanitizer.SanitizerConfig",
    ),
    BrowserType(
        jsName = "SanitizerElement",
        kotlinFqn = "web.sanitizer.SanitizerElement",
    ),
    BrowserType(
        jsName = "SanitizerElementNamespace",
        kotlinFqn = "web.sanitizer.SanitizerElementNamespace",
    ),
    BrowserType(
        jsName = "SanitizerElementNamespaceWithAttributes",
        kotlinFqn = "web.sanitizer.SanitizerElementNamespaceWithAttributes",
    ),
    BrowserType(
        jsName = "SanitizerElementWithAttributes",
        kotlinFqn = "web.sanitizer.SanitizerElementWithAttributes",
    ),
    BrowserType(
        jsName = "SanitizerPI",
        kotlinFqn = "web.sanitizer.SanitizerPI",
    ),
    BrowserType(
        jsName = "SanitizerPresets",
        kotlinFqn = "web.sanitizer.SanitizerPresets",
    ),
    BrowserType(
        jsName = "SanitizerProcessingInstruction",
        kotlinFqn = "web.sanitizer.SanitizerProcessingInstruction",
    ),
    BrowserType(
        jsName = "SaveFilePickerOptions",
        kotlinFqn = "web.fs.SaveFilePickerOptions",
    ),
    BrowserType(
        jsName = "Scheduler",
        kotlinFqn = "web.scheduling.Scheduler",
    ),
    BrowserType(
        jsName = "SchedulerPostTaskCallback",
        kotlinFqn = "web.scheduling.SchedulerPostTaskCallback",
    ),
    BrowserType(
        jsName = "SchedulerPostTaskOptions",
        kotlinFqn = "web.scheduling.SchedulerPostTaskOptions",
    ),
    BrowserType(
        jsName = "Screen",
        kotlinFqn = "web.screen.Screen",
    ),
    BrowserType(
        jsName = "ScreenDetailed",
        kotlinFqn = "web.screen.ScreenDetailed",
    ),
    BrowserType(
        jsName = "ScreenDetails",
        kotlinFqn = "web.screen.ScreenDetails",
    ),
    BrowserType(
        jsName = "ScreenOrientation",
        kotlinFqn = "web.screen.ScreenOrientation",
    ),
    BrowserType(
        jsName = "ScrollAxis",
        kotlinFqn = "web.animations.ScrollAxis",
    ),
    BrowserType(
        jsName = "ScrollBehavior",
        kotlinFqn = "web.scroll.ScrollBehavior",
    ),
    BrowserType(
        jsName = "ScrollIntoViewOptions",
        kotlinFqn = "web.scroll.ScrollIntoViewOptions",
    ),
    BrowserType(
        jsName = "ScrollLogicalPosition",
        kotlinFqn = "web.scroll.ScrollLogicalPosition",
    ),
    BrowserType(
        jsName = "ScrollOptions",
        kotlinFqn = "web.scroll.ScrollOptions",
    ),
    BrowserType(
        jsName = "ScrollRestoration",
        kotlinFqn = "web.history.ScrollRestoration",
    ),
    BrowserType(
        jsName = "ScrollSetting",
        kotlinFqn = "web.vtt.ScrollSetting",
    ),
    BrowserType(
        jsName = "ScrollTimeline",
        kotlinFqn = "web.animations.ScrollTimeline",
    ),
    BrowserType(
        jsName = "ScrollTimelineOptions",
        kotlinFqn = "web.animations.ScrollTimelineOptions",
    ),
    BrowserType(
        jsName = "ScrollToOptions",
        kotlinFqn = "web.scroll.ScrollToOptions",
    ),
    BrowserType(
        jsName = "SecurityPolicyViolationEvent",
        kotlinFqn = "web.csp.SecurityPolicyViolationEvent",
    ),
    BrowserType(
        jsName = "SecurityPolicyViolationEventDisposition",
        kotlinFqn = "web.csp.SecurityPolicyViolationEventDisposition",
    ),
    BrowserType(
        jsName = "SecurityPolicyViolationEventInit",
        kotlinFqn = "web.csp.SecurityPolicyViolationEventInit",
    ),
    BrowserType(
        jsName = "SelectType",
        kotlinFqn = "web.html.SelectType",
    ),
    BrowserType(
        jsName = "Selection",
        kotlinFqn = "web.selection.Selection",
    ),
    BrowserType(
        jsName = "SelectionDirection",
        kotlinFqn = "web.selection.SelectionDirection",
    ),
    BrowserType(
        jsName = "SelectionMode",
        kotlinFqn = "web.html.SelectionMode",
    ),
    BrowserType(
        jsName = "Serial",
        kotlinFqn = "web.serial.Serial",
    ),
    BrowserType(
        jsName = "SerialInputSignals",
        kotlinFqn = "web.serial.SerialInputSignals",
    ),
    BrowserType(
        jsName = "SerialOptions",
        kotlinFqn = "web.serial.SerialOptions",
    ),
    BrowserType(
        jsName = "SerialOutputSignals",
        kotlinFqn = "web.serial.SerialOutputSignals",
    ),
    BrowserType(
        jsName = "SerialPort",
        kotlinFqn = "web.serial.SerialPort",
    ),
    BrowserType(
        jsName = "SerialPortFilter",
        kotlinFqn = "web.serial.SerialPortFilter",
    ),
    BrowserType(
        jsName = "SerialPortInfo",
        kotlinFqn = "web.serial.SerialPortInfo",
    ),
    BrowserType(
        jsName = "SerialPortRequestOptions",
        kotlinFqn = "web.serial.SerialPortRequestOptions",
    ),
    BrowserType(
        jsName = "ServiceWorker",
        kotlinFqn = "web.serviceworker.ServiceWorker",
    ),
    BrowserType(
        jsName = "ServiceWorkerContainer",
        kotlinFqn = "web.serviceworker.ServiceWorkerContainer",
    ),
    BrowserType(
        jsName = "ServiceWorkerGlobalScope",
        kotlinFqn = "web.serviceworker.ServiceWorkerGlobalScope",
    ),
    BrowserType(
        jsName = "ServiceWorkerModule",
        kotlinFqn = "web.serviceworker.ServiceWorkerModule",
    ),
    BrowserType(
        jsName = "ServiceWorkerRegistration",
        kotlinFqn = "web.serviceworker.ServiceWorkerRegistration",
    ),
    BrowserType(
        jsName = "ServiceWorkerState",
        kotlinFqn = "web.serviceworker.ServiceWorkerState",
    ),
    BrowserType(
        jsName = "ServiceWorkerUpdateViaCache",
        kotlinFqn = "web.serviceworker.ServiceWorkerUpdateViaCache",
    ),
    BrowserType(
        jsName = "Set",
        kotlinFqn = "js.collections.JsSet",
    ),
    BrowserType(
        jsName = "SetFromResult",
        kotlinFqn = "js.typedarrays.SetFromResult",
    ),
    BrowserType(
        jsName = "SetHTMLOptions",
        kotlinFqn = "web.dom.SetHTMLOptions",
    ),
    BrowserType(
        jsName = "SetHTMLUnsafeOptions",
        kotlinFqn = "web.html.SetHTMLUnsafeOptions",
    ),
    BrowserType(
        jsName = "ShadowRoot",
        kotlinFqn = "web.components.ShadowRoot",
    ),
    BrowserType(
        jsName = "ShadowRootInit",
        kotlinFqn = "web.components.ShadowRootInit",
    ),
    BrowserType(
        jsName = "ShadowRootMode",
        kotlinFqn = "web.components.ShadowRootMode",
    ),
    BrowserType(
        jsName = "ShareData",
        kotlinFqn = "web.share.ShareData",
    ),
    BrowserType(
        jsName = "SharedArrayBuffer",
        kotlinFqn = "js.buffer.SharedArrayBuffer",
    ),
    BrowserType(
        jsName = "SharedArrayBufferOptions",
        kotlinFqn = "js.buffer.SharedArrayBufferOptions",
    ),
    BrowserType(
        jsName = "SharedWorker",
        kotlinFqn = "web.workers.SharedWorker",
    ),
    BrowserType(
        jsName = "SharedWorkerGlobalScope",
        kotlinFqn = "web.workers.SharedWorkerGlobalScope",
    ),
    BrowserType(
        jsName = "ShowPopoverOptions",
        kotlinFqn = "web.popover.ShowPopoverOptions",
    ),
    BrowserType(
        jsName = "SlotAssignmentMode",
        kotlinFqn = "web.components.SlotAssignmentMode",
    ),
    BrowserType(
        jsName = "Slottable",
        kotlinFqn = "web.components.Slottable",
    ),
    BrowserType(
        jsName = "SourceBuffer",
        kotlinFqn = "web.mediasource.SourceBuffer",
    ),
    BrowserType(
        jsName = "SourceBufferList",
        kotlinFqn = "web.mediasource.SourceBufferList",
    ),
    BrowserType(
        jsName = "SpeechRecognitionAlternative",
        kotlinFqn = "web.speech.SpeechRecognitionAlternative",
    ),
    BrowserType(
        jsName = "SpeechRecognitionErrorCode",
        kotlinFqn = "web.speech.SpeechRecognitionErrorCode",
    ),
    BrowserType(
        jsName = "SpeechRecognitionErrorEvent",
        kotlinFqn = "web.speech.SpeechRecognitionErrorEvent",
    ),
    BrowserType(
        jsName = "SpeechRecognitionErrorEventInit",
        kotlinFqn = "web.speech.SpeechRecognitionErrorEventInit",
    ),
    BrowserType(
        jsName = "SpeechRecognitionEvent",
        kotlinFqn = "web.speech.SpeechRecognitionEvent",
    ),
    BrowserType(
        jsName = "SpeechRecognitionEventInit",
        kotlinFqn = "web.speech.SpeechRecognitionEventInit",
    ),
    BrowserType(
        jsName = "SpeechRecognitionResult",
        kotlinFqn = "web.speech.SpeechRecognitionResult",
    ),
    BrowserType(
        jsName = "SpeechRecognitionResultList",
        kotlinFqn = "web.speech.SpeechRecognitionResultList",
    ),
    BrowserType(
        jsName = "SpeechSynthesis",
        kotlinFqn = "web.speech.SpeechSynthesis",
    ),
    BrowserType(
        jsName = "SpeechSynthesisErrorCode",
        kotlinFqn = "web.speech.SpeechSynthesisErrorCode",
    ),
    BrowserType(
        jsName = "SpeechSynthesisErrorEvent",
        kotlinFqn = "web.speech.SpeechSynthesisErrorEvent",
    ),
    BrowserType(
        jsName = "SpeechSynthesisErrorEventInit",
        kotlinFqn = "web.speech.SpeechSynthesisErrorEventInit",
    ),
    BrowserType(
        jsName = "SpeechSynthesisEvent",
        kotlinFqn = "web.speech.SpeechSynthesisEvent",
    ),
    BrowserType(
        jsName = "SpeechSynthesisEventInit",
        kotlinFqn = "web.speech.SpeechSynthesisEventInit",
    ),
    BrowserType(
        jsName = "SpeechSynthesisUtterance",
        kotlinFqn = "web.speech.SpeechSynthesisUtterance",
    ),
    BrowserType(
        jsName = "SpeechSynthesisVoice",
        kotlinFqn = "web.speech.SpeechSynthesisVoice",
    ),
    BrowserType(
        jsName = "StartInDirectory",
        kotlinFqn = "web.fs.StartInDirectory",
    ),
    BrowserType(
        jsName = "StartViewTransitionOptions",
        kotlinFqn = "web.viewtransition.StartViewTransitionOptions",
    ),
    BrowserType(
        jsName = "StaticRange",
        kotlinFqn = "web.ranges.StaticRange",
    ),
    BrowserType(
        jsName = "StaticRangeInit",
        kotlinFqn = "web.ranges.StaticRangeInit",
    ),
    BrowserType(
        jsName = "StereoPannerNode",
        kotlinFqn = "web.audio.StereoPannerNode",
    ),
    BrowserType(
        jsName = "StereoPannerOptions",
        kotlinFqn = "web.audio.StereoPannerOptions",
    ),
    BrowserType(
        jsName = "Storage",
        kotlinFqn = "web.storage.Storage",
    ),
    BrowserType(
        jsName = "StorageEstimate",
        kotlinFqn = "web.storage.StorageEstimate",
    ),
    BrowserType(
        jsName = "StorageEvent",
        kotlinFqn = "web.storage.StorageEvent",
    ),
    BrowserType(
        jsName = "StorageEventInit",
        kotlinFqn = "web.storage.StorageEventInit",
    ),
    BrowserType(
        jsName = "StorageManager",
        kotlinFqn = "web.storage.StorageManager",
    ),
    BrowserType(
        jsName = "StreamPipeOptions",
        kotlinFqn = "web.streams.StreamPipeOptions",
    ),
    BrowserType(
        jsName = "StringLike",
        kotlinFqn = "js.string.StringLike",
    ),
    BrowserType(
        jsName = "StringMatcher",
        kotlinFqn = "js.string.StringMatcher",
    ),
    BrowserType(
        jsName = "StringMatcherAll",
        kotlinFqn = "js.string.StringMatcherAll",
    ),
    BrowserType(
        jsName = "StringReplacer",
        kotlinFqn = "js.string.StringReplacer",
    ),
    BrowserType(
        jsName = "StringSearcher",
        kotlinFqn = "js.string.StringSearcher",
    ),
    BrowserType(
        jsName = "StringSplitter",
        kotlinFqn = "js.string.StringSplitter",
    ),
    BrowserType(
        jsName = "StructuredSerializeOptions",
        kotlinFqn = "web.serialization.StructuredSerializeOptions",
    ),
    BrowserType(
        jsName = "StylePropertyMap",
        kotlinFqn = "web.cssom.StylePropertyMap",
    ),
    BrowserType(
        jsName = "StylePropertyMapReadOnly",
        kotlinFqn = "web.cssom.StylePropertyMapReadOnly",
    ),
    BrowserType(
        jsName = "StyleSheet",
        kotlinFqn = "web.cssom.StyleSheet",
    ),
    BrowserType(
        jsName = "StyleSheetList",
        kotlinFqn = "web.cssom.StyleSheetList",
    ),
    BrowserType(
        jsName = "SubmitEvent",
        kotlinFqn = "web.form.SubmitEvent",
    ),
    BrowserType(
        jsName = "SubmitEventInit",
        kotlinFqn = "web.form.SubmitEventInit",
    ),
    BrowserType(
        jsName = "SubscribeCallback",
        kotlinFqn = "web.observable.SubscribeCallback",
    ),
    BrowserType(
        jsName = "SubscribeOptions",
        kotlinFqn = "web.observable.SubscribeOptions",
    ),
    BrowserType(
        jsName = "Subscriber",
        kotlinFqn = "js.observable.Subscriber",
    ),
    BrowserType(
        jsName = "SubscriptionObserver",
        kotlinFqn = "web.observable.SubscriptionObserver",
    ),
    BrowserType(
        jsName = "SubtleCrypto",
        kotlinFqn = "web.crypto.SubtleCrypto",
    ),
    BrowserType(
        jsName = "SuppressedError",
        kotlinFqn = "js.disposable.SuppressedError",
    ),
    BrowserType(
        jsName = "SvcOutputMetadata",
        kotlinFqn = "web.codecs.SvcOutputMetadata",
    ),
    BrowserType(
        jsName = "Symbol",
        kotlinFqn = "js.symbol.Symbol",
    ),
    BrowserType(
        jsName = "SyntaxError",
        kotlinFqn = "js.errors.SyntaxError",
    ),
    BrowserType(
        jsName = "TagName",
        kotlinFqn = "web.dom.TagName",
    ),
    BrowserType(
        jsName = "TagNamespace",
        kotlinFqn = "web.dom.TagNamespace",
    ),
    BrowserType(
        jsName = "TaskController",
        kotlinFqn = "web.scheduling.TaskController",
    ),
    BrowserType(
        jsName = "TaskControllerInit",
        kotlinFqn = "web.scheduling.TaskControllerInit",
    ),
    BrowserType(
        jsName = "TaskPriority",
        kotlinFqn = "web.scheduling.TaskPriority",
    ),
    BrowserType(
        jsName = "TaskPriorityChangeEvent",
        kotlinFqn = "web.scheduling.TaskPriorityChangeEvent",
    ),
    BrowserType(
        jsName = "TaskPriorityChangeEventInit",
        kotlinFqn = "web.scheduling.TaskPriorityChangeEventInit",
    ),
    BrowserType(
        jsName = "TaskSignal",
        kotlinFqn = "web.scheduling.TaskSignal",
    ),
    BrowserType(
        jsName = "TaskSignalAnyInit",
        kotlinFqn = "web.scheduling.TaskSignalAnyInit",
    ),
    BrowserType(
        jsName = "TemplateStringsArray",
        kotlinFqn = "js.string.TemplateStringsArray",
    ),
    BrowserType(
        jsName = "Temporal.ArithmeticOptions",
        kotlinFqn = "js.temporal.ArithmeticOptions",
    ),
    BrowserType(
        jsName = "Temporal.AssignmentOptions",
        kotlinFqn = "js.temporal.AssignmentOptions",
    ),
    BrowserType(
        jsName = "Temporal.Calendar",
        kotlinFqn = "js.temporal.Calendar",
    ),
    BrowserType(
        jsName = "Temporal.CalendarTypeToStringOptions",
        kotlinFqn = "js.temporal.CalendarTypeToStringOptions",
    ),
    BrowserType(
        jsName = "Temporal.Comparator",
        kotlinFqn = "js.temporal.Comparator",
    ),
    BrowserType(
        jsName = "Temporal.ComparisonResult",
        kotlinFqn = "js.temporal.ComparisonResult",
    ),
    BrowserType(
        jsName = "Temporal.DateTimeUnit",
        kotlinFqn = "js.temporal.DateTimeUnit",
    ),
    BrowserType(
        jsName = "Temporal.DateUnit",
        kotlinFqn = "js.temporal.DateUnit",
    ),
    BrowserType(
        jsName = "Temporal.DifferenceOptions",
        kotlinFqn = "js.temporal.DifferenceOptions",
    ),
    BrowserType(
        jsName = "Temporal.Disambiguation",
        kotlinFqn = "js.temporal.Disambiguation",
    ),
    BrowserType(
        jsName = "Temporal.Duration",
        kotlinFqn = "js.temporal.Duration",
    ),
    BrowserType(
        jsName = "Temporal.DurationArithmeticOptions",
        kotlinFqn = "js.temporal.DurationArithmeticOptions",
    ),
    BrowserType(
        jsName = "Temporal.DurationLike",
        kotlinFqn = "js.temporal.DurationLike",
    ),
    BrowserType(
        jsName = "Temporal.DurationOptions",
        kotlinFqn = "js.temporal.DurationOptions",
    ),
    BrowserType(
        jsName = "Temporal.Factory",
        kotlinFqn = "js.temporal.Factory",
    ),
    BrowserType(
        jsName = "Temporal.HasArithmeticOperations",
        kotlinFqn = "js.temporal.HasArithmeticOperations",
    ),
    BrowserType(
        jsName = "Temporal.HasDurationOperations",
        kotlinFqn = "js.temporal.HasDurationOperations",
    ),
    BrowserType(
        jsName = "Temporal.Instant",
        kotlinFqn = "js.temporal.Instant",
    ),
    BrowserType(
        jsName = "Temporal.InstantToStringOptions",
        kotlinFqn = "js.temporal.InstantToStringOptions",
    ),
    BrowserType(
        jsName = "Temporal.LargestUnit",
        kotlinFqn = "js.temporal.LargestUnit",
    ),
    BrowserType(
        jsName = "Temporal.LocalizableDateTime",
        kotlinFqn = "js.temporal.LocalizableDateTime",
    ),
    BrowserType(
        jsName = "Temporal.MonthCodeOrMonthAndYear",
        kotlinFqn = "js.temporal.MonthCodeOrMonthAndYear",
    ),
    BrowserType(
        jsName = "Temporal.MonthOrMonthCode",
        kotlinFqn = "js.temporal.MonthOrMonthCode",
    ),
    BrowserType(
        jsName = "Temporal.OffsetDisambiguationOptions",
        kotlinFqn = "js.temporal.OffsetDisambiguationOptions",
    ),
    BrowserType(
        jsName = "Temporal.Overflow",
        kotlinFqn = "js.temporal.Overflow",
    ),
    BrowserType(
        jsName = "Temporal.PlainCompanion",
        kotlinFqn = "js.temporal.PlainCompanion",
    ),
    BrowserType(
        jsName = "Temporal.PlainDate",
        kotlinFqn = "js.temporal.PlainDate",
    ),
    BrowserType(
        jsName = "Temporal.PlainDateISOFields",
        kotlinFqn = "js.temporal.PlainDateISOFields",
    ),
    BrowserType(
        jsName = "Temporal.PlainDateLike",
        kotlinFqn = "js.temporal.PlainDateLike",
    ),
    BrowserType(
        jsName = "Temporal.PlainDateTime",
        kotlinFqn = "js.temporal.PlainDateTime",
    ),
    BrowserType(
        jsName = "Temporal.PlainDateTimeISOFields",
        kotlinFqn = "js.temporal.PlainDateTimeISOFields",
    ),
    BrowserType(
        jsName = "Temporal.PlainDateTimeLike",
        kotlinFqn = "js.temporal.PlainDateTimeLike",
    ),
    BrowserType(
        jsName = "Temporal.PlainMonthDay",
        kotlinFqn = "js.temporal.PlainMonthDay",
    ),
    BrowserType(
        jsName = "Temporal.PlainMonthDayLike",
        kotlinFqn = "js.temporal.PlainMonthDayLike",
    ),
    BrowserType(
        jsName = "Temporal.PlainTime",
        kotlinFqn = "js.temporal.PlainTime",
    ),
    BrowserType(
        jsName = "Temporal.PlainTimeISOFields",
        kotlinFqn = "js.temporal.PlainTimeISOFields",
    ),
    BrowserType(
        jsName = "Temporal.PlainTimeLike",
        kotlinFqn = "js.temporal.PlainTimeLike",
    ),
    BrowserType(
        jsName = "Temporal.PlainYearMonth",
        kotlinFqn = "js.temporal.PlainYearMonth",
    ),
    BrowserType(
        jsName = "Temporal.PlainYearMonthLike",
        kotlinFqn = "js.temporal.PlainYearMonthLike",
    ),
    BrowserType(
        jsName = "Temporal.PluralUnit",
        kotlinFqn = "js.temporal.PluralUnit",
    ),
    BrowserType(
        jsName = "Temporal.RoundTo",
        kotlinFqn = "js.temporal.RoundTo",
    ),
    BrowserType(
        jsName = "Temporal.Roundable",
        kotlinFqn = "js.temporal.Roundable",
    ),
    BrowserType(
        jsName = "Temporal.RoundingMode",
        kotlinFqn = "js.temporal.RoundingMode",
    ),
    BrowserType(
        jsName = "Temporal.ShowCalendarOption",
        kotlinFqn = "js.temporal.ShowCalendarOption",
    ),
    BrowserType(
        jsName = "Temporal.SmallestUnit",
        kotlinFqn = "js.temporal.SmallestUnit",
    ),
    BrowserType(
        jsName = "Temporal.TimeUnit",
        kotlinFqn = "js.temporal.TimeUnit",
    ),
    BrowserType(
        jsName = "Temporal.TimeZone",
        kotlinFqn = "js.temporal.TimeZone",
    ),
    BrowserType(
        jsName = "Temporal.ToInstantOptions",
        kotlinFqn = "js.temporal.ToInstantOptions",
    ),
    BrowserType(
        jsName = "Temporal.ToStringPrecisionOptions",
        kotlinFqn = "js.temporal.ToStringPrecisionOptions",
    ),
    BrowserType(
        jsName = "Temporal.TotalUnit",
        kotlinFqn = "js.temporal.TotalUnit",
    ),
    BrowserType(
        jsName = "Temporal.YearOrEraAndEraYear",
        kotlinFqn = "js.temporal.YearOrEraAndEraYear",
    ),
    BrowserType(
        jsName = "Temporal.ZonedDateTime",
        kotlinFqn = "js.temporal.ZonedDateTime",
    ),
    BrowserType(
        jsName = "Temporal.ZonedDateTimeAssignmentOptions",
        kotlinFqn = "js.temporal.ZonedDateTimeAssignmentOptions",
    ),
    BrowserType(
        jsName = "Temporal.ZonedDateTimeISOFields",
        kotlinFqn = "js.temporal.ZonedDateTimeISOFields",
    ),
    BrowserType(
        jsName = "Temporal.ZonedDateTimeLike",
        kotlinFqn = "js.temporal.ZonedDateTimeLike",
    ),
    BrowserType(
        jsName = "Temporal.ZonedDateTimeToStringOptions",
        kotlinFqn = "js.temporal.ZonedDateTimeToStringOptions",
    ),
    BrowserType(
        jsName = "TexImageSource",
        kotlinFqn = "web.gl.TexImageSource",
    ),
    BrowserType(
        jsName = "Text",
        kotlinFqn = "web.dom.Text",
    ),
    BrowserType(
        jsName = "TextContent",
        kotlinFqn = "web.mcp.TextContent",
    ),
    BrowserType(
        jsName = "TextDecodeOptions",
        kotlinFqn = "web.encoding.TextDecodeOptions",
    ),
    BrowserType(
        jsName = "TextDecoder",
        kotlinFqn = "web.encoding.TextDecoder",
    ),
    BrowserType(
        jsName = "TextDecoderCommon",
        kotlinFqn = "web.encoding.TextDecoderCommon",
    ),
    BrowserType(
        jsName = "TextDecoderOptions",
        kotlinFqn = "web.encoding.TextDecoderOptions",
    ),
    BrowserType(
        jsName = "TextDecoderStream",
        kotlinFqn = "web.encoding.TextDecoderStream",
    ),
    BrowserType(
        jsName = "TextEncoder",
        kotlinFqn = "web.encoding.TextEncoder",
    ),
    BrowserType(
        jsName = "TextEncoderCommon",
        kotlinFqn = "web.encoding.TextEncoderCommon",
    ),
    BrowserType(
        jsName = "TextEncoderEncodeIntoResult",
        kotlinFqn = "web.encoding.TextEncoderEncodeIntoResult",
    ),
    BrowserType(
        jsName = "TextEncoderStream",
        kotlinFqn = "web.encoding.TextEncoderStream",
    ),
    BrowserType(
        jsName = "TextFormat",
        kotlinFqn = "web.editcontext.TextFormat",
    ),
    BrowserType(
        jsName = "TextFormatInit",
        kotlinFqn = "web.editcontext.TextFormatInit",
    ),
    BrowserType(
        jsName = "TextFormatUpdateEvent",
        kotlinFqn = "web.editcontext.TextFormatUpdateEvent",
    ),
    BrowserType(
        jsName = "TextFormatUpdateEventInit",
        kotlinFqn = "web.editcontext.TextFormatUpdateEventInit",
    ),
    BrowserType(
        jsName = "TextMetrics",
        kotlinFqn = "web.canvas.TextMetrics",
    ),
    BrowserType(
        jsName = "TextResourceContents",
        kotlinFqn = "web.mcp.TextResourceContents",
    ),
    BrowserType(
        jsName = "TextTrack",
        kotlinFqn = "web.vtt.TextTrack",
    ),
    BrowserType(
        jsName = "TextTrackCue",
        kotlinFqn = "web.vtt.TextTrackCue",
    ),
    BrowserType(
        jsName = "TextTrackCueList",
        kotlinFqn = "web.vtt.TextTrackCueList",
    ),
    BrowserType(
        jsName = "TextTrackKind",
        kotlinFqn = "web.vtt.TextTrackKind",
    ),
    BrowserType(
        jsName = "TextTrackList",
        kotlinFqn = "web.vtt.TextTrackList",
    ),
    BrowserType(
        jsName = "TextTrackMode",
        kotlinFqn = "web.vtt.TextTrackMode",
    ),
    BrowserType(
        jsName = "TextUpdateEvent",
        kotlinFqn = "web.editcontext.TextUpdateEvent",
    ),
    BrowserType(
        jsName = "TextUpdateEventInit",
        kotlinFqn = "web.editcontext.TextUpdateEventInit",
    ),
    BrowserType(
        jsName = "TimeRanges",
        kotlinFqn = "web.mediasource.TimeRanges",
    ),
    BrowserType(
        jsName = "TimelineRangeOffset",
        kotlinFqn = "web.animations.TimelineRangeOffset",
    ),
    BrowserType(
        jsName = "Timeout",
        kotlinFqn = "web.timers.Timeout",
    ),
    BrowserType(
        jsName = "TimerHandler",
        kotlinFqn = "web.timers.TimerHandler",
    ),
    BrowserType(
        jsName = "ToBase64Options",
        kotlinFqn = "js.typedarrays.ToBase64Options",
    ),
    BrowserType(
        jsName = "ToPrimitive",
        kotlinFqn = "js.primitive.ToPrimitive",
    ),
    BrowserType(
        jsName = "ToString",
        kotlinFqn = "js.string.ToString",
    ),
    BrowserType(
        jsName = "ToggleEvent",
        kotlinFqn = "web.popover.ToggleEvent",
    ),
    BrowserType(
        jsName = "ToggleEventInit",
        kotlinFqn = "web.popover.ToggleEventInit",
    ),
    BrowserType(
        jsName = "TogglePopoverOptions",
        kotlinFqn = "web.popover.TogglePopoverOptions",
    ),
    BrowserType(
        jsName = "ToggleState",
        kotlinFqn = "web.popover.ToggleState",
    ),
    BrowserType(
        jsName = "ToolAnnotations",
        kotlinFqn = "web.mcp.ToolAnnotations",
    ),
    BrowserType(
        jsName = "ToolExecuteCallback",
        kotlinFqn = "web.mcp.ToolExecuteCallback",
    ),
    BrowserType(
        jsName = "Touch",
        kotlinFqn = "web.touch.Touch",
    ),
    BrowserType(
        jsName = "TouchEvent",
        kotlinFqn = "web.touch.TouchEvent",
    ),
    BrowserType(
        jsName = "TouchEventInit",
        kotlinFqn = "web.touch.TouchEventInit",
    ),
    BrowserType(
        jsName = "TouchInit",
        kotlinFqn = "web.touch.TouchInit",
    ),
    BrowserType(
        jsName = "TouchList",
        kotlinFqn = "web.touch.TouchList",
    ),
    BrowserType(
        jsName = "TouchType",
        kotlinFqn = "web.touch.TouchType",
    ),
    BrowserType(
        jsName = "TrackEvent",
        kotlinFqn = "web.vtt.TrackEvent",
    ),
    BrowserType(
        jsName = "TrackEventInit",
        kotlinFqn = "web.vtt.TrackEventInit",
    ),
    BrowserType(
        jsName = "TransferFunction",
        kotlinFqn = "web.mediacapabilities.TransferFunction",
    ),
    BrowserType(
        jsName = "Transferable",
        kotlinFqn = "js.serialization.Transferable",
    ),
    BrowserType(
        jsName = "TransformStream",
        kotlinFqn = "web.streams.TransformStream",
    ),
    BrowserType(
        jsName = "TransformStreamDefaultController",
        kotlinFqn = "web.streams.TransformStreamDefaultController",
    ),
    BrowserType(
        jsName = "Transformer",
        kotlinFqn = "web.streams.Transformer",
    ),
    BrowserType(
        jsName = "TransformerFlushCallback",
        kotlinFqn = "web.streams.TransformerFlushCallback",
    ),
    BrowserType(
        jsName = "TransformerStartCallback",
        kotlinFqn = "web.streams.TransformerStartCallback",
    ),
    BrowserType(
        jsName = "TransformerTransformCallback",
        kotlinFqn = "web.streams.TransformerTransformCallback",
    ),
    BrowserType(
        jsName = "TransitionEvent",
        kotlinFqn = "web.cssom.TransitionEvent",
    ),
    BrowserType(
        jsName = "TransitionEventInit",
        kotlinFqn = "web.cssom.TransitionEventInit",
    ),
    BrowserType(
        jsName = "TreeWalker",
        kotlinFqn = "web.dom.TreeWalker",
    ),
    BrowserType(
        jsName = "TrustedHTML",
        kotlinFqn = "web.trustedtypes.TrustedHTML",
    ),
    BrowserType(
        jsName = "TrustedScript",
        kotlinFqn = "web.trustedtypes.TrustedScript",
    ),
    BrowserType(
        jsName = "TrustedScriptURL",
        kotlinFqn = "web.trustedtypes.TrustedScriptURL",
    ),
    BrowserType(
        jsName = "TrustedTypePolicy",
        kotlinFqn = "web.trustedtypes.TrustedTypePolicy",
    ),
    BrowserType(
        jsName = "TrustedTypePolicyFactory",
        kotlinFqn = "web.trustedtypes.TrustedTypePolicyFactory",
    ),
    BrowserType(
        jsName = "TrustedTypePolicyOptions",
        kotlinFqn = "web.trustedtypes.TrustedTypePolicyOptions",
    ),
    BrowserType(
        jsName = "TypeError",
        kotlinFqn = "js.errors.TypeError",
    ),
    BrowserType(
        jsName = "TypeGuard",
        kotlinFqn = "js.reflect.TypeGuard",
    ),
    BrowserType(
        jsName = "TypedArray",
        kotlinFqn = "js.typedarrays.TypedArray",
    ),
    BrowserType(
        jsName = "TypedArrayCompanion",
        kotlinFqn = "js.typedarrays.TypedArrayCompanion",
    ),
    BrowserType(
        jsName = "TypedPropertyDescriptor",
        kotlinFqn = "js.objects.TypedPropertyDescriptor",
    ),
    BrowserType(
        jsName = "UIEvent",
        kotlinFqn = "web.uievents.UIEvent",
    ),
    BrowserType(
        jsName = "UIEventInit",
        kotlinFqn = "web.uievents.UIEventInit",
    ),
    BrowserType(
        jsName = "UInt53",
        kotlinFqn = "js.numbers.UInt53",
    ),
    BrowserType(
        jsName = "ULongRange",
        kotlinFqn = "web.mediastreams.ULongRange",
    ),
    BrowserType(
        jsName = "URIError",
        kotlinFqn = "js.uri.URIError",
    ),
    BrowserType(
        jsName = "URL",
        kotlinFqn = "web.url.URL",
    ),
    BrowserType(
        jsName = "URLLike",
        kotlinFqn = "web.url.URLLike",
    ),
    BrowserType(
        jsName = "URLPattern",
        kotlinFqn = "web.url.URLPattern",
    ),
    BrowserType(
        jsName = "URLPatternComponentResult",
        kotlinFqn = "web.url.URLPatternComponentResult",
    ),
    BrowserType(
        jsName = "URLPatternInit",
        kotlinFqn = "web.url.URLPatternInit",
    ),
    BrowserType(
        jsName = "URLPatternOptions",
        kotlinFqn = "web.url.URLPatternOptions",
    ),
    BrowserType(
        jsName = "URLPatternResult",
        kotlinFqn = "web.url.URLPatternResult",
    ),
    BrowserType(
        jsName = "URLSearchParams",
        kotlinFqn = "web.url.URLSearchParams",
    ),
    BrowserType(
        jsName = "URLSource",
        kotlinFqn = "web.url.URLSource",
    ),
    BrowserType(
        jsName = "USB",
        kotlinFqn = "web.usb.USB",
    ),
    BrowserType(
        jsName = "USBAlternateInterface",
        kotlinFqn = "web.usb.USBAlternateInterface",
    ),
    BrowserType(
        jsName = "USBConfiguration",
        kotlinFqn = "web.usb.USBConfiguration",
    ),
    BrowserType(
        jsName = "USBConnectionEvent",
        kotlinFqn = "web.usb.USBConnectionEvent",
    ),
    BrowserType(
        jsName = "USBConnectionEventInit",
        kotlinFqn = "web.usb.USBConnectionEventInit",
    ),
    BrowserType(
        jsName = "USBControlTransferParameters",
        kotlinFqn = "web.usb.USBControlTransferParameters",
    ),
    BrowserType(
        jsName = "USBDevice",
        kotlinFqn = "web.usb.USBDevice",
    ),
    BrowserType(
        jsName = "USBDeviceFilter",
        kotlinFqn = "web.usb.USBDeviceFilter",
    ),
    BrowserType(
        jsName = "USBDeviceRequestOptions",
        kotlinFqn = "web.usb.USBDeviceRequestOptions",
    ),
    BrowserType(
        jsName = "USBDirection",
        kotlinFqn = "web.usb.USBDirection",
    ),
    BrowserType(
        jsName = "USBEndpoint",
        kotlinFqn = "web.usb.USBEndpoint",
    ),
    BrowserType(
        jsName = "USBEndpointType",
        kotlinFqn = "web.usb.USBEndpointType",
    ),
    BrowserType(
        jsName = "USBInTransferResult",
        kotlinFqn = "web.usb.USBInTransferResult",
    ),
    BrowserType(
        jsName = "USBInterface",
        kotlinFqn = "web.usb.USBInterface",
    ),
    BrowserType(
        jsName = "USBIsochronousInTransferPacket",
        kotlinFqn = "web.usb.USBIsochronousInTransferPacket",
    ),
    BrowserType(
        jsName = "USBIsochronousInTransferResult",
        kotlinFqn = "web.usb.USBIsochronousInTransferResult",
    ),
    BrowserType(
        jsName = "USBIsochronousOutTransferPacket",
        kotlinFqn = "web.usb.USBIsochronousOutTransferPacket",
    ),
    BrowserType(
        jsName = "USBIsochronousOutTransferResult",
        kotlinFqn = "web.usb.USBIsochronousOutTransferResult",
    ),
    BrowserType(
        jsName = "USBOutTransferResult",
        kotlinFqn = "web.usb.USBOutTransferResult",
    ),
    BrowserType(
        jsName = "USBRecipient",
        kotlinFqn = "web.usb.USBRecipient",
    ),
    BrowserType(
        jsName = "USBRequestType",
        kotlinFqn = "web.usb.USBRequestType",
    ),
    BrowserType(
        jsName = "USBTransferStatus",
        kotlinFqn = "web.usb.USBTransferStatus",
    ),
    BrowserType(
        jsName = "Uint16Array",
        kotlinFqn = "js.typedarrays.Uint16Array",
    ),
    BrowserType(
        jsName = "Uint32Array",
        kotlinFqn = "js.typedarrays.Uint32Array",
    ),
    BrowserType(
        jsName = "Uint32List",
        kotlinFqn = "web.gl.Uint32List",
    ),
    BrowserType(
        jsName = "Uint8Array",
        kotlinFqn = "js.typedarrays.Uint8Array",
    ),
    BrowserType(
        jsName = "Uint8ClampedArray",
        kotlinFqn = "js.typedarrays.Uint8ClampedArray",
    ),
    BrowserType(
        jsName = "UnderSized",
        kotlinFqn = "js.iterable.UnderSized",
    ),
    BrowserType(
        jsName = "UnderlineStyle",
        kotlinFqn = "web.editcontext.UnderlineStyle",
    ),
    BrowserType(
        jsName = "UnderlineThickness",
        kotlinFqn = "web.editcontext.UnderlineThickness",
    ),
    BrowserType(
        jsName = "UnderlyingByteSource",
        kotlinFqn = "web.streams.UnderlyingByteSource",
    ),
    BrowserType(
        jsName = "UnderlyingDefaultSource",
        kotlinFqn = "web.streams.UnderlyingDefaultSource",
    ),
    BrowserType(
        jsName = "UnderlyingSink",
        kotlinFqn = "web.streams.UnderlyingSink",
    ),
    BrowserType(
        jsName = "UnderlyingSinkAbortCallback",
        kotlinFqn = "web.streams.UnderlyingSinkAbortCallback",
    ),
    BrowserType(
        jsName = "UnderlyingSinkCloseCallback",
        kotlinFqn = "web.streams.UnderlyingSinkCloseCallback",
    ),
    BrowserType(
        jsName = "UnderlyingSinkStartCallback",
        kotlinFqn = "web.streams.UnderlyingSinkStartCallback",
    ),
    BrowserType(
        jsName = "UnderlyingSinkWriteCallback",
        kotlinFqn = "web.streams.UnderlyingSinkWriteCallback",
    ),
    BrowserType(
        jsName = "UnderlyingSource",
        kotlinFqn = "web.streams.UnderlyingSource",
    ),
    BrowserType(
        jsName = "UnderlyingSourceCancelCallback",
        kotlinFqn = "web.streams.UnderlyingSourceCancelCallback",
    ),
    BrowserType(
        jsName = "UnderlyingSourcePullCallback",
        kotlinFqn = "web.streams.UnderlyingSourcePullCallback",
    ),
    BrowserType(
        jsName = "UnderlyingSourceStartCallback",
        kotlinFqn = "web.streams.UnderlyingSourceStartCallback",
    ),
    BrowserType(
        jsName = "UnknownCredentialOptions",
        kotlinFqn = "web.authn.UnknownCredentialOptions",
    ),
    BrowserType(
        jsName = "UserActivation",
        kotlinFqn = "web.useractivation.UserActivation",
    ),
    BrowserType(
        jsName = "UserVerificationRequirement",
        kotlinFqn = "web.authn.UserVerificationRequirement",
    ),
    BrowserType(
        jsName = "VTTCue",
        kotlinFqn = "web.vtt.VTTCue",
    ),
    BrowserType(
        jsName = "VTTRegion",
        kotlinFqn = "web.vtt.VTTRegion",
    ),
    BrowserType(
        jsName = "ValidationTarget",
        kotlinFqn = "web.validation.ValidationTarget",
    ),
    BrowserType(
        jsName = "ValidityState",
        kotlinFqn = "web.validation.ValidityState",
    ),
    BrowserType(
        jsName = "ValidityStateFlags",
        kotlinFqn = "web.validation.ValidityStateFlags",
    ),
    BrowserType(
        jsName = "VibratePattern",
        kotlinFqn = "web.vibration.VibratePattern",
    ),
    BrowserType(
        jsName = "VideoColorPrimaries",
        kotlinFqn = "web.codecs.VideoColorPrimaries",
    ),
    BrowserType(
        jsName = "VideoColorSpace",
        kotlinFqn = "web.codecs.VideoColorSpace",
    ),
    BrowserType(
        jsName = "VideoColorSpaceInit",
        kotlinFqn = "web.codecs.VideoColorSpaceInit",
    ),
    BrowserType(
        jsName = "VideoConfiguration",
        kotlinFqn = "web.mediacapabilities.VideoConfiguration",
    ),
    BrowserType(
        jsName = "VideoDecoder",
        kotlinFqn = "web.codecs.VideoDecoder",
    ),
    BrowserType(
        jsName = "VideoDecoderConfig",
        kotlinFqn = "web.codecs.VideoDecoderConfig",
    ),
    BrowserType(
        jsName = "VideoDecoderInit",
        kotlinFqn = "web.codecs.VideoDecoderInit",
    ),
    BrowserType(
        jsName = "VideoDecoderSupport",
        kotlinFqn = "web.codecs.VideoDecoderSupport",
    ),
    BrowserType(
        jsName = "VideoEncoder",
        kotlinFqn = "web.codecs.VideoEncoder",
    ),
    BrowserType(
        jsName = "VideoEncoderBitrateMode",
        kotlinFqn = "web.codecs.VideoEncoderBitrateMode",
    ),
    BrowserType(
        jsName = "VideoEncoderConfig",
        kotlinFqn = "web.codecs.VideoEncoderConfig",
    ),
    BrowserType(
        jsName = "VideoEncoderEncodeOptions",
        kotlinFqn = "web.codecs.VideoEncoderEncodeOptions",
    ),
    BrowserType(
        jsName = "VideoEncoderEncodeOptionsForAvc",
        kotlinFqn = "web.codecs.VideoEncoderEncodeOptionsForAvc",
    ),
    BrowserType(
        jsName = "VideoEncoderInit",
        kotlinFqn = "web.codecs.VideoEncoderInit",
    ),
    BrowserType(
        jsName = "VideoEncoderSupport",
        kotlinFqn = "web.codecs.VideoEncoderSupport",
    ),
    BrowserType(
        jsName = "VideoFrame",
        kotlinFqn = "web.codecs.VideoFrame",
    ),
    BrowserType(
        jsName = "VideoFrameBufferInit",
        kotlinFqn = "web.codecs.VideoFrameBufferInit",
    ),
    BrowserType(
        jsName = "VideoFrameCallbackMetadata",
        kotlinFqn = "web.html.VideoFrameCallbackMetadata",
    ),
    BrowserType(
        jsName = "VideoFrameCopyToOptions",
        kotlinFqn = "web.codecs.VideoFrameCopyToOptions",
    ),
    BrowserType(
        jsName = "VideoFrameInit",
        kotlinFqn = "web.codecs.VideoFrameInit",
    ),
    BrowserType(
        jsName = "VideoFrameOutputCallback",
        kotlinFqn = "web.codecs.VideoFrameOutputCallback",
    ),
    BrowserType(
        jsName = "VideoFrameRequestCallback",
        kotlinFqn = "web.html.VideoFrameRequestCallback",
    ),
    BrowserType(
        jsName = "VideoFrameRequestId",
        kotlinFqn = "web.html.VideoFrameRequestId",
    ),
    BrowserType(
        jsName = "VideoMatrixCoefficients",
        kotlinFqn = "web.codecs.VideoMatrixCoefficients",
    ),
    BrowserType(
        jsName = "VideoPixelFormat",
        kotlinFqn = "web.codecs.VideoPixelFormat",
    ),
    BrowserType(
        jsName = "VideoPlaybackQuality",
        kotlinFqn = "web.html.VideoPlaybackQuality",
    ),
    BrowserType(
        jsName = "VideoTransferCharacteristics",
        kotlinFqn = "web.codecs.VideoTransferCharacteristics",
    ),
    BrowserType(
        jsName = "ViewTimeline",
        kotlinFqn = "web.animations.ViewTimeline",
    ),
    BrowserType(
        jsName = "ViewTimelineOptions",
        kotlinFqn = "web.animations.ViewTimelineOptions",
    ),
    BrowserType(
        jsName = "ViewTransition",
        kotlinFqn = "web.viewtransition.ViewTransition",
    ),
    BrowserType(
        jsName = "ViewTransitionTypeSet",
        kotlinFqn = "web.viewtransition.ViewTransitionTypeSet",
    ),
    BrowserType(
        jsName = "ViewTransitionUpdateCallback",
        kotlinFqn = "web.viewtransition.ViewTransitionUpdateCallback",
    ),
    BrowserType(
        jsName = "VisualViewport",
        kotlinFqn = "web.viewport.VisualViewport",
    ),
    BrowserType(
        jsName = "Void",
        kotlinFqn = "js.void.Void",
    ),
    BrowserType(
        jsName = "VoidFunction",
        kotlinFqn = "web.function.VoidFunction",
    ),
    BrowserType(
        jsName = "WEBGL_color_buffer_float",
        kotlinFqn = "web.gl.WEBGL_color_buffer_float",
    ),
    BrowserType(
        jsName = "WEBGL_compressed_texture_astc",
        kotlinFqn = "web.gl.WEBGL_compressed_texture_astc",
    ),
    BrowserType(
        jsName = "WEBGL_compressed_texture_etc",
        kotlinFqn = "web.gl.WEBGL_compressed_texture_etc",
    ),
    BrowserType(
        jsName = "WEBGL_compressed_texture_etc1",
        kotlinFqn = "web.gl.WEBGL_compressed_texture_etc1",
    ),
    BrowserType(
        jsName = "WEBGL_compressed_texture_pvrtc",
        kotlinFqn = "web.gl.WEBGL_compressed_texture_pvrtc",
    ),
    BrowserType(
        jsName = "WEBGL_compressed_texture_s3tc",
        kotlinFqn = "web.gl.WEBGL_compressed_texture_s3tc",
    ),
    BrowserType(
        jsName = "WEBGL_compressed_texture_s3tc_srgb",
        kotlinFqn = "web.gl.WEBGL_compressed_texture_s3tc_srgb",
    ),
    BrowserType(
        jsName = "WEBGL_debug_renderer_info",
        kotlinFqn = "web.gl.WEBGL_debug_renderer_info",
    ),
    BrowserType(
        jsName = "WEBGL_debug_shaders",
        kotlinFqn = "web.gl.WEBGL_debug_shaders",
    ),
    BrowserType(
        jsName = "WEBGL_depth_texture",
        kotlinFqn = "web.gl.WEBGL_depth_texture",
    ),
    BrowserType(
        jsName = "WEBGL_draw_buffers",
        kotlinFqn = "web.gl.WEBGL_draw_buffers",
    ),
    BrowserType(
        jsName = "WEBGL_lose_context",
        kotlinFqn = "web.gl.WEBGL_lose_context",
    ),
    BrowserType(
        jsName = "WEBGL_multi_draw",
        kotlinFqn = "web.gl.WEBGL_multi_draw",
    ),
    BrowserType(
        jsName = "WGSLLanguageFeatures",
        kotlinFqn = "web.gpu.WGSLLanguageFeatures",
    ),
    BrowserType(
        jsName = "WakeLock",
        kotlinFqn = "web.wakelock.WakeLock",
    ),
    BrowserType(
        jsName = "WakeLockSentinel",
        kotlinFqn = "web.wakelock.WakeLockSentinel",
    ),
    BrowserType(
        jsName = "WakeLockType",
        kotlinFqn = "web.wakelock.WakeLockType",
    ),
    BrowserType(
        jsName = "WaveShaperNode",
        kotlinFqn = "web.audio.WaveShaperNode",
    ),
    BrowserType(
        jsName = "WaveShaperOptions",
        kotlinFqn = "web.audio.WaveShaperOptions",
    ),
    BrowserType(
        jsName = "WeakMap",
        kotlinFqn = "js.collections.WeakMap",
    ),
    BrowserType(
        jsName = "WeakRef",
        kotlinFqn = "js.memory.WeakRef",
    ),
    BrowserType(
        jsName = "WeakSet",
        kotlinFqn = "js.collections.WeakSet",
    ),
    BrowserType(
        jsName = "WebAssembly.AddressType",
        kotlinFqn = "web.assembly.AddressType",
    ),
    BrowserType(
        jsName = "WebAssembly.AddressValue",
        kotlinFqn = "web.assembly.AddressValue",
    ),
    BrowserType(
        jsName = "WebAssembly.CompileError",
        kotlinFqn = "web.assembly.CompileError",
    ),
    BrowserType(
        jsName = "WebAssembly.Exception",
        kotlinFqn = "web.assembly.Exception",
    ),
    BrowserType(
        jsName = "WebAssembly.ExceptionOptions",
        kotlinFqn = "web.assembly.ExceptionOptions",
    ),
    BrowserType(
        jsName = "WebAssembly.ExportValue",
        kotlinFqn = "web.assembly.ExportValue",
    ),
    BrowserType(
        jsName = "WebAssembly.Exports",
        kotlinFqn = "web.assembly.Exports",
    ),
    BrowserType(
        jsName = "WebAssembly.Global",
        kotlinFqn = "web.assembly.Global",
    ),
    BrowserType(
        jsName = "WebAssembly.GlobalDescriptor",
        kotlinFqn = "web.assembly.GlobalDescriptor",
    ),
    BrowserType(
        jsName = "WebAssembly.ImportExportKind",
        kotlinFqn = "web.assembly.ImportExportKind",
    ),
    BrowserType(
        jsName = "WebAssembly.ImportValue",
        kotlinFqn = "web.assembly.ImportValue",
    ),
    BrowserType(
        jsName = "WebAssembly.Imports",
        kotlinFqn = "web.assembly.Imports",
    ),
    BrowserType(
        jsName = "WebAssembly.Instance",
        kotlinFqn = "web.assembly.Instance",
    ),
    BrowserType(
        jsName = "WebAssembly.LinkError",
        kotlinFqn = "web.assembly.LinkError",
    ),
    BrowserType(
        jsName = "WebAssembly.Memory",
        kotlinFqn = "web.assembly.Memory",
    ),
    BrowserType(
        jsName = "WebAssembly.MemoryDescriptor",
        kotlinFqn = "web.assembly.MemoryDescriptor",
    ),
    BrowserType(
        jsName = "WebAssembly.Module",
        kotlinFqn = "web.assembly.Module",
    ),
    BrowserType(
        jsName = "WebAssembly.ModuleExportDescriptor",
        kotlinFqn = "web.assembly.ModuleExportDescriptor",
    ),
    BrowserType(
        jsName = "WebAssembly.ModuleImportDescriptor",
        kotlinFqn = "web.assembly.ModuleImportDescriptor",
    ),
    BrowserType(
        jsName = "WebAssembly.ModuleImports",
        kotlinFqn = "web.assembly.ModuleImports",
    ),
    BrowserType(
        jsName = "WebAssembly.RuntimeError",
        kotlinFqn = "web.assembly.RuntimeError",
    ),
    BrowserType(
        jsName = "WebAssembly.Table",
        kotlinFqn = "web.assembly.Table",
    ),
    BrowserType(
        jsName = "WebAssembly.TableDescriptor",
        kotlinFqn = "web.assembly.TableDescriptor",
    ),
    BrowserType(
        jsName = "WebAssembly.TableKind",
        kotlinFqn = "web.assembly.TableKind",
    ),
    BrowserType(
        jsName = "WebAssembly.Tag",
        kotlinFqn = "web.assembly.Tag",
    ),
    BrowserType(
        jsName = "WebAssembly.TagType",
        kotlinFqn = "web.assembly.TagType",
    ),
    BrowserType(
        jsName = "WebAssembly.ValueType",
        kotlinFqn = "web.assembly.ValueType",
    ),
    BrowserType(
        jsName = "WebAssembly.WebAssemblyCompileOptions",
        kotlinFqn = "web.assembly.WebAssemblyCompileOptions",
    ),
    BrowserType(
        jsName = "WebAssembly.WebAssemblyInstantiatedSource",
        kotlinFqn = "web.assembly.WebAssemblyInstantiatedSource",
    ),
    BrowserType(
        jsName = "WebCodecsErrorCallback",
        kotlinFqn = "web.codecs.WebCodecsErrorCallback",
    ),
    BrowserType(
        jsName = "WebGL2RenderingContext",
        kotlinFqn = "web.gl.WebGL2RenderingContext",
    ),
    BrowserType(
        jsName = "WebGL2RenderingContextBase",
        kotlinFqn = "web.gl.WebGL2RenderingContextBase",
    ),
    BrowserType(
        jsName = "WebGL2RenderingContextOverloads",
        kotlinFqn = "web.gl.WebGL2RenderingContextOverloads",
    ),
    BrowserType(
        jsName = "WebGLActiveInfo",
        kotlinFqn = "web.gl.WebGLActiveInfo",
    ),
    BrowserType(
        jsName = "WebGLBuffer",
        kotlinFqn = "web.gl.WebGLBuffer",
    ),
    BrowserType(
        jsName = "WebGLContextAttributes",
        kotlinFqn = "web.gl.WebGLContextAttributes",
    ),
    BrowserType(
        jsName = "WebGLContextEvent",
        kotlinFqn = "web.gl.WebGLContextEvent",
    ),
    BrowserType(
        jsName = "WebGLContextEventInit",
        kotlinFqn = "web.gl.WebGLContextEventInit",
    ),
    BrowserType(
        jsName = "WebGLFramebuffer",
        kotlinFqn = "web.gl.WebGLFramebuffer",
    ),
    BrowserType(
        jsName = "WebGLPowerPreference",
        kotlinFqn = "web.gl.WebGLPowerPreference",
    ),
    BrowserType(
        jsName = "WebGLProgram",
        kotlinFqn = "web.gl.WebGLProgram",
    ),
    BrowserType(
        jsName = "WebGLQuery",
        kotlinFqn = "web.gl.WebGLQuery",
    ),
    BrowserType(
        jsName = "WebGLRenderbuffer",
        kotlinFqn = "web.gl.WebGLRenderbuffer",
    ),
    BrowserType(
        jsName = "WebGLRenderingContext",
        kotlinFqn = "web.gl.WebGLRenderingContext",
    ),
    BrowserType(
        jsName = "WebGLRenderingContextBase",
        kotlinFqn = "web.gl.WebGLRenderingContextBase",
    ),
    BrowserType(
        jsName = "WebGLRenderingContextOverloads",
        kotlinFqn = "web.gl.WebGLRenderingContextOverloads",
    ),
    BrowserType(
        jsName = "WebGLSampler",
        kotlinFqn = "web.gl.WebGLSampler",
    ),
    BrowserType(
        jsName = "WebGLShader",
        kotlinFqn = "web.gl.WebGLShader",
    ),
    BrowserType(
        jsName = "WebGLShaderPrecisionFormat",
        kotlinFqn = "web.gl.WebGLShaderPrecisionFormat",
    ),
    BrowserType(
        jsName = "WebGLSync",
        kotlinFqn = "web.gl.WebGLSync",
    ),
    BrowserType(
        jsName = "WebGLTexture",
        kotlinFqn = "web.gl.WebGLTexture",
    ),
    BrowserType(
        jsName = "WebGLTransformFeedback",
        kotlinFqn = "web.gl.WebGLTransformFeedback",
    ),
    BrowserType(
        jsName = "WebGLUniformLocation",
        kotlinFqn = "web.gl.WebGLUniformLocation",
    ),
    BrowserType(
        jsName = "WebGLVertexArrayObject",
        kotlinFqn = "web.gl.WebGLVertexArrayObject",
    ),
    BrowserType(
        jsName = "WebGLVertexArrayObjectOES",
        kotlinFqn = "web.gl.WebGLVertexArrayObjectOES",
    ),
    BrowserType(
        jsName = "WebSocket",
        kotlinFqn = "web.sockets.WebSocket",
    ),
    BrowserType(
        jsName = "WebTransport",
        kotlinFqn = "web.transport.WebTransport",
    ),
    BrowserType(
        jsName = "WebTransportBidirectionalStream",
        kotlinFqn = "web.transport.WebTransportBidirectionalStream",
    ),
    BrowserType(
        jsName = "WebTransportCloseInfo",
        kotlinFqn = "web.transport.WebTransportCloseInfo",
    ),
    BrowserType(
        jsName = "WebTransportCongestionControl",
        kotlinFqn = "web.transport.WebTransportCongestionControl",
    ),
    BrowserType(
        jsName = "WebTransportConnectionStats",
        kotlinFqn = "web.transport.WebTransportConnectionStats",
    ),
    BrowserType(
        jsName = "WebTransportDatagramDuplexStream",
        kotlinFqn = "web.transport.WebTransportDatagramDuplexStream",
    ),
    BrowserType(
        jsName = "WebTransportDatagramStats",
        kotlinFqn = "web.transport.WebTransportDatagramStats",
    ),
    BrowserType(
        jsName = "WebTransportError",
        kotlinFqn = "web.transport.WebTransportError",
    ),
    BrowserType(
        jsName = "WebTransportErrorOptions",
        kotlinFqn = "web.transport.WebTransportErrorOptions",
    ),
    BrowserType(
        jsName = "WebTransportErrorSource",
        kotlinFqn = "web.transport.WebTransportErrorSource",
    ),
    BrowserType(
        jsName = "WebTransportHash",
        kotlinFqn = "web.transport.WebTransportHash",
    ),
    BrowserType(
        jsName = "WebTransportOptions",
        kotlinFqn = "web.transport.WebTransportOptions",
    ),
    BrowserType(
        jsName = "WebTransportReceiveStream",
        kotlinFqn = "web.transport.WebTransportReceiveStream",
    ),
    BrowserType(
        jsName = "WebTransportReceiveStreamStats",
        kotlinFqn = "web.transport.WebTransportReceiveStreamStats",
    ),
    BrowserType(
        jsName = "WebTransportReliabilityMode",
        kotlinFqn = "web.transport.WebTransportReliabilityMode",
    ),
    BrowserType(
        jsName = "WebTransportSendOptions",
        kotlinFqn = "web.transport.WebTransportSendOptions",
    ),
    BrowserType(
        jsName = "WebTransportSendStream",
        kotlinFqn = "web.transport.WebTransportSendStream",
    ),
    BrowserType(
        jsName = "WebTransportSendStreamOptions",
        kotlinFqn = "web.transport.WebTransportSendStreamOptions",
    ),
    BrowserType(
        jsName = "WebTransportSendStreamStats",
        kotlinFqn = "web.transport.WebTransportSendStreamStats",
    ),
    BrowserType(
        jsName = "WellKnownDirectory",
        kotlinFqn = "web.fs.WellKnownDirectory",
    ),
    BrowserType(
        jsName = "WhatToShow",
        kotlinFqn = "web.dom.WhatToShow",
    ),
    BrowserType(
        jsName = "WheelEvent",
        kotlinFqn = "web.mouse.WheelEvent",
    ),
    BrowserType(
        jsName = "WheelEventInit",
        kotlinFqn = "web.mouse.WheelEventInit",
    ),
    BrowserType(
        jsName = "Window",
        kotlinFqn = "web.window.Window",
    ),
    BrowserType(
        jsName = "WindowClient",
        kotlinFqn = "web.serviceworker.WindowClient",
    ),
    BrowserType(
        jsName = "WindowEventHandlers",
        kotlinFqn = "web.window.WindowEventHandlers",
    ),
    BrowserType(
        jsName = "WindowName",
        kotlinFqn = "web.window.WindowName",
    ),
    BrowserType(
        jsName = "WindowPostMessageOptions",
        kotlinFqn = "web.window.WindowPostMessageOptions",
    ),
    BrowserType(
        jsName = "WindowProxy",
        kotlinFqn = "web.window.WindowProxy",
    ),
    BrowserType(
        jsName = "WindowTarget",
        kotlinFqn = "web.window.WindowTarget",
    ),
    BrowserType(
        jsName = "Worker",
        kotlinFqn = "web.workers.Worker",
    ),
    BrowserType(
        jsName = "WorkerFactory",
        kotlinFqn = "web.workers.WorkerFactory",
    ),
    BrowserType(
        jsName = "WorkerGlobalScope",
        kotlinFqn = "web.workers.WorkerGlobalScope",
    ),
    BrowserType(
        jsName = "WorkerLocation",
        kotlinFqn = "web.workers.WorkerLocation",
    ),
    BrowserType(
        jsName = "WorkerNavigator",
        kotlinFqn = "web.workers.WorkerNavigator",
    ),
    BrowserType(
        jsName = "WorkerOptions",
        kotlinFqn = "web.workers.WorkerOptions",
    ),
    BrowserType(
        jsName = "WorkerType",
        kotlinFqn = "web.workers.WorkerType",
    ),
    BrowserType(
        jsName = "Worklet",
        kotlinFqn = "web.worklets.Worklet",
    ),
    BrowserType(
        jsName = "WorkletGlobalScope",
        kotlinFqn = "web.worklets.WorkletGlobalScope",
    ),
    BrowserType(
        jsName = "WorkletModule",
        kotlinFqn = "web.worklets.WorkletModule",
    ),
    BrowserType(
        jsName = "WorkletOptions",
        kotlinFqn = "web.worklets.WorkletOptions",
    ),
    BrowserType(
        jsName = "WritableStream",
        kotlinFqn = "web.streams.WritableStream",
    ),
    BrowserType(
        jsName = "WritableStreamDefaultController",
        kotlinFqn = "web.streams.WritableStreamDefaultController",
    ),
    BrowserType(
        jsName = "WritableStreamDefaultWriter",
        kotlinFqn = "web.streams.WritableStreamDefaultWriter",
    ),
    BrowserType(
        jsName = "WriteCommandType",
        kotlinFqn = "web.fs.WriteCommandType",
    ),
    BrowserType(
        jsName = "WriteParams",
        kotlinFqn = "web.fs.WriteParams",
    ),
    BrowserType(
        jsName = "XMLDocument",
        kotlinFqn = "web.xml.XMLDocument",
    ),
    BrowserType(
        jsName = "XMLHttpRequest",
        kotlinFqn = "web.xhr.XMLHttpRequest",
    ),
    BrowserType(
        jsName = "XMLHttpRequestEventTarget",
        kotlinFqn = "web.xhr.XMLHttpRequestEventTarget",
    ),
    BrowserType(
        jsName = "XMLHttpRequestResponseType",
        kotlinFqn = "web.xhr.XMLHttpRequestResponseType",
    ),
    BrowserType(
        jsName = "XMLHttpRequestUpload",
        kotlinFqn = "web.xhr.XMLHttpRequestUpload",
    ),
    BrowserType(
        jsName = "XMLSerializer",
        kotlinFqn = "web.parsing.XMLSerializer",
    ),
    BrowserType(
        jsName = "XPathEvaluator",
        kotlinFqn = "web.xpath.XPathEvaluator",
    ),
    BrowserType(
        jsName = "XPathEvaluatorBase",
        kotlinFqn = "web.xpath.XPathEvaluatorBase",
    ),
    BrowserType(
        jsName = "XPathExpression",
        kotlinFqn = "web.xpath.XPathExpression",
    ),
    BrowserType(
        jsName = "XPathNSResolver",
        kotlinFqn = "web.xpath.XPathNSResolver",
    ),
    BrowserType(
        jsName = "XPathResult",
        kotlinFqn = "web.xpath.XPathResult",
    ),
    BrowserType(
        jsName = "XRAnchor",
        kotlinFqn = "web.xr.XRAnchor",
    ),
    BrowserType(
        jsName = "XRAnchorSet",
        kotlinFqn = "web.xr.XRAnchorSet",
    ),
    BrowserType(
        jsName = "XRBoundedReferenceSpace",
        kotlinFqn = "web.xr.XRBoundedReferenceSpace",
    ),
    BrowserType(
        jsName = "XRCPUDepthInformation",
        kotlinFqn = "web.xr.XRCPUDepthInformation",
    ),
    BrowserType(
        jsName = "XRCompositionLayer",
        kotlinFqn = "web.xr.XRCompositionLayer",
    ),
    BrowserType(
        jsName = "XRCubeLayer",
        kotlinFqn = "web.xr.XRCubeLayer",
    ),
    BrowserType(
        jsName = "XRCubeLayerInit",
        kotlinFqn = "web.xr.XRCubeLayerInit",
    ),
    BrowserType(
        jsName = "XRCylinderLayer",
        kotlinFqn = "web.xr.XRCylinderLayer",
    ),
    BrowserType(
        jsName = "XRCylinderLayerInit",
        kotlinFqn = "web.xr.XRCylinderLayerInit",
    ),
    BrowserType(
        jsName = "XRDOMOverlayInit",
        kotlinFqn = "web.xr.XRDOMOverlayInit",
    ),
    BrowserType(
        jsName = "XRDOMOverlayState",
        kotlinFqn = "web.xr.XRDOMOverlayState",
    ),
    BrowserType(
        jsName = "XRDOMOverlayType",
        kotlinFqn = "web.xr.XRDOMOverlayType",
    ),
    BrowserType(
        jsName = "XRDepthDataFormat",
        kotlinFqn = "web.xr.XRDepthDataFormat",
    ),
    BrowserType(
        jsName = "XRDepthInformation",
        kotlinFqn = "web.xr.XRDepthInformation",
    ),
    BrowserType(
        jsName = "XRDepthStateInit",
        kotlinFqn = "web.xr.XRDepthStateInit",
    ),
    BrowserType(
        jsName = "XRDepthType",
        kotlinFqn = "web.xr.XRDepthType",
    ),
    BrowserType(
        jsName = "XRDepthUsage",
        kotlinFqn = "web.xr.XRDepthUsage",
    ),
    BrowserType(
        jsName = "XREnvironmentBlendMode",
        kotlinFqn = "web.xr.XREnvironmentBlendMode",
    ),
    BrowserType(
        jsName = "XREquirectLayer",
        kotlinFqn = "web.xr.XREquirectLayer",
    ),
    BrowserType(
        jsName = "XREquirectLayerInit",
        kotlinFqn = "web.xr.XREquirectLayerInit",
    ),
    BrowserType(
        jsName = "XREye",
        kotlinFqn = "web.xr.XREye",
    ),
    BrowserType(
        jsName = "XRFrame",
        kotlinFqn = "web.xr.XRFrame",
    ),
    BrowserType(
        jsName = "XRFrameRequestCallback",
        kotlinFqn = "web.xr.XRFrameRequestCallback",
    ),
    BrowserType(
        jsName = "XRFrameRequestId",
        kotlinFqn = "web.xr.XRFrameRequestId",
    ),
    BrowserType(
        jsName = "XRHand",
        kotlinFqn = "web.xr.XRHand",
    ),
    BrowserType(
        jsName = "XRHandJoint",
        kotlinFqn = "web.xr.XRHandJoint",
    ),
    BrowserType(
        jsName = "XRHandedness",
        kotlinFqn = "web.xr.XRHandedness",
    ),
    BrowserType(
        jsName = "XRHitResult",
        kotlinFqn = "web.xr.XRHitResult",
    ),
    BrowserType(
        jsName = "XRHitTestOptionsInit",
        kotlinFqn = "web.xr.XRHitTestOptionsInit",
    ),
    BrowserType(
        jsName = "XRHitTestResult",
        kotlinFqn = "web.xr.XRHitTestResult",
    ),
    BrowserType(
        jsName = "XRHitTestSource",
        kotlinFqn = "web.xr.XRHitTestSource",
    ),
    BrowserType(
        jsName = "XRHitTestTrackableType",
        kotlinFqn = "web.xr.XRHitTestTrackableType",
    ),
    BrowserType(
        jsName = "XRInputSource",
        kotlinFqn = "web.xr.XRInputSource",
    ),
    BrowserType(
        jsName = "XRInputSourceArray",
        kotlinFqn = "web.xr.XRInputSourceArray",
    ),
    BrowserType(
        jsName = "XRInputSourceEvent",
        kotlinFqn = "web.xr.XRInputSourceEvent",
    ),
    BrowserType(
        jsName = "XRInputSourcesChangeEvent",
        kotlinFqn = "web.xr.XRInputSourcesChangeEvent",
    ),
    BrowserType(
        jsName = "XRInteractionMode",
        kotlinFqn = "web.xr.XRInteractionMode",
    ),
    BrowserType(
        jsName = "XRJointPose",
        kotlinFqn = "web.xr.XRJointPose",
    ),
    BrowserType(
        jsName = "XRJointSpace",
        kotlinFqn = "web.xr.XRJointSpace",
    ),
    BrowserType(
        jsName = "XRLayer",
        kotlinFqn = "web.xr.XRLayer",
    ),
    BrowserType(
        jsName = "XRLayerEvent",
        kotlinFqn = "web.xr.XRLayerEvent",
    ),
    BrowserType(
        jsName = "XRLayerInit",
        kotlinFqn = "web.xr.XRLayerInit",
    ),
    BrowserType(
        jsName = "XRLayerLayout",
        kotlinFqn = "web.xr.XRLayerLayout",
    ),
    BrowserType(
        jsName = "XRLayerQuality",
        kotlinFqn = "web.xr.XRLayerQuality",
    ),
    BrowserType(
        jsName = "XRMediaBinding",
        kotlinFqn = "web.xr.XRMediaBinding",
    ),
    BrowserType(
        jsName = "XRMediaCylinderLayerInit",
        kotlinFqn = "web.xr.XRMediaCylinderLayerInit",
    ),
    BrowserType(
        jsName = "XRMediaEquirectLayerInit",
        kotlinFqn = "web.xr.XRMediaEquirectLayerInit",
    ),
    BrowserType(
        jsName = "XRMediaLayerInit",
        kotlinFqn = "web.xr.XRMediaLayerInit",
    ),
    BrowserType(
        jsName = "XRMediaQuadLayerInit",
        kotlinFqn = "web.xr.XRMediaQuadLayerInit",
    ),
    BrowserType(
        jsName = "XRMesh",
        kotlinFqn = "web.xr.XRMesh",
    ),
    BrowserType(
        jsName = "XRMeshSet",
        kotlinFqn = "web.xr.XRMeshSet",
    ),
    BrowserType(
        jsName = "XRPlane",
        kotlinFqn = "web.xr.XRPlane",
    ),
    BrowserType(
        jsName = "XRPlaneOrientation",
        kotlinFqn = "web.xr.XRPlaneOrientation",
    ),
    BrowserType(
        jsName = "XRPlaneSet",
        kotlinFqn = "web.xr.XRPlaneSet",
    ),
    BrowserType(
        jsName = "XRPose",
        kotlinFqn = "web.xr.XRPose",
    ),
    BrowserType(
        jsName = "XRProjectionLayer",
        kotlinFqn = "web.xr.XRProjectionLayer",
    ),
    BrowserType(
        jsName = "XRProjectionLayerInit",
        kotlinFqn = "web.xr.XRProjectionLayerInit",
    ),
    BrowserType(
        jsName = "XRQuadLayer",
        kotlinFqn = "web.xr.XRQuadLayer",
    ),
    BrowserType(
        jsName = "XRQuadLayerInit",
        kotlinFqn = "web.xr.XRQuadLayerInit",
    ),
    BrowserType(
        jsName = "XRRay",
        kotlinFqn = "web.xr.XRRay",
    ),
    BrowserType(
        jsName = "XRReferenceSpace",
        kotlinFqn = "web.xr.XRReferenceSpace",
    ),
    BrowserType(
        jsName = "XRReferenceSpaceEvent",
        kotlinFqn = "web.xr.XRReferenceSpaceEvent",
    ),
    BrowserType(
        jsName = "XRReferenceSpaceType",
        kotlinFqn = "web.xr.XRReferenceSpaceType",
    ),
    BrowserType(
        jsName = "XRRenderState",
        kotlinFqn = "web.xr.XRRenderState",
    ),
    BrowserType(
        jsName = "XRRenderStateInit",
        kotlinFqn = "web.xr.XRRenderStateInit",
    ),
    BrowserType(
        jsName = "XRRigidTransform",
        kotlinFqn = "web.xr.XRRigidTransform",
    ),
    BrowserType(
        jsName = "XRSession",
        kotlinFqn = "web.xr.XRSession",
    ),
    BrowserType(
        jsName = "XRSessionEvent",
        kotlinFqn = "web.xr.XRSessionEvent",
    ),
    BrowserType(
        jsName = "XRSessionGrant",
        kotlinFqn = "web.xr.XRSessionGrant",
    ),
    BrowserType(
        jsName = "XRSessionInit",
        kotlinFqn = "web.xr.XRSessionInit",
    ),
    BrowserType(
        jsName = "XRSessionMode",
        kotlinFqn = "web.xr.XRSessionMode",
    ),
    BrowserType(
        jsName = "XRSpace",
        kotlinFqn = "web.xr.XRSpace",
    ),
    BrowserType(
        jsName = "XRSubImage",
        kotlinFqn = "web.xr.XRSubImage",
    ),
    BrowserType(
        jsName = "XRSystem",
        kotlinFqn = "web.xr.XRSystem",
    ),
    BrowserType(
        jsName = "XRSystemDeviceChangeEvent",
        kotlinFqn = "web.xr.XRSystemDeviceChangeEvent",
    ),
    BrowserType(
        jsName = "XRSystemSessionGrantedEvent",
        kotlinFqn = "web.xr.XRSystemSessionGrantedEvent",
    ),
    BrowserType(
        jsName = "XRTargetRayMode",
        kotlinFqn = "web.xr.XRTargetRayMode",
    ),
    BrowserType(
        jsName = "XRTextureType",
        kotlinFqn = "web.xr.XRTextureType",
    ),
    BrowserType(
        jsName = "XRTransientInputHitTestOptionsInit",
        kotlinFqn = "web.xr.XRTransientInputHitTestOptionsInit",
    ),
    BrowserType(
        jsName = "XRTransientInputHitTestResult",
        kotlinFqn = "web.xr.XRTransientInputHitTestResult",
    ),
    BrowserType(
        jsName = "XRTransientInputHitTestSource",
        kotlinFqn = "web.xr.XRTransientInputHitTestSource",
    ),
    BrowserType(
        jsName = "XRView",
        kotlinFqn = "web.xr.XRView",
    ),
    BrowserType(
        jsName = "XRViewerPose",
        kotlinFqn = "web.xr.XRViewerPose",
    ),
    BrowserType(
        jsName = "XRViewport",
        kotlinFqn = "web.xr.XRViewport",
    ),
    BrowserType(
        jsName = "XRVisibilityState",
        kotlinFqn = "web.xr.XRVisibilityState",
    ),
    BrowserType(
        jsName = "XRWebGLBinding",
        kotlinFqn = "web.xr.XRWebGLBinding",
    ),
    BrowserType(
        jsName = "XRWebGLDepthInformation",
        kotlinFqn = "web.xr.XRWebGLDepthInformation",
    ),
    BrowserType(
        jsName = "XRWebGLLayer",
        kotlinFqn = "web.xr.XRWebGLLayer",
    ),
    BrowserType(
        jsName = "XRWebGLLayerInit",
        kotlinFqn = "web.xr.XRWebGLLayerInit",
    ),
    BrowserType(
        jsName = "XRWebGLSubImage",
        kotlinFqn = "web.xr.XRWebGLSubImage",
    ),
    BrowserType(
        jsName = "XSLTProcessor",
        kotlinFqn = "web.xslt.XSLTProcessor",
    ),
)
