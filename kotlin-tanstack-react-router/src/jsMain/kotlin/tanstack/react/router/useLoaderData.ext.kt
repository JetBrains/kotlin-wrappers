package tanstack.react.router

import tanstack.router.core.LoaderData

fun useLoaderData(): LoaderData =
    useLoaderData(UseLoaderDataOptions(strict = false))

fun <T> useLoaderData(
    select: Select<LoaderData, T>,
): T =
    useLoaderData(UseLoaderDataOptions(strict = false, select = select))
