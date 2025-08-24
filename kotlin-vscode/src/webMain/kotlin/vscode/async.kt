package vscode

import js.core.JsAny
import js.promise.Promise
import kotlinx.coroutines.CoroutineScope
import vscode.internal.createCancellablePromise

fun <R : JsAny?> async(
    block: suspend CoroutineScope.() -> R,
): (CancellationToken) -> Promise<R> = { token ->
    createCancellablePromise(token) { block() }
}

fun <P1 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1) -> R,
): (P1, CancellationToken) -> Promise<R> = { p1, token ->
    createCancellablePromise(token) { block(p1) }
}

fun <P1 : JsAny?, P2 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2) -> R,
): (P1, P2, CancellationToken) -> Promise<R> = { p1, p2, token ->
    createCancellablePromise(token) { block(p1, p2) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3) -> R,
): (P1, P2, P3, CancellationToken) -> Promise<R> = { p1, p2, p3, token ->
    createCancellablePromise(token) { block(p1, p2, p3) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4) -> R,
): (P1, P2, P3, P4, CancellationToken) -> Promise<R> = { p1, p2, p3, p4, token ->
    createCancellablePromise(token) { block(p1, p2, p3, p4) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5) -> R,
): (P1, P2, P3, P4, P5, CancellationToken) -> Promise<R> = { p1, p2, p3, p4, p5, token ->
    createCancellablePromise(token) { block(p1, p2, p3, p4, p5) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5, P6) -> R,
): (P1, P2, P3, P4, P5, P6, CancellationToken) -> Promise<R> = { p1, p2, p3, p4, p5, p6, token ->
    createCancellablePromise(token) { block(p1, p2, p3, p4, p5, p6) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : JsAny?, R : JsAny?> async(
    block: suspend CoroutineScope.(P1, P2, P3, P4, P5, P6, P7) -> R,
): (P1, P2, P3, P4, P5, P6, P7, CancellationToken) -> Promise<R> = { p1, p2, p3, p4, p5, p6, p7, token ->
    createCancellablePromise(token) { block(p1, p2, p3, p4, p5, p6, p7) }
}
