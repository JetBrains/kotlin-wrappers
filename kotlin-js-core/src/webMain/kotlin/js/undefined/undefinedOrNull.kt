package js.undefined

/**
 * Temp workaround for KT-82504
 *
 * `undefined` - on JS platform
 * `null` - on WasmJS platform
 */
expect val undefinedOrNull: Nothing?
