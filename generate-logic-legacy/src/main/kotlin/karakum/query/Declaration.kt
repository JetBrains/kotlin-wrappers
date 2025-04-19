package karakum.query

abstract class Declaration {
    protected abstract val source: String

    abstract val name: String

    abstract fun toCode(): String
}
