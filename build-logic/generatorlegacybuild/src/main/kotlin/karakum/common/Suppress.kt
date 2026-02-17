package karakum.common

internal enum class Suppress {
    DECLARATION_CANT_BE_INLINED,

    INTERFACE_WITH_SUPERCLASS,

    UNUSED_TYPEALIAS_PARAMETER,

    VIRTUAL_MEMBER_HIDDEN,

    ABSTRACT_MEMBER_NOT_IMPLEMENTED,

    NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE,

    NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE,

    // WasmJS
    NESTED_CLASS_IN_EXTERNAL_INTERFACE,

    ;
}

internal fun fileSuppress(
    suppresses: List<Suppress>,
): String {
    if (suppresses.isEmpty())
        return ""

    return suppresses.joinToString(",\n", "@file:Suppress(\n", ",\n)") {
        """"${it.name}""""
    }
}
