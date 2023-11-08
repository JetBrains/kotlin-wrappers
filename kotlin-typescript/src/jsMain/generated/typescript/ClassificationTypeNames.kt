// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ClassificationTypeNames {
    companion object {
        @JsValue("comment")
        val comment: ClassificationTypeNames

        @JsValue("identifier")
        val identifier: ClassificationTypeNames

        @JsValue("keyword")
        val keyword: ClassificationTypeNames

        @JsValue("number")
        val numericLiteral: ClassificationTypeNames

        @JsValue("bigint")
        val bigintLiteral: ClassificationTypeNames

        @JsValue("operator")
        val operator: ClassificationTypeNames

        @JsValue("string")
        val stringLiteral: ClassificationTypeNames

        @JsValue("whitespace")
        val whiteSpace: ClassificationTypeNames

        @JsValue("text")
        val text: ClassificationTypeNames

        @JsValue("punctuation")
        val punctuation: ClassificationTypeNames

        @JsValue("class name")
        val className: ClassificationTypeNames

        @JsValue("enum name")
        val enumName: ClassificationTypeNames

        @JsValue("interface name")
        val interfaceName: ClassificationTypeNames

        @JsValue("module name")
        val moduleName: ClassificationTypeNames

        @JsValue("type parameter name")
        val typeParameterName: ClassificationTypeNames

        @JsValue("type alias name")
        val typeAliasName: ClassificationTypeNames

        @JsValue("parameter name")
        val parameterName: ClassificationTypeNames

        @JsValue("doc comment tag name")
        val docCommentTagName: ClassificationTypeNames

        @JsValue("jsx open tag name")
        val jsxOpenTagName: ClassificationTypeNames

        @JsValue("jsx close tag name")
        val jsxCloseTagName: ClassificationTypeNames

        @JsValue("jsx self closing tag name")
        val jsxSelfClosingTagName: ClassificationTypeNames

        @JsValue("jsx attribute")
        val jsxAttribute: ClassificationTypeNames

        @JsValue("jsx text")
        val jsxText: ClassificationTypeNames

        @JsValue("jsx attribute string literal value")
        val jsxAttributeStringLiteralValue: ClassificationTypeNames
    }
}
