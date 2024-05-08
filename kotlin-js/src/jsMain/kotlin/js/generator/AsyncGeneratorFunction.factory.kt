package js.generator

import js.array.JsTuple
import seskar.js.JsSpecialName

@JsSpecialName(ASYNC_GENERATOR_FUNCTION)
external fun <R : AsyncGenerator<*, *, *>> AsyncGeneratorFunction(
    body: String,
): AsyncGeneratorFunction<JsTuple, R>
