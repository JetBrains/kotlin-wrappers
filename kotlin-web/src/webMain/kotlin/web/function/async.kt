package web.function

import js.core.JsAny
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import web.abort.AbortableLike
import web.abort.internal.createCancellablePromise

fun <P1 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1) -> R,
): (P1) -> Promise<R> = { p1 ->
    createCancellablePromise(p1) { block(p1) }
}

fun <P1 : JsAny?, P2 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2) -> R,
): (P1, P2) -> Promise<R> = { p1, p2 ->
    createCancellablePromise(p2) { block(p1, p2) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3) -> R,
): (P1, P2, P3) -> Promise<R> = { p1, p2, p3 ->
    createCancellablePromise(p3) { block(p1, p2, p3) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4) -> R,
): (P1, P2, P3, P4) -> Promise<R> = { p1, p2, p3, p4 ->
    createCancellablePromise(p4) { block(p1, p2, p3, p4) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5) -> R,
): (P1, P2, P3, P4, P5) -> Promise<R> = { p1, p2, p3, p4, p5 ->
    createCancellablePromise(p5) { block(p1, p2, p3, p4, p5) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5, P6) -> R,
): (P1, P2, P3, P4, P5, P6) -> Promise<R> = { p1, p2, p3, p4, p5, p6 ->
    createCancellablePromise(p6) { block(p1, p2, p3, p4, p5, p6) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : AbortableLike, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5, P6, P7) -> R,
): (P1, P2, P3, P4, P5, P6, P7) -> Promise<R> = { p1, p2, p3, p4, p5, p6, p7 ->
    createCancellablePromise(p7) { block(p1, p2, p3, p4, p5, p6, p7) }
}
