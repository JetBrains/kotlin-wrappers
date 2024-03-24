package js.function

fun <T : Any> JsFunction(
    vararg argumentNames: String,
    body: String,
): T =
    Function(
        argumentNames = argumentNames,
        body = body,
    ).unsafeCast<T>()

private external class Function(
    vararg argumentNames: String,
    body: String,
)
