package web.observable

import js.array.ReadonlyArray
import js.core.JsAny
import js.core.JsBoolean
import js.core.Void
import js.errors.JsError
import js.iterable.AsyncIterable
import js.iterable.JsIterable
import js.promise.Promise
import seskar.js.JsAsync
import web.function.VoidFunction
import kotlin.js.JsName
import kotlin.js.definedExternally

external class Observable<out T : JsAny?>(
    callback: SubscribeCallback<T>,
) {
    fun catch(callback: (JsError) -> @UnsafeVariance T): Observable<T>

    fun drop(n: Int): Observable<T>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun every(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Boolean

    @JsName("every")
    fun everyAsync(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<JsBoolean>

    fun filter(predicate: (T) -> Boolean): Observable<T>

    fun finally(callback: VoidFunction): Observable<T>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun find(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): T

    @JsName("find")
    fun findAsync(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Promise<T>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun first(options: SubscribeOptions? = definedExternally): T

    @JsName("first")
    fun firstAsync(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> flatMap(transform: (T) -> Promise<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> JsIterable<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> ReadonlyArray<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> AsyncIterable<R>): Observable<R>
    fun <R : JsAny?> flatMap(transform: (T) -> Observable<R>): Observable<R>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    fun forEach(
        action: (item: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    )

    @JsName("forEach")
    fun forEachAsync(
        action: (item: T) -> Unit,
        options: SubscribeOptions? = definedExternally,
    ): Promise<Void>

    fun inspect(inspector: ObservableInspector<T>): Observable<T>
    fun inspect(callback: (value: T) -> Unit): Observable<T>
    fun inspect(): Observable<T>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun last(options: SubscribeOptions? = definedExternally): T

    @JsName("last")
    fun lastAsync(options: SubscribeOptions? = definedExternally): Promise<T>

    fun <R : JsAny?> map(transform: (T) -> R): Observable<R>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun <U : JsAny?> reduce(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
        options: SubscribeOptions? = definedExternally,
    ): U

    @JsName("reduce")
    fun <U : JsAny?> reduceAsync(
        operation: (previousValue: U, currentValue: T, currentIndex: Int) -> U,
        initialValue: U,
        options: SubscribeOptions? = definedExternally,
    ): Promise<U>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun some(
        predicate: (T) -> Boolean,
        options: SubscribeOptions? = definedExternally,
    ): Boolean

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

    fun <R : JsAny?> switchMap(transform: (T) -> ReadonlyArray<R>): Observable<R>
    fun <R : JsAny?> switchMap(transform: (T) -> Observable<R>): Observable<R>

    fun take(n: Int): Observable<T>

    fun takeUntil(notifier: Promise<*>): Observable<T>
    fun takeUntil(notifier: JsIterable<*>): Observable<T>
    fun takeUntil(notifier: ReadonlyArray<*>): Observable<T>
    fun takeUntil(notifier: AsyncIterable<*>): Observable<T>
    fun takeUntil(notifier: Observable<*>): Observable<T>

    @JsAsync
    @Suppress("WRONG_EXTERNAL_DECLARATION")
    suspend fun toArray(options: SubscribeOptions? = definedExternally): ReadonlyArray<T>

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
