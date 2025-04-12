package karakum.common

internal enum class Suppress {
    DECLARATION_CANT_BE_INLINED,

    INTERFACE_WITH_SUPERCLASS,

    UNUSED_TYPEALIAS_PARAMETER,
    BOUNDS_NOT_ALLOWED_IF_BOUNDED_BY_TYPE_PARAMETER,

    VIRTUAL_MEMBER_HIDDEN,

    ABSTRACT_MEMBER_NOT_IMPLEMENTED,
    SEALED_INHERITOR_IN_DIFFERENT_PACKAGE,

    NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE,

    NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE,

    // WasmJS
    NESTED_CLASS_IN_EXTERNAL_INTERFACE,

    ;
}

internal fun fileSuppress(
    vararg suppresses: Suppress,
): String =
    suppresses.joinToString(",\n", "@file:Suppress(\n", ",\n)") {
        """"${it.name}""""
    }

internal fun suppress(
    suppress: Suppress,
): String =
    """@Suppress("${suppress.name}")"""
