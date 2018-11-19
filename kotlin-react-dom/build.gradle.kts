dependencies {
    val kotlinxHtmlVersion = rootProject.extra.get("kotlinx_html_version")

    compile(project(":kotlin-react"))
    compile("org.jetbrains.kotlinx:kotlinx-html-js:$kotlinxHtmlVersion")
}
