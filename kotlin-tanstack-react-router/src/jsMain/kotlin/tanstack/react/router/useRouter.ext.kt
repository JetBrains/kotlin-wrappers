package tanstack.react.router

fun useRouter(
    warn: Boolean,
): Router =
    useRouter(UseRouterOptions(warn = warn))
