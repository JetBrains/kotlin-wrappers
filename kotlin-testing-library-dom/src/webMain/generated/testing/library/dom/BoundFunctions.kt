// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: * as queries from "./queries"

external interface BoundFunctions {
    operator fun <P /*  : /* keyof Q */ */> get(key: P): BoundFunction<Any?>?

    operator fun <P /*  : /* keyof Q */ */> set(key: P, value: BoundFunction<Any?>?)

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByLabelText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByLabelTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByLabelText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByLabelTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByPlaceholderText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByPlaceholderTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByPlaceholderText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByPlaceholderTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByAltText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByAltTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByAltText")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByAltTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByTitle")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByTitleAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByTitle")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByTitleAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByDisplayValue")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByDisplayValueAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByDisplayValue")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByDisplayValueAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByRole")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByRoleAsync(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByRole")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByRoleAsync(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> getAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> queryAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByTestId")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByTestIdAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByTestId")
    fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByTestIdAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : web.html.HTMLElement /* default is web.html.HTMLElement */> findAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>
}
