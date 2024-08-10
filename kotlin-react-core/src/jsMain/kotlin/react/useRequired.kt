package react

fun <T : Any> useRequired(
    context: Context<T?>,
): T =
    requireNotNull(use(context))

fun <T : Any> useRequired(
    context: RequiredContext<T>,
): T =
    requireNotNull(use(context))
