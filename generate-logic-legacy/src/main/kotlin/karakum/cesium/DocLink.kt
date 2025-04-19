package karakum.cesium

private const val DOC_ROOT = "https://cesium.com/docs/cesiumjs-ref-doc"
private const val GLOBAL_TEMPLATE = "$DOC_ROOT/global.html#{top}"
private const val TOP_TEMPLATE = "$DOC_ROOT/{top}.html"
private const val MEMBER_TEMPLATE = "$DOC_ROOT/{type}.html#{member}"

internal class DocLink
private constructor(
    val href: String,
    val typeMode: Boolean = false,
) {
    constructor(enum: IEnum)
            : this(GLOBAL_TEMPLATE.replace("{top}", enum.docName))

    constructor(enum: IMember)
            : this(GLOBAL_TEMPLATE.replace("{top}", enum.docName))

    constructor(top: HasName)
            : this(TOP_TEMPLATE.replace("{top}", top.docName), top is IType)

    constructor(type: IType, member: IMember)
            : this(MEMBER_TEMPLATE.replace("{type}", type.docName).replace("{member}", member.docName))
}
