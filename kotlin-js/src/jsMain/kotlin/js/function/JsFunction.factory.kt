package js.function

import js.array.JsTuple

fun <A : JsTuple, R> JsFunction(
    vararg argumentNames: String,
    body: String,
): JsFunction<A, R> =
    Function(
        argumentNames = argumentNames,
        body = body,
    ).unsafeCast<JsFunction<A, R>>()

private external class Function(
    vararg argumentNames: String,
    body: String,
)
