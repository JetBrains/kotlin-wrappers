// Automatically generated - do not modify!

package typescript

sealed external interface Union {

    sealed interface AbstractKeyword_ : Modifier

    sealed interface AccessibilityModifier_ : ParameterPropertyModifier, ClassMemberModifier

    sealed interface AccessorDeclaration_ : HasJSDoc, SignatureDeclaration, ObjectLiteralElementLike

    sealed interface AccessorKeyword_ : Modifier, ClassMemberModifier

    sealed interface AdditiveOperator_ : AdditiveOperatorOrHigher

    sealed interface AdditiveOperatorOrHigher_ : ShiftOperatorOrHigher

    sealed interface ArrayBindingOrAssignmentElement_ : BindingOrAssignmentElement

    sealed interface ArrayBindingOrAssignmentPattern_ : BindingOrAssignmentPattern

    sealed interface ArrayBindingPattern_ : BindingPattern, ArrayBindingOrAssignmentPattern

    sealed interface ArrayBindingPattern_parent : Node

    sealed interface ArrayDestructuringAssignment_ : DestructuringAssignment

    sealed interface ArrayLiteralExpression_ : ArrayBindingOrAssignmentPattern, AssignmentPattern, JsonObjectExpression,
        DestructuringPattern, SpreadElement_parent

    sealed interface ArrayTypeNode_ : TypeReference_node

    sealed interface ArrowFunction_ : HasJSDoc, HasModifiers, SignatureDeclaration, FunctionLikeDeclaration,
        FlowStart_node

    sealed interface AsExpression_ : AssertionExpression

    sealed interface AssertClause_parent : Node

    sealed interface AssertionExpression_ : HasType

    sealed interface AssertsIdentifierTypePredicate_ : TypePredicate

    sealed interface AssertsThisTypePredicate_ : TypePredicate

    sealed interface AssignmentOperator_ : AssignmentOperatorOrHigher

    sealed interface AssignmentOperatorOrHigher_ : BinaryOperator

    sealed interface AsyncKeyword_ : Modifier

    sealed interface BigIntLiteral_ : LiteralToken

    sealed interface BinaryExpression_ : FlowArrayMutation_node

    sealed interface BindingElement_ : HasExpressionInitializer, VariableLikeDeclaration, ArrayBindingElement,
        ObjectBindingOrAssignmentElement, ObjectBindingPattern_parent, ArrayBindingPattern_parent, FlowAssignment_node

    sealed interface BindingOrAssignmentPattern_ : BindingOrAssignmentElementTarget

    sealed interface BindingPattern_ : DeclarationName, BindingName, DestructuringPattern

    sealed interface BitwiseOperator_ : BitwiseOperatorOrHigher

    sealed interface BitwiseOperatorOrHigher_ : LogicalOperatorOrHigher

    sealed interface Block_ : HasJSDoc, BlockLike

    sealed interface BooleanLiteral_ : JsonObjectExpression, LiteralTypeNode_literal

    sealed interface BreakStatement_ : HasJSDoc, BreakOrContinueStatement

    sealed interface CallChain_ : OptionalChain

    sealed interface CallExpression_ : HasTypeArguments, CallLikeExpression, SpreadElement_parent,
        FlowArrayMutation_node

    sealed interface CallSignatureDeclaration_ : HasJSDoc, SignatureDeclaration

    sealed interface CaseClause_ : HasJSDoc, CaseOrDefaultClause

    sealed interface CaseOrDefaultClause_ : BlockLike

    sealed interface CatchClause_ : VariableDeclaration_parent

    sealed interface ClassDeclaration_ : HasDecorators, HasModifiers, ClassLikeDeclaration,
        ClassStaticBlockDeclaration_parent

    sealed interface ClassExpression_ : HasDecorators, HasModifiers, ClassLikeDeclaration,
        ClassStaticBlockDeclaration_parent

    sealed interface ClassLikeDeclaration_ : HasJSDoc, ObjectTypeDeclaration, DeclarationWithTypeParameterChildren,
        MethodDeclaration_parent, GetAccessorDeclaration_parent, SetAccessorDeclaration_parent, HeritageClause_parent

    sealed interface ClassLikeDeclarationBase_kind : SyntaxKind

    sealed interface ClassStaticBlockDeclaration_ : HasJSDoc

    sealed interface ClassStaticBlockDeclaration_parent : Node

    sealed interface CompletionEntryDataResolved_ : CompletionEntryData

    sealed interface CompletionEntryDataUnresolved_ : CompletionEntryData

    sealed interface CompoundAssignmentOperator_ : AssignmentOperator

    sealed interface ComputedPropertyName_ : PropertyName, DeclarationName

    sealed interface ConstKeyword_ : Modifier

    sealed interface ConstructSignatureDeclaration_ : HasJSDoc, SignatureDeclaration

    sealed interface ConstructorDeclaration_ : HasJSDoc, HasModifiers, SignatureDeclaration, FunctionLikeDeclaration

    sealed interface ConstructorTypeNode_ : HasJSDoc, HasModifiers, SignatureDeclaration, FunctionOrConstructorTypeNode

    sealed interface ContinueStatement_ : HasJSDoc, BreakOrContinueStatement

    sealed interface DebuggerStatement_ : HasJSDoc

    sealed interface DeclarationStatement_name : DeclarationName

    sealed interface DeclarationWithTypeParameterChildren_ : DeclarationWithTypeParameters,
        TypeParameterDeclaration_parent

    sealed interface DeclareKeyword_ : Modifier

    sealed interface Decorator_ : ModifierLike, CallLikeExpression

    sealed interface DefaultClause_ : CaseOrDefaultClause

    sealed interface DefaultKeyword_ : Modifier

    sealed interface DoStatement_ : HasJSDoc

    sealed interface DotDotDotToken_ : BindingOrAssignmentElementRestIndicator

    sealed interface ElementAccessChain_ : OptionalChain

    sealed interface ElementAccessExpression_ : DeclarationName, BindingOrAssignmentElementTarget, AccessExpression

    sealed interface EmptyStatement_ : HasJSDoc

    sealed interface EndOfFileToken_ : HasJSDoc

    sealed interface EntityName_ : EntityNameOrEntityNameExpression, ModuleReference, JSDocNameReference_name,
        JSDocMemberName_left, JSDocLink_name, JSDocLinkCode_name, JSDocLinkPlain_name

    sealed interface EntityNameExpression_ : DeclarationName, EntityNameOrEntityNameExpression

    sealed interface EnumDeclaration_ : HasJSDoc, HasModifiers

    sealed interface EnumMember_ : HasJSDoc, HasExpressionInitializer, VariableLikeDeclaration

    sealed interface EqualityOperator_ : EqualityOperatorOrHigher

    sealed interface EqualityOperatorOrHigher_ : BitwiseOperatorOrHigher

    sealed interface ExponentiationOperator_ : MultiplicativeOperatorOrHigher

    sealed interface ExportAssignment_ : HasJSDoc, HasModifiers

    sealed interface ExportDeclaration_ : HasJSDoc, HasModifiers, AssertClause_parent

    sealed interface ExportDeclaration_parent : Node

    sealed interface ExportKeyword_ : Modifier

    sealed interface ExportSpecifier_ : HasJSDoc, ImportOrExportSpecifier

    sealed interface Expression_ : ConciseBody, ForInitializer, FlowAssignment_node

    sealed interface ExpressionStatement_ : HasJSDoc

    sealed interface ExpressionWithTypeArguments_ : TypeReferenceType

    sealed interface ExternalModuleReference_ : ModuleReference

    sealed interface FalseLiteral_ : BooleanLiteral

    sealed interface FlowArrayMutation_ : FlowNode

    sealed interface FlowArrayMutation_node

    sealed interface FlowAssignment_ : FlowNode

    sealed interface FlowAssignment_node

    sealed interface FlowCall_ : FlowNode

    sealed interface FlowCondition_ : FlowNode

    sealed interface FlowLabel_ : FlowNode

    sealed interface FlowReduceLabel_ : FlowNode

    sealed interface FlowStart_ : FlowNode

    sealed interface FlowStart_node

    sealed interface FlowSwitchClause_ : FlowNode

    sealed interface ForInStatement_ : HasJSDoc, HasInitializer, ForInOrOfStatement, VariableDeclarationList_parent

    sealed interface ForOfStatement_ : HasJSDoc, HasInitializer, ForInOrOfStatement, VariableDeclarationList_parent

    sealed interface ForStatement_ : HasJSDoc, HasInitializer, VariableDeclarationList_parent

    sealed interface FunctionBody_ : ConciseBody

    sealed interface FunctionDeclaration_ : HasJSDoc, HasModifiers, SignatureDeclaration, FunctionLikeDeclaration

    sealed interface FunctionExpression_ : HasJSDoc, HasModifiers, SignatureDeclaration, FunctionLikeDeclaration,
        FlowStart_node

    sealed interface FunctionOrConstructorTypeNodeBase_kind : SyntaxKind

    sealed interface FunctionTypeNode_ : HasJSDoc, SignatureDeclaration, FunctionOrConstructorTypeNode

    sealed interface GetAccessorDeclaration_ : HasDecorators, HasModifiers, FunctionLikeDeclaration,
        AccessorDeclaration, FlowStart_node

    sealed interface GetAccessorDeclaration_parent : Node

    sealed interface HasExpressionInitializer_ : HasInitializer

    sealed interface HeritageClause_parent : Node

    sealed interface HeritageClause_token

    sealed interface Identifier_ : EntityName, PropertyName, MemberName, DeclarationName, BindingName,
        PropertyNameLiteral, BindingOrAssignmentElementTarget, EntityNameExpression, JsxTagNameExpression, ModuleName,
        JSDocNamespaceBody, AssertionKey, DeclarationStatement_name, TypePredicateNode_parameterName,
        JSDocTypedefTag_fullName, JSDocCallbackTag_fullName

    sealed interface IdentifierTypePredicate_ : TypePredicate

    sealed interface IfStatement_ : HasJSDoc

    sealed interface ImportClause_ : TypeOnlyCompatibleAliasDeclaration

    sealed interface ImportDeclaration_ : HasJSDoc, HasModifiers, AssertClause_parent

    sealed interface ImportDeclaration_parent : Node

    sealed interface ImportEqualsDeclaration_ : HasJSDoc, HasModifiers, TypeOnlyCompatibleAliasDeclaration

    sealed interface ImportEqualsDeclaration_parent : Node

    sealed interface ImportOrExportSpecifier_ : TypeOnlyCompatibleAliasDeclaration

    sealed interface ImportSpecifier_ : ImportOrExportSpecifier

    sealed interface InKeyword_ : Modifier

    sealed interface IncompleteType_ : FlowType

    sealed interface IndexSignatureDeclaration_ : HasJSDoc, HasModifiers, SignatureDeclaration

    sealed interface IndexType_type

    sealed interface IndexedAccessType_ : TypeVariable

    sealed interface InferTypeNode_ : TypeParameterDeclaration_parent

    sealed interface InstantiableType_ : IndexType_type

    sealed interface InterfaceDeclaration_ : HasJSDoc, HasModifiers, ObjectTypeDeclaration,
        DeclarationWithTypeParameterChildren, GetAccessorDeclaration_parent, SetAccessorDeclaration_parent,
        HeritageClause_parent

    sealed interface IntersectionType_ : BaseType, StructuredType

    sealed interface IntersectionTypeNode_ : UnionOrIntersectionTypeNode

    sealed interface JSDoc_ : JSDocTag_parent

    sealed interface JSDocCallbackTag_ : DeclarationWithTypeParameters

    sealed interface JSDocCallbackTag_fullName

    sealed interface JSDocFunctionType_ : HasJSDoc, SignatureDeclaration

    sealed interface JSDocLink_ : JSDocComment

    sealed interface JSDocLink_name : DeclarationName

    sealed interface JSDocLinkCode_ : JSDocComment

    sealed interface JSDocLinkCode_name : DeclarationName

    sealed interface JSDocLinkPlain_ : JSDocComment

    sealed interface JSDocLinkPlain_name : DeclarationName

    sealed interface JSDocMemberName_ : JSDocNameReference_name, JSDocMemberName_left, JSDocLink_name,
        JSDocLinkCode_name, JSDocLinkPlain_name

    sealed interface JSDocMemberName_left

    sealed interface JSDocNameReference_name : DeclarationName

    sealed interface JSDocNamespaceBody_ : ModuleBody

    sealed interface JSDocNamespaceDeclaration_ : JSDocNamespaceBody, ModuleDeclaration_body, JSDocTypedefTag_fullName,
        JSDocCallbackTag_fullName

    sealed interface JSDocNonNullableType_ : HasType, JSDocTypeReferencingNode

    sealed interface JSDocNullableType_ : HasType, JSDocTypeReferencingNode

    sealed interface JSDocOptionalType_ : HasType, JSDocTypeReferencingNode

    sealed interface JSDocParameterTag_ : VariableLikeDeclaration

    sealed interface JSDocPropertyTag_ : VariableLikeDeclaration

    sealed interface JSDocSignature_ : DeclarationWithTypeParameters, Signature_declaration

    sealed interface JSDocTag_parent : Node

    sealed interface JSDocTemplateTag_ : DeclarationWithTypeParameterChildren

    sealed interface JSDocText_ : JSDocComment

    sealed interface JSDocTypeExpression_ : HasType, TypePredicateNode_parent, JSDocTypedefTag_typeExpression

    sealed interface JSDocTypeLiteral_ : JSDocTag_parent, JSDocTypedefTag_typeExpression

    sealed interface JSDocTypedefTag_ : DeclarationWithTypeParameters

    sealed interface JSDocTypedefTag_fullName

    sealed interface JSDocTypedefTag_typeExpression

    sealed interface JSDocVariadicType_ : HasType, JSDocTypeReferencingNode

    sealed interface JsonMinusNumericLiteral_ : JsonObjectExpression

    sealed interface JsxAttribute_ : HasInitializer, VariableLikeDeclaration, JsxAttributeLike

    sealed interface JsxAttributeLike_ : JsxExpression_parent

    sealed interface JsxElement_ : JsxAttributeValue, JsxChild, JsxExpression_parent, JsxText_parent

    sealed interface JsxExpression_ : JsxAttributeValue, JsxChild

    sealed interface JsxExpression_parent : Node

    sealed interface JsxFragment_ : JsxAttributeValue, JsxChild, JsxExpression_parent, JsxText_parent

    sealed interface JsxOpeningElement_ : HasTypeArguments, JsxOpeningLikeElement

    sealed interface JsxOpeningLikeElement_ : CallLikeExpression

    sealed interface JsxSelfClosingElement_ : HasTypeArguments, JsxOpeningLikeElement, JsxAttributeValue, JsxChild

    sealed interface JsxSpreadAttribute_ : JsxAttributeLike

    sealed interface JsxTagNamePropertyAccess_ : JsxTagNameExpression

    sealed interface JsxText_ : LiteralToken, JsxChild

    sealed interface JsxText_parent : Node

    sealed interface KeywordSyntaxKind_ : TokenSyntaxKind, JSDocSyntaxKind

    sealed interface LabeledStatement_ : HasJSDoc

    sealed interface LiteralExpression_ : LiteralTypeNode_literal

    sealed interface LiteralSyntaxKind_ : TokenSyntaxKind

    sealed interface LiteralTypeNode_literal

    sealed interface LogicalOperator_ : LogicalOperatorOrHigher

    sealed interface LogicalOperatorOrHigher_ : AssignmentOperatorOrHigher

    sealed interface MappedTypeNode_ : HasType

    sealed interface MappedTypeNode_questionToken

    sealed interface MappedTypeNode_readonlyToken

    sealed interface MetaProperty_keywordToken

    sealed interface MethodDeclaration_ : HasJSDoc, HasDecorators, HasModifiers, SignatureDeclaration,
        ObjectLiteralElementLike, FunctionLikeDeclaration, FlowStart_node

    sealed interface MethodDeclaration_parent : Node

    sealed interface MethodSignature_ : HasJSDoc, HasModifiers, SignatureDeclaration

    sealed interface MinusToken_ : MappedTypeNode_readonlyToken, MappedTypeNode_questionToken

    sealed interface Modifier_ : ModifierLike

    sealed interface ModuleBlock_ : BlockLike, NamespaceBody, ImportEqualsDeclaration_parent, ImportDeclaration_parent,
        ExportDeclaration_parent

    sealed interface ModuleBody_ : ModuleDeclaration_parent, ModuleDeclaration_body

    sealed interface ModuleDeclaration_ : HasJSDoc, HasModifiers

    sealed interface ModuleDeclaration_body

    sealed interface ModuleDeclaration_parent : Node

    sealed interface MultiplicativeOperator_ : MultiplicativeOperatorOrHigher

    sealed interface MultiplicativeOperatorOrHigher_ : AdditiveOperatorOrHigher

    sealed interface NamedExports_ : NamedExportBindings, NamedImportsOrExports

    sealed interface NamedImports_ : NamedImportBindings, NamedImportsOrExports

    sealed interface NamedTupleMember_ : HasJSDoc, SyntheticExpression_tupleNameSource

    sealed interface NamespaceBody_ : ModuleBody

    sealed interface NamespaceDeclaration_ : NamespaceBody

    sealed interface NamespaceExport_ : NamedExportBindings

    sealed interface NamespaceExportDeclaration_ : HasJSDoc

    sealed interface NamespaceImport_ : NamedImportBindings, TypeOnlyCompatibleAliasDeclaration

    sealed interface NewExpression_ : HasTypeArguments, CallLikeExpression, SpreadElement_parent

    sealed interface NoSubstitutionTemplateLiteral_ : StringLiteralLike, LiteralToken, TemplateLiteralToken,
        TemplateLiteral

    sealed interface NonNullChain_ : OptionalChain

    sealed interface NullLiteral_ : JsonObjectExpression, LiteralTypeNode_literal

    sealed interface NumericLiteral_ : PropertyName, DeclarationName, PropertyNameLiteral, LiteralToken,
        JsonObjectExpression, DeclarationStatement_name

    sealed interface ObjectBindingOrAssignmentElement_ : BindingOrAssignmentElement

    sealed interface ObjectBindingOrAssignmentPattern_ : BindingOrAssignmentPattern

    sealed interface ObjectBindingPattern_ : BindingPattern, ObjectBindingOrAssignmentPattern

    sealed interface ObjectBindingPattern_parent : Node

    sealed interface ObjectDestructuringAssignment_ : DestructuringAssignment

    sealed interface ObjectLiteralExpression_ : ObjectBindingOrAssignmentPattern, AssignmentPattern,
        JsonObjectExpression, DestructuringPattern, MethodDeclaration_parent, GetAccessorDeclaration_parent,
        SetAccessorDeclaration_parent

    sealed interface ObjectType_ : BaseType, StructuredType

    sealed interface OmittedExpression_ : ArrayBindingElement, BindingOrAssignmentElementTarget

    sealed interface OutKeyword_ : Modifier

    sealed interface OverrideKeyword_ : Modifier

    sealed interface ParameterDeclaration_ : HasJSDoc, HasType, HasExpressionInitializer, HasDecorators, HasModifiers,
        VariableLikeDeclaration, BindingOrAssignmentElement, ObjectBindingPattern_parent, ArrayBindingPattern_parent,
        SyntheticExpression_tupleNameSource

    sealed interface ParenthesizedExpression_ : HasJSDoc

    sealed interface ParenthesizedTypeNode_ : HasType

    sealed interface PlusToken_ : MappedTypeNode_readonlyToken, MappedTypeNode_questionToken

    sealed interface PrefixUnaryExpression_ : LiteralTypeNode_literal

    sealed interface PrivateIdentifier_ : PropertyName, MemberName, DeclarationName

    sealed interface PrivateKeyword_ : Modifier, AccessibilityModifier

    sealed interface PropertyAccessChain_ : OptionalChain

    sealed interface PropertyAccessEntityNameExpression_ : EntityNameExpression

    sealed interface PropertyAccessExpression_ : BindingOrAssignmentElementTarget, AccessExpression

    sealed interface PropertyAssignment_ : HasJSDoc, HasExpressionInitializer, ObjectLiteralElementLike,
        VariableLikeDeclaration, ObjectBindingOrAssignmentElement

    sealed interface PropertyDeclaration_ : HasJSDoc, HasType, HasExpressionInitializer, HasDecorators, HasModifiers,
        VariableLikeDeclaration

    sealed interface PropertySignature_ : HasJSDoc, HasType, HasModifiers, VariableLikeDeclaration

    sealed interface ProtectedKeyword_ : Modifier, AccessibilityModifier

    sealed interface PseudoLiteralSyntaxKind_ : TokenSyntaxKind

    sealed interface PseudoLiteralToken_ : TemplateLiteralToken

    sealed interface PublicKeyword_ : Modifier, AccessibilityModifier

    sealed interface PunctuationSyntaxKind_ : TokenSyntaxKind

    sealed interface QualifiedName_ : EntityName

    sealed interface QuestionToken_ : MappedTypeNode_questionToken

    sealed interface ReadonlyKeyword_ : Modifier, ParameterPropertyModifier, ClassMemberModifier,
        MappedTypeNode_readonlyToken

    sealed interface RegularExpressionLiteral_ : LiteralToken

    sealed interface RelationalOperator_ : RelationalOperatorOrHigher

    sealed interface RelationalOperatorOrHigher_ : EqualityOperatorOrHigher

    sealed interface RenameInfoFailure_ : RenameInfo

    sealed interface RenameInfoSuccess_ : RenameInfo

    sealed interface ReturnStatement_ : HasJSDoc

    sealed interface ScopedEmitHelper_ : EmitHelper

    sealed interface SetAccessorDeclaration_ : HasDecorators, HasModifiers, FunctionLikeDeclaration,
        AccessorDeclaration, FlowStart_node

    sealed interface SetAccessorDeclaration_parent : Node

    sealed interface ShiftOperator_ : ShiftOperatorOrHigher

    sealed interface ShiftOperatorOrHigher_ : RelationalOperatorOrHigher

    sealed interface ShorthandPropertyAssignment_ : HasJSDoc, ObjectLiteralElementLike, VariableLikeDeclaration,
        ObjectBindingOrAssignmentElement

    sealed interface Signature_declaration

    sealed interface SignatureDeclaration_ : HasType, DeclarationWithTypeParameterChildren, TypePredicateNode_parent,
        Signature_declaration

    sealed interface SignatureHelpCharacterTypedReason_ : SignatureHelpTriggerReason

    sealed interface SignatureHelpInvokedReason_ : SignatureHelpTriggerReason

    sealed interface SignatureHelpRetriggeredReason_ : SignatureHelpTriggerReason

    sealed interface SourceFile_ : BlockLike, ModuleDeclaration_parent, ImportEqualsDeclaration_parent,
        ImportDeclaration_parent, ExportDeclaration_parent

    sealed interface SpreadAssignment_ : HasJSDoc, ObjectLiteralElementLike, ObjectBindingOrAssignmentElement,
        BindingOrAssignmentElementRestIndicator

    sealed interface SpreadElement_ : BindingOrAssignmentElementRestIndicator

    sealed interface SpreadElement_parent : Node

    sealed interface StaticKeyword_ : Modifier, ClassMemberModifier

    sealed interface StringLiteral_ : PropertyName, StringLiteralLike, LiteralToken, JsxAttributeValue, ModuleName,
        AssertionKey, JsonObjectExpression, DeclarationStatement_name

    sealed interface StringLiteralLike_ : DeclarationName, PropertyNameLiteral

    sealed interface SuperElementAccessExpression_ : SuperProperty

    sealed interface SuperPropertyAccessExpression_ : SuperProperty

    sealed interface SwitchStatement_ : HasJSDoc

    sealed interface SyntaxKind_AbstractKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_AccessorKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_AmpersandAmpersandEqualsToken : CompoundAssignmentOperator,
        LogicalOrCoalescingAssignmentOperator

    sealed interface SyntaxKind_AmpersandAmpersandToken : PunctuationSyntaxKind, LogicalOperator

    sealed interface SyntaxKind_AmpersandEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_AmpersandToken : PunctuationSyntaxKind, BitwiseOperator

    sealed interface SyntaxKind_AnyKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_AsKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_AssertKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_AssertsKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_AsteriskAsteriskEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_AsteriskAsteriskToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_AsteriskEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_AsteriskToken : PunctuationSyntaxKind, JSDocSyntaxKind, MultiplicativeOperator

    sealed interface SyntaxKind_AsyncKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_AtToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_AwaitKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_BacktickToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_BarBarEqualsToken : CompoundAssignmentOperator, LogicalOrCoalescingAssignmentOperator

    sealed interface SyntaxKind_BarBarToken : PunctuationSyntaxKind, LogicalOperator

    sealed interface SyntaxKind_BarEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_BarToken : PunctuationSyntaxKind, BitwiseOperator

    sealed interface SyntaxKind_BigIntKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_BigIntLiteral : LiteralSyntaxKind

    sealed interface SyntaxKind_BooleanKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_BreakKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_CaretEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_CaretToken : PunctuationSyntaxKind, BitwiseOperator

    sealed interface SyntaxKind_CaseKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_CatchKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ClassDeclaration : ClassLikeDeclarationBase_kind

    sealed interface SyntaxKind_ClassExpression : ClassLikeDeclarationBase_kind

    sealed interface SyntaxKind_ClassKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_CloseBraceToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_CloseBracketToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_CloseParenToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_ColonToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_CommaToken : PunctuationSyntaxKind, JSDocSyntaxKind, BinaryOperator

    sealed interface SyntaxKind_ConflictMarkerTrivia : TriviaSyntaxKind, JsxTokenSyntaxKind

    sealed interface SyntaxKind_ConstKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_ConstructorKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ConstructorType : FunctionOrConstructorTypeNodeBase_kind

    sealed interface SyntaxKind_ContinueKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_DebuggerKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_DeclareKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_DefaultKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_DeleteKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_DoKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_DotDotDotToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_DotToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_ElseKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_EndOfFileToken : TokenSyntaxKind, JsxTokenSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_EnumKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_EqualsEqualsEqualsToken : PunctuationSyntaxKind, EqualityOperator

    sealed interface SyntaxKind_EqualsEqualsToken : PunctuationSyntaxKind, EqualityOperator

    sealed interface SyntaxKind_EqualsGreaterThanToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_EqualsToken : PunctuationSyntaxKind, JSDocSyntaxKind, AssignmentOperator

    sealed interface SyntaxKind_ExclamationEqualsEqualsToken : PunctuationSyntaxKind, EqualityOperator

    sealed interface SyntaxKind_ExclamationEqualsToken : PunctuationSyntaxKind, EqualityOperator

    sealed interface SyntaxKind_ExclamationToken : PunctuationSyntaxKind, PrefixUnaryOperator

    sealed interface SyntaxKind_ExportKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_ExtendsKeyword : KeywordSyntaxKind, HeritageClause_token

    sealed interface SyntaxKind_FalseKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_FinallyKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ForKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_FromKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_FunctionKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_FunctionType : FunctionOrConstructorTypeNodeBase_kind

    sealed interface SyntaxKind_GetKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_GlobalKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_GreaterThanEqualsToken : PunctuationSyntaxKind, RelationalOperator

    sealed interface SyntaxKind_GreaterThanGreaterThanEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_GreaterThanGreaterThanGreaterThanEqualsToken : PunctuationSyntaxKind,
        CompoundAssignmentOperator

    sealed interface SyntaxKind_GreaterThanGreaterThanGreaterThanToken : PunctuationSyntaxKind, ShiftOperator

    sealed interface SyntaxKind_GreaterThanGreaterThanToken : PunctuationSyntaxKind, ShiftOperator

    sealed interface SyntaxKind_GreaterThanToken : PunctuationSyntaxKind, JSDocSyntaxKind, RelationalOperator

    sealed interface SyntaxKind_HashToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_Identifier : TokenSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_IfKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ImplementsKeyword : KeywordSyntaxKind, HeritageClause_token

    sealed interface SyntaxKind_ImportKeyword : KeywordSyntaxKind, MetaProperty_keywordToken

    sealed interface SyntaxKind_InKeyword : KeywordSyntaxKind, ModifierSyntaxKind, RelationalOperator

    sealed interface SyntaxKind_InferKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_InstanceOfKeyword : KeywordSyntaxKind, RelationalOperator

    sealed interface SyntaxKind_InterfaceKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_IntrinsicKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_IsKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_JsxText : LiteralSyntaxKind, JsxTokenSyntaxKind

    sealed interface SyntaxKind_JsxTextAllWhiteSpaces : LiteralSyntaxKind, JsxTokenSyntaxKind

    sealed interface SyntaxKind_KeyOfKeyword : KeywordSyntaxKind, TypeOperatorNode_operator

    sealed interface SyntaxKind_LessThanEqualsToken : PunctuationSyntaxKind, RelationalOperator

    sealed interface SyntaxKind_LessThanLessThanEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_LessThanLessThanToken : PunctuationSyntaxKind, ShiftOperator

    sealed interface SyntaxKind_LessThanSlashToken : PunctuationSyntaxKind, JsxTokenSyntaxKind

    sealed interface SyntaxKind_LessThanToken : PunctuationSyntaxKind, JsxTokenSyntaxKind, JSDocSyntaxKind,
        RelationalOperator

    sealed interface SyntaxKind_LetKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_MinusEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_MinusMinusToken : PunctuationSyntaxKind, PrefixUnaryOperator, PostfixUnaryOperator

    sealed interface SyntaxKind_MinusToken : PunctuationSyntaxKind, PrefixUnaryOperator, AdditiveOperator

    sealed interface SyntaxKind_ModuleKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_MultiLineCommentTrivia : TriviaSyntaxKind, CommentKind

    sealed interface SyntaxKind_NamespaceKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_NeverKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_NewKeyword : KeywordSyntaxKind, MetaProperty_keywordToken

    sealed interface SyntaxKind_NewLineTrivia : TriviaSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_NoSubstitutionTemplateLiteral : LiteralSyntaxKind

    sealed interface SyntaxKind_NullKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_NumberKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_NumericLiteral : LiteralSyntaxKind

    sealed interface SyntaxKind_ObjectKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_OfKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_OpenBraceToken : PunctuationSyntaxKind, JsxTokenSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_OpenBracketToken : PunctuationSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_OpenParenToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_OutKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_OverrideKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_PackageKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_PercentEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_PercentToken : PunctuationSyntaxKind, MultiplicativeOperator

    sealed interface SyntaxKind_PlusEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_PlusPlusToken : PunctuationSyntaxKind, PrefixUnaryOperator, PostfixUnaryOperator

    sealed interface SyntaxKind_PlusToken : PunctuationSyntaxKind, PrefixUnaryOperator, AdditiveOperator

    sealed interface SyntaxKind_PrivateKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_ProtectedKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_PublicKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_QuestionDotToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_QuestionQuestionEqualsToken : CompoundAssignmentOperator,
        LogicalOrCoalescingAssignmentOperator

    sealed interface SyntaxKind_QuestionQuestionToken : PunctuationSyntaxKind, AssignmentOperatorOrHigher

    sealed interface SyntaxKind_QuestionToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_ReadonlyKeyword : KeywordSyntaxKind, ModifierSyntaxKind, TypeOperatorNode_operator

    sealed interface SyntaxKind_RegularExpressionLiteral : LiteralSyntaxKind

    sealed interface SyntaxKind_RequireKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ReturnKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_SatisfiesKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_SemicolonToken : PunctuationSyntaxKind

    sealed interface SyntaxKind_SetKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ShebangTrivia : TriviaSyntaxKind

    sealed interface SyntaxKind_SingleLineCommentTrivia : TriviaSyntaxKind, CommentKind

    sealed interface SyntaxKind_SlashEqualsToken : PunctuationSyntaxKind, CompoundAssignmentOperator

    sealed interface SyntaxKind_SlashToken : PunctuationSyntaxKind, MultiplicativeOperator

    sealed interface SyntaxKind_StaticKeyword : KeywordSyntaxKind, ModifierSyntaxKind

    sealed interface SyntaxKind_StringKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_StringLiteral : LiteralSyntaxKind

    sealed interface SyntaxKind_SuperKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_SwitchKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_SymbolKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_TemplateHead : PseudoLiteralSyntaxKind

    sealed interface SyntaxKind_TemplateMiddle : PseudoLiteralSyntaxKind

    sealed interface SyntaxKind_TemplateTail : PseudoLiteralSyntaxKind

    sealed interface SyntaxKind_ThisKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_ThrowKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_TildeToken : PunctuationSyntaxKind, PrefixUnaryOperator

    sealed interface SyntaxKind_TrueKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_TryKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_TypeKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_TypeOfKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_UndefinedKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_UniqueKeyword : KeywordSyntaxKind, TypeOperatorNode_operator

    sealed interface SyntaxKind_Unknown : TokenSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_UnknownKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_UnparsedInternalText : UnparsedTextLike_kind

    sealed interface SyntaxKind_UnparsedText : UnparsedTextLike_kind

    sealed interface SyntaxKind_VarKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_VoidKeyword : KeywordSyntaxKind, KeywordTypeSyntaxKind

    sealed interface SyntaxKind_WhileKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_WhitespaceTrivia : TriviaSyntaxKind, JSDocSyntaxKind

    sealed interface SyntaxKind_WithKeyword : KeywordSyntaxKind

    sealed interface SyntaxKind_YieldKeyword : KeywordSyntaxKind

    sealed interface SyntheticExpression_tupleNameSource

    sealed interface TaggedTemplateExpression_ : HasTypeArguments, CallLikeExpression

    sealed interface TemplateExpression_ : TemplateLiteral, TemplateHead_parent

    sealed interface TemplateHead_ : PseudoLiteralToken

    sealed interface TemplateHead_parent : Node

    sealed interface TemplateLiteralTypeNode_ : TemplateHead_parent

    sealed interface TemplateLiteralTypeSpan_ : TemplateMiddle_parent, TemplateTail_parent

    sealed interface TemplateLiteralTypeSpan_literal

    sealed interface TemplateMiddle_ : PseudoLiteralToken, TemplateLiteralTypeSpan_literal, TemplateSpan_literal

    sealed interface TemplateMiddle_parent : Node

    sealed interface TemplateSpan_ : TemplateMiddle_parent, TemplateTail_parent

    sealed interface TemplateSpan_literal

    sealed interface TemplateTail_ : PseudoLiteralToken, TemplateLiteralTypeSpan_literal, TemplateSpan_literal

    sealed interface TemplateTail_parent : Node

    sealed interface ThisExpression_ : JsxTagNameExpression

    sealed interface ThisTypeNode_ : TypePredicateNode_parameterName

    sealed interface ThisTypePredicate_ : TypePredicate

    sealed interface ThrowStatement_ : HasJSDoc

    sealed interface TriviaSyntaxKind_ : TokenSyntaxKind

    sealed interface TrueLiteral_ : BooleanLiteral

    sealed interface TryStatement_ : HasJSDoc

    sealed interface TupleTypeNode_ : TypeReference_node

    sealed interface Type_ : FlowType

    sealed interface TypeAliasDeclaration_ : HasJSDoc, HasType, HasModifiers, DeclarationWithTypeParameterChildren

    sealed interface TypeAssertion_ : AssertionExpression

    sealed interface TypeLiteralNode_ : ObjectTypeDeclaration, GetAccessorDeclaration_parent,
        SetAccessorDeclaration_parent

    sealed interface TypeOperatorNode_ : HasType

    sealed interface TypeOperatorNode_operator

    sealed interface TypeParameter_ : TypeVariable

    sealed interface TypeParameterDeclaration_ : HasModifiers

    sealed interface TypeParameterDeclaration_parent : Node

    sealed interface TypePredicateNode_ : HasType

    sealed interface TypePredicateNode_parameterName

    sealed interface TypePredicateNode_parent : Node

    sealed interface TypeReference_node

    sealed interface TypeReferenceNode_ : TypeReferenceType, TypeReference_node

    sealed interface TypeVariable_ : BaseType

    sealed interface UnionOrIntersectionType_ : IndexType_type

    sealed interface UnionType_ : StructuredType

    sealed interface UnionTypeNode_ : UnionOrIntersectionTypeNode

    sealed interface UnparsedPrepend_ : UnparsedSourceText

    sealed interface UnparsedPrologue_ : UnparsedNode

    sealed interface UnparsedSourceText_ : UnparsedNode

    sealed interface UnparsedSyntheticReference_ : UnparsedNode

    sealed interface UnparsedTextLike_ : UnparsedSourceText

    sealed interface UnparsedTextLike_kind : SyntaxKind

    sealed interface UnscopedEmitHelper_ : EmitHelper

    sealed interface VariableDeclaration_ : HasJSDoc, HasType, HasExpressionInitializer, VariableLikeDeclaration,
        BindingOrAssignmentElement, ObjectBindingPattern_parent, ArrayBindingPattern_parent, FlowAssignment_node

    sealed interface VariableDeclaration_parent : Node

    sealed interface VariableDeclarationList_ : ForInitializer, VariableDeclaration_parent

    sealed interface VariableDeclarationList_parent : Node

    sealed interface VariableStatement_ : HasJSDoc, HasModifiers, VariableDeclarationList_parent

    sealed interface WhileStatement_ : HasJSDoc

    sealed interface WithStatement_ : HasJSDoc

}
