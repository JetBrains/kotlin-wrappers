@file:Suppress("NOTHING_TO_INLINE")

package react.dom

import kotlinx.html.*
import kotlinx.html.ButtonType
import kotlinx.html.attributes.enumEncode
import react.RBuilder

inline fun <T : Tag> RBuilder.tag(block: RDOMBuilder<T>.() -> Unit, noinline factory: (TagConsumer<Unit>) -> T) = child(RDOMBuilder(factory).apply { block() }.create())

inline fun RBuilder.a(href: String? = null, target: String? = null, classes: String? = null, block: RDOMBuilder<A>.() -> Unit) = tag(block) { A(attributesMapOf("href", href, "target", target, "class", classes), it) }

inline fun RBuilder.abbr(classes: String? = null, block: RDOMBuilder<ABBR>.() -> Unit) = tag(block) { ABBR(attributesMapOf("class", classes), it) }

inline fun RBuilder.address(classes: String? = null, block: RDOMBuilder<ADDRESS>.() -> Unit) = tag(block) { ADDRESS(attributesMapOf("class", classes), it) }

inline fun RBuilder.area(shape: AreaShape? = null, alt: String? = null, classes: String? = null, block: RDOMBuilder<AREA>.() -> Unit) = tag(block) { AREA(attributesMapOf("Shape", shape?.enumEncode(), "alt", alt, "class", classes), it) }

inline fun RBuilder.article(classes: String? = null, block: RDOMBuilder<ARTICLE>.() -> Unit) = tag(block) { ARTICLE(attributesMapOf("class", classes), it) }

inline fun RBuilder.aside(classes: String? = null, block: RDOMBuilder<ASIDE>.() -> Unit) = tag(block) { ASIDE(attributesMapOf("class", classes), it) }

inline fun RBuilder.audio(classes: String? = null, block: RDOMBuilder<AUDIO>.() -> Unit) = tag(block) { AUDIO(attributesMapOf("class", classes), it) }

inline fun RBuilder.b(classes: String? = null, block: RDOMBuilder<B>.() -> Unit) = tag(block) { B(attributesMapOf("class", classes), it) }

inline fun RBuilder.base(classes: String? = null, block: RDOMBuilder<BASE>.() -> Unit) = tag(block) { BASE(attributesMapOf("class", classes), it) }

inline fun RBuilder.bdi(classes: String? = null, block: RDOMBuilder<BDI>.() -> Unit) = tag(block) { BDI(attributesMapOf("class", classes), it) }

inline fun RBuilder.bdo(classes: String? = null, block: RDOMBuilder<BDO>.() -> Unit) = tag(block) { BDO(attributesMapOf("class", classes), it) }

inline fun RBuilder.blockquote(classes: String? = null, block: RDOMBuilder<BLOCKQUOTE>.() -> Unit) = tag(block) { BLOCKQUOTE(attributesMapOf("class", classes), it) }

inline fun RBuilder.body(classes: String? = null, block: RDOMBuilder<BODY>.() -> Unit) = tag(block) { BODY(attributesMapOf("class", classes), it) }

inline fun RBuilder.br(classes: String? = null, block: RDOMBuilder<BR>.() -> Unit) = tag(block) { BR(attributesMapOf("class", classes), it) }

inline fun RBuilder.button(formEncType: ButtonFormEncType? = null, formMethod: ButtonFormMethod? = null, type: ButtonType? = null, classes: String? = null, block: RDOMBuilder<BUTTON>.() -> Unit) = tag(block) { BUTTON(attributesMapOf("formenctype", formEncType?.enumEncode(), "formmethod", formMethod?.enumEncode(), "type", type?.enumEncode(), "class", classes), it) }

inline fun RBuilder.canvas(classes: String? = null, content: String = "") = tag({ +content }) { CANVAS(attributesMapOf("class", classes), it) }
inline fun RBuilder.canvas(classes: String? = null, block: RDOMBuilder<CANVAS>.() -> Unit) = tag(block) { CANVAS(attributesMapOf("class", classes), it) }

inline fun RBuilder.caption(classes: String? = null, block: RDOMBuilder<CAPTION>.() -> Unit) = tag(block) { CAPTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.cite(classes: String? = null, block: RDOMBuilder<CITE>.() -> Unit) = tag(block) { CITE(attributesMapOf("class", classes), it) }

inline fun RBuilder.code(classes: String? = null, block: RDOMBuilder<CODE>.() -> Unit) = tag(block) { CODE(attributesMapOf("class", classes), it) }

inline fun RBuilder.col(classes: String? = null, block: RDOMBuilder<COL>.() -> Unit) = tag(block) { COL(attributesMapOf("class", classes), it) }

inline fun RBuilder.colgroup(classes: String? = null, block: RDOMBuilder<COLGROUP>.() -> Unit) = tag(block) { COLGROUP(attributesMapOf("class", classes), it) }

inline fun RBuilder.datalist(classes: String? = null, block: RDOMBuilder<DATALIST>.() -> Unit) = tag(block) { DATALIST(attributesMapOf("class", classes), it) }

inline fun RBuilder.dd(classes: String? = null, block: RDOMBuilder<DD>.() -> Unit) = tag(block) { DD(attributesMapOf("class", classes), it) }

inline fun RBuilder.del(classes: String? = null, block: RDOMBuilder<DEL>.() -> Unit) = tag(block) { DEL(attributesMapOf("class", classes), it) }

inline fun RBuilder.details(classes: String? = null, block: RDOMBuilder<DETAILS>.() -> Unit) = tag(block) { DETAILS(attributesMapOf("class", classes), it) }

inline fun RBuilder.dfn(classes: String? = null, block: RDOMBuilder<DFN>.() -> Unit) = tag(block) { DFN(attributesMapOf("class", classes), it) }

inline fun RBuilder.dialog(classes: String? = null, block: RDOMBuilder<DIALOG>.() -> Unit) = tag(block) { DIALOG(attributesMapOf("class", classes), it) }

inline fun RBuilder.div(classes: String? = null, block: RDOMBuilder<DIV>.() -> Unit) = tag(block) { DIV(attributesMapOf("class", classes), it) }

inline fun RBuilder.dl(classes: String? = null, block: RDOMBuilder<DL>.() -> Unit) = tag(block) { DL(attributesMapOf("class", classes), it) }

inline fun RBuilder.dt(classes: String? = null, block: RDOMBuilder<DT>.() -> Unit) = tag(block) { DT(attributesMapOf("class", classes), it) }

inline fun RBuilder.em(classes: String? = null, block: RDOMBuilder<EM>.() -> Unit) = tag(block) { EM(attributesMapOf("class", classes), it) }

inline fun RBuilder.embed(classes: String? = null, block: RDOMBuilder<EMBED>.() -> Unit) = tag(block) { EMBED(attributesMapOf("class", classes), it) }

inline fun RBuilder.fieldset(classes: String? = null, block: RDOMBuilder<FIELDSET>.() -> Unit) = tag(block) { FIELDSET(attributesMapOf("class", classes), it) }

inline fun RBuilder.figcaption(classes: String? = null, block: RDOMBuilder<FIGCAPTION>.() -> Unit) = tag(block) { FIGCAPTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.figure(classes: String? = null, block: RDOMBuilder<FIGURE>.() -> Unit) = tag(block) { FIGURE(attributesMapOf("class", classes), it) }

inline fun RBuilder.footer(classes: String? = null, block: RDOMBuilder<FOOTER>.() -> Unit) = tag(block) { FOOTER(attributesMapOf("class", classes), it) }

inline fun RBuilder.form(action: String? = null, encType: FormEncType? = null, method: FormMethod? = null, classes: String? = null, block: RDOMBuilder<FORM>.() -> Unit) = tag(block) { FORM(attributesMapOf("action", action, "enctype", encType?.enumEncode(), "method", method?.enumEncode(), "class", classes), it) }

inline fun RBuilder.h1(classes: String? = null, block: RDOMBuilder<H1>.() -> Unit) = tag(block) { H1(attributesMapOf("class", classes), it) }

inline fun RBuilder.h2(classes: String? = null, block: RDOMBuilder<H2>.() -> Unit) = tag(block) { H2(attributesMapOf("class", classes), it) }

inline fun RBuilder.h3(classes: String? = null, block: RDOMBuilder<H3>.() -> Unit) = tag(block) { H3(attributesMapOf("class", classes), it) }

inline fun RBuilder.h4(classes: String? = null, block: RDOMBuilder<H4>.() -> Unit) = tag(block) { H4(attributesMapOf("class", classes), it) }

inline fun RBuilder.h5(classes: String? = null, block: RDOMBuilder<H5>.() -> Unit) = tag(block) { H5(attributesMapOf("class", classes), it) }

inline fun RBuilder.h6(classes: String? = null, block: RDOMBuilder<H6>.() -> Unit) = tag(block) { H6(attributesMapOf("class", classes), it) }

inline fun RBuilder.head(block: RDOMBuilder<HEAD>.() -> Unit) = tag(block) { HEAD(emptyMap, it) }

inline fun RBuilder.header(classes: String? = null, block: RDOMBuilder<HEADER>.() -> Unit) = tag(block) { HEADER(attributesMapOf("class", classes), it) }

inline fun RBuilder.hr(classes: String? = null, block: RDOMBuilder<HR>.() -> Unit) = tag(block) { HR(attributesMapOf("class", classes), it) }

inline fun RBuilder.html(block: RDOMBuilder<HTML>.() -> Unit) = tag(block) { HTML(emptyMap, it) }

inline fun RBuilder.i(classes: String? = null, block: RDOMBuilder<I>.() -> Unit) = tag(block) { I(attributesMapOf("class", classes), it) }

inline fun RBuilder.iframe(sandbox: IframeSandbox? = null, classes: String? = null, content: String = "") = tag({ +content }) { IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), it) }

inline fun RBuilder.iframe(sandbox: IframeSandbox? = null, classes: String? = null, block: RDOMBuilder<IFRAME>.() -> Unit) = tag(block) { IFRAME(attributesMapOf("sandbox", sandbox?.enumEncode(), "class", classes), it) }

inline fun RBuilder.img(alt: String? = null, src: String? = null, classes: String? = null, block: RDOMBuilder<IMG>.() -> Unit) = tag(block) { IMG(attributesMapOf("alt", alt, "src", src, "class", classes), it) }

inline fun RBuilder.input(type: InputType? = null, formEncType: InputFormEncType? = null, formMethod: InputFormMethod? = null, name: String? = null, classes: String? = null, block: RDOMBuilder<INPUT>.() -> Unit) = tag(block) { INPUT(attributesMapOf("type", type?.enumEncode(), "formenctype", formEncType?.enumEncode(), "formmethod", formMethod?.enumEncode(), "name", name, "class", classes), it) }

inline fun RBuilder.ins(classes: String? = null, block: RDOMBuilder<INS>.() -> Unit) = tag(block) { INS(attributesMapOf("class", classes), it) }

inline fun RBuilder.kbd(classes: String? = null, block: RDOMBuilder<KBD>.() -> Unit) = tag(block) { KBD(attributesMapOf("class", classes), it) }

inline fun RBuilder.label(classes: String? = null, block: RDOMBuilder<LABEL>.() -> Unit) = tag(block) { LABEL(attributesMapOf("class", classes), it) }

inline fun RBuilder.legend(classes: String? = null, block: RDOMBuilder<LEGEND>.() -> Unit) = tag(block) { LEGEND(attributesMapOf("class", classes), it) }

inline fun RBuilder.li(classes: String? = null, block: RDOMBuilder<LI>.() -> Unit) = tag(block) { LI(attributesMapOf("class", classes), it) }

inline fun RBuilder.link(href: String? = null, rel: String? = null, type: String? = null, block: RDOMBuilder<LINK>.() -> Unit) = tag(block) { LINK(attributesMapOf("href", href, "rel", rel, "type", type), it) }

inline fun RBuilder.main(classes: String? = null, block: RDOMBuilder<MAIN>.() -> Unit) = tag(block) { MAIN(attributesMapOf("class", classes), it) }

inline fun RBuilder.map(name: String? = null, classes: String? = null, block: RDOMBuilder<MAP>.() -> Unit) = tag(block) { MAP(attributesMapOf("name", name, "class", classes), it) }

inline fun RBuilder.mark(classes: String? = null, block: RDOMBuilder<MARK>.() -> Unit) = tag(block) { MARK(attributesMapOf("class", classes), it) }

inline fun RBuilder.math(classes: String? = null, block: RDOMBuilder<MATH>.() -> Unit) = tag(block) { MATH(attributesMapOf("class", classes), it) }

inline fun RBuilder.meta(name: String? = null, content: String? = null, block: RDOMBuilder<META>.() -> Unit) = tag(block) { META(attributesMapOf("name", name, "content", content), it) }

inline fun RBuilder.meter(classes: String? = null, block: RDOMBuilder<METER>.() -> Unit) = tag(block) { METER(attributesMapOf("class", classes), it) }

inline fun RBuilder.nav(classes: String? = null, block: RDOMBuilder<NAV>.() -> Unit) = tag(block) { NAV(attributesMapOf("class", classes), it) }

inline fun RBuilder.noscript(classes: String? = null, block: RDOMBuilder<NOSCRIPT>.() -> Unit) = tag(block) { NOSCRIPT(attributesMapOf("class", classes), it) }

inline fun RBuilder.objectTag(classes: String? = null, block: RDOMBuilder<OBJECT>.() -> Unit) = tag(block) { OBJECT(attributesMapOf("class", classes), it) }

inline fun RBuilder.ol(classes: String? = null, block: RDOMBuilder<OL>.() -> Unit) = tag(block) { OL(attributesMapOf("class", classes), it) }

inline fun RBuilder.optgroup(label: String? = null, classes: String? = null, block: RDOMBuilder<OPTGROUP>.() -> Unit) = tag(block) { OPTGROUP(attributesMapOf("label", label, "class", classes), it) }

inline fun RBuilder.option(classes: String? = null, content: String = "") = tag({ +content }) { OPTION(attributesMapOf("class", classes), it) }
inline fun RBuilder.option(classes: String? = null, block: RDOMBuilder<OPTION>.() -> Unit) = tag(block) { OPTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.output(classes: String? = null, block: RDOMBuilder<OUTPUT>.() -> Unit) = tag(block) { OUTPUT(attributesMapOf("class", classes), it) }

inline fun RBuilder.p(classes: String? = null, block: RDOMBuilder<P>.() -> Unit) = tag(block) { P(attributesMapOf("class", classes), it) }

inline fun RBuilder.param(name: String? = null, value: String? = null, block: RDOMBuilder<PARAM>.() -> Unit) = tag(block) { PARAM(attributesMapOf("name", name, "value", value), it) }

inline fun RBuilder.picture(classes: String? = null, block: RDOMBuilder<PICTURE>.() -> Unit) = tag(block) { PICTURE(attributesMapOf("class", classes), it) }

inline fun RBuilder.pre(classes: String? = null, block: RDOMBuilder<PRE>.() -> Unit) = tag(block) { PRE(attributesMapOf("class", classes), it) }

inline fun RBuilder.progress(classes: String? = null, block: RDOMBuilder<PROGRESS>.() -> Unit) = tag(block) { PROGRESS(attributesMapOf("class", classes), it) }

inline fun RBuilder.q(classes: String? = null, block: RDOMBuilder<Q>.() -> Unit) = tag(block) { Q(attributesMapOf("class", classes), it) }

inline fun RBuilder.rp(classes: String? = null, block: RDOMBuilder<RP>.() -> Unit) = tag(block) { RP(attributesMapOf("class", classes), it) }

inline fun RBuilder.rt(classes: String? = null, block: RDOMBuilder<RT>.() -> Unit) = tag(block) { RT(attributesMapOf("class", classes), it) }

inline fun RBuilder.ruby(classes: String? = null, block: RDOMBuilder<RUBY>.() -> Unit) = tag(block) { RUBY(attributesMapOf("class", classes), it) }

inline fun RBuilder.samp(classes: String? = null, block: RDOMBuilder<SAMP>.() -> Unit) = tag(block) { SAMP(attributesMapOf("class", classes), it) }

inline fun RBuilder.script(type: String? = null, src: String? = null, block: RDOMBuilder<SCRIPT>.() -> Unit) = tag(block) { SCRIPT(attributesMapOf("type", type, "src", src), it) }

inline fun RBuilder.section(classes: String? = null, block: RDOMBuilder<SECTION>.() -> Unit) = tag(block) { SECTION(attributesMapOf("class", classes), it) }

inline fun RBuilder.select(classes: String? = null, block: RDOMBuilder<SELECT>.() -> Unit) = tag(block) { SELECT(attributesMapOf("class", classes), it) }

inline fun RBuilder.small(classes: String? = null, block: RDOMBuilder<SMALL>.() -> Unit) = tag(block) { SMALL(attributesMapOf("class", classes), it) }

inline fun RBuilder.source(classes: String? = null, block: RDOMBuilder<SOURCE>.() -> Unit) = tag(block) { SOURCE(attributesMapOf("class", classes), it) }

inline fun RBuilder.span(classes: String? = null, block: RDOMBuilder<SPAN>.() -> Unit) = tag(block) { SPAN(attributesMapOf("class", classes), it) }

inline fun RBuilder.strong(classes: String? = null, block: RDOMBuilder<STRONG>.() -> Unit) = tag(block) { STRONG(attributesMapOf("class", classes), it) }

inline fun RBuilder.style(type: String? = null, content: String = "") = tag({ +content }) { STYLE(attributesMapOf("type", type), it) }
inline fun RBuilder.style(type: String? = null, block: RDOMBuilder<STYLE>.() -> Unit) = tag(block) { STYLE(attributesMapOf("type", type), it) }

inline fun RBuilder.sub(classes: String? = null, block: RDOMBuilder<SUB>.() -> Unit) = tag(block) { SUB(attributesMapOf("class", classes), it) }

inline fun RBuilder.sup(classes: String? = null, block: RDOMBuilder<SUP>.() -> Unit) = tag(block) { SUP(attributesMapOf("class", classes), it) }

inline fun RBuilder.svg(classes: String? = null, content: String = "") = tag({ +content }) { SVG(attributesMapOf("class", classes), it) }
inline fun RBuilder.svg(classes: String? = null, block: RDOMBuilder<SVG>.() -> Unit) = tag(block) { SVG(attributesMapOf("class", classes), it) }

inline fun RBuilder.table(classes: String? = null, block: RDOMBuilder<TABLE>.() -> Unit) = tag(block) { TABLE(attributesMapOf("class", classes), it) }

inline fun RBuilder.tbody(classes: String? = null, block: RDOMBuilder<TBODY>.() -> Unit) = tag(block) { TBODY(attributesMapOf("class", classes), it) }

inline fun RBuilder.td(classes: String? = null, block: RDOMBuilder<TD>.() -> Unit) = tag(block) { TD(attributesMapOf("class", classes), it) }

inline fun RBuilder.textarea(rows: String? = null, cols: String? = null, wrap: TextAreaWrap? = null, classes: String? = null, content: String = "") = tag({ +content }) { TEXTAREA(attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes), it) }

inline fun RBuilder.textarea(rows: String? = null, cols: String? = null, wrap: TextAreaWrap? = null, classes: String? = null, block: RDOMBuilder<TEXTAREA>.() -> Unit) = tag(block) { TEXTAREA(attributesMapOf("rows", rows, "cols", cols, "wrap", wrap?.enumEncode(), "class", classes), it) }

inline fun RBuilder.tfoot(classes: String? = null, block: RDOMBuilder<TFOOT>.() -> Unit) = tag(block) { TFOOT(attributesMapOf("class", classes), it) }

inline fun RBuilder.th(scope: ThScope? = null, classes: String? = null, block: RDOMBuilder<TH>.() -> Unit) = tag(block) { TH(attributesMapOf("scope", scope?.enumEncode(), "class", classes), it) }

inline fun RBuilder.thead(classes: String? = null, block: RDOMBuilder<THEAD>.() -> Unit) = tag(block) { THEAD(attributesMapOf("class", classes), it) }

inline fun RBuilder.time(classes: String? = null, block: RDOMBuilder<TIME>.() -> Unit) = tag(block) { TIME(attributesMapOf("class", classes), it) }

inline fun RBuilder.title(content: String = "") = tag({ +content }) { TITLE(emptyMap, it) }
inline fun RBuilder.title(block: RDOMBuilder<TITLE>.() -> Unit) = tag(block) { TITLE(emptyMap, it) }

inline fun RBuilder.tr(classes: String? = null, block: RDOMBuilder<TR>.() -> Unit) = tag(block) { TR(attributesMapOf("class", classes), it) }

inline fun RBuilder.ul(classes: String? = null, block: RDOMBuilder<UL>.() -> Unit) = tag(block) { UL(attributesMapOf("class", classes), it) }

inline fun RBuilder.varTag(classes: String? = null, block: RDOMBuilder<VAR>.() -> Unit) = tag(block) { VAR(attributesMapOf("class", classes), it) }

inline fun RBuilder.video(classes: String? = null, block: RDOMBuilder<VIDEO>.() -> Unit) = tag(block) { VIDEO(attributesMapOf("class", classes), it) }
