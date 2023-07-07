@file:JsModule("@remix-run/router")

package remix.run.router


/**
 * @private
 */
external fun invariant(value: Boolean, message: String = definedExternally): Boolean

external fun <T> invariant(value: T?, message: String = definedExternally): Boolean
