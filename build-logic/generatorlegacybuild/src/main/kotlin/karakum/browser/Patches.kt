package karakum.browser

private const val SVG_ANIMATED_ENUMERATION_BEFORE = "\ninterface SVGAnimatedEnumeration {"
private const val SVG_ANIMATED_ENUMERATION_AFTER = "\ninterface SVGAnimatedEnumeration<T> {"

internal fun String.applyPatches(): String {
    return patchVideoFrameCallback()
        .applyReadyStatePatches()
        .replace(" extends NodeListOf<", " extends NodeList<")
        .replace(": NodeListOf<", ": NodeList<")
        .replace(" extends HTMLCollectionOf<", " extends HTMLCollection<")
        .replace(": HTMLCollectionOf<", ": HTMLCollection<")
        .patchQuerySelectors()
        .replace(Regex("""(\n\s+)get (.+)\(\)(: string;)\n\s+set .+\(.+: string \| null\);"""), "$1$2$3")
        .replace(Regex("""(\n\s+)get (.+)\(\)(: .+;)"""), "$1readonly $2$3")
        .replace(Regex("""\n\s+set .+\(.+: string\);"""), "")
        .replace("    autocapitalize: string;", "    autocapitalize: $AUTO_CAPITALIZE;")
        .replace("""    fetchPriority: "high" | "low" | "auto";""", "    fetchPriority: $FETCH_PRIORITY;")
        .patchInterfaces("Request", "RequestInit", "XMLHttpRequest") {
            it.replace(Regex("""([( ]method\??: )string([;,])"""), "$1$REQUEST_METHOD$2")
        }
        .patchInterface("HTMLElement") {
            it.replace("    popover: string | null;", "    popover: $POPOVER | null;")
        }
        .patchInterface("PopoverInvokerElement") {
            it.replace(
                "    popoverTargetAction: string;",
                "    popoverTargetAction: $POPOVER_TARGET_ACTION;",
            )
        }
        .patchInterfaces("ToggleEvent", "ToggleEventInit") {
            it.replace("State: string;", "State: $TOGGLE_STATE;")
                .replace("State?: string;", "State?: $TOGGLE_STATE;")
        }
        .patchInterface("HTMLFormElement") {
            it.replace("    method: string;", "    method: $FORM_METHOD;")
                .replace("    enctype: string;", "    enctype: $FORM_ENCTYPE;")
        }
        .replace("    formMethod: string;", "    formMethod: $FORM_METHOD;")
        .replace("    formEnctype: string;", "    formEnctype: $FORM_ENCTYPE;")
        .patchInterface("ProgressEvent") {
            it.replace("\n    readonly target: T | null;", "")
        }
        .replace("ProgressEvent<T extends EventTarget = EventTarget>", "ProgressEvent")
        .replace("ProgressEvent<FileReader>", "ProgressEvent")
        .patchInterface("CustomEvent") {
            it.replace("\n    readonly detail: T;", "\n    readonly detail: D;")
        }
        .replace(" CustomEvent<T = any>", " CustomEvent<D = any>")
        .patchInterface("CustomEventInit") {
            it.replace("\n    detail?: T;", "\n    detail?: D;")
        }
        .replace(" CustomEventInit<T = any>", " CustomEventInit<D = any>")
        .replace(" CustomEventInit<T>", " CustomEventInit<D>")
        .patchInterface("MessageEvent") {
            it.replace("\n    readonly data: T;", "\n    readonly data: D;")
        }
        .replace(" MessageEvent<T = any>", " MessageEvent<D = any>")
        .patchInterface("MessageEventInit") {
            it.replace("\n    data?: T;", "\n    data?: D;")
        }
        .replace(" MessageEventInit<T = any>", " MessageEventInit<D = any>")
        .replace(" MessageEventInit<T>", " MessageEventInit<D>")
        .patchInterface("URLSearchParams") {
            it.replace("name: string", "key: string")
                .replace(
                    "    has(key: string, value?: string): boolean;",
                    "    has(key: string): boolean;" +
                            "\n    has(key: string, value: string): boolean;",
                )
        }
        .patchInterface("MediaKeyStatusMap") {
            it.replace("(keyId: ", "(key: ")
        }
        .patchInterface("StylePropertyMapReadOnly") {
            it.replace("has(property: ", "has(key: ")
        }
        .patchInterface("EventModifierInit") {
            it.replace("    ", "    readonly ")
        }
        // FormData
        .replace(
            "\n    append(name: string, value: string | Blob): void;\n" +
                    "    append(name: string, value: string): void;\n",
            "\n    append(name: string, value: string | Blob): void;\n",
        )
        .replace(
            "\n    set(name: string, value: string | Blob): void;\n" +
                    "    set(name: string, value: string): void;\n",
            "\n    set(name: string, value: string | Blob): void;\n",
        )
        .replace("    getReader(options: { mode: \"byob\" }): ReadableStreamBYOBReader;\n", "")
        .replace(
            ", strategy?: { highWaterMark?: number }): ReadableStream<",
            ", strategy?: QueuingStrategy<R>): ReadableStream<",
        )
        .patchInterface("ReadableStream") {
            "$it\n    values(options?: ReadableStreamIteratorOptions): AsyncIterator<R>"
        }
        .replace(
            "// abort(reason?: any): AbortSignal; - To be re-added in the future",
            "abort(reason?: any): AbortSignal;",
        )
        .replace(""""Ed25519" | { name: "Ed25519" }""", "${ED25519}Algorithm")
        .replace("    reason?: any;", "    reason?: JsError | undefined;")
        .replace("readonly reason: any;", "readonly reason: JsError | undefined;")
        .replace("(reason?: any)", "(reason?: JsError | undefined)")
        .replace("\n    exportKey(format: KeyFormat, key: CryptoKey): Promise<ArrayBuffer | JsonWebKey>;", "")
        .splitUnion("string | string[]")
        .splitUnion("string | number[]")
        .splitUnion("string | BufferSource")
        .splitUnion("number[] | Float32Array")
        .splitUnion("string | WorkerOptions")
        .splitUnion("string | ElementCreationOptions")
        .splitUnion("(Element | Text)[]", "Element[] | Text[]")
        .splitUnion("(Node | string)[]", "Node[] | string[]")
        .patchInterface("ParentNode") {
            it.replace(
                "\n    replaceChildren(...nodes: string[]): void;",
                "\n    replaceChildren(...nodes: string[]): void;" +
                        "\n    replaceChildren(): void;"
            )
        }
        .splitUnion("(CSSStyleValue | string)[]", "CSSStyleValue[] | string[]")
        .splitUnion("boolean | ImportNodeOptions")
        .replace(
            "importNode<T extends Node>(node: T, options?: boolean)",
            "importNode<T extends Node>(node: T, subtree?: boolean)",
        )
        .splitUnion("HTMLOptionElement | HTMLOptGroupElement")
        .splitUnion("ViewTransitionUpdateCallback | StartViewTransitionOptions")
        .splitUnion("HTMLElement | number")
        .splitUnion("string[][] | Record<string, string> | string | URLSearchParams")
        .splitTypealias("BinaryData")
        .splitUnion("string | ArrayBuffer | ArrayBufferView")
        .splitUnion("Document | XMLHttpRequestBodyInit")
        .splitTypealias("XMLHttpRequestBodyInit")
        .splitUnion("Blob | BufferSource | FormData | URLSearchParams | string")
        .splitUnion("string | URL")
        .splitUnion("string | Blob")
        .replace("(request: RequestInfo | URL,", "(url: string | URL | Request,")
        .replace("(request?: RequestInfo | URL,", "(url?: string | URL | Request,")
        .replace("(request: RequestInfo | URL)", "(url: string | URL | Request)")
        .replace("(request?: RequestInfo | URL)", "(url?: string | URL | Request)")
        .replace("(input: RequestInfo | URL,", "(url: string | URL | Request,")
        .splitUnion("string | URL | Request")
        .replace("(url: Request,", "(request: Request,")
        .replace("(url?: Request,", "(request?: Request,")
        .replace("(url: Request)", "(request: Request)")
        .replace("(url?: Request)", "(request?: Request)")
        .splitUnion("RequestInfo | URL")
        .splitUnion("RequestInfo", "Request | string")
        .replace("(requests: string[])", "(urls: string[])")
        .replace(", protocols?: string)", ", protocol?: string)")
        .replace("headers?: HeadersInit", "headers?: Headers")
        .splitTypealias("HeadersInit")
        .splitUnion("[string, string][] | Record<string, string> | Headers")
        .splitUnion("MediaStreamTrack | string")
        .splitUnion("Path2D | string")
        .splitUnion("string | PerformanceMeasureOptions")
        .splitUnion("string | ArrayBufferLike | Blob | ArrayBufferView")
        .splitUnion("AlgorithmIdentifier | AesDerivedKeyParams | HmacImportParams | HkdfParams | Pbkdf2Params")
        .splitUnion("AlgorithmIdentifier | EcdhKeyDeriveParams | HkdfParams | Pbkdf2Params")
        .splitUnion("AlgorithmIdentifier | RsaHashedImportParams | EcKeyImportParams | HmacImportParams | AesKeyAlgorithm")
        .splitUnion("AlgorithmIdentifier | RsaOaepParams | AesCtrParams | AesCbcParams | AesGcmParams")
        .splitUnion("AlgorithmIdentifier | RsaPssParams | EcdsaParams")
        .splitUnion("AlgorithmIdentifier", "Algorithm | string")
        .splitUnion("RsaHashedKeyGenParams | EcKeyGenParams")
        .splitUnion("AesKeyGenParams | HmacKeyGenParams | Pbkdf2Params")
        .splitUnion("IDBValidKey | IDBKeyRange")
        .splitUnion("PaymentDetailsUpdate | PromiseLike<PaymentDetailsUpdate>")
        .splitUnion("Response | PromiseLike<Response>")
        .splitUnion("Keyframe[] | PropertyIndexedKeyframes")
        .splitUnion("number | KeyframeAnimationOptions")
        .splitUnion("number | KeyframeEffectOptions")
        .patchDomGeometry()
        .replace(GET_CONTEXT_REGEX, "")
        .replace("quality?: any", "quality?: number")
        .replace("clearWatch(watchId: number)", "clearWatch(watchId: $GEOLOCATION_WATCH_ID)")
        .replace(": PositionOptions): number;", ": PositionOptions): $GEOLOCATION_WATCH_ID;")
        .replaceFirst("readonly labels: NodeList;", "readonly labels: NodeList<HTMLLabelElement>;")
        .replaceFirst(
            """    setFormValue(value: File | string | FormData | null, state?: File | string | FormData | null): void;""",
            sequenceOf(
                """    setFormValue(value: File | null, state?: File | null): void;""",
                """    setFormValue(value: string | null, state?: string | null): void;""",
                """    setFormValue(value: FormData | null, state?: FormData | null): void;""",
            ).joinToString("\n")
        )
        .let {
            val lines = listOf(
                """new(angle: CSSNumericValue): CSSRotate;""",
                """new(x: CSSNumberish, y: CSSNumberish, z: CSSNumberish, angle: CSSNumericValue): CSSRotate;""",
            )

            it.replaceFirst(
                lines.joinToString("\n    "),
                lines.reversed().joinToString("\n    "),
            )
        }
        // TODO: use `Error`
        .replace("  error(e?: any)", "  error(error?: JsError)")
        .replace(
            Regex("""forEach\(callbackfn: \(value: ([\w\[\]]+), .+?, thisArg\?: any\): void;"""),
            "forEach(action: (item: $1) => void): void;"
        )
        .replace("): undefined | CSSStyleValue", "): CSSStyleValue | undefined")
        .replace(
            "FileSystemWritableFileStream extends WritableStream {",
            "FileSystemWritableFileStream extends WritableStream<FileSystemWriteChunkType> {"
        )
        .patchCollections()
        .replace(
            "arg?: boolean | ScrollIntoViewOptions",
            "options?: ScrollIntoViewOptions",
        )
        .replace(""": "jwk"""", ": KeyFormat.jwk")
        .replace(""": Exclude<KeyFormat, "jwk">""", ": KeyFormat")
        .replace(
            "getModifierState(keyArg: string): boolean",
            "getModifierState(keyArg: $MODIFIER_KEY_CODE): boolean",
        )
        // TODO: apply for `KeyboardEvent` only
        .replace(
            "readonly code: string",
            "readonly code: KeyCode",
        )
        .replace(
            "code?: string",
            "code?: KeyCode",
        )
        .replace(
            "referrerPolicy: string",
            "referrerPolicy: ReferrerPolicy",
        )
        .replace(
            """decoding: "async" | "sync" | "auto";""",
            """decoding: ImageDecoding;""",
        )
        .replace(
            """loading: "eager" | "lazy";""",
            """loading: Loading;""",
        )
        .replace(
            """enterKeyHint: string;""",
            """enterKeyHint: EnterKeyHint;""",
        )
        .replace(
            """inputMode: string;""",
            """inputMode: InputMode;""",
        )
        .replace(
            "crossOrigin: string",
            "crossOrigin: CrossOrigin",
        )
        .patchInterface("DOMTokenList") {
            it.replace(": string", ": T")
        }
        .replace("interface DOMTokenList {", "interface DOMTokenList<T : JsAny> {")
        .replace("classList: DOMTokenList;", "classList: DOMTokenList<ClassName>;")
        .replace("blocking: DOMTokenList;", "blocking: DOMTokenList<$BLOCKING>;")
        .replace("htmlFor: DOMTokenList;", "htmlFor: DOMTokenList<ElementId>;")
        .replace(": DOMTokenList;", ": DOMTokenList<String>;")
        .replace("className: string", "className: ClassName")
        .replace("classNames: string", "classNames: ClassName")
        .replace("elementId: string", "elementId: ElementId")
        .patchInterface("Element") {
            it.replace("id: string;", "id: ElementId;")
        }
        .patchInterface("SVGAnimatedEnumeration") {
            it.replace("Val: number;", "Val: T;")
        }
        .replace(
            """    texParameterf(target: GLenum, pname: GLenum, param: GLfloat): void;""",
            sequenceOf(
                """    texParameterf(target: GLenum, pname: GLenum, param: GLenum): void;""",
                """    texParameterf(target: GLenum, pname: GLenum, param: GLfloat): void;""",
            ).joinToString("\n")
        )
        .replace(
            """    texParameteri(target: GLenum, pname: GLenum, param: GLint): void;""",
            sequenceOf(
                """    texParameteri(target: GLenum, pname: GLenum, param: GLenum): void;""",
                """    texParameteri(target: GLenum, pname: GLenum, param: GLint): void;""",
            ).joinToString("\n")
        )
        .replace(" MessageEventTarget<MessagePort>", " MessageEventTarget")
        .replace(" MessageEventTarget<Worker>", " MessageEventTarget")
        .replace(" MessageEventTarget<T>", " MessageEventTarget")
        .replace(SVG_ANIMATED_ENUMERATION_BEFORE, SVG_ANIMATED_ENUMERATION_AFTER)
        .applyInlineUnionPatches()
        .patchInterface("Console") {
            it.splitToSequence("\n")
                .flatMap { line ->
                    val additionalLine = line.replace(
                        "(...data: any[])",
                        "(...data: (string | undefined)[])",
                    )

                    sequenceOf(line, additionalLine)
                        .distinct()
                }
                .joinToString("\n")
        }
        // https://github.com/microsoft/TypeScript-DOM-lib-generator/issues/2054
        .replace(
            "declare function getComputedStyle(elt: Element, pseudoElt?: string | null): CSSStyleDeclaration;",
            "declare function getComputedStyle(elt: Element, pseudoElt?: string | null): CSSStyleProperties;",
        )
        // https://github.com/microsoft/TypeScript-DOM-lib-generator/issues/2054
        .patchInterface("ElementCSSInlineStyle") {
            it.replace(" readonly style: CSSStyleDeclaration;", " readonly style: CSSStyleProperties;")
        }
}

internal val DOM_GEOMETRY_ALIASES = listOf(
    "DOMQuadInit" to "DOMQuad",
    "DOMPointInit" to "DOMPointReadOnly",
    "DOMRectInit" to "DOMRectReadOnly",
    "DOMMatrixInit" to "DOMMatrixReadOnly",
    "DOMMatrix2DInit" to "DOMMatrixReadOnly",
)

private fun String.patchDomGeometry(): String =
    DOM_GEOMETRY_ALIASES.fold(this) { acc, (initType, aliasType) ->
        val aliasComment = if ("2D" in initType) " /* $initType */" else ""
        acc.splitUnionSafety(initType, aliasType + aliasComment)
    }
        .replace(": DOMRectInit", ": DOMRectReadOnly")

private fun String.patchVideoFrameCallback(): String =
    replace(
        "cancelVideoFrameCallback(handle: number): void;",
        "cancelVideoFrameCallback(requestId: $VIDEO_FRAME_REQUEST_ID): void;"
    )
        .replace(
            "requestVideoFrameCallback(callback: VideoFrameRequestCallback): number;",
            "requestVideoFrameCallback(callback: VideoFrameRequestCallback): $VIDEO_FRAME_REQUEST_ID;"
        )

private fun String.patchCollections(): String {
    var result = this

    sequenceOf(
        "NodeList" to "Node",
        "HTMLCollectionBase" to "Element",
        "HTMLCollection" to "Element",
    ).forEach { (type, bound) ->
        val body = Regex("""interface $type [\s\S]+?}""")
            .find(this)!!
            .value

        val newBody = body
            .replaceFirst(type, "$type<T extends $bound>")
            .replace(": $bound", ": T")

        result = result.replace(body, newBody)
    }

    return result
}

internal fun String.patchInterfaces(
    vararg names: String,
    transform: (String) -> String,
): String =
    names.fold(this) { acc, name ->
        acc.patchInterface(name, transform)
    }

internal fun String.patchInterface(
    name: String,
    transform: (String) -> String,
): String {
    val declarationStart = sequenceOf(
        "\ninterface $name ",
        "\ninterface $name<",
    ).firstOrNull { it in this }
        ?: return this

    val oldBody = "\n" + substringAfter(declarationStart, "")
        .substringAfter("{\n", "")
        .substringBefore("\n}", "")

    return replaceFirst(oldBody, transform(oldBody))
}

private fun String.patchQuerySelectors(): String =
    this
        .replace(
            "querySelector<K extends keyof HTMLElementTagNameMap>(selectors: K): HTMLElementTagNameMap[K] | null;",
            "querySelector<T extends Element>(selectors: TagName<T>): T | null;"
        )
        .replace(
            "querySelector<K extends keyof SVGElementTagNameMap>(selectors: K): SVGElementTagNameMap[K] | null;",
            ""
        )
        .replace(
            "querySelector<K extends keyof MathMLElementTagNameMap>(selectors: K): MathMLElementTagNameMap[K] | null;",
            ""
        )
        .replace(
            "querySelector<E extends Element = Element>(selectors: string): E | null;",
            "querySelector(selectors: string): Element | null;"
        )
        .replace(
            "querySelectorAll<K extends keyof HTMLElementTagNameMap>(selectors: K): NodeList<HTMLElementTagNameMap[K]>;",
            "querySelectorAll<T extends Element>(selectors: TagName<T>): NodeList<T>;"
        )
        .replace(
            "querySelectorAll<K extends keyof SVGElementTagNameMap>(selectors: K): NodeList<SVGElementTagNameMap[K]>;",
            ""
        )
        .replace(
            "querySelectorAll<K extends keyof MathMLElementTagNameMap>(selectors: K): NodeList<MathMLElementTagNameMap[K]>;",
            ""
        )
        .replace(
            "querySelectorAll<E extends Element = Element>(selectors: string): NodeList<E>;",
            "querySelectorAll(selectors: string): NodeList<Element>;"
        )
        .replace(
            "\"$SVG_NAMESPACE\"",
            "SVG_NAMESPACE"
        )
        .replace(
            "\"$MATHML_NAMESPACE\"",
            "MATHML_NAMESPACE"
        )

private fun String.applyInlineUnionPatches(): String =
    UNION_DATA_LIST.fold(this) { acc, data ->
        val values = data.values.let {
            if (data.name == PRELOAD) it + "" else it
        }

        val before = ": " + values.joinToString(" | ") { "\"$it\"" }
        require(before in acc)
        acc.replace(before, ": ${data.name}")
    }

// TODO: remove after `splitUnion` fix
private fun String.splitUnionSafety(
    union: String,
    unionBody: String,
): String {
    val parts = unionBody.split(" | ")

    return splitToSequence("\n")
        .flatMap { line ->
            splitUnionLine(
                line = line,
                union = union,
                parts = parts,
                optional = true,
            )
        }
        .joinToString("\n")
}

internal fun String.splitTypealias(
    name: String,
): String {
    val aliasDeclaration = "\ntype $name = "
    val aliasBody = substringAfter(aliasDeclaration)
        .substringBefore("\n")

    return replace(aliasDeclaration + aliasBody, "")
        .replace(name, aliasBody.removeSuffix(";"))
}

internal fun String.splitUnion(
    union: String,
    unionBody: String? = null,
): String {
    val parts = (unionBody ?: union).split(" | ")

    return splitToSequence("\n")
        .flatMap { line ->
            splitUnionLine(
                line = line,
                union = union,
                parts = parts,
                optional = true,
            )
        }
        .flatMap { line ->
            splitUnionLine(
                line = line,
                union = union,
                parts = parts,
                optional = false,
            )
        }
        .joinToString("\n")
}

private fun splitUnionLine(
    line: String,
    union: String,
    parts: List<String>,
    optional: Boolean,
): Sequence<String> {
    if ("(" !in line || (line.indexOf(":") < line.indexOf("(")))
        return sequenceOf(line)

    val optionality = if (optional) "?" else ""
    val declaration = "$optionality: $union"

    if (declaration !in line)
        return sequenceOf(line)

    return parts.asSequence()
        .mapIndexed { index, part ->
            line.replace(declaration, if (index == 0) "$optionality: $part" else ": $part")
        }
}
