package kotlinext.js

external interface JsFunction<in C, out O> {
    fun call(ctx: C, vararg args: Any?): O
    fun apply(ctx: C, args: Array<out Any?>): O
    fun bind(ctx: C, vararg args: Any?): JsFunction<Nothing?, O>

    val length: Int
}

external interface JsFunction0<out O> : JsFunction<Nothing?, O>

operator fun <O> JsFunction0<O>.invoke() = asDynamic()()

external interface JsFunction1<in I, out O> : JsFunction<Nothing?, O>

operator fun <I, O> JsFunction1<I, O>.invoke(arg: I) =
    asDynamic()(arg)

external interface JsFunction2<in I1, in I2, out O> : JsFunction<Nothing?, O>

operator fun <I1, I2, O> JsFunction2<I1, I2, O>.invoke(arg1: I1, arg2: I2) =
    asDynamic()(arg1, arg2)

external interface JsFunction3<in I1, in I2, in I3, out O> : JsFunction<Nothing?, O>

operator fun <I1, I2, I3, O> JsFunction3<I1, I2, I3, O>.invoke(arg1: I1, arg2: I2, arg3: I3) =
    asDynamic()(arg1, arg2, arg3)

