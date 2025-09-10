package js.function

import js.coroutines.internal.createIsolatedPromise
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import kotlin.js.JsAny

fun <R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.() -> R,
): () -> Promise<R> = {
    createIsolatedPromise { block() }
}

fun <P1 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1) -> R,
): (P1) -> Promise<R> = { p1 ->
    createIsolatedPromise { block(p1) }
}

fun <P1 : JsAny?, P2 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1, P2) -> R,
): (P1, P2) -> Promise<R> = { p1, p2 ->
    createIsolatedPromise { block(p1, p2) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1, P2, P3) -> R,
): (P1, P2, P3) -> Promise<R> = { p1, p2, p3 ->
    createIsolatedPromise { block(p1, p2, p3) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1, P2, P3, P4) -> R,
): (P1, P2, P3, P4) -> Promise<R> = { p1, p2, p3, p4 ->
    createIsolatedPromise { block(p1, p2, p3, p4) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5) -> R,
): (P1, P2, P3, P4, P5) -> Promise<R> = { p1, p2, p3, p4, p5 ->
    createIsolatedPromise { block(p1, p2, p3, p4, p5) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5, P6) -> R,
): (P1, P2, P3, P4, P5, P6) -> Promise<R> = { p1, p2, p3, p4, p5, p6 ->
    createIsolatedPromise { block(p1, p2, p3, p4, p5, p6) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : JsAny?, R : JsAny?> unsafeAsync(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5, P6, P7) -> R,
): (P1, P2, P3, P4, P5, P6, P7) -> Promise<R> = { p1, p2, p3, p4, p5, p6, p7 ->
    createIsolatedPromise { block(p1, p2, p3, p4, p5, p6, p7) }
}
