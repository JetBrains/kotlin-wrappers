package web.observable

import js.array.ReadonlyArray
import js.core.JsBoolean
import js.core.JsPrimitives.toBoolean
import js.core.Void
import js.errors.JsErrorLike
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.promise.Promise
import web.abort.AbortController
import web.abort.internal.awaitCancellable
import web.abort.internal.createAbortable
import web.function.VoidFunction
import kotlin.js.JsAny
import kotlin.js.JsName
import kotlin.js.definedExternally

external class Observable<out T : JsAny?>(
    callback: SubscribeCallback<T>,
) {
    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(transform: (JsErrorLike?) -> Promise<@UnsafeVariance T>): Observable<T>

    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(transform: (JsErrorLike?) -> JsIterable<@UnsafeVariance T>): Observable<T>

    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(transform: (JsErrorLike?) -> ReadonlyArray<@UnsafeVariance T>): Observable<T>

    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(transform: (JsErrorLike?) -> AsyncIterable<@UnsafeVariance T>): Observable<T>

    @PublishedApi
    @JsName("catch")
    internal fun catchInternal(transform: (JsErrorLike?) -> Observable<@UnsafeVariance T>): Observable<T>

    fun drop(n: Int): Observable<T>

    @JsName("every")
    fun everyAsync(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<JsBoolean>

    fun filter(predicate: (T) -> Boolean): Observable<T>

    fun finally(callback: VoidFunction): Observable<T>

    @JsName("find")
    fun findAsync(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<T>

    @JsName("first")
    fun firstAsync(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> flatMap(transform: (T) -> Promise<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> JsIterable<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> ReadonlyArray<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> AsyncIterable<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> Observable<R>): Observable<R>

    @JsName("forEach")
    fun forEachAsync(
        action: (item: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    ): Promise<Void>

    fun inspect(inspector: ObservableInspector<T>): Observable<T>
    fun inspect(callback: (value: T) -> Unit): Observable<T>
    fun inspect(): Observable<T>

    @JsName("last")
    fun lastAsync(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> map(transform: (T) -> R): Observable<R>

    @JsName("reduce")
    fun <U : JsAny?> reduceAsync(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
        options: SubscribeOptions? = definedExternally,
    ): Promise<U>

    @JsName("some")
    fun someAsync(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<JsBoolean>

    /**
     * Subscribes to the sequence with an observer
     */
    fun subscribe(
        observer: SubscriptionObserver<T>,
        options: SubscribeOptions? = definedExternally,
    )

    /**
     * Subscribes to the sequence with callbacks
     */
    fun subscribe(
        callback: (value: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    )

    fun <R : JsAny?> switchMap(transform: (T) -> Promise<R>): Observable<R>
    fun <R : JsAny?> switchMap(transform: (T) -> JsIterable<R>): Observable<R>
    fun <R : JsAny?> switchMap(transform: (T) -> ReadonlyArray<R>): Observable<R>
    fun <R : JsAny?> switchMap(transform: (T) -> AsyncIterable<R>): Observable<R>
    fun <R : JsAny?> switchMap(transform: (T) -> Observable<R>): Observable<R>

    fun take(n: Int): Observable<T>

    fun takeUntil(notifier: Promise<*>): Observable<T>
    fun takeUntil(notifier: JsIterable<*>): Observable<T>
    fun takeUntil(notifier: ReadonlyArray<*>): Observable<T>
    fun takeUntil(notifier: AsyncIterable<*>): Observable<T>
    fun takeUntil(notifier: Observable<*>): Observable<T>

    @JsName("toArray")
    fun toArrayAsync(options: SubscribeOptions? = definedExternally): Promise<ReadonlyArray<T>>

    companion object {
        fun <T : JsAny?> from(
            source: Promise<T>,
        ): Observable<T>

        fun <T : JsAny?> from(
            source: JsIterable<T>,
        ): Observable<T>

        fun <T : JsAny?> from(
            source: ReadonlyArray<T>,
        ): Observable<T>

        fun <T : JsAny?> from(
            source: AsyncIterable<T>,
        ): Observable<T>

        fun <T : JsAny?> from(
            source: Observable<T>,
        ): Observable<T>
    }
}

inline fun <T : JsAny?> Observable<T>.catch(
    noinline transform: (JsErrorLike?) -> Promise<T>,
): Observable<T> =
    catchInternal(transform)

inline fun <T : JsAny?> Observable<T>.catch(
    noinline transform: (JsErrorLike?) -> JsIterable<T>,
): Observable<T> =
    catchInternal(transform)

inline fun <T : JsAny?> Observable<T>.catch(
    noinline transform: (JsErrorLike?) -> ReadonlyArray<T>,
): Observable<T> =
    catchInternal(transform)

inline fun <T : JsAny?> Observable<T>.catch(
    noinline transform: (JsErrorLike?) -> AsyncIterable<T>,
): Observable<T> =
    catchInternal(transform)

inline fun <T : JsAny?> Observable<T>.catch(
    noinline transform: (JsErrorLike?) -> Observable<T>,
): Observable<T> =
    catchInternal(transform)

suspend fun <T : JsAny?> Observable<T>.every(
    predicate: (T) -> Boolean,
): Boolean {
    val controller = AbortController()
    return everyAsync(
        predicate = predicate,
        options = createAbortable(controller),
    ).awaitCancellable(controller).toBoolean()
}

suspend fun <T : JsAny?> Observable<T>.find(
    predicate: (T) -> Boolean,
): T {
    val controller = AbortController()
    return findAsync(
        predicate = predicate,
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

suspend fun <T : JsAny?> Observable<T>.first(): T {
    val controller = AbortController()
    return firstAsync(
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

suspend fun <T : JsAny?> Observable<T>.forEach(
    action: (item: T) -> Unit,
) {
    val controller = AbortController()
    forEachAsync(
        action = action,
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

suspend fun <T : JsAny?> Observable<T>.last(): T {
    val controller = AbortController()
    return lastAsync(
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

suspend fun <T : JsAny?, U : JsAny?> Observable<T>.reduce(
    operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
    initialValue: U,
): U {
    val controller = AbortController()
    return reduceAsync(
        operation = operation,
        initialValue = initialValue,
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}

suspend fun <T : JsAny?> Observable<T>.some(
    predicate: (T) -> Boolean,
): Boolean {
    val controller = AbortController()
    return someAsync(
        predicate = predicate,
        options = createAbortable(controller),
    ).awaitCancellable(controller).toBoolean()
}

suspend fun <T : JsAny?> Observable<T>.toArray(): ReadonlyArray<T> {
    val controller = AbortController()
    return toArrayAsync(
        options = createAbortable(controller),
    ).awaitCancellable(controller)
}
