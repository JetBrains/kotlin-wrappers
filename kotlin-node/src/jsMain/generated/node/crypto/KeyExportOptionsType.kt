package node.crypto


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{pkcs1: 'pkcs1', spki: 'spki', pkcs8: 'pkcs8', sec1: 'sec1'}/*union*/)""")
sealed external interface KeyExportOptionsType {
    companion object {
        val pkcs1: KeyExportOptionsType
        val spki: KeyExportOptionsType
        val pkcs8: KeyExportOptionsType
        val sec1: KeyExportOptionsType
    }
}
