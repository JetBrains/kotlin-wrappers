package mocha

external interface Suite {
    var parent: Suite
    var title: String
    fun fullTitle(): String
}

external interface SuiteBuilder<out R>
operator fun <R> SuiteBuilder<R>.invoke(description: String, callback: () -> Unit): R =
    asDynamic()(description, callback)

external interface ContextDefinition: SuiteBuilder<Suite> {
    val only: SuiteBuilder<Suite>
    val skip: SuiteBuilder<Unit>
    fun timeout(ms: Number)
}

external interface Runnable {
    var title: String
    var fn: Function<*>
    var async: Boolean
    var sync: Boolean
    var timedOut: Boolean
}

external interface Test : Runnable {
    var parent: Suite
    var pending: Boolean
    var state: String? /* "failed" | "passed" | undefined */
    fun fullTitle(): String
}

external interface MochaDone
operator fun MochaDone.invoke(error: Throwable) = asDynamic()(error)
operator fun MochaDone.invoke() = asDynamic()()

external interface TestBuilder<out R>: SuiteBuilder<R>
fun <R> TestBuilder<R>.async(description: String, callback: (MochaDone) -> Unit): R =
    asDynamic()(description, callback)

external interface TestDefinition: TestBuilder<Test> {
    val only: TestBuilder<Test>
    val skip: TestBuilder<Unit>
    fun timeout(ms: Number)
    var state: String /* "failed" | "passed" */
}

external val describe: ContextDefinition
external val it: TestDefinition
