// Automatically generated - do not modify!

package testing.library.dom

// unhandled import: * as queries from "./queries"

external interface BoundFunctions {
    operator fun <P /*  : /* keyof Q */ */> get(key: P): BoundFunction<Any?>?

    operator fun <P /*  : /* keyof Q */ */> set(key: P, value: BoundFunction<Any?>?)

    fun getByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByLabelText")
    fun findByLabelTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByLabelText")
    fun findAllByLabelTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByLabelText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByPlaceholderText")
    fun findByPlaceholderTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByPlaceholderText")
    fun findAllByPlaceholderTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByPlaceholderText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByText")
    fun findByTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByText")
    fun findAllByTextAsync(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByText(
        id: Matcher,
        options: SelectorMatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByAltText")
    fun findByAltTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByAltText")
    fun findAllByAltTextAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByAltText(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByTitle")
    fun findByTitleAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByTitle")
    fun findAllByTitleAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByTitle(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByDisplayValue")
    fun findByDisplayValueAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByDisplayValue")
    fun findAllByDisplayValueAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByDisplayValue(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByRole")
    fun findByRoleAsync(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByRole")
    fun findAllByRoleAsync(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByRole(
        role: ByRoleMatcher,
        options: ByRoleOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun getByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement

    fun getAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    fun queryByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): web.html.HTMLElement?

    fun queryAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>

    @JsName("findByTestId")
    fun findByTestIdAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<web.html.HTMLElement>

    @seskar.js.JsAsync
    suspend fun findByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): web.html.HTMLElement

    @JsName("findAllByTestId")
    fun findAllByTestIdAsync(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.promise.Promise<js.array.ReadonlyArray<web.html.HTMLElement>>

    @seskar.js.JsAsync
    suspend fun findAllByTestId(
        id: Matcher,
        options: MatcherOptions = definedExternally,
        waitForElementOptions: waitForOptions = definedExternally,
    ): js.array.ReadonlyArray<web.html.HTMLElement>
}
