// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsUnion

@JsUnion
sealed external interface ClassificationType {
    companion object {
        @JsIntValue(1)
        val comment: ClassificationType

        @JsIntValue(2)
        val identifier: ClassificationType

        @JsIntValue(3)
        val keyword: ClassificationType

        @JsIntValue(4)
        val numericLiteral: ClassificationType

        @JsIntValue(5)
        val operator: ClassificationType

        @JsIntValue(6)
        val stringLiteral: ClassificationType

        @JsIntValue(7)
        val regularExpressionLiteral: ClassificationType

        @JsIntValue(8)
        val whiteSpace: ClassificationType

        @JsIntValue(9)
        val text: ClassificationType

        @JsIntValue(10)
        val punctuation: ClassificationType

        @JsIntValue(11)
        val className: ClassificationType

        @JsIntValue(12)
        val enumName: ClassificationType

        @JsIntValue(13)
        val interfaceName: ClassificationType

        @JsIntValue(14)
        val moduleName: ClassificationType

        @JsIntValue(15)
        val typeParameterName: ClassificationType

        @JsIntValue(16)
        val typeAliasName: ClassificationType

        @JsIntValue(17)
        val parameterName: ClassificationType

        @JsIntValue(18)
        val docCommentTagName: ClassificationType

        @JsIntValue(19)
        val jsxOpenTagName: ClassificationType

        @JsIntValue(20)
        val jsxCloseTagName: ClassificationType

        @JsIntValue(21)
        val jsxSelfClosingTagName: ClassificationType

        @JsIntValue(22)
        val jsxAttribute: ClassificationType

        @JsIntValue(23)
        val jsxText: ClassificationType

        @JsIntValue(24)
        val jsxAttributeStringLiteralValue: ClassificationType

        @JsIntValue(25)
        val bigintLiteral: ClassificationType
    }
}
