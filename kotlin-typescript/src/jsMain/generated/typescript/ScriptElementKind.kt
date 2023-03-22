// Automatically generated - do not modify!

@file:Suppress(
    "NAME_CONTAINS_ILLEGAL_CHARS",
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

// language=JavaScript
@JsName(
    """(/*union*/{unknown: '', warning: 'warning', keyword: 'keyword', scriptElement: 'script', moduleElement: 'module', classElement: 'class', localClassElement: 'local class', interfaceElement: 'interface', typeElement: 'type', enumElement: 'enum', enumMemberElement: 'enum member', variableElement: 'var', localVariableElement: 'local var', functionElement: 'function', localFunctionElement: 'local function', memberFunctionElement: 'method', memberGetAccessorElement: 'getter', memberSetAccessorElement: 'setter', memberVariableElement: 'property', memberAccessorVariableElement: 'accessor', constructorImplementationElement: 'constructor', callSignatureElement: 'call', indexSignatureElement: 'index', constructSignatureElement: 'construct', parameterElement: 'parameter', typeParameterElement: 'type parameter', primitiveType: 'primitive type', label: 'label', alias: 'alias', constElement: 'const', letElement: 'let', directory: 'directory', externalModuleName: 'external module name', jsxAttribute: 'JSX attribute', string: 'string', link: 'link', linkName: 'link name', linkText: 'link text'}/*union*/)"""
)
sealed external interface ScriptElementKind {
    companion object {
        val unknown: ScriptElementKind
        val warning: ScriptElementKind

        /** predefined type (void) or keyword (class) */
        val keyword: ScriptElementKind

        /** top level script node */
        val scriptElement: ScriptElementKind

        /** module foo {} */
        val moduleElement: ScriptElementKind

        /** class X {} */
        val classElement: ScriptElementKind

        /** var x = class X {} */
        val localClassElement: ScriptElementKind

        /** interface Y {} */
        val interfaceElement: ScriptElementKind

        /** type T = ... */
        val typeElement: ScriptElementKind

        /** enum E */
        val enumElement: ScriptElementKind
        val enumMemberElement: ScriptElementKind

        /**
         * Inside module and script only
         * const v = ..
         */
        val variableElement: ScriptElementKind

        /** Inside function */
        val localVariableElement: ScriptElementKind

        /**
         * Inside module and script only
         * function f() { }
         */
        val functionElement: ScriptElementKind

        /** Inside function */
        val localFunctionElement: ScriptElementKind

        /** class X { [public|private]* foo() {} } */
        val memberFunctionElement: ScriptElementKind

        /** class X { [public|private]* [get|set] foo:number; } */
        val memberGetAccessorElement: ScriptElementKind
        val memberSetAccessorElement: ScriptElementKind

        /**
         * class X { [public|private]* foo:number; }
         * interface Y { foo:number; }
         */
        val memberVariableElement: ScriptElementKind

        /** class X { [public|private]* accessor foo: number; } */
        val memberAccessorVariableElement: ScriptElementKind

        /**
         * class X { constructor() { } }
         * class X { static { } }
         */
        val constructorImplementationElement: ScriptElementKind

        /** interface Y { ():number; } */
        val callSignatureElement: ScriptElementKind

        /** interface Y { []:number; } */
        val indexSignatureElement: ScriptElementKind

        /** interface Y { new():Y; } */
        val constructSignatureElement: ScriptElementKind

        /** function foo(*Y*: string) */
        val parameterElement: ScriptElementKind
        val typeParameterElement: ScriptElementKind
        val primitiveType: ScriptElementKind
        val label: ScriptElementKind
        val alias: ScriptElementKind
        val constElement: ScriptElementKind
        val letElement: ScriptElementKind
        val directory: ScriptElementKind
        val externalModuleName: ScriptElementKind

        /**
         * <JsxTagName attribute1 attribute2={0} />
         * @deprecated
         */
        val jsxAttribute: ScriptElementKind

        /** String literal */
        val string: ScriptElementKind

        /** Jsdoc @link: in `{@link C link text}`, the before and after text "{@link " and "}" */
        val link: ScriptElementKind

        /** Jsdoc @link: in `{@link C link text}`, the entity name "C" */
        val linkName: ScriptElementKind

        /** Jsdoc @link: in `{@link C link text}`, the link text "link text" */
        val linkText: ScriptElementKind
    }
}
