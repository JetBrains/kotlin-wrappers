package karakum.query

abstract class Member : Declaration() {
    override val name: String by lazy {
        getMemberName(source)
    }

    var open: Boolean = false
    var overridden: Boolean = false

    private val protected: Boolean by lazy {
        source.startsWith("protected ")
    }

    private val abstract: Boolean by lazy {
        " abstract " in source
    }

    protected val modifiers: String by lazy {
        mutableListOf<String>().apply {
            when {
                abstract -> add("abstract")
                overridden -> add("override")
                open -> add("open")
            }

            if (protected) add("protected")
        }.joinToString(" ")
    }
}
