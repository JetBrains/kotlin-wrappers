// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface ScriptElementKind {
    companion object {
        @JsValue("")
        val unknown: ScriptElementKind

        @JsValue("warning")
        val warning: ScriptElementKind

        /** predefined type (void) or keyword (class) */
        @JsValue("keyword")
        val keyword: ScriptElementKind

        /** top level script node */
        @JsValue("script")
        val scriptElement: ScriptElementKind

        /** module foo {} */
        @JsValue("module")
        val moduleElement: ScriptElementKind

        /** class X {} */
        @JsValue("class")
        val classElement: ScriptElementKind

        /** var x = class X {} */
        @JsValue("local class")
        val localClassElement: ScriptElementKind

        /** interface Y {} */
        @JsValue("interface")
        val interfaceElement: ScriptElementKind

        /** type T = ... */
        @JsValue("type")
        val typeElement: ScriptElementKind

        /** enum E */
        @JsValue("enum")
        val enumElement: ScriptElementKind

        @JsValue("enum member")
        val enumMemberElement: ScriptElementKind

        /**
         * Inside module and script only
         * const v = ..
         */
        @JsValue("var")
        val variableElement: ScriptElementKind

        /** Inside function */
        @JsValue("local var")
        val localVariableElement: ScriptElementKind

        /**
         * Inside module and script only
         * function f() { }
         */
        @JsValue("function")
        val functionElement: ScriptElementKind

        /** Inside function */
        @JsValue("local function")
        val localFunctionElement: ScriptElementKind

        /** class X { [public|private]* foo() {} } */
        @JsValue("method")
        val memberFunctionElement: ScriptElementKind

        /** class X { [public|private]* [get|set] foo:number; } */
        @JsValue("getter")
        val memberGetAccessorElement: ScriptElementKind

        @JsValue("setter")
        val memberSetAccessorElement: ScriptElementKind

        /**
         * class X { [public|private]* foo:number; }
         * interface Y { foo:number; }
         */
        @JsValue("property")
        val memberVariableElement: ScriptElementKind

        /** class X { [public|private]* accessor foo: number; } */
        @JsValue("accessor")
        val memberAccessorVariableElement: ScriptElementKind

        /**
         * class X { constructor() { } }
         * class X { static { } }
         */
        @JsValue("constructor")
        val constructorImplementationElement: ScriptElementKind

        /** interface Y { ():number; } */
        @JsValue("call")
        val callSignatureElement: ScriptElementKind

        /** interface Y { []:number; } */
        @JsValue("index")
        val indexSignatureElement: ScriptElementKind

        /** interface Y { new():Y; } */
        @JsValue("construct")
        val constructSignatureElement: ScriptElementKind

        /** function foo(*Y*: string) */
        @JsValue("parameter")
        val parameterElement: ScriptElementKind

        @JsValue("type parameter")
        val typeParameterElement: ScriptElementKind

        @JsValue("primitive type")
        val primitiveType: ScriptElementKind

        @JsValue("label")
        val label: ScriptElementKind

        @JsValue("alias")
        val alias: ScriptElementKind

        @JsValue("const")
        val constElement: ScriptElementKind

        @JsValue("let")
        val letElement: ScriptElementKind

        @JsValue("directory")
        val directory: ScriptElementKind

        @JsValue("external module name")
        val externalModuleName: ScriptElementKind

        /**
         * <JsxTagName attribute1 attribute2={0} />
         * @deprecated
         */
        @JsValue("JSX attribute")
        val jsxAttribute: ScriptElementKind

        /** String literal */
        @JsValue("string")
        val string: ScriptElementKind

        /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
        @JsValue("link")
        val link: ScriptElementKind

        /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
        @JsValue("link name")
        val linkName: ScriptElementKind

        /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
        @JsValue("link text")
        val linkText: ScriptElementKind
    }
}
