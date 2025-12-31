package tanstack.react.router

import tanstack.router.core.Params

fun useParams(): Params =
    useParams(UseParamsOptions(strict = false))

fun <T> useParams(
    select: Select<Params, T>,
): T =
    useParams(UseParamsOptions(strict = false, select = select))
