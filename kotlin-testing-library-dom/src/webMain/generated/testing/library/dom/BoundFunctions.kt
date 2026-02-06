// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: * as queries from "./queries"
import js.promise.Promise
import web.html.HTMLElement

external interface BoundFunctions {
    operator fun <P /*  : /* keyof Q */ */> get(key: P): BoundFunction<Any?>?

    operator fun <P /*  : /* keyof Q */ */> set(key: P, value: BoundFunction<Any?>?)

    fun <T : HTMLElement /* default is HTMLElement */> getByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByLabelText")
    fun <T : HTMLElement /* default is HTMLElement */> findByLabelTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByLabelText")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByLabelTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByPlaceholderText")
    fun <T : HTMLElement /* default is HTMLElement */> findByPlaceholderTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByPlaceholderText")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByPlaceholderTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByText")
    fun <T : HTMLElement /* default is HTMLElement */> findByTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByText")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByAltText")
    fun <T : HTMLElement /* default is HTMLElement */> findByAltTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByAltText")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByAltTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByTitle")
    fun <T : HTMLElement /* default is HTMLElement */> findByTitleAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByTitle")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByTitleAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByDisplayValue")
    fun <T : HTMLElement /* default is HTMLElement */> findByDisplayValueAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByDisplayValue")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByDisplayValueAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByRole")
    fun <T : HTMLElement /* default is HTMLElement */> findByRoleAsync(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByRole")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByRoleAsync(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> getByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T

    fun <T : HTMLElement /* default is HTMLElement */> getAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    fun <T : HTMLElement /* default is HTMLElement */> queryByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): T?

    fun <T : HTMLElement /* default is HTMLElement */> queryAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<T>

    @JsName("findByTestId")
    fun <T : HTMLElement /* default is HTMLElement */> findByTestIdAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<T>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): T

    @JsName("findAllByTestId")
    fun <T : HTMLElement /* default is HTMLElement */> findAllByTestIdAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): Promise<js.array.ReadonlyArray<T>>

    @seskar.js.JsAsync
    suspend fun <T : HTMLElement /* default is HTMLElement */> findAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<T>
}
