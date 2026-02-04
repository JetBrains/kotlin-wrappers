package tanstack.react.router

import tanstack.router.core.RoutePath
import tanstack.router.core.UseNavigateResult

fun useNavigate(
    from: RoutePath,
): UseNavigateResult =
    useNavigate(UseNavigateOptions(from = from))
