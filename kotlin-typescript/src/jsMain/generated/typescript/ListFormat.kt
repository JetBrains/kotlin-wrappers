// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ListFormat {
    companion object {
        @JsIntValue(0)
        val None: ListFormat

        @JsIntValue(0)
        val SingleLine: ListFormat

        @JsIntValue(1)
        val MultiLine: ListFormat

        @JsIntValue(2)
        val PreserveLines: ListFormat

        @JsIntValue(3)
        val LinesMask: ListFormat

        @JsIntValue(0)
        val NotDelimited: ListFormat

        @JsIntValue(4)
        val BarDelimited: ListFormat

        @JsIntValue(8)
        val AmpersandDelimited: ListFormat

        @JsIntValue(16)
        val CommaDelimited: ListFormat

        @JsIntValue(32)
        val AsteriskDelimited: ListFormat

        @JsIntValue(60)
        val DelimitersMask: ListFormat

        @JsIntValue(64)
        val AllowTrailingComma: ListFormat

        @JsIntValue(128)
        val Indented: ListFormat

        @JsIntValue(256)
        val SpaceBetweenBraces: ListFormat

        @JsIntValue(512)
        val SpaceBetweenSiblings: ListFormat

        @JsIntValue(1024)
        val Braces: ListFormat

        @JsIntValue(2048)
        val Parenthesis: ListFormat

        @JsIntValue(4096)
        val AngleBrackets: ListFormat

        @JsIntValue(8192)
        val SquareBrackets: ListFormat

        @JsIntValue(15360)
        val BracketsMask: ListFormat

        @JsIntValue(16384)
        val OptionalIfUndefined: ListFormat

        @JsIntValue(32768)
        val OptionalIfEmpty: ListFormat

        @JsIntValue(49152)
        val Optional: ListFormat

        @JsIntValue(65536)
        val PreferNewLine: ListFormat

        @JsIntValue(131072)
        val NoTrailingNewLine: ListFormat

        @JsIntValue(262144)
        val NoInterveningComments: ListFormat

        @JsIntValue(524288)
        val NoSpaceIfEmpty: ListFormat

        @JsIntValue(1048576)
        val SingleElement: ListFormat

        @JsIntValue(2097152)
        val SpaceAfterList: ListFormat

        @JsIntValue(2359808)
        val Modifiers: ListFormat

        @JsIntValue(512)
        val HeritageClauses: ListFormat

        @JsIntValue(768)
        val SingleLineTypeLiteralMembers: ListFormat

        @JsIntValue(32897)
        val MultiLineTypeLiteralMembers: ListFormat

        @JsIntValue(528)
        val SingleLineTupleTypeElements: ListFormat

        @JsIntValue(657)
        val MultiLineTupleTypeElements: ListFormat

        @JsIntValue(516)
        val UnionTypeConstituents: ListFormat

        @JsIntValue(520)
        val IntersectionTypeConstituents: ListFormat

        @JsIntValue(525136)
        val ObjectBindingPatternElements: ListFormat

        @JsIntValue(524880)
        val ArrayBindingPatternElements: ListFormat

        @JsIntValue(526226)
        val ObjectLiteralExpressionProperties: ListFormat

        @JsIntValue(526226)
        val ImportClauseEntries: ListFormat

        @JsIntValue(8914)
        val ArrayLiteralExpressionElements: ListFormat

        @JsIntValue(528)
        val CommaListElements: ListFormat

        @JsIntValue(2576)
        val CallExpressionArguments: ListFormat

        @JsIntValue(18960)
        val NewExpressionArguments: ListFormat

        @JsIntValue(262144)
        val TemplateExpressionSpans: ListFormat

        @JsIntValue(768)
        val SingleLineBlockStatements: ListFormat

        @JsIntValue(129)
        val MultiLineBlockStatements: ListFormat

        @JsIntValue(528)
        val VariableDeclarationList: ListFormat

        @JsIntValue(768)
        val SingleLineFunctionBodyStatements: ListFormat

        @JsIntValue(1)
        val MultiLineFunctionBodyStatements: ListFormat

        @JsIntValue(0)
        val ClassHeritageClauses: ListFormat

        @JsIntValue(129)
        val ClassMembers: ListFormat

        @JsIntValue(129)
        val InterfaceMembers: ListFormat

        @JsIntValue(145)
        val EnumMembers: ListFormat

        @JsIntValue(129)
        val CaseBlockClauses: ListFormat

        @JsIntValue(525136)
        val NamedImportsOrExportsElements: ListFormat

        @JsIntValue(262144)
        val JsxElementOrFragmentChildren: ListFormat

        @JsIntValue(262656)
        val JsxElementAttributes: ListFormat

        @JsIntValue(163969)
        val CaseOrDefaultClauseStatements: ListFormat

        @JsIntValue(528)
        val HeritageClauseTypes: ListFormat

        @JsIntValue(131073)
        val SourceFileStatements: ListFormat

        @JsIntValue(2146305)
        val Decorators: ListFormat

        @JsIntValue(53776)
        val TypeArguments: ListFormat

        @JsIntValue(53776)
        val TypeParameters: ListFormat

        @JsIntValue(2576)
        val Parameters: ListFormat

        @JsIntValue(8848)
        val IndexSignatureParameters: ListFormat

        @JsIntValue(33)
        val JSDocComment: ListFormat
    }
}
