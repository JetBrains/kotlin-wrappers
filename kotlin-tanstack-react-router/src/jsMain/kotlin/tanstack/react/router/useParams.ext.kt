package tanstack.react.router

import tanstack.router.core.Params

fun useParams(): Params =
    useParams(UseParamsOptions(strict = false))
