@file:JsModule("@remix-run/router")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * @private
 */
external fun invariant(value: Boolean, message: String = definedExternally): Boolean

external fun <T> invariant(value: T?, message: String = definedExternally): Boolean
