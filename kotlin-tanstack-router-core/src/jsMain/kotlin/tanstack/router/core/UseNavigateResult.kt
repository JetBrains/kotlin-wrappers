package tanstack.router.core

import js.objects.unsafeJso
import tanstack.router.core.raw.UseNavigateResultRaw

value class UseNavigateResult(
    private val navigate: UseNavigateResultRaw,
) {
    operator fun invoke(
        block: NavigateOptions.() -> Unit,
    ) {
        navigate(unsafeJso(block))
    }
}
