package react.dom

import kotlinx.html.*
import kotlinx.html.attributes.*
import react.*

inline fun <T : Tag> RBuilder.tag(block: RDOMBuilder<T>.() -> Unit, noinline factory: (TagConsumer<Unit>) -> T): ReactElement =
    child(RDOMBuilder(factory).apply {
        block()
    }.create())

inline fun RBuilder.a(href: String? = null, target: String? = null, classes: String? = null, block: RDOMBuilder<A>.() -> Unit): ReactElement = tag(block) { A(attributesMapOf("href", href, "target", target, "class", classes), it) }

inline fun RBuilder.abbr(classes: String? = null, block: RDOMBuilder<ABBR>.() -> Unit): ReactElement = tag(block) { ABBR(attributesMapOf("class", classes), it) }

inline fun RBuilder.address(classes: String? = null, block: RDOMBuilder<ADDRESS>.() -> Unit): ReactElement = tag(block) { ADDRESS(attributesMapOf("class", classes), it) }

inline fun RBuilder.area(shape: AreaShape? = null, alt: String? = null, classes: String? = null, block: RDOMBuilder<AREA>.() -> Unit): ReactElement = tag(block) { AREA(attributesMapOf("Shape", shape?.enumEncode(), "alt", alt, "class", classes), it) }

inline fun RBuilder.article(classes: String? = null, block: RDOMBuilder<ARTICLE>.() -> Unit): ReactElement = tag(block) { ARTICLE(attributesMapOf("class", classes), it) }

inline fun RBuilder.aside(classes: String? = null, block: RDOMBuilder<ASIDE>.() -> Unit): ReactElement = tag(block) { ASIDE(attributesMapOf("class", classes), it) }

inline fun RBuilder.audio(classes: String? = null, block: RDOMBuilder<AUDIO>.() -> Unit): ReactElement = tag(block) { AUDIO(attributesMapOf("class", classes), it) }

inline fun RBuilder.b(classes: String? = null, block: RDOMBuilder<B>.() -> Unit): ReactElement = tag(block) { B(attributesMapOf("class", classes), it) }

inline fun RBuilder.base(classes: String? = null, block: RDOMBuilder<BASE>.() -> Unit): ReactElement = tag(block) { BASE(attributesMapOf("class", classes), it) }

inline fun RBuilder.bdi(classes: String? = null, block: RDOMBuilder<BDI>.() -> Unit): ReactElement = tag(block) { BDI(attributesMapOf("class", classes), it) }

inline fun RBuilder.bdo(classes: String? = null, block: RDOMBuilder<BDO>.() -> Unit): ReactElement = tag(block) { BDO(attributesMapOf("class", classes), it) }

inline fun RBuilder.blockQuote(classes: String? = null, block: RDOMBuilder<BLOCKQUOTE>.() -> Unit): ReactElement = tag(block) { BLOCKQUOTE(attributesMapOf("class", classes), it) }

inline fun RBuilder.body(classes: String? = null, block: RDOMBuilder<BODY>.() -> Unit): ReactElement = tag(block) { BODY(attributesMapOf("class", classes), it) }

inline fun RBuilder.br(classes: String? = null, block: RDOMBuilder<BR>.() -> Unit): ReactElement = tag(block) { BR(attributesMapOf("class", classes), it) }

inline fun RBuilder.button(formEncType: ButtonFormEncType? = null, formMethod: ButtonFormMethod? = null, type: ButtonType? = null, classes: String? = null, block: RDOMBuilder<BUTTON>.() -> Unit): ReactElement = tag(block) { BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(), "formmethod", formMethod?.enumEncode(), "type", type?.enumEncode(), "class", classes), it) }

inline fun RBuilder.canvas(classes: String? = null, content: String = ""): ReactElement = tag({ +content }) { CANVAS(attributesMapOf("class", classes), it) }
inline fun RBuilder.canvas(classes: String? = null, block: RDOMBuilder<CANVAS>.() -> Unit): ReactElement = tag(block) { CANVAS(attributesMapOf("class", classes), it) }

inline fun RBuilder.caption(classes: String? = null, block: RDOMBuilder<CAPTION>.() -> Unit): ReactElement = tag(block) { CAPTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.cite(classes: String? = null, block: RDOMBuilder<CITE>.() -> Unit): ReactElement = tag(block) { CITE(attributesMapOf("class", classes), it) }

inline fun RBuilder.code(classes: String? = null, block: RDOMBuilder<CODE>.() -> Unit): ReactElement = tag(block) { CODE(attributesMapOf("class", classes), it) }

inline fun RBuilder.col(classes: String? = null, block: RDOMBuilder<COL>.() -> Unit): ReactElement = tag(block) { COL(attributesMapOf("class", classes), it) }

inline fun RBuilder.colGroup(classes: String? = null, block: RDOMBuilder<COLGROUP>.() -> Unit): ReactElement = tag(block) { COLGROUP(attributesMapOf("class", classes), it) }

inline fun RBuilder.command(type: CommandType? = null, classes: String? = null, block: RDOMBuilder<COMMAND>.() -> Unit): ReactElement = tag(block) { COMMAND(attributesMapOf("type", type?.enumEncode(), "class", classes), it) }

inline fun RBuilder.dataList(classes: String? = null, block: RDOMBuilder<DATALIST>.() -> Unit): ReactElement = tag(block) { DATALIST(attributesMapOf("class", classes), it) }

inline fun RBuilder.dd(classes: String? = null, block: RDOMBuilder<DD>.() -> Unit): ReactElement = tag(block) { DD(attributesMapOf("class", classes), it) }

inline fun RBuilder.del(classes: String? = null, block: RDOMBuilder<DEL>.() -> Unit): ReactElement = tag(block) { DEL(attributesMapOf("class", classes), it) }

inline fun RBuilder.details(classes: String? = null, block: RDOMBuilder<DETAILS>.() -> Unit): ReactElement = tag(block) { DETAILS(attributesMapOf("class", classes), it) }

inline fun RBuilder.dfn(classes: String? = null, block: RDOMBuilder<DFN>.() -> Unit): ReactElement = tag(block) { DFN(attributesMapOf("class", classes), it) }

inline fun RBuilder.dialog(classes: String? = null, block: RDOMBuilder<DIALOG>.() -> Unit): ReactElement = tag(block) { DIALOG(attributesMapOf("class", classes), it) }

inline fun RBuilder.div(classes: String? = null, block: RDOMBuilder<DIV>.() -> Unit): ReactElement = tag(block) { DIV(attributesMapOf("class", classes), it) }

inline fun RBuilder.dl(classes: String? = null, block: RDOMBuilder<DL>.() -> Unit): ReactElement = tag(block) { DL(attributesMapOf("class", classes), it) }

inline fun RBuilder.dt(classes: String? = null, block: RDOMBuilder<DT>.() -> Unit): ReactElement = tag(block) { DT(attributesMapOf("class", classes), it) }

inline fun RBuilder.em(classes: String? = null, block: RDOMBuilder<EM>.() -> Unit): ReactElement = tag(block) { EM(attributesMapOf("class", classes), it) }

inline fun RBuilder.embed(classes: String? = null, block: RDOMBuilder<EMBED>.() -> Unit): ReactElement = tag(block) { EMBED(attributesMapOf("class", classes), it) }

inline fun RBuilder.fieldSet(classes: String? = null, block: RDOMBuilder<FIELDSET>.() -> Unit): ReactElement = tag(block) { FIELDSET(attributesMapOf("class", classes), it) }

inline fun RBuilder.figcaption(classes: String? = null, block: RDOMBuilder<FIGCAPTION>.() -> Unit): ReactElement = tag(block) { FIGCAPTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.figure(classes: String? = null, block: RDOMBuilder<FIGURE>.() -> Unit): ReactElement = tag(block) { FIGURE(attributesMapOf("class", classes), it) }

inline fun RBuilder.footer(classes: String? = null, block: RDOMBuilder<FOOTER>.() -> Unit): ReactElement = tag(block) { FOOTER(attributesMapOf("class", classes), it) }

inline fun RBuilder.form(action: String? = null, encType: FormEncType? = null, method: FormMethod? = null, classes: String? = null, block: RDOMBuilder<FORM>.() -> Unit): ReactElement = tag(block) { FORM(attributesMapOf("action", action, "enctype", encType?.enumEncode(), "method", method?.enumEncode(), "class", classes), it) }

inline fun RBuilder.h1(classes: String? = null, block: RDOMBuilder<H1>.() -> Unit): ReactElement = tag(block) { H1(attributesMapOf("class", classes), it) }

inline fun RBuilder.h2(classes: String? = null, block: RDOMBuilder<H2>.() -> Unit): ReactElement = tag(block) { H2(attributesMapOf("class", classes), it) }

inline fun RBuilder.h3(classes: String? = null, block: RDOMBuilder<H3>.() -> Unit): ReactElement = tag(block) { H3(attributesMapOf("class", classes), it) }

inline fun RBuilder.h4(classes: String? = null, block: RDOMBuilder<H4>.() -> Unit): ReactElement = tag(block) { H4(attributesMapOf("class", classes), it) }

inline fun RBuilder.h5(classes: String? = null, block: RDOMBuilder<H5>.() -> Unit): ReactElement = tag(block) { H5(attributesMapOf("class", classes), it) }

inline fun RBuilder.h6(classes: String? = null, block: RDOMBuilder<H6>.() -> Unit): ReactElement = tag(block) { H6(attributesMapOf("class", classes), it) }

inline fun RBuilder.head(block: RDOMBuilder<HEAD>.() -> Unit): ReactElement = tag(block) { HEAD(emptyMap, it) }

inline fun RBuilder.header(classes: String? = null, block: RDOMBuilder<HEADER>.() -> Unit): ReactElement = tag(block) { HEADER(attributesMapOf("class", classes), it) }

inline fun RBuilder.hGroup(classes: String? = null, block: RDOMBuilder<HGROUP>.() -> Unit): ReactElement = tag(block) { HGROUP(attributesMapOf("class", classes), it) }

inline fun RBuilder.hr(classes: String? = null, block: RDOMBuilder<HR>.() -> Unit): ReactElement = tag(block) { HR(attributesMapOf("class", classes), it) }

inline fun RBuilder.html(block: RDOMBuilder<HTML>.() -> Unit): ReactElement = tag(block) { HTML(emptyMap, it) }

inline fun RBuilder.i(classes: String? = null, block: RDOMBuilder<I>.() -> Unit): ReactElement = tag(block) { I(attributesMapOf("class", classes), it) }

inline fun RBuilder.iframe(sandbox: IframeSandbox? = null, classes: String? = null, content: String = ""): ReactElement = tag({ +content }) { IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), it) }
inline fun RBuilder.iframe(sandbox: IframeSandbox? = null, classes: String? = null, block: RDOMBuilder<IFRAME>.() -> Unit): ReactElement = tag(block) { IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), it) }

inline fun RBuilder.img(alt: String? = null, src: String? = null, classes: String? = null, block: RDOMBuilder<IMG>.() -> Unit): ReactElement = tag(block) { IMG(attributesMapOf("alt", alt, "src", src, "class", classes), it) }

inline fun RBuilder.input(type: InputType? = null, formEncType: InputFormEncType? = null, formMethod: InputFormMethod? = null, name: String? = null, classes: String? = null, block: RDOMBuilder<INPUT>.() -> Unit): ReactElement = tag(block) { INPUT(attributesMapOf("type", type?.enumEncode(), "formenctype", formEncType?.enumEncode(), "formmethod", formMethod?.enumEncode(), "name", name, "class", classes), it) }

inline fun RBuilder.ins(classes: String? = null, block: RDOMBuilder<INS>.() -> Unit): ReactElement = tag(block) { INS(attributesMapOf("class", classes), it) }

inline fun RBuilder.kbd(classes: String? = null, block: RDOMBuilder<KBD>.() -> Unit): ReactElement = tag(block) { KBD(attributesMapOf("class", classes), it) }

inline fun RBuilder.keyGen(keyType: KeyGenKeyType? = null, classes: String? = null, block: RDOMBuilder<KEYGEN>.() -> Unit): ReactElement = tag(block) { KEYGEN(attributesMapOf("keytype", keyType?.enumEncode(), "class", classes), it) }

inline fun RBuilder.label(classes: String? = null, block: RDOMBuilder<LABEL>.() -> Unit): ReactElement = tag(block) { LABEL(attributesMapOf("class", classes), it) }

inline fun RBuilder.legend(classes: String? = null, block: RDOMBuilder<LEGEND>.() -> Unit): ReactElement = tag(block) { LEGEND(attributesMapOf("class", classes), it) }

inline fun RBuilder.li(classes: String? = null, block: RDOMBuilder<LI>.() -> Unit): ReactElement = tag(block) { LI(attributesMapOf("class", classes), it) }

inline fun RBuilder.link(href: String? = null, rel: String? = null, type: String? = null, block: RDOMBuilder<LINK>.() -> Unit): ReactElement = tag(block) { LINK(attributesMapOf("href", href, "rel", rel, "type", type), it) }

inline fun RBuilder.map(name: String? = null, classes: String? = null, block: RDOMBuilder<MAP>.() -> Unit): ReactElement = tag(block) { MAP(attributesMapOf("name", name, "class", classes), it) }

inline fun RBuilder.mark(classes: String? = null, block: RDOMBuilder<MARK>.() -> Unit): ReactElement = tag(block) { MARK(attributesMapOf("class", classes), it) }

inline fun RBuilder.math(classes: String? = null, block: RDOMBuilder<MATH>.() -> Unit): ReactElement = tag(block) { MATH(attributesMapOf("class", classes), it) }

inline fun RBuilder.mathml(classes: String? = null, content: String = ""): ReactElement = tag({ +content }) { MATHML(attributesMapOf("class", classes), it) }
inline fun RBuilder.mathml(classes: String? = null, block: RDOMBuilder<MATHML>.() -> Unit): ReactElement = tag(block) { MATHML(attributesMapOf("class", classes), it) }

inline fun RBuilder.meta(name: String? = null, content: String? = null, block: RDOMBuilder<META>.() -> Unit): ReactElement = tag(block) { META(attributesMapOf("name", name, "content", content), it) }

inline fun RBuilder.meter(classes: String? = null, block: RDOMBuilder<METER>.() -> Unit): ReactElement = tag(block) { METER(attributesMapOf("class", classes), it) }

inline fun RBuilder.nav(classes: String? = null, block: RDOMBuilder<NAV>.() -> Unit): ReactElement = tag(block) { NAV(attributesMapOf("class", classes), it) }

inline fun RBuilder.noScript(classes: String? = null, block: RDOMBuilder<NOSCRIPT>.() -> Unit): ReactElement = tag(block) { NOSCRIPT(attributesMapOf("class", classes), it) }

inline fun RBuilder.object_(classes: String? = null, block: RDOMBuilder<OBJECT>.() -> Unit): ReactElement = tag(block) { OBJECT(attributesMapOf("class", classes), it) }

inline fun RBuilder.ol(classes: String? = null, block: RDOMBuilder<OL>.() -> Unit): ReactElement = tag(block) { OL(attributesMapOf("class", classes), it) }

inline fun RBuilder.optGroup(label: String? = null, classes: String? = null, block: RDOMBuilder<OPTGROUP>.() -> Unit): ReactElement = tag(block) { OPTGROUP(attributesMapOf("label", label, "class", classes), it) }

inline fun RBuilder.option(classes: String? = null, content: String = ""): ReactElement = tag({ +content }) { OPTION(attributesMapOf("class", classes), it) }
inline fun RBuilder.option(classes: String? = null, block: RDOMBuilder<OPTION>.() -> Unit): ReactElement = tag(block) { OPTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.output(classes: String? = null, block: RDOMBuilder<OUTPUT>.() -> Unit): ReactElement = tag(block) { OUTPUT(attributesMapOf("class", classes), it) }

inline fun RBuilder.p(classes: String? = null, block: RDOMBuilder<P>.() -> Unit): ReactElement = tag(block) { P(attributesMapOf("class", classes), it) }

inline fun RBuilder.param(name: String? = null, value: String? = null, block: RDOMBuilder<PARAM>.() -> Unit): ReactElement = tag(block) { PARAM(attributesMapOf("name", name, "value", value), it) }

inline fun RBuilder.pre(classes: String? = null, block: RDOMBuilder<PRE>.() -> Unit): ReactElement = tag(block) { PRE(attributesMapOf("class", classes), it) }

inline fun RBuilder.progress(classes: String? = null, block: RDOMBuilder<PROGRESS>.() -> Unit): ReactElement = tag(block) { PROGRESS(attributesMapOf("class", classes), it) }

inline fun RBuilder.q(classes: String? = null, block: RDOMBuilder<Q>.() -> Unit): ReactElement = tag(block) { Q(attributesMapOf("class", classes), it) }

inline fun RBuilder.rp(classes: String? = null, block: RDOMBuilder<RP>.() -> Unit): ReactElement = tag(block) { RP(attributesMapOf("class", classes), it) }

inline fun RBuilder.rt(classes: String? = null, block: RDOMBuilder<RT>.() -> Unit): ReactElement = tag(block) { RT(attributesMapOf("class", classes), it) }

inline fun RBuilder.ruby(classes: String? = null, block: RDOMBuilder<RUBY>.() -> Unit): ReactElement = tag(block) { RUBY(attributesMapOf("class", classes), it) }

inline fun RBuilder.samp(classes: String? = null, block: RDOMBuilder<SAMP>.() -> Unit): ReactElement = tag(block) { SAMP(attributesMapOf("class", classes), it) }

inline fun RBuilder.script(type: String? = null, src: String? = null, block: RDOMBuilder<SCRIPT>.() -> Unit): ReactElement = tag(block) { SCRIPT(attributesMapOf("type", type, "src", src), it) }

inline fun RBuilder.section(classes: String? = null, block: RDOMBuilder<SECTION>.() -> Unit): ReactElement = tag(block) { SECTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.select(classes: String? = null, block: RDOMBuilder<SELECT>.() -> Unit): ReactElement = tag(block) { SELECT(attributesMapOf("class", classes), it) }

inline fun RBuilder.small(classes: String? = null, block: RDOMBuilder<SMALL>.() -> Unit): ReactElement = tag(block) { SMALL(attributesMapOf("class", classes), it) }

inline fun RBuilder.source(classes: String? = null, block: RDOMBuilder<SOURCE>.() -> Unit): ReactElement = tag(block) { SOURCE(attributesMapOf("class", classes), it) }

inline fun RBuilder.span(classes: String? = null, block: RDOMBuilder<SPAN>.() -> Unit): ReactElement = tag(block) { SPAN(attributesMapOf("class", classes), it) }

inline fun RBuilder.strong(classes: String? = null, block: RDOMBuilder<STRONG>.() -> Unit): ReactElement = tag(block) { STRONG(attributesMapOf("class", classes), it) }

inline fun RBuilder.style(type: String? = null, content: String = ""): ReactElement = tag({ +content }) { STYLE(attributesMapOf("type", type), it) }
inline fun RBuilder.style(type: String? = null, block: RDOMBuilder<STYLE>.() -> Unit): ReactElement = tag(block) { STYLE(attributesMapOf("type", type), it) }

inline fun RBuilder.sub(classes: String? = null, block: RDOMBuilder<SUB>.() -> Unit): ReactElement = tag(block) { SUB(attributesMapOf("class", classes), it) }

inline fun RBuilder.sup(classes: String? = null, block: RDOMBuilder<SUP>.() -> Unit): ReactElement = tag(block) { SUP(attributesMapOf("class", classes), it) }

inline fun RBuilder.svg(classes: String? = null, content: String = ""): ReactElement = tag({ +content }) { SVG(attributesMapOf("class", classes), it) }
inline fun RBuilder.svg(classes: String? = null, block: RDOMBuilder<SVG>.() -> Unit): ReactElement = tag(block) { SVG(attributesMapOf("class", classes), it) }

inline fun RBuilder.table(classes: String? = null, block: RDOMBuilder<TABLE>.() -> Unit): ReactElement = tag(block) { TABLE(attributesMapOf("class", classes), it) }

inline fun RBuilder.tbody(classes: String? = null, block: RDOMBuilder<TBODY>.() -> Unit): ReactElement = tag(block) { TBODY(attributesMapOf("class", classes), it) }

inline fun RBuilder.td(classes: String? = null, block: RDOMBuilder<TD>.() -> Unit): ReactElement = tag(block) { TD(attributesMapOf("class", classes), it) }

inline fun RBuilder.textArea(rows: String? = null, cols: String? = null, wrap: TextAreaWrap? = null, classes: String? = null, content: String = ""): ReactElement = tag({ +content }) { TEXTAREA(attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes), it) }
inline fun RBuilder.textArea(rows: String? = null, cols: String? = null, wrap: TextAreaWrap? = null, classes: String? = null, block: RDOMBuilder<TEXTAREA>.() -> Unit): ReactElement = tag(block) { TEXTAREA(attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes), it) }

inline fun RBuilder.tfoot(classes: String? = null, block: RDOMBuilder<TFOOT>.() -> Unit): ReactElement = tag(block) { TFOOT(attributesMapOf("class", classes), it) }

inline fun RBuilder.th(scope: ThScope? = null, classes: String? = null, block: RDOMBuilder<TH>.() -> Unit): ReactElement = tag(block) { TH(attributesMapOf("scope", scope?.enumEncode(), "class", classes), it) }

inline fun RBuilder.thead(classes: String? = null, block: RDOMBuilder<THEAD>.() -> Unit): ReactElement = tag(block) { THEAD(attributesMapOf("class", classes), it) }

inline fun RBuilder.time(classes: String? = null, block: RDOMBuilder<TIME>.() -> Unit): ReactElement = tag(block) { TIME(attributesMapOf("class", classes), it) }

inline fun RBuilder.title(content: String = ""): ReactElement = tag({ +content }) { TITLE(emptyMap, it) }
inline fun RBuilder.title(block: RDOMBuilder<TITLE>.() -> Unit): ReactElement = tag(block) { TITLE(emptyMap, it) }

inline fun RBuilder.tr(classes: String? = null, block: RDOMBuilder<TR>.() -> Unit): ReactElement = tag(block) { TR(attributesMapOf("class", classes), it) }

inline fun RBuilder.ul(classes: String? = null, block: RDOMBuilder<UL>.() -> Unit): ReactElement = tag(block) { UL(attributesMapOf("class", classes), it) }

inline fun RBuilder.var_(classes: String? = null, block: RDOMBuilder<VAR>.() -> Unit): ReactElement = tag(block) { VAR(attributesMapOf("class", classes), it) }

inline fun RBuilder.video(classes: String? = null, block: RDOMBuilder<VIDEO>.() -> Unit): ReactElement = tag(block) { VIDEO(attributesMapOf("class", classes), it) }
