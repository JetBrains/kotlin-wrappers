package js.function

import js.core.JsAny
import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import js.promise.Promise
import kotlinx.coroutines.CoroutineStart.UNDISPATCHED

// TODO: use common utility instead
private fun <R : JsAny?> createPromise(
    block: suspend () -> R,
): Promise<R> =
    IsolatedCoroutineScope()
        .promise(
            start = UNDISPATCHED,
            block = { block() },
        )

fun <R : JsAny?> async(
    block: suspend () -> R,
): () -> Promise<R> = {
    createPromise { block() }
}

fun <P1 : JsAny?, R : JsAny?> async(
    block: suspend (P1) -> R,
): (P1) -> Promise<R> = { p1 ->
    createPromise { block(p1) }
}

fun <P1 : JsAny?, P2 : JsAny?, R : JsAny?> async(
    block: suspend (P1, P2) -> R,
): (P1, P2) -> Promise<R> = { p1, p2 ->
    createPromise { block(p1, p2) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, R : JsAny?> async(
    block: suspend (P1, P2, P3) -> R,
): (P1, P2, P3) -> Promise<R> = { p1, p2, p3 ->
    createPromise { block(p1, p2, p3) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, R : JsAny?> async(
    block: suspend (P1, P2, P3, P4) -> R,
): (P1, P2, P3, P4) -> Promise<R> = { p1, p2, p3, p4 ->
    createPromise { block(p1, p2, p3, p4) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, R : JsAny?> async(
    block: suspend (P1, P2, P3, P4, P5) -> R,
): (P1, P2, P3, P4, P5) -> Promise<R> = { p1, p2, p3, p4, p5 ->
    createPromise { block(p1, p2, p3, p4, p5) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, R : JsAny?> async(
    block: suspend (P1, P2, P3, P4, P5, P6) -> R,
): (P1, P2, P3, P4, P5, P6) -> Promise<R> = { p1, p2, p3, p4, p5, p6 ->
    createPromise { block(p1, p2, p3, p4, p5, p6) }
}

fun <P1 : JsAny?, P2 : JsAny?, P3 : JsAny?, P4 : JsAny?, P5 : JsAny?, P6 : JsAny?, P7 : JsAny?, R : JsAny?> async(
    block: suspend (P1, P2, P3, P4, P5, P6, P7) -> R,
): (P1, P2, P3, P4, P5, P6, P7) -> Promise<R> = { p1, p2, p3, p4, p5, p6, p7 ->
    createPromise { block(p1, p2, p3, p4, p5, p6, p7) }
}
