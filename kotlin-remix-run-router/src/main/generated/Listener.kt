@file:JsModule("@remix-run/router")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package remix.run.router


/**
 * A function that receives notifications about location changes.
 */

external interface Listener {
    fun invoke(update: Update): Unit
}

