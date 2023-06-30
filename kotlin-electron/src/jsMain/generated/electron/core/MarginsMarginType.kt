package electron.core


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{default: 'default', none: 'none', printableArea: 'printableArea', custom: 'custom'}/*union*/)""")
sealed external interface MarginsMarginType {
    companion object {
        val default: MarginsMarginType
        val none: MarginsMarginType
        val printableArea: MarginsMarginType
        val custom: MarginsMarginType
    }
}
