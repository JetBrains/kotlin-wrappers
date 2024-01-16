// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package typescript

import seskar.js.JsIntValue
import seskar.js.JsVirtual

@JsVirtual
sealed external interface SyntaxKind {
    companion object {
        @JsIntValue(0)
        val Unknown: Unknown

        @JsIntValue(1)
        val EndOfFileToken: EndOfFileToken

        @JsIntValue(2)
        val SingleLineCommentTrivia: SingleLineCommentTrivia

        @JsIntValue(3)
        val MultiLineCommentTrivia: MultiLineCommentTrivia

        @JsIntValue(4)
        val NewLineTrivia: NewLineTrivia

        @JsIntValue(5)
        val WhitespaceTrivia: WhitespaceTrivia

        @JsIntValue(6)
        val ShebangTrivia: ShebangTrivia

        @JsIntValue(7)
        val ConflictMarkerTrivia: ConflictMarkerTrivia

        @JsIntValue(8)
        val NonTextFileMarkerTrivia: NonTextFileMarkerTrivia

        @JsIntValue(9)
        val NumericLiteral: NumericLiteral

        @JsIntValue(10)
        val BigIntLiteral: BigIntLiteral

        @JsIntValue(11)
        val StringLiteral: StringLiteral

        @JsIntValue(12)
        val JsxText: JsxText

        @JsIntValue(13)
        val JsxTextAllWhiteSpaces: JsxTextAllWhiteSpaces

        @JsIntValue(14)
        val RegularExpressionLiteral: RegularExpressionLiteral

        @JsIntValue(15)
        val NoSubstitutionTemplateLiteral: NoSubstitutionTemplateLiteral

        @JsIntValue(16)
        val TemplateHead: TemplateHead

        @JsIntValue(17)
        val TemplateMiddle: TemplateMiddle

        @JsIntValue(18)
        val TemplateTail: TemplateTail

        @JsIntValue(19)
        val OpenBraceToken: OpenBraceToken

        @JsIntValue(20)
        val CloseBraceToken: CloseBraceToken

        @JsIntValue(21)
        val OpenParenToken: OpenParenToken

        @JsIntValue(22)
        val CloseParenToken: CloseParenToken

        @JsIntValue(23)
        val OpenBracketToken: OpenBracketToken

        @JsIntValue(24)
        val CloseBracketToken: CloseBracketToken

        @JsIntValue(25)
        val DotToken: DotToken

        @JsIntValue(26)
        val DotDotDotToken: DotDotDotToken

        @JsIntValue(27)
        val SemicolonToken: SemicolonToken

        @JsIntValue(28)
        val CommaToken: CommaToken

        @JsIntValue(29)
        val QuestionDotToken: QuestionDotToken

        @JsIntValue(30)
        val LessThanToken: LessThanToken

        @JsIntValue(31)
        val LessThanSlashToken: LessThanSlashToken

        @JsIntValue(32)
        val GreaterThanToken: GreaterThanToken

        @JsIntValue(33)
        val LessThanEqualsToken: LessThanEqualsToken

        @JsIntValue(34)
        val GreaterThanEqualsToken: GreaterThanEqualsToken

        @JsIntValue(35)
        val EqualsEqualsToken: EqualsEqualsToken

        @JsIntValue(36)
        val ExclamationEqualsToken: ExclamationEqualsToken

        @JsIntValue(37)
        val EqualsEqualsEqualsToken: EqualsEqualsEqualsToken

        @JsIntValue(38)
        val ExclamationEqualsEqualsToken: ExclamationEqualsEqualsToken

        @JsIntValue(39)
        val EqualsGreaterThanToken: EqualsGreaterThanToken

        @JsIntValue(40)
        val PlusToken: PlusToken

        @JsIntValue(41)
        val MinusToken: MinusToken

        @JsIntValue(42)
        val AsteriskToken: AsteriskToken

        @JsIntValue(43)
        val AsteriskAsteriskToken: AsteriskAsteriskToken

        @JsIntValue(44)
        val SlashToken: SlashToken

        @JsIntValue(45)
        val PercentToken: PercentToken

        @JsIntValue(46)
        val PlusPlusToken: PlusPlusToken

        @JsIntValue(47)
        val MinusMinusToken: MinusMinusToken

        @JsIntValue(48)
        val LessThanLessThanToken: LessThanLessThanToken

        @JsIntValue(49)
        val GreaterThanGreaterThanToken: GreaterThanGreaterThanToken

        @JsIntValue(50)
        val GreaterThanGreaterThanGreaterThanToken: GreaterThanGreaterThanGreaterThanToken

        @JsIntValue(51)
        val AmpersandToken: AmpersandToken

        @JsIntValue(52)
        val BarToken: BarToken

        @JsIntValue(53)
        val CaretToken: CaretToken

        @JsIntValue(54)
        val ExclamationToken: ExclamationToken

        @JsIntValue(55)
        val TildeToken: TildeToken

        @JsIntValue(56)
        val AmpersandAmpersandToken: AmpersandAmpersandToken

        @JsIntValue(57)
        val BarBarToken: BarBarToken

        @JsIntValue(58)
        val QuestionToken: QuestionToken

        @JsIntValue(59)
        val ColonToken: ColonToken

        @JsIntValue(60)
        val AtToken: AtToken

        @JsIntValue(61)
        val QuestionQuestionToken: QuestionQuestionToken

        /** Only the JSDoc scanner produces BacktickToken. The normal scanner produces NoSubstitutionTemplateLiteral and related kinds. */
        @JsIntValue(62)
        val BacktickToken: BacktickToken

        /** Only the JSDoc scanner produces HashToken. The normal scanner produces PrivateIdentifier. */
        @JsIntValue(63)
        val HashToken: HashToken

        @JsIntValue(64)
        val EqualsToken: EqualsToken

        @JsIntValue(65)
        val PlusEqualsToken: PlusEqualsToken

        @JsIntValue(66)
        val MinusEqualsToken: MinusEqualsToken

        @JsIntValue(67)
        val AsteriskEqualsToken: AsteriskEqualsToken

        @JsIntValue(68)
        val AsteriskAsteriskEqualsToken: AsteriskAsteriskEqualsToken

        @JsIntValue(69)
        val SlashEqualsToken: SlashEqualsToken

        @JsIntValue(70)
        val PercentEqualsToken: PercentEqualsToken

        @JsIntValue(71)
        val LessThanLessThanEqualsToken: LessThanLessThanEqualsToken

        @JsIntValue(72)
        val GreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanEqualsToken

        @JsIntValue(73)
        val GreaterThanGreaterThanGreaterThanEqualsToken: GreaterThanGreaterThanGreaterThanEqualsToken

        @JsIntValue(74)
        val AmpersandEqualsToken: AmpersandEqualsToken

        @JsIntValue(75)
        val BarEqualsToken: BarEqualsToken

        @JsIntValue(76)
        val BarBarEqualsToken: BarBarEqualsToken

        @JsIntValue(77)
        val AmpersandAmpersandEqualsToken: AmpersandAmpersandEqualsToken

        @JsIntValue(78)
        val QuestionQuestionEqualsToken: QuestionQuestionEqualsToken

        @JsIntValue(79)
        val CaretEqualsToken: CaretEqualsToken

        @JsIntValue(80)
        val Identifier: Identifier

        @JsIntValue(81)
        val PrivateIdentifier: PrivateIdentifier

        @JsIntValue(83)
        val BreakKeyword: BreakKeyword

        @JsIntValue(84)
        val CaseKeyword: CaseKeyword

        @JsIntValue(85)
        val CatchKeyword: CatchKeyword

        @JsIntValue(86)
        val ClassKeyword: ClassKeyword

        @JsIntValue(87)
        val ConstKeyword: ConstKeyword

        @JsIntValue(88)
        val ContinueKeyword: ContinueKeyword

        @JsIntValue(89)
        val DebuggerKeyword: DebuggerKeyword

        @JsIntValue(90)
        val DefaultKeyword: DefaultKeyword

        @JsIntValue(91)
        val DeleteKeyword: DeleteKeyword

        @JsIntValue(92)
        val DoKeyword: DoKeyword

        @JsIntValue(93)
        val ElseKeyword: ElseKeyword

        @JsIntValue(94)
        val EnumKeyword: EnumKeyword

        @JsIntValue(95)
        val ExportKeyword: ExportKeyword

        @JsIntValue(96)
        val ExtendsKeyword: ExtendsKeyword

        @JsIntValue(97)
        val FalseKeyword: FalseKeyword

        @JsIntValue(98)
        val FinallyKeyword: FinallyKeyword

        @JsIntValue(99)
        val ForKeyword: ForKeyword

        @JsIntValue(100)
        val FunctionKeyword: FunctionKeyword

        @JsIntValue(101)
        val IfKeyword: IfKeyword

        @JsIntValue(102)
        val ImportKeyword: ImportKeyword

        @JsIntValue(103)
        val InKeyword: InKeyword

        @JsIntValue(104)
        val InstanceOfKeyword: InstanceOfKeyword

        @JsIntValue(105)
        val NewKeyword: NewKeyword

        @JsIntValue(106)
        val NullKeyword: NullKeyword

        @JsIntValue(107)
        val ReturnKeyword: ReturnKeyword

        @JsIntValue(108)
        val SuperKeyword: SuperKeyword

        @JsIntValue(109)
        val SwitchKeyword: SwitchKeyword

        @JsIntValue(110)
        val ThisKeyword: ThisKeyword

        @JsIntValue(111)
        val ThrowKeyword: ThrowKeyword

        @JsIntValue(112)
        val TrueKeyword: TrueKeyword

        @JsIntValue(113)
        val TryKeyword: TryKeyword

        @JsIntValue(114)
        val TypeOfKeyword: TypeOfKeyword

        @JsIntValue(115)
        val VarKeyword: VarKeyword

        @JsIntValue(116)
        val VoidKeyword: VoidKeyword

        @JsIntValue(117)
        val WhileKeyword: WhileKeyword

        @JsIntValue(118)
        val WithKeyword: WithKeyword

        @JsIntValue(119)
        val ImplementsKeyword: ImplementsKeyword

        @JsIntValue(120)
        val InterfaceKeyword: InterfaceKeyword

        @JsIntValue(121)
        val LetKeyword: LetKeyword

        @JsIntValue(122)
        val PackageKeyword: PackageKeyword

        @JsIntValue(123)
        val PrivateKeyword: PrivateKeyword

        @JsIntValue(124)
        val ProtectedKeyword: ProtectedKeyword

        @JsIntValue(125)
        val PublicKeyword: PublicKeyword

        @JsIntValue(126)
        val StaticKeyword: StaticKeyword

        @JsIntValue(127)
        val YieldKeyword: YieldKeyword

        @JsIntValue(128)
        val AbstractKeyword: AbstractKeyword

        @JsIntValue(129)
        val AccessorKeyword: AccessorKeyword

        @JsIntValue(130)
        val AsKeyword: AsKeyword

        @JsIntValue(131)
        val AssertsKeyword: AssertsKeyword

        @JsIntValue(132)
        val AssertKeyword: AssertKeyword

        @JsIntValue(133)
        val AnyKeyword: AnyKeyword

        @JsIntValue(134)
        val AsyncKeyword: AsyncKeyword

        @JsIntValue(135)
        val AwaitKeyword: AwaitKeyword

        @JsIntValue(136)
        val BooleanKeyword: BooleanKeyword

        @JsIntValue(137)
        val ConstructorKeyword: ConstructorKeyword

        @JsIntValue(138)
        val DeclareKeyword: DeclareKeyword

        @JsIntValue(139)
        val GetKeyword: GetKeyword

        @JsIntValue(140)
        val InferKeyword: InferKeyword

        @JsIntValue(141)
        val IntrinsicKeyword: IntrinsicKeyword

        @JsIntValue(142)
        val IsKeyword: IsKeyword

        @JsIntValue(143)
        val KeyOfKeyword: KeyOfKeyword

        @JsIntValue(144)
        val ModuleKeyword: ModuleKeyword

        @JsIntValue(145)
        val NamespaceKeyword: NamespaceKeyword

        @JsIntValue(146)
        val NeverKeyword: NeverKeyword

        @JsIntValue(147)
        val OutKeyword: OutKeyword

        @JsIntValue(148)
        val ReadonlyKeyword: ReadonlyKeyword

        @JsIntValue(149)
        val RequireKeyword: RequireKeyword

        @JsIntValue(150)
        val NumberKeyword: NumberKeyword

        @JsIntValue(151)
        val ObjectKeyword: ObjectKeyword

        @JsIntValue(152)
        val SatisfiesKeyword: SatisfiesKeyword

        @JsIntValue(153)
        val SetKeyword: SetKeyword

        @JsIntValue(154)
        val StringKeyword: StringKeyword

        @JsIntValue(155)
        val SymbolKeyword: SymbolKeyword

        @JsIntValue(156)
        val TypeKeyword: TypeKeyword

        @JsIntValue(157)
        val UndefinedKeyword: UndefinedKeyword

        @JsIntValue(158)
        val UniqueKeyword: UniqueKeyword

        @JsIntValue(159)
        val UnknownKeyword: UnknownKeyword

        @JsIntValue(160)
        val UsingKeyword: UsingKeyword

        @JsIntValue(161)
        val FromKeyword: FromKeyword

        @JsIntValue(162)
        val GlobalKeyword: GlobalKeyword

        @JsIntValue(163)
        val BigIntKeyword: BigIntKeyword

        @JsIntValue(164)
        val OverrideKeyword: OverrideKeyword

        @JsIntValue(165)
        val OfKeyword: OfKeyword

        @JsIntValue(166)
        val QualifiedName: QualifiedName

        @JsIntValue(167)
        val ComputedPropertyName: ComputedPropertyName

        @JsIntValue(168)
        val TypeParameter: TypeParameter

        @JsIntValue(169)
        val Parameter: Parameter

        @JsIntValue(170)
        val Decorator: Decorator

        @JsIntValue(171)
        val PropertySignature: PropertySignature

        @JsIntValue(172)
        val PropertyDeclaration: PropertyDeclaration

        @JsIntValue(173)
        val MethodSignature: MethodSignature

        @JsIntValue(174)
        val MethodDeclaration: MethodDeclaration

        @JsIntValue(175)
        val ClassStaticBlockDeclaration: ClassStaticBlockDeclaration

        @JsIntValue(176)
        val Constructor: Constructor

        @JsIntValue(177)
        val GetAccessor: GetAccessor

        @JsIntValue(178)
        val SetAccessor: SetAccessor

        @JsIntValue(179)
        val CallSignature: CallSignature

        @JsIntValue(180)
        val ConstructSignature: ConstructSignature

        @JsIntValue(181)
        val IndexSignature: IndexSignature

        @JsIntValue(182)
        val TypePredicate: TypePredicate

        @JsIntValue(183)
        val TypeReference: TypeReference

        @JsIntValue(184)
        val FunctionType: FunctionType

        @JsIntValue(185)
        val ConstructorType: ConstructorType

        @JsIntValue(186)
        val TypeQuery: TypeQuery

        @JsIntValue(187)
        val TypeLiteral: TypeLiteral

        @JsIntValue(188)
        val ArrayType: ArrayType

        @JsIntValue(189)
        val TupleType: TupleType

        @JsIntValue(190)
        val OptionalType: OptionalType

        @JsIntValue(191)
        val RestType: RestType

        @JsIntValue(192)
        val UnionType: UnionType

        @JsIntValue(193)
        val IntersectionType: IntersectionType

        @JsIntValue(194)
        val ConditionalType: ConditionalType

        @JsIntValue(195)
        val InferType: InferType

        @JsIntValue(196)
        val ParenthesizedType: ParenthesizedType

        @JsIntValue(197)
        val ThisType: ThisType

        @JsIntValue(198)
        val TypeOperator: TypeOperator

        @JsIntValue(199)
        val IndexedAccessType: IndexedAccessType

        @JsIntValue(200)
        val MappedType: MappedType

        @JsIntValue(201)
        val LiteralType: LiteralType

        @JsIntValue(202)
        val NamedTupleMember: NamedTupleMember

        @JsIntValue(203)
        val TemplateLiteralType: TemplateLiteralType

        @JsIntValue(204)
        val TemplateLiteralTypeSpan: TemplateLiteralTypeSpan

        @JsIntValue(205)
        val ImportType: ImportType

        @JsIntValue(206)
        val ObjectBindingPattern: ObjectBindingPattern

        @JsIntValue(207)
        val ArrayBindingPattern: ArrayBindingPattern

        @JsIntValue(208)
        val BindingElement: BindingElement

        @JsIntValue(209)
        val ArrayLiteralExpression: ArrayLiteralExpression

        @JsIntValue(210)
        val ObjectLiteralExpression: ObjectLiteralExpression

        @JsIntValue(211)
        val PropertyAccessExpression: PropertyAccessExpression

        @JsIntValue(212)
        val ElementAccessExpression: ElementAccessExpression

        @JsIntValue(213)
        val CallExpression: CallExpression

        @JsIntValue(214)
        val NewExpression: NewExpression

        @JsIntValue(215)
        val TaggedTemplateExpression: TaggedTemplateExpression

        @JsIntValue(216)
        val TypeAssertionExpression: TypeAssertionExpression

        @JsIntValue(217)
        val ParenthesizedExpression: ParenthesizedExpression

        @JsIntValue(218)
        val FunctionExpression: FunctionExpression

        @JsIntValue(219)
        val ArrowFunction: ArrowFunction

        @JsIntValue(220)
        val DeleteExpression: DeleteExpression

        @JsIntValue(221)
        val TypeOfExpression: TypeOfExpression

        @JsIntValue(222)
        val VoidExpression: VoidExpression

        @JsIntValue(223)
        val AwaitExpression: AwaitExpression

        @JsIntValue(224)
        val PrefixUnaryExpression: PrefixUnaryExpression

        @JsIntValue(225)
        val PostfixUnaryExpression: PostfixUnaryExpression

        @JsIntValue(226)
        val BinaryExpression: BinaryExpression

        @JsIntValue(227)
        val ConditionalExpression: ConditionalExpression

        @JsIntValue(228)
        val TemplateExpression: TemplateExpression

        @JsIntValue(229)
        val YieldExpression: YieldExpression

        @JsIntValue(230)
        val SpreadElement: SpreadElement

        @JsIntValue(231)
        val ClassExpression: ClassExpression

        @JsIntValue(232)
        val OmittedExpression: OmittedExpression

        @JsIntValue(233)
        val ExpressionWithTypeArguments: ExpressionWithTypeArguments

        @JsIntValue(234)
        val AsExpression: AsExpression

        @JsIntValue(235)
        val NonNullExpression: NonNullExpression

        @JsIntValue(236)
        val MetaProperty: MetaProperty

        @JsIntValue(237)
        val SyntheticExpression: SyntheticExpression

        @JsIntValue(238)
        val SatisfiesExpression: SatisfiesExpression

        @JsIntValue(239)
        val TemplateSpan: TemplateSpan

        @JsIntValue(240)
        val SemicolonClassElement: SemicolonClassElement

        @JsIntValue(241)
        val Block: Block

        @JsIntValue(242)
        val EmptyStatement: EmptyStatement

        @JsIntValue(243)
        val VariableStatement: VariableStatement

        @JsIntValue(244)
        val ExpressionStatement: ExpressionStatement

        @JsIntValue(245)
        val IfStatement: IfStatement

        @JsIntValue(246)
        val DoStatement: DoStatement

        @JsIntValue(247)
        val WhileStatement: WhileStatement

        @JsIntValue(248)
        val ForStatement: ForStatement

        @JsIntValue(249)
        val ForInStatement: ForInStatement

        @JsIntValue(250)
        val ForOfStatement: ForOfStatement

        @JsIntValue(251)
        val ContinueStatement: ContinueStatement

        @JsIntValue(252)
        val BreakStatement: BreakStatement

        @JsIntValue(253)
        val ReturnStatement: ReturnStatement

        @JsIntValue(254)
        val WithStatement: WithStatement

        @JsIntValue(255)
        val SwitchStatement: SwitchStatement

        @JsIntValue(256)
        val LabeledStatement: LabeledStatement

        @JsIntValue(257)
        val ThrowStatement: ThrowStatement

        @JsIntValue(258)
        val TryStatement: TryStatement

        @JsIntValue(259)
        val DebuggerStatement: DebuggerStatement

        @JsIntValue(260)
        val VariableDeclaration: VariableDeclaration

        @JsIntValue(261)
        val VariableDeclarationList: VariableDeclarationList

        @JsIntValue(262)
        val FunctionDeclaration: FunctionDeclaration

        @JsIntValue(263)
        val ClassDeclaration: ClassDeclaration

        @JsIntValue(264)
        val InterfaceDeclaration: InterfaceDeclaration

        @JsIntValue(265)
        val TypeAliasDeclaration: TypeAliasDeclaration

        @JsIntValue(266)
        val EnumDeclaration: EnumDeclaration

        @JsIntValue(267)
        val ModuleDeclaration: ModuleDeclaration

        @JsIntValue(268)
        val ModuleBlock: ModuleBlock

        @JsIntValue(269)
        val CaseBlock: CaseBlock

        @JsIntValue(270)
        val NamespaceExportDeclaration: NamespaceExportDeclaration

        @JsIntValue(271)
        val ImportEqualsDeclaration: ImportEqualsDeclaration

        @JsIntValue(272)
        val ImportDeclaration: ImportDeclaration

        @JsIntValue(273)
        val ImportClause: ImportClause

        @JsIntValue(274)
        val NamespaceImport: NamespaceImport

        @JsIntValue(275)
        val NamedImports: NamedImports

        @JsIntValue(276)
        val ImportSpecifier: ImportSpecifier

        @JsIntValue(277)
        val ExportAssignment: ExportAssignment

        @JsIntValue(278)
        val ExportDeclaration: ExportDeclaration

        @JsIntValue(279)
        val NamedExports: NamedExports

        @JsIntValue(280)
        val NamespaceExport: NamespaceExport

        @JsIntValue(281)
        val ExportSpecifier: ExportSpecifier

        @JsIntValue(282)
        val MissingDeclaration: MissingDeclaration

        @JsIntValue(283)
        val ExternalModuleReference: ExternalModuleReference

        @JsIntValue(284)
        val JsxElement: JsxElement

        @JsIntValue(285)
        val JsxSelfClosingElement: JsxSelfClosingElement

        @JsIntValue(286)
        val JsxOpeningElement: JsxOpeningElement

        @JsIntValue(287)
        val JsxClosingElement: JsxClosingElement

        @JsIntValue(288)
        val JsxFragment: JsxFragment

        @JsIntValue(289)
        val JsxOpeningFragment: JsxOpeningFragment

        @JsIntValue(290)
        val JsxClosingFragment: JsxClosingFragment

        @JsIntValue(291)
        val JsxAttribute: JsxAttribute

        @JsIntValue(292)
        val JsxAttributes: JsxAttributes

        @JsIntValue(293)
        val JsxSpreadAttribute: JsxSpreadAttribute

        @JsIntValue(294)
        val JsxExpression: JsxExpression

        @JsIntValue(295)
        val JsxNamespacedName: JsxNamespacedName

        @JsIntValue(296)
        val CaseClause: CaseClause

        @JsIntValue(297)
        val DefaultClause: DefaultClause

        @JsIntValue(298)
        val HeritageClause: HeritageClause

        @JsIntValue(299)
        val CatchClause: CatchClause

        @JsIntValue(300)
        val ImportAttributes: ImportAttributes

        @JsIntValue(301)
        val ImportAttribute: ImportAttribute

        @JsIntValue(303)
        val PropertyAssignment: PropertyAssignment

        @JsIntValue(304)
        val ShorthandPropertyAssignment: ShorthandPropertyAssignment

        @JsIntValue(305)
        val SpreadAssignment: SpreadAssignment

        @JsIntValue(306)
        val EnumMember: EnumMember

        @JsIntValue(312)
        val SourceFile: SourceFile

        @JsIntValue(313)
        val Bundle: Bundle

        @JsIntValue(316)
        val JSDocTypeExpression: JSDocTypeExpression

        @JsIntValue(317)
        val JSDocNameReference: JSDocNameReference

        @JsIntValue(318)
        val JSDocMemberName: JSDocMemberName

        @JsIntValue(319)
        val JSDocAllType: JSDocAllType

        @JsIntValue(320)
        val JSDocUnknownType: JSDocUnknownType

        @JsIntValue(321)
        val JSDocNullableType: JSDocNullableType

        @JsIntValue(322)
        val JSDocNonNullableType: JSDocNonNullableType

        @JsIntValue(323)
        val JSDocOptionalType: JSDocOptionalType

        @JsIntValue(324)
        val JSDocFunctionType: JSDocFunctionType

        @JsIntValue(325)
        val JSDocVariadicType: JSDocVariadicType

        @JsIntValue(326)
        val JSDocNamepathType: JSDocNamepathType

        @JsIntValue(327)
        val JSDoc: JSDoc

        @JsIntValue(328)
        val JSDocText: JSDocText

        @JsIntValue(329)
        val JSDocTypeLiteral: JSDocTypeLiteral

        @JsIntValue(330)
        val JSDocSignature: JSDocSignature

        @JsIntValue(331)
        val JSDocLink: JSDocLink

        @JsIntValue(332)
        val JSDocLinkCode: JSDocLinkCode

        @JsIntValue(333)
        val JSDocLinkPlain: JSDocLinkPlain

        @JsIntValue(334)
        val JSDocTag: JSDocTag

        @JsIntValue(335)
        val JSDocAugmentsTag: JSDocAugmentsTag

        @JsIntValue(336)
        val JSDocImplementsTag: JSDocImplementsTag

        @JsIntValue(337)
        val JSDocAuthorTag: JSDocAuthorTag

        @JsIntValue(338)
        val JSDocDeprecatedTag: JSDocDeprecatedTag

        @JsIntValue(339)
        val JSDocClassTag: JSDocClassTag

        @JsIntValue(340)
        val JSDocPublicTag: JSDocPublicTag

        @JsIntValue(341)
        val JSDocPrivateTag: JSDocPrivateTag

        @JsIntValue(342)
        val JSDocProtectedTag: JSDocProtectedTag

        @JsIntValue(343)
        val JSDocReadonlyTag: JSDocReadonlyTag

        @JsIntValue(344)
        val JSDocOverrideTag: JSDocOverrideTag

        @JsIntValue(345)
        val JSDocCallbackTag: JSDocCallbackTag

        @JsIntValue(346)
        val JSDocOverloadTag: JSDocOverloadTag

        @JsIntValue(347)
        val JSDocEnumTag: JSDocEnumTag

        @JsIntValue(348)
        val JSDocParameterTag: JSDocParameterTag

        @JsIntValue(349)
        val JSDocReturnTag: JSDocReturnTag

        @JsIntValue(350)
        val JSDocThisTag: JSDocThisTag

        @JsIntValue(351)
        val JSDocTypeTag: JSDocTypeTag

        @JsIntValue(352)
        val JSDocTemplateTag: JSDocTemplateTag

        @JsIntValue(353)
        val JSDocTypedefTag: JSDocTypedefTag

        @JsIntValue(354)
        val JSDocSeeTag: JSDocSeeTag

        @JsIntValue(355)
        val JSDocPropertyTag: JSDocPropertyTag

        @JsIntValue(356)
        val JSDocThrowsTag: JSDocThrowsTag

        @JsIntValue(357)
        val JSDocSatisfiesTag: JSDocSatisfiesTag

        @JsIntValue(358)
        val SyntaxList: SyntaxList

        @JsIntValue(359)
        val NotEmittedStatement: NotEmittedStatement

        @JsIntValue(360)
        val PartiallyEmittedExpression: PartiallyEmittedExpression

        @JsIntValue(361)
        val CommaListExpression: CommaListExpression

        @JsIntValue(362)
        val SyntheticReferenceExpression: SyntheticReferenceExpression

        @JsIntValue(363)
        val Count: Count

        @JsIntValue(64)
        val FirstAssignment: FirstAssignment

        @JsIntValue(79)
        val LastAssignment: LastAssignment

        @JsIntValue(65)
        val FirstCompoundAssignment: FirstCompoundAssignment

        @JsIntValue(79)
        val LastCompoundAssignment: LastCompoundAssignment

        @JsIntValue(83)
        val FirstReservedWord: FirstReservedWord

        @JsIntValue(118)
        val LastReservedWord: LastReservedWord

        @JsIntValue(83)
        val FirstKeyword: FirstKeyword

        @JsIntValue(165)
        val LastKeyword: LastKeyword

        @JsIntValue(119)
        val FirstFutureReservedWord: FirstFutureReservedWord

        @JsIntValue(127)
        val LastFutureReservedWord: LastFutureReservedWord

        @JsIntValue(182)
        val FirstTypeNode: FirstTypeNode

        @JsIntValue(205)
        val LastTypeNode: LastTypeNode

        @JsIntValue(19)
        val FirstPunctuation: FirstPunctuation

        @JsIntValue(79)
        val LastPunctuation: LastPunctuation

        @JsIntValue(0)
        val FirstToken: FirstToken

        @JsIntValue(165)
        val LastToken: LastToken

        @JsIntValue(2)
        val FirstTriviaToken: FirstTriviaToken

        @JsIntValue(7)
        val LastTriviaToken: LastTriviaToken

        @JsIntValue(9)
        val FirstLiteralToken: FirstLiteralToken

        @JsIntValue(15)
        val LastLiteralToken: LastLiteralToken

        @JsIntValue(15)
        val FirstTemplateToken: FirstTemplateToken

        @JsIntValue(18)
        val LastTemplateToken: LastTemplateToken

        @JsIntValue(30)
        val FirstBinaryOperator: FirstBinaryOperator

        @JsIntValue(79)
        val LastBinaryOperator: LastBinaryOperator

        @JsIntValue(243)
        val FirstStatement: FirstStatement

        @JsIntValue(259)
        val LastStatement: LastStatement

        @JsIntValue(166)
        val FirstNode: FirstNode

        @JsIntValue(316)
        val FirstJSDocNode: FirstJSDocNode

        @JsIntValue(357)
        val LastJSDocNode: LastJSDocNode

        @JsIntValue(334)
        val FirstJSDocTagNode: FirstJSDocTagNode

        @JsIntValue(357)
        val LastJSDocTagNode: LastJSDocTagNode
    }

    sealed interface Unknown : SyntaxKind, Union.SyntaxKind_Unknown
    sealed interface EndOfFileToken : SyntaxKind, Union.SyntaxKind_EndOfFileToken
    sealed interface SingleLineCommentTrivia : SyntaxKind, Union.SyntaxKind_SingleLineCommentTrivia
    sealed interface MultiLineCommentTrivia : SyntaxKind, Union.SyntaxKind_MultiLineCommentTrivia
    sealed interface NewLineTrivia : SyntaxKind, Union.SyntaxKind_NewLineTrivia
    sealed interface WhitespaceTrivia : SyntaxKind, Union.SyntaxKind_WhitespaceTrivia
    sealed interface ShebangTrivia : SyntaxKind, Union.SyntaxKind_ShebangTrivia
    sealed interface ConflictMarkerTrivia : SyntaxKind, Union.SyntaxKind_ConflictMarkerTrivia
    sealed interface NonTextFileMarkerTrivia : SyntaxKind
    sealed interface NumericLiteral : SyntaxKind, Union.SyntaxKind_NumericLiteral
    sealed interface BigIntLiteral : SyntaxKind, Union.SyntaxKind_BigIntLiteral
    sealed interface StringLiteral : SyntaxKind, Union.SyntaxKind_StringLiteral
    sealed interface JsxText : SyntaxKind, Union.SyntaxKind_JsxText
    sealed interface JsxTextAllWhiteSpaces : SyntaxKind, Union.SyntaxKind_JsxTextAllWhiteSpaces
    sealed interface RegularExpressionLiteral : SyntaxKind, Union.SyntaxKind_RegularExpressionLiteral
    sealed interface NoSubstitutionTemplateLiteral : SyntaxKind, Union.SyntaxKind_NoSubstitutionTemplateLiteral
    sealed interface TemplateHead : SyntaxKind, Union.SyntaxKind_TemplateHead
    sealed interface TemplateMiddle : SyntaxKind, Union.SyntaxKind_TemplateMiddle
    sealed interface TemplateTail : SyntaxKind, Union.SyntaxKind_TemplateTail
    sealed interface OpenBraceToken : SyntaxKind, Union.SyntaxKind_OpenBraceToken
    sealed interface CloseBraceToken : SyntaxKind, Union.SyntaxKind_CloseBraceToken
    sealed interface OpenParenToken : SyntaxKind, Union.SyntaxKind_OpenParenToken
    sealed interface CloseParenToken : SyntaxKind, Union.SyntaxKind_CloseParenToken
    sealed interface OpenBracketToken : SyntaxKind, Union.SyntaxKind_OpenBracketToken
    sealed interface CloseBracketToken : SyntaxKind, Union.SyntaxKind_CloseBracketToken
    sealed interface DotToken : SyntaxKind, Union.SyntaxKind_DotToken
    sealed interface DotDotDotToken : SyntaxKind, Union.SyntaxKind_DotDotDotToken
    sealed interface SemicolonToken : SyntaxKind, Union.SyntaxKind_SemicolonToken
    sealed interface CommaToken : SyntaxKind, Union.SyntaxKind_CommaToken
    sealed interface QuestionDotToken : SyntaxKind, Union.SyntaxKind_QuestionDotToken
    sealed interface LessThanToken : SyntaxKind, Union.SyntaxKind_LessThanToken
    sealed interface LessThanSlashToken : SyntaxKind, Union.SyntaxKind_LessThanSlashToken
    sealed interface GreaterThanToken : SyntaxKind, Union.SyntaxKind_GreaterThanToken
    sealed interface LessThanEqualsToken : SyntaxKind, Union.SyntaxKind_LessThanEqualsToken
    sealed interface GreaterThanEqualsToken : SyntaxKind, Union.SyntaxKind_GreaterThanEqualsToken
    sealed interface EqualsEqualsToken : SyntaxKind, Union.SyntaxKind_EqualsEqualsToken
    sealed interface ExclamationEqualsToken : SyntaxKind, Union.SyntaxKind_ExclamationEqualsToken
    sealed interface EqualsEqualsEqualsToken : SyntaxKind, Union.SyntaxKind_EqualsEqualsEqualsToken
    sealed interface ExclamationEqualsEqualsToken : SyntaxKind, Union.SyntaxKind_ExclamationEqualsEqualsToken
    sealed interface EqualsGreaterThanToken : SyntaxKind, Union.SyntaxKind_EqualsGreaterThanToken
    sealed interface PlusToken : SyntaxKind, Union.SyntaxKind_PlusToken
    sealed interface MinusToken : SyntaxKind, Union.SyntaxKind_MinusToken
    sealed interface AsteriskToken : SyntaxKind, Union.SyntaxKind_AsteriskToken
    sealed interface AsteriskAsteriskToken : SyntaxKind, Union.SyntaxKind_AsteriskAsteriskToken
    sealed interface SlashToken : SyntaxKind, Union.SyntaxKind_SlashToken
    sealed interface PercentToken : SyntaxKind, Union.SyntaxKind_PercentToken
    sealed interface PlusPlusToken : SyntaxKind, Union.SyntaxKind_PlusPlusToken
    sealed interface MinusMinusToken : SyntaxKind, Union.SyntaxKind_MinusMinusToken
    sealed interface LessThanLessThanToken : SyntaxKind, Union.SyntaxKind_LessThanLessThanToken
    sealed interface GreaterThanGreaterThanToken : SyntaxKind, Union.SyntaxKind_GreaterThanGreaterThanToken
    sealed interface GreaterThanGreaterThanGreaterThanToken : SyntaxKind,
        Union.SyntaxKind_GreaterThanGreaterThanGreaterThanToken

    sealed interface AmpersandToken : SyntaxKind, Union.SyntaxKind_AmpersandToken
    sealed interface BarToken : SyntaxKind, Union.SyntaxKind_BarToken
    sealed interface CaretToken : SyntaxKind, Union.SyntaxKind_CaretToken
    sealed interface ExclamationToken : SyntaxKind, Union.SyntaxKind_ExclamationToken
    sealed interface TildeToken : SyntaxKind, Union.SyntaxKind_TildeToken
    sealed interface AmpersandAmpersandToken : SyntaxKind, Union.SyntaxKind_AmpersandAmpersandToken
    sealed interface BarBarToken : SyntaxKind, Union.SyntaxKind_BarBarToken
    sealed interface QuestionToken : SyntaxKind, Union.SyntaxKind_QuestionToken
    sealed interface ColonToken : SyntaxKind, Union.SyntaxKind_ColonToken
    sealed interface AtToken : SyntaxKind, Union.SyntaxKind_AtToken
    sealed interface QuestionQuestionToken : SyntaxKind, Union.SyntaxKind_QuestionQuestionToken
    sealed interface BacktickToken : SyntaxKind, Union.SyntaxKind_BacktickToken
    sealed interface HashToken : SyntaxKind, Union.SyntaxKind_HashToken
    sealed interface EqualsToken : SyntaxKind, Union.SyntaxKind_EqualsToken
    sealed interface PlusEqualsToken : SyntaxKind, Union.SyntaxKind_PlusEqualsToken
    sealed interface MinusEqualsToken : SyntaxKind, Union.SyntaxKind_MinusEqualsToken
    sealed interface AsteriskEqualsToken : SyntaxKind, Union.SyntaxKind_AsteriskEqualsToken
    sealed interface AsteriskAsteriskEqualsToken : SyntaxKind, Union.SyntaxKind_AsteriskAsteriskEqualsToken
    sealed interface SlashEqualsToken : SyntaxKind, Union.SyntaxKind_SlashEqualsToken
    sealed interface PercentEqualsToken : SyntaxKind, Union.SyntaxKind_PercentEqualsToken
    sealed interface LessThanLessThanEqualsToken : SyntaxKind, Union.SyntaxKind_LessThanLessThanEqualsToken
    sealed interface GreaterThanGreaterThanEqualsToken : SyntaxKind, Union.SyntaxKind_GreaterThanGreaterThanEqualsToken
    sealed interface GreaterThanGreaterThanGreaterThanEqualsToken : SyntaxKind,
        Union.SyntaxKind_GreaterThanGreaterThanGreaterThanEqualsToken

    sealed interface AmpersandEqualsToken : SyntaxKind, Union.SyntaxKind_AmpersandEqualsToken
    sealed interface BarEqualsToken : SyntaxKind, Union.SyntaxKind_BarEqualsToken
    sealed interface BarBarEqualsToken : SyntaxKind, Union.SyntaxKind_BarBarEqualsToken
    sealed interface AmpersandAmpersandEqualsToken : SyntaxKind, Union.SyntaxKind_AmpersandAmpersandEqualsToken
    sealed interface QuestionQuestionEqualsToken : SyntaxKind, Union.SyntaxKind_QuestionQuestionEqualsToken
    sealed interface CaretEqualsToken : SyntaxKind, Union.SyntaxKind_CaretEqualsToken
    sealed interface Identifier : SyntaxKind, Union.SyntaxKind_Identifier
    sealed interface PrivateIdentifier : SyntaxKind
    sealed interface BreakKeyword : SyntaxKind, Union.SyntaxKind_BreakKeyword
    sealed interface CaseKeyword : SyntaxKind, Union.SyntaxKind_CaseKeyword
    sealed interface CatchKeyword : SyntaxKind, Union.SyntaxKind_CatchKeyword
    sealed interface ClassKeyword : SyntaxKind, Union.SyntaxKind_ClassKeyword
    sealed interface ConstKeyword : SyntaxKind, Union.SyntaxKind_ConstKeyword
    sealed interface ContinueKeyword : SyntaxKind, Union.SyntaxKind_ContinueKeyword
    sealed interface DebuggerKeyword : SyntaxKind, Union.SyntaxKind_DebuggerKeyword
    sealed interface DefaultKeyword : SyntaxKind, Union.SyntaxKind_DefaultKeyword
    sealed interface DeleteKeyword : SyntaxKind, Union.SyntaxKind_DeleteKeyword
    sealed interface DoKeyword : SyntaxKind, Union.SyntaxKind_DoKeyword
    sealed interface ElseKeyword : SyntaxKind, Union.SyntaxKind_ElseKeyword
    sealed interface EnumKeyword : SyntaxKind, Union.SyntaxKind_EnumKeyword
    sealed interface ExportKeyword : SyntaxKind, Union.SyntaxKind_ExportKeyword
    sealed interface ExtendsKeyword : SyntaxKind, Union.SyntaxKind_ExtendsKeyword
    sealed interface FalseKeyword : SyntaxKind, Union.SyntaxKind_FalseKeyword
    sealed interface FinallyKeyword : SyntaxKind, Union.SyntaxKind_FinallyKeyword
    sealed interface ForKeyword : SyntaxKind, Union.SyntaxKind_ForKeyword
    sealed interface FunctionKeyword : SyntaxKind, Union.SyntaxKind_FunctionKeyword
    sealed interface IfKeyword : SyntaxKind, Union.SyntaxKind_IfKeyword
    sealed interface ImportKeyword : SyntaxKind, Union.SyntaxKind_ImportKeyword
    sealed interface InKeyword : SyntaxKind, Union.SyntaxKind_InKeyword
    sealed interface InstanceOfKeyword : SyntaxKind, Union.SyntaxKind_InstanceOfKeyword
    sealed interface NewKeyword : SyntaxKind, Union.SyntaxKind_NewKeyword
    sealed interface NullKeyword : SyntaxKind, Union.SyntaxKind_NullKeyword
    sealed interface ReturnKeyword : SyntaxKind, Union.SyntaxKind_ReturnKeyword
    sealed interface SuperKeyword : SyntaxKind, Union.SyntaxKind_SuperKeyword
    sealed interface SwitchKeyword : SyntaxKind, Union.SyntaxKind_SwitchKeyword
    sealed interface ThisKeyword : SyntaxKind, Union.SyntaxKind_ThisKeyword
    sealed interface ThrowKeyword : SyntaxKind, Union.SyntaxKind_ThrowKeyword
    sealed interface TrueKeyword : SyntaxKind, Union.SyntaxKind_TrueKeyword
    sealed interface TryKeyword : SyntaxKind, Union.SyntaxKind_TryKeyword
    sealed interface TypeOfKeyword : SyntaxKind, Union.SyntaxKind_TypeOfKeyword
    sealed interface VarKeyword : SyntaxKind, Union.SyntaxKind_VarKeyword
    sealed interface VoidKeyword : SyntaxKind, Union.SyntaxKind_VoidKeyword
    sealed interface WhileKeyword : SyntaxKind, Union.SyntaxKind_WhileKeyword
    sealed interface WithKeyword : SyntaxKind, Union.SyntaxKind_WithKeyword
    sealed interface ImplementsKeyword : SyntaxKind, Union.SyntaxKind_ImplementsKeyword
    sealed interface InterfaceKeyword : SyntaxKind, Union.SyntaxKind_InterfaceKeyword
    sealed interface LetKeyword : SyntaxKind, Union.SyntaxKind_LetKeyword
    sealed interface PackageKeyword : SyntaxKind, Union.SyntaxKind_PackageKeyword
    sealed interface PrivateKeyword : SyntaxKind, Union.SyntaxKind_PrivateKeyword
    sealed interface ProtectedKeyword : SyntaxKind, Union.SyntaxKind_ProtectedKeyword
    sealed interface PublicKeyword : SyntaxKind, Union.SyntaxKind_PublicKeyword
    sealed interface StaticKeyword : SyntaxKind, Union.SyntaxKind_StaticKeyword
    sealed interface YieldKeyword : SyntaxKind, Union.SyntaxKind_YieldKeyword
    sealed interface AbstractKeyword : SyntaxKind, Union.SyntaxKind_AbstractKeyword
    sealed interface AccessorKeyword : SyntaxKind, Union.SyntaxKind_AccessorKeyword
    sealed interface AsKeyword : SyntaxKind, Union.SyntaxKind_AsKeyword
    sealed interface AssertsKeyword : SyntaxKind, Union.SyntaxKind_AssertsKeyword
    sealed interface AssertKeyword : SyntaxKind, Union.SyntaxKind_AssertKeyword
    sealed interface AnyKeyword : SyntaxKind, Union.SyntaxKind_AnyKeyword
    sealed interface AsyncKeyword : SyntaxKind, Union.SyntaxKind_AsyncKeyword
    sealed interface AwaitKeyword : SyntaxKind, Union.SyntaxKind_AwaitKeyword
    sealed interface BooleanKeyword : SyntaxKind, Union.SyntaxKind_BooleanKeyword
    sealed interface ConstructorKeyword : SyntaxKind, Union.SyntaxKind_ConstructorKeyword
    sealed interface DeclareKeyword : SyntaxKind, Union.SyntaxKind_DeclareKeyword
    sealed interface GetKeyword : SyntaxKind, Union.SyntaxKind_GetKeyword
    sealed interface InferKeyword : SyntaxKind, Union.SyntaxKind_InferKeyword
    sealed interface IntrinsicKeyword : SyntaxKind, Union.SyntaxKind_IntrinsicKeyword
    sealed interface IsKeyword : SyntaxKind, Union.SyntaxKind_IsKeyword
    sealed interface KeyOfKeyword : SyntaxKind, Union.SyntaxKind_KeyOfKeyword
    sealed interface ModuleKeyword : SyntaxKind, Union.SyntaxKind_ModuleKeyword
    sealed interface NamespaceKeyword : SyntaxKind, Union.SyntaxKind_NamespaceKeyword
    sealed interface NeverKeyword : SyntaxKind, Union.SyntaxKind_NeverKeyword
    sealed interface OutKeyword : SyntaxKind, Union.SyntaxKind_OutKeyword
    sealed interface ReadonlyKeyword : SyntaxKind, Union.SyntaxKind_ReadonlyKeyword
    sealed interface RequireKeyword : SyntaxKind, Union.SyntaxKind_RequireKeyword
    sealed interface NumberKeyword : SyntaxKind, Union.SyntaxKind_NumberKeyword
    sealed interface ObjectKeyword : SyntaxKind, Union.SyntaxKind_ObjectKeyword
    sealed interface SatisfiesKeyword : SyntaxKind, Union.SyntaxKind_SatisfiesKeyword
    sealed interface SetKeyword : SyntaxKind, Union.SyntaxKind_SetKeyword
    sealed interface StringKeyword : SyntaxKind, Union.SyntaxKind_StringKeyword
    sealed interface SymbolKeyword : SyntaxKind, Union.SyntaxKind_SymbolKeyword
    sealed interface TypeKeyword : SyntaxKind, Union.SyntaxKind_TypeKeyword
    sealed interface UndefinedKeyword : SyntaxKind, Union.SyntaxKind_UndefinedKeyword
    sealed interface UniqueKeyword : SyntaxKind, Union.SyntaxKind_UniqueKeyword
    sealed interface UnknownKeyword : SyntaxKind, Union.SyntaxKind_UnknownKeyword
    sealed interface UsingKeyword : SyntaxKind, Union.SyntaxKind_UsingKeyword
    sealed interface FromKeyword : SyntaxKind, Union.SyntaxKind_FromKeyword
    sealed interface GlobalKeyword : SyntaxKind, Union.SyntaxKind_GlobalKeyword
    sealed interface BigIntKeyword : SyntaxKind, Union.SyntaxKind_BigIntKeyword
    sealed interface OverrideKeyword : SyntaxKind, Union.SyntaxKind_OverrideKeyword
    sealed interface OfKeyword : SyntaxKind, Union.SyntaxKind_OfKeyword
    sealed interface QualifiedName : SyntaxKind
    sealed interface ComputedPropertyName : SyntaxKind
    sealed interface TypeParameter : SyntaxKind
    sealed interface Parameter : SyntaxKind
    sealed interface Decorator : SyntaxKind
    sealed interface PropertySignature : SyntaxKind
    sealed interface PropertyDeclaration : SyntaxKind
    sealed interface MethodSignature : SyntaxKind
    sealed interface MethodDeclaration : SyntaxKind
    sealed interface ClassStaticBlockDeclaration : SyntaxKind
    sealed interface Constructor : SyntaxKind
    sealed interface GetAccessor : SyntaxKind
    sealed interface SetAccessor : SyntaxKind
    sealed interface CallSignature : SyntaxKind
    sealed interface ConstructSignature : SyntaxKind
    sealed interface IndexSignature : SyntaxKind
    sealed interface TypePredicate : SyntaxKind
    sealed interface TypeReference : SyntaxKind
    sealed interface FunctionType : SyntaxKind, Union.SyntaxKind_FunctionType
    sealed interface ConstructorType : SyntaxKind, Union.SyntaxKind_ConstructorType
    sealed interface TypeQuery : SyntaxKind
    sealed interface TypeLiteral : SyntaxKind
    sealed interface ArrayType : SyntaxKind
    sealed interface TupleType : SyntaxKind
    sealed interface OptionalType : SyntaxKind
    sealed interface RestType : SyntaxKind
    sealed interface UnionType : SyntaxKind
    sealed interface IntersectionType : SyntaxKind
    sealed interface ConditionalType : SyntaxKind
    sealed interface InferType : SyntaxKind
    sealed interface ParenthesizedType : SyntaxKind
    sealed interface ThisType : SyntaxKind
    sealed interface TypeOperator : SyntaxKind
    sealed interface IndexedAccessType : SyntaxKind
    sealed interface MappedType : SyntaxKind
    sealed interface LiteralType : SyntaxKind
    sealed interface NamedTupleMember : SyntaxKind
    sealed interface TemplateLiteralType : SyntaxKind
    sealed interface TemplateLiteralTypeSpan : SyntaxKind
    sealed interface ImportType : SyntaxKind
    sealed interface ObjectBindingPattern : SyntaxKind
    sealed interface ArrayBindingPattern : SyntaxKind
    sealed interface BindingElement : SyntaxKind
    sealed interface ArrayLiteralExpression : SyntaxKind
    sealed interface ObjectLiteralExpression : SyntaxKind
    sealed interface PropertyAccessExpression : SyntaxKind
    sealed interface ElementAccessExpression : SyntaxKind
    sealed interface CallExpression : SyntaxKind
    sealed interface NewExpression : SyntaxKind
    sealed interface TaggedTemplateExpression : SyntaxKind
    sealed interface TypeAssertionExpression : SyntaxKind
    sealed interface ParenthesizedExpression : SyntaxKind
    sealed interface FunctionExpression : SyntaxKind
    sealed interface ArrowFunction : SyntaxKind
    sealed interface DeleteExpression : SyntaxKind
    sealed interface TypeOfExpression : SyntaxKind
    sealed interface VoidExpression : SyntaxKind
    sealed interface AwaitExpression : SyntaxKind
    sealed interface PrefixUnaryExpression : SyntaxKind
    sealed interface PostfixUnaryExpression : SyntaxKind
    sealed interface BinaryExpression : SyntaxKind
    sealed interface ConditionalExpression : SyntaxKind
    sealed interface TemplateExpression : SyntaxKind
    sealed interface YieldExpression : SyntaxKind
    sealed interface SpreadElement : SyntaxKind
    sealed interface ClassExpression : SyntaxKind, Union.SyntaxKind_ClassExpression
    sealed interface OmittedExpression : SyntaxKind
    sealed interface ExpressionWithTypeArguments : SyntaxKind
    sealed interface AsExpression : SyntaxKind
    sealed interface NonNullExpression : SyntaxKind
    sealed interface MetaProperty : SyntaxKind
    sealed interface SyntheticExpression : SyntaxKind
    sealed interface SatisfiesExpression : SyntaxKind
    sealed interface TemplateSpan : SyntaxKind
    sealed interface SemicolonClassElement : SyntaxKind
    sealed interface Block : SyntaxKind
    sealed interface EmptyStatement : SyntaxKind
    sealed interface VariableStatement : SyntaxKind
    sealed interface ExpressionStatement : SyntaxKind
    sealed interface IfStatement : SyntaxKind
    sealed interface DoStatement : SyntaxKind
    sealed interface WhileStatement : SyntaxKind
    sealed interface ForStatement : SyntaxKind
    sealed interface ForInStatement : SyntaxKind
    sealed interface ForOfStatement : SyntaxKind
    sealed interface ContinueStatement : SyntaxKind
    sealed interface BreakStatement : SyntaxKind
    sealed interface ReturnStatement : SyntaxKind
    sealed interface WithStatement : SyntaxKind
    sealed interface SwitchStatement : SyntaxKind
    sealed interface LabeledStatement : SyntaxKind
    sealed interface ThrowStatement : SyntaxKind
    sealed interface TryStatement : SyntaxKind
    sealed interface DebuggerStatement : SyntaxKind
    sealed interface VariableDeclaration : SyntaxKind
    sealed interface VariableDeclarationList : SyntaxKind
    sealed interface FunctionDeclaration : SyntaxKind
    sealed interface ClassDeclaration : SyntaxKind, Union.SyntaxKind_ClassDeclaration
    sealed interface InterfaceDeclaration : SyntaxKind
    sealed interface TypeAliasDeclaration : SyntaxKind
    sealed interface EnumDeclaration : SyntaxKind
    sealed interface ModuleDeclaration : SyntaxKind
    sealed interface ModuleBlock : SyntaxKind
    sealed interface CaseBlock : SyntaxKind
    sealed interface NamespaceExportDeclaration : SyntaxKind
    sealed interface ImportEqualsDeclaration : SyntaxKind
    sealed interface ImportDeclaration : SyntaxKind
    sealed interface ImportClause : SyntaxKind
    sealed interface NamespaceImport : SyntaxKind
    sealed interface NamedImports : SyntaxKind
    sealed interface ImportSpecifier : SyntaxKind
    sealed interface ExportAssignment : SyntaxKind
    sealed interface ExportDeclaration : SyntaxKind
    sealed interface NamedExports : SyntaxKind
    sealed interface NamespaceExport : SyntaxKind
    sealed interface ExportSpecifier : SyntaxKind
    sealed interface MissingDeclaration : SyntaxKind
    sealed interface ExternalModuleReference : SyntaxKind
    sealed interface JsxElement : SyntaxKind
    sealed interface JsxSelfClosingElement : SyntaxKind
    sealed interface JsxOpeningElement : SyntaxKind
    sealed interface JsxClosingElement : SyntaxKind
    sealed interface JsxFragment : SyntaxKind
    sealed interface JsxOpeningFragment : SyntaxKind
    sealed interface JsxClosingFragment : SyntaxKind
    sealed interface JsxAttribute : SyntaxKind
    sealed interface JsxAttributes : SyntaxKind
    sealed interface JsxSpreadAttribute : SyntaxKind
    sealed interface JsxExpression : SyntaxKind
    sealed interface JsxNamespacedName : SyntaxKind
    sealed interface CaseClause : SyntaxKind
    sealed interface DefaultClause : SyntaxKind
    sealed interface HeritageClause : SyntaxKind
    sealed interface CatchClause : SyntaxKind
    sealed interface ImportAttributes : SyntaxKind
    sealed interface ImportAttribute : SyntaxKind
    sealed interface PropertyAssignment : SyntaxKind
    sealed interface ShorthandPropertyAssignment : SyntaxKind
    sealed interface SpreadAssignment : SyntaxKind
    sealed interface EnumMember : SyntaxKind
    sealed interface SourceFile : SyntaxKind
    sealed interface Bundle : SyntaxKind
    sealed interface JSDocTypeExpression : SyntaxKind
    sealed interface JSDocNameReference : SyntaxKind
    sealed interface JSDocMemberName : SyntaxKind
    sealed interface JSDocAllType : SyntaxKind
    sealed interface JSDocUnknownType : SyntaxKind
    sealed interface JSDocNullableType : SyntaxKind
    sealed interface JSDocNonNullableType : SyntaxKind
    sealed interface JSDocOptionalType : SyntaxKind
    sealed interface JSDocFunctionType : SyntaxKind
    sealed interface JSDocVariadicType : SyntaxKind
    sealed interface JSDocNamepathType : SyntaxKind
    sealed interface JSDoc : SyntaxKind
    sealed interface JSDocText : SyntaxKind
    sealed interface JSDocTypeLiteral : SyntaxKind
    sealed interface JSDocSignature : SyntaxKind
    sealed interface JSDocLink : SyntaxKind
    sealed interface JSDocLinkCode : SyntaxKind
    sealed interface JSDocLinkPlain : SyntaxKind
    sealed interface JSDocTag : SyntaxKind
    sealed interface JSDocAugmentsTag : SyntaxKind
    sealed interface JSDocImplementsTag : SyntaxKind
    sealed interface JSDocAuthorTag : SyntaxKind
    sealed interface JSDocDeprecatedTag : SyntaxKind
    sealed interface JSDocClassTag : SyntaxKind
    sealed interface JSDocPublicTag : SyntaxKind
    sealed interface JSDocPrivateTag : SyntaxKind
    sealed interface JSDocProtectedTag : SyntaxKind
    sealed interface JSDocReadonlyTag : SyntaxKind
    sealed interface JSDocOverrideTag : SyntaxKind
    sealed interface JSDocCallbackTag : SyntaxKind
    sealed interface JSDocOverloadTag : SyntaxKind
    sealed interface JSDocEnumTag : SyntaxKind
    sealed interface JSDocParameterTag : SyntaxKind
    sealed interface JSDocReturnTag : SyntaxKind
    sealed interface JSDocThisTag : SyntaxKind
    sealed interface JSDocTypeTag : SyntaxKind
    sealed interface JSDocTemplateTag : SyntaxKind
    sealed interface JSDocTypedefTag : SyntaxKind
    sealed interface JSDocSeeTag : SyntaxKind
    sealed interface JSDocPropertyTag : SyntaxKind
    sealed interface JSDocThrowsTag : SyntaxKind
    sealed interface JSDocSatisfiesTag : SyntaxKind
    sealed interface SyntaxList : SyntaxKind
    sealed interface NotEmittedStatement : SyntaxKind
    sealed interface PartiallyEmittedExpression : SyntaxKind
    sealed interface CommaListExpression : SyntaxKind
    sealed interface SyntheticReferenceExpression : SyntaxKind
    sealed interface Count : SyntaxKind
    sealed interface FirstAssignment : SyntaxKind
    sealed interface LastAssignment : SyntaxKind
    sealed interface FirstCompoundAssignment : SyntaxKind
    sealed interface LastCompoundAssignment : SyntaxKind
    sealed interface FirstReservedWord : SyntaxKind
    sealed interface LastReservedWord : SyntaxKind
    sealed interface FirstKeyword : SyntaxKind
    sealed interface LastKeyword : SyntaxKind
    sealed interface FirstFutureReservedWord : SyntaxKind
    sealed interface LastFutureReservedWord : SyntaxKind
    sealed interface FirstTypeNode : SyntaxKind
    sealed interface LastTypeNode : SyntaxKind
    sealed interface FirstPunctuation : SyntaxKind
    sealed interface LastPunctuation : SyntaxKind
    sealed interface FirstToken : SyntaxKind
    sealed interface LastToken : SyntaxKind
    sealed interface FirstTriviaToken : SyntaxKind
    sealed interface LastTriviaToken : SyntaxKind
    sealed interface FirstLiteralToken : SyntaxKind
    sealed interface LastLiteralToken : SyntaxKind
    sealed interface FirstTemplateToken : SyntaxKind
    sealed interface LastTemplateToken : SyntaxKind
    sealed interface FirstBinaryOperator : SyntaxKind
    sealed interface LastBinaryOperator : SyntaxKind
    sealed interface FirstStatement : SyntaxKind
    sealed interface LastStatement : SyntaxKind
    sealed interface FirstNode : SyntaxKind
    sealed interface FirstJSDocNode : SyntaxKind
    sealed interface LastJSDocNode : SyntaxKind
    sealed interface FirstJSDocTagNode : SyntaxKind
    sealed interface LastJSDocTagNode : SyntaxKind
}
