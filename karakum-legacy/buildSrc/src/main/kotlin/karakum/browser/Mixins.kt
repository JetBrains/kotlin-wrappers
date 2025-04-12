package karakum.browser

internal object Mixins {
    private val SAFE: Set<String> = setOf(
        "LocaleOptions",
        "AbstractWorker",
        "MessageEventTarget",

        // CSS
        "LinkStyle",

        // DOM
        "ARIAMixin",
        "GlobalEventHandlers",
        "NonDocumentTypeChildNode",
        "Slottable",

        // Window
        "WindowEventHandlers",
    )

    val UNSAFE: Set<String> = setOf(
        "Body",
        "CanvasPath",

        "FontFaceSource",
        "XPathEvaluatorBase",

        "Animatable",
        "ElementCSSInlineStyle",
        "ChildNode",
        "DocumentOrShadowRoot",
        "HTMLHyperlinkElementUtils",
        "HTMLOrSVGElement",
        "ParentNode",
        "ElementContentEditable",
        "PopoverInvokerElement",

        "TextDecoderCommon",
        "TextEncoderCommon",

        "ReadableStreamGenericReader",

        "SVGAnimatedPoints",
        "SVGFilterPrimitiveStandardAttributes",
        "SVGFitToViewBox",
        "SVGTests",
        "SVGURIReference",

        "GPUError",
        "GPUObjectBase",
        "GPUPipelineBase",
        "GPUBindingCommandsMixin",
        "GPUDebugCommandsMixin",
        "GPURenderCommandsMixin",
    )

    val ALL: Set<String> = SAFE + UNSAFE
}
