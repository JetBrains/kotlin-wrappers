package tanstack.router.core

import js.objects.unsafeJso
import tanstack.router.core.raw.redirectRaw

fun redirect(
    block: RedirectOptions.() -> Unit,
): Nothing {
    val options = unsafeJso(block)
    options.`throw` = true

    redirectRaw<Nothing>(options)
}
