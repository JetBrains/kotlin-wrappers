package tanstack.router.core

import js.objects.Object
import js.objects.unsafeJso
import tanstack.router.core.raw.redirectRaw

fun redirect(
    options: RedirectOptions,
): Nothing =
    redirectRaw(
        options = Object.assign(
            unsafeJso(),
            options,
            unsafeJso { `throw` = true },
        ),
    )
