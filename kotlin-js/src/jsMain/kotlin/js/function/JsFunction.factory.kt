package js.function

fun <T : Any> JsFunction(
    vararg argumentNames: String,
    body: String,
): T =
    NativeFunction(
        argumentNames = argumentNames,
        body = body,
    ).unsafeCast<T>()

private external class NativeFunction(
    vararg argumentNames: String,
    body: String,
)
