package karakum.browser

import karakum.common.unionBody

internal const val VALIDATION_TARGET = "ValidationTarget"
internal const val FORM_CONTROL = "FormControl"

internal const val CUSTOM_FORM_CONTROL = "CustomFormControl"

internal const val FORM_STATE_RESTORE_MODE = "FormStateRestoreMode"

internal val WELL_KNOWN_FORM_CONTROL = listOf(
    "HTMLButtonElement",
    "HTMLFieldSetElement",
    "HTMLInputElement",
    "HTMLObjectElement",
    "HTMLOutputElement",
    "HTMLSelectElement",
    "HTMLTextAreaElement",
)

private val CALLBACKS = mapOf(
    "formAssociatedCallback" to "(form: HTMLFormElement?)",
    "formDisabledCallback" to "(disabled: Boolean)",
    "formResetCallback" to "()",
    "formStateRestoreCallback" to """(
        state: JsAny? /* File | string | FormData */,
        mode: $FORM_STATE_RESTORE_MODE,
    )""",
)

private val VALIDATION_TARGET_MEMBERS = """
val validationMessage: String
val validity: ValidityState
val willValidate: Boolean
fun checkValidity(): Boolean
fun reportValidity(): Boolean
""".trimIndent()

private val FORM_CONTROL_MEMBERS = """
val form: HTMLFormElement?
val labels: NodeListOf<HTMLLabelElement>?
    get() = definedExternally
var name: String
""".trimIndent()

internal fun String.applyFormControlPatch(): String =
    applyPatch(VALIDATION_TARGET_MEMBERS, FORM_CONTROL_MEMBERS)

internal fun String.applyValidationTargetPatch(): String =
    applyPatch(VALIDATION_TARGET_MEMBERS)

private fun String.applyPatch(
    vararg members: String,
): String =
    members.asSequence()
        .flatMap { it.splitToSequence("\n") }
        .filter { !it.startsWith(" ") }
        .map { it.removeSuffix("?") }
        .fold(this) { acc, member ->
            acc.replaceFirst(member, "override $member")
        }

internal fun formTypes(): Sequence<ConversionResult> =
    sequenceOf(
        ConversionResult(
            name = VALIDATION_TARGET,
            body = """
            external interface $VALIDATION_TARGET {
                $VALIDATION_TARGET_MEMBERS
            }
            """.trimIndent(),
            pkg = "web.validation"
        ),
        ConversionResult(
            name = FORM_CONTROL,
            body = """
            external interface $FORM_CONTROL:
                $VALIDATION_TARGET {
                $FORM_CONTROL_MEMBERS
            }
            """.trimIndent(),
            pkg = "web.form"
        ),
        ConversionResult(
            name = FORM_STATE_RESTORE_MODE,
            body = unionBody(
                FORM_STATE_RESTORE_MODE,
                listOf("restore", "autocomplete")
            ),
            pkg = "web.form"
        ),
        CustomFormControl(),
    )

private fun CustomFormControl(): ConversionResult {
    val mainInterface = """
        interface WithFormCallbacks:
            ${CALLBACKS.keys.joinToString(",\n") { interfaceName(it) }}
        """.trimIndent()

    val interfaces = CALLBACKS.entries.joinToString("\n") { (methodName, methodBody) ->
        """
        interface ${interfaceName(methodName)} {
            fun ${methodName}${methodBody}
        }
        """.trimIndent()
    }

    val body = """
    external interface $CUSTOM_FORM_CONTROL:
        $FORM_CONTROL {
        
        $mainInterface
        
        $interfaces
    }
    """.trimIndent()

    return ConversionResult(
        name = CUSTOM_FORM_CONTROL,
        body = body,
        pkg = "web.form"
    )
}

internal fun interfaceName(methodName: String): String =
    """With${methodName.replaceFirstChar(Char::uppercase)}"""
