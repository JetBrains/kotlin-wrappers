package electron


@Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)
@JsName("""(/*union*/{confirm: 'confirm', confirmPin: 'confirmPin', providePin: 'providePin'}/*union*/)""")
sealed external interface BluetoothPairingHandlerHandlerDetailsPairingKind {
    companion object {
        val confirm: BluetoothPairingHandlerHandlerDetailsPairingKind
        val confirmPin: BluetoothPairingHandlerHandlerDetailsPairingKind
        val providePin: BluetoothPairingHandlerHandlerDetailsPairingKind
    }
}
