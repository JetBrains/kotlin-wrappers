package karakum.browser

internal const val CUSTOM_ELEMENT = "CustomElement"
internal const val CUSTOM_ELEMENT_COMPANION = "CustomElementCompanion"

private val CALLBACKS = mapOf(
    "connectedCallback" to "()",
    "disconnectedCallback" to "()",
    "adoptedCallback" to "()",
    "attributeChangedCallback" to """(
        name: String,
        oldValue: JsAny?,
        newValue: JsAny?,
    )""",
)

internal fun customElementTypes(): Sequence<ConversionResult> =
    sequenceOf(
        CustomElement(),
        CustomElementCompanion(),
    )

private fun CustomElement(): ConversionResult {
    val mainInterface = """
        interface WithCallbacks:
            ${CALLBACKS.keys.joinToString(",\n") { interfaceName(it) }}
        """.trimIndent()

    val interfaces = CALLBACKS.entries.joinToString("\n") { (methodName, methodBody) ->
        """
        interface ${interfaceName(methodName)} {
            /**
             * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components#${methodName.lowercase()})
             */
            fun ${methodName}${methodBody}
        }
        """.trimIndent()
    }

    val body = """
    external interface $CUSTOM_ELEMENT {
        $mainInterface
        
        $interfaces
    }
    """.trimIndent()

    return ConversionResult(
        name = CUSTOM_ELEMENT,
        body = body,
        pkg = "web.components"
    )
}

private fun CustomElementCompanion(): ConversionResult {
    val body = """
    external interface $CUSTOM_ELEMENT_COMPANION {
        val formAssociated: Boolean?
            get() = definedExternally
    
        /**
         * [MDN Reference](https://developer.mozilla.org/en-US/docs/Web/API/Web_components/Using_custom_elements#responding_to_attribute_changes)
         */
        val observedAttributes: ReadonlyArray<String>?
            get() = definedExternally
    }
    """.trimIndent()

    return ConversionResult(
        name = CUSTOM_ELEMENT_COMPANION,
        body = body,
        pkg = "web.components"
    )
}
