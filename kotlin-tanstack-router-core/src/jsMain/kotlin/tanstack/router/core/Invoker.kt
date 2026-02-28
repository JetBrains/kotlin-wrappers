package tanstack.router.core

import js.objects.unsafeJso

@JsName("Function")
external class Invoker<O : Any, R>
private constructor() {
    internal /* raw */
    operator fun invoke(
        options: O,
    ): R
}

operator fun <O : Any, R> Invoker<O, R>.invoke(
    block: O.() -> Unit,
): R =
    invoke(options = unsafeJso(block))
