package web.serviceworker

import js.globals.internal.getGlobalScope
import js.objects.unsafeJso

sealed /* final */
external interface ServiceWorkerModule

fun ServiceWorkerModule(
    block: (self: ServiceWorkerGlobalScope) -> Unit,
): ServiceWorkerModule {
    val self: ServiceWorkerGlobalScope = getGlobalScope("ServiceWorkerGlobalScope")

    block(self)

    return unsafeJso()
}
