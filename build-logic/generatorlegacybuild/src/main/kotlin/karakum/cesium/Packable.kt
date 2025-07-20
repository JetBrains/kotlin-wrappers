package karakum.cesium

const val PACKABLE: String = "Packable"
const val PACKED_LENGTH = "packedLength"

val PACKABLE_MEMBERS: Set<String> = setOf(
    PACKED_LENGTH,
    "pack",
    "unpack"
)

// Details - https://github.com/CesiumGS/cesium/issues/8914
fun applyPackableFixes(code: String): String =
    code.replace(": JsAny", ": T")
        .replace("interface $PACKABLE", "interface $PACKABLE<T: JsAny>")
        .replaceFirst("definedExternally\n)", "definedExternally\n): ReadonlyArray<Double>")
        .replace("companion object  {", "")
        .replace("}\n}\n", "}\n")
